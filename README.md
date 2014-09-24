posterror
=========

Error message with custom controller

{
timestamp: 1411528152186
status: 400
error: "Bad Request"
exception: "org.springframework.http.converter.HttpMessageNotReadableException"
message: "Could not read JSON: Template must not be null or empty! (through reference chain: com.zandriod.posterror.appointment.Appointment["products"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: Template must not be null or empty! (through reference chain: com.zandriod.posterror.appointment.Appointment["products"])"
path: "/appointment"
}


With out customer controller

{
cause: {
cause: {
cause: null
message: "Template must not be null or empty!"
}-
message: "Template must not be null or empty! (through reference chain: com.zandriod.posterror.appointment.Appointment["products"])"
}-
message: "Could not read JSON: Template must not be null or empty! (through reference chain: com.zandriod.posterror.appointment.Appointment["products"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: Template must not be null or empty! (through reference chain: com.zandriod.posterror.appointment.Appointment["products"])"
}

posterror
