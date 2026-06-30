package n21;

/* loaded from: classes8.dex */
public class h implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final kk.j f334265f = new kk.l(5);

    /* renamed from: g, reason: collision with root package name */
    public static int f334266g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static n21.h f334267h;

    /* renamed from: d, reason: collision with root package name */
    public boolean f334268d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f334269e = 3;

    public static int a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 5;
        }
        str.startsWith("single");
        int i17 = str.startsWith("chatroom") ? 7 : 5;
        if (str.startsWith("app")) {
            return 8;
        }
        return i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if ((m1Var instanceof com.tencent.mm.modelbase.q1) && ((com.tencent.mm.modelbase.q1) m1Var).u() == 9 && m1Var.getType() == 159) {
            if (i17 == 0 && i18 == 0) {
                gm0.j1.i();
                gm0.j1.u().c().w(81944, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
            } else {
                int i19 = this.f334269e - 1;
                this.f334269e = i19;
                if (i19 < 0) {
                    gm0.j1.i();
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    c17.w(81944, java.lang.Long.valueOf(((java.lang.System.currentTimeMillis() - 86400000) + 3600000) / 1000));
                    this.f334269e = 3;
                }
            }
            this.f334268d = false;
            gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        }
    }
}
