package l25;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final l25.c f315211a = new l25.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f315212b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f315213c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f315214d;

    public static void a(l25.c cVar, long j17, long j18, long j19, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            j19 = 1;
        }
        long j27 = j19;
        cVar.getClass();
        if (f315214d) {
            jx3.f.INSTANCE.w(j17, j18, j27);
        } else {
            ((java.util.ArrayList) f315212b).add(new long[]{j17, j18, j27});
        }
    }
}
