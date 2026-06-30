package w21;

@j95.b
/* loaded from: classes12.dex */
public class p0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public w21.g1 f442452d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.lb f442453e;

    /* renamed from: f, reason: collision with root package name */
    public tl.q0 f442454f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f442455g = new w21.n0(this);

    public static com.tencent.mm.storage.lb Ai() {
        gm0.j1.b().c();
        if (wi().f442453e == null) {
            iz5.a.g("dataDB is null ", gm0.j1.u().f273153f != null);
            wi().f442453e = new com.tencent.mm.storage.lb(gm0.j1.u().f273153f);
        }
        return wi().f442453e;
    }

    public static tl.q0 Bi() {
        gm0.j1.b().c();
        if (wi().f442454f == null) {
            wi().f442454f = tl.v0.f420147a;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVoice", "getVoiceService %s", wi().f442454f.toString());
        return wi().f442454f;
    }

    public static w21.g1 Di() {
        gm0.j1.b().c();
        if (wi().f442452d == null) {
            iz5.a.g("dataDB is null ", gm0.j1.u().f273153f != null);
            wi().f442452d = new w21.g1(gm0.j1.u().f273153f);
        }
        return wi().f442452d;
    }

    public static w21.p0 wi() {
        return (w21.p0) i95.n0.c(w21.p0.class);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        tl.q0 Bi = Bi();
        Bi.getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.SceneVoiceService", "setAccountReady: true");
        Bi.f420095f = true;
        this.f442455g.alive();
        q25.b.b(new w21.o0(), "//voicetrymore");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        if (wi().f442454f != null) {
            tl.q0 q0Var = wi().f442454f;
            q0Var.f420102p = 0;
            q0Var.f(true);
        }
        this.f442455g.dead();
        q25.b.c("//voicetrymore");
        tl.q0 Bi = Bi();
        Bi.getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.SceneVoiceService", "setAccountReady: false");
        Bi.f420095f = false;
    }
}
