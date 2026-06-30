package p36;

/* loaded from: classes13.dex */
public class e extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    public java.lang.Object initialValue() {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(m36.e.f323390e);
        return simpleDateFormat;
    }
}
