package t21;

/* loaded from: classes3.dex */
public abstract class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f414730a = new java.util.concurrent.atomic.AtomicLong(1);

    public static java.lang.String a(java.lang.String str) {
        int lastIndexOf;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sb6.append(new java.text.SimpleDateFormat("yyMMddHHmmss", java.util.Locale.ENGLISH).format(new java.util.Date(currentTimeMillis)));
        sb6.append(java.lang.String.valueOf(currentTimeMillis).substring(r1.length() - 3));
        sb6.append(f414730a.getAndIncrement());
        if (str != null && (lastIndexOf = str.lastIndexOf("@")) >= 0) {
            sb6.append(str.substring(lastIndexOf + 1));
        }
        return sb6.toString();
    }
}
