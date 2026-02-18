package br.com.rian.eurudio.exeception;

import java.util.Date;

public record ExeceptionResponse(Date timeStamp, String message, String details) {}
