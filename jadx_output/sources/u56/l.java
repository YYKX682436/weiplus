package u56;

/* loaded from: classes13.dex */
public abstract class l implements p56.s {

    /* renamed from: d, reason: collision with root package name */
    public static final int f424832d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f424833e;

    /* renamed from: f, reason: collision with root package name */
    public static final u56.g f424834f;

    /* renamed from: g, reason: collision with root package name */
    public static final u56.g f424835g;

    static {
        f424832d = 128;
        if (u56.i.f424831b) {
            f424832d = 16;
        }
        java.lang.String property = java.lang.System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                f424832d = java.lang.Integer.parseInt(property);
            } catch (java.lang.NumberFormatException e17) {
                java.lang.System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e17.getMessage());
            }
        }
        f424833e = f424832d;
        f424834f = new u56.j();
        f424835g = new u56.k();
    }
}
