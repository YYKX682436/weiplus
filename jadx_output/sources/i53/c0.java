package i53;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f288528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.l f288529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288530f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m33.m1 f288531g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f288532h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f288533i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i53.d0 f288534m;

    public c0(i53.d0 d0Var, java.util.Map map, com.tencent.mm.modelbase.l lVar, java.lang.String str, m33.m1 m1Var, int i17, int i18) {
        this.f288534m = d0Var;
        this.f288528d = map;
        this.f288529e = lVar;
        this.f288530f = str;
        this.f288531g = m1Var;
        this.f288532h = i17;
        this.f288533i = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f288528d;
        if (map.containsKey("videoid")) {
            map.put("videoid", com.tencent.mm.vfs.w6.p((java.lang.String) map.get("videoid")));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(this.f288529e.a(), new i53.b0(this, currentTimeMillis));
    }
}
