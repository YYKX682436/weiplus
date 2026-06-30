package com.tencent.xweb;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f220288a = new java.lang.Object();

    public static java.lang.String a() {
        try {
            return new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
        } catch (java.lang.Throwable th6) {
            by5.c4.c("FileReaderDownloadLimiter", "getCurrentDate error: " + th6.getMessage());
            return "";
        }
    }
}
