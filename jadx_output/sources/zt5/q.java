package zt5;

/* loaded from: classes9.dex */
public class q implements zt5.c {

    /* renamed from: a, reason: collision with root package name */
    public static int f475611a;

    /* renamed from: b, reason: collision with root package name */
    public static int[] f475612b;

    public static void a(java.lang.String str, java.lang.Object obj) {
        synchronized (zt5.q.class) {
            if ("fingerprint_type".equals(str)) {
                f475611a = ((java.lang.Integer) obj).intValue();
            } else if ("fingerprint_hardware_position".equals(str)) {
                f475612b = (int[]) obj;
            }
        }
    }
}
