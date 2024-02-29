/*
 * package com.mannit.chatbot.controller;
 * 
 * import java.text.DateFormat; import java.text.ParseException; import
 * java.text.SimpleDateFormat; import java.util.Date; import java.util.HashMap;
 * import java.util.List; import java.util.Map; import java.util.TimeZone;
 * import java.util.stream.Collectors;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.scheduling.annotation.Scheduled; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.mannit.chatbot.model.Botdelivered; import
 * com.mannit.chatbot.model.CurrentPatient; import
 * com.mannit.chatbot.model.Defaultstatus; import
 * com.mannit.chatbot.model.Noappointment; import
 * com.mannit.chatbot.model.QueriedPatient; import
 * com.mannit.chatbot.model.SentMessageStatus; import
 * com.mannit.chatbot.repository.Botdeliveredrepo; import
 * com.mannit.chatbot.repository.Botreadrepo; import
 * com.mannit.chatbot.repository.Botsentrepo; import
 * com.mannit.chatbot.repository.Currentpatientsrepo; import
 * com.mannit.chatbot.repository.Defaultstatusrepo; import
 * com.mannit.chatbot.repository.MessagestatusRepo; import
 * com.mannit.chatbot.repository.Noappointmentrepo; import
 * com.mannit.chatbot.repository.QuriedpRepo; import
 * com.mannit.chatbot.repository.Smartyupresrespo;
 * 
 * @RestController public class Campaignscheduling {
 * 
 * @Autowired private Currentpatientsrepo repo;
 * 
 * @Autowired private Noappointmentrepo no_app_repo;
 * 
 * @Autowired private QuriedpRepo quried_repo;
 * 
 * @Autowired private Botdeliveredrepo deliveredrepo;
 * 
 * @Scheduled(cron = "0 0 23 * * ?", zone = "Asia/Kolkata") public
 * ResponseEntity<Object> sendcampaign(String date) { String formattedDate =
 * convertDateFormat(date, "yyyy-MM-dd", "MM/dd/yyyy"); List<CurrentPatient> cp
 * = repo.findByDate(formattedDate); List<QueriedPatient> qp =
 * quried_repo.findByDate(formattedDate); List<Noappointment> np =
 * no_app_repo.findByDate(formattedDate); List<Noappointment> uniqueNp =
 * removeDuplicates(np, Noappointment::getTimestamp); List<Botdelivered>
 * uniqueDp = removeDuplicates(deliveredrepo.findAllBydate(formattedDate),
 * Botdelivered::getPhone_number); List<CurrentPatient> UniqueCp =
 * removeDuplicates(repo.findByDate(formattedDate),
 * CurrentPatient::getPhone_number); List<QueriedPatient> uniqueQp =
 * removeDuplicates(qp, QueriedPatient::getTimestamp); for (Botdelivered b :
 * uniqueDp) { // sendrequesttoapi(b.getPhone_number()); }
 * 
 * return null; }
 * 
 * private static <T> List<T> removeDuplicates(List<T> list,
 * java.util.function.Function<T, String> timestampExtractor) { return
 * list.stream() .collect(Collectors.toMap(timestampExtractor, item -> item,
 * (existing, replacement) -> existing))
 * .values().stream().collect(Collectors.toList()); }
 * 
 * public String convertDateFormat(String inputDateStr, String inputFormat,
 * String outputFormat) { DateFormat inputDateFormat = new
 * SimpleDateFormat(inputFormat); DateFormat outputDateFormat = new
 * SimpleDateFormat(outputFormat); try { Date date =
 * inputDateFormat.parse(inputDateStr);
 * outputDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
 * 
 * return outputDateFormat.format(date); } catch (ParseException e) {
 * e.printStackTrace(); return null; }
 * 
 * } }
 */