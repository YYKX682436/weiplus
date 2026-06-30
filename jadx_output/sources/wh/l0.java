package wh;

/* loaded from: classes8.dex */
public final class l0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final wh.l0 f445825a = new wh.l0();

    @Override // wh.u0
    public java.lang.Object apply(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
        kotlin.jvm.internal.o.f(calendar, "calendar");
        calendar.add(14, timeZone.getOffset(calendar.getTimeInMillis()));
        return new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, java.util.Locale.getDefault()).format(new java.util.Date(longValue));
    }
}
