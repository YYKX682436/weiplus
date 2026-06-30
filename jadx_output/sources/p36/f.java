package p36;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f351718a = new p36.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f351719b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.text.DateFormat[] f351720c;

    static {
        java.lang.String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f351719b = strArr;
        f351720c = new java.text.DateFormat[strArr.length];
    }

    public static java.util.Date a(java.lang.String str) {
        if (str.length() == 0) {
            return null;
        }
        java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
        java.util.Date parse = ((java.text.DateFormat) f351718a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        java.lang.String[] strArr = f351719b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                java.text.DateFormat[] dateFormatArr = f351720c;
                java.text.DateFormat dateFormat = dateFormatArr[i17];
                if (dateFormat == null) {
                    dateFormat = new java.text.SimpleDateFormat(f351719b[i17], java.util.Locale.US);
                    dateFormat.setTimeZone(m36.e.f323390e);
                    dateFormatArr[i17] = dateFormat;
                }
                parsePosition.setIndex(0);
                java.util.Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
