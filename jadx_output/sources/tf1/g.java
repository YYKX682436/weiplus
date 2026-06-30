package tf1;

/* loaded from: classes7.dex */
public enum g {
    /* JADX INFO: Fake field, exist only in values array */
    HIDE(com.tencent.mm.plugin.appbrand.w0.HIDE, 1),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCH_NATIVE_PAGE(com.tencent.mm.plugin.appbrand.w0.LAUNCH_NATIVE_PAGE, 2),
    /* JADX INFO: Fake field, exist only in values array */
    BACK(com.tencent.mm.plugin.appbrand.w0.BACK, 3),
    /* JADX INFO: Fake field, exist only in values array */
    CLOSE(com.tencent.mm.plugin.appbrand.w0.CLOSE, 4),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCH_MINI_PROGRAM(com.tencent.mm.plugin.appbrand.w0.LAUNCH_MINI_PROGRAM, 5),
    /* JADX INFO: Fake field, exist only in values array */
    HOME_PRESSED(com.tencent.mm.plugin.appbrand.w0.HOME_PRESSED, 6),
    /* JADX INFO: Fake field, exist only in values array */
    RECENT_APPS_PRESSED(com.tencent.mm.plugin.appbrand.w0.RECENT_APPS_PRESSED, 7),
    /* JADX INFO: Fake field, exist only in values array */
    HANG(com.tencent.mm.plugin.appbrand.w0.HANG, 8);


    /* renamed from: f, reason: collision with root package name */
    public static java.util.Map f418877f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.util.Map f418878g = null;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.w0 f418880d;

    /* renamed from: e, reason: collision with root package name */
    public final int f418881e;

    g(com.tencent.mm.plugin.appbrand.w0 w0Var, int i17) {
        this.f418880d = w0Var;
        this.f418881e = i17;
    }

    public static void h() {
        tf1.g[] values = values();
        f418877f = new java.util.HashMap(values.length * 2);
        f418878g = new java.util.HashMap(values.length * 2);
        for (tf1.g gVar : values) {
            java.util.Map map = f418877f;
            com.tencent.mm.plugin.appbrand.w0 w0Var = gVar.f418880d;
            int i17 = gVar.f418881e;
            map.put(w0Var, java.lang.Integer.valueOf(i17));
            f418878g.put(java.lang.Integer.valueOf(i17), gVar.f418880d);
        }
    }
}
