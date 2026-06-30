package g73;

@j95.b(dependencies = {d73.j.class})
/* loaded from: classes15.dex */
public final class g2 extends i95.w implements d73.i {

    /* renamed from: d, reason: collision with root package name */
    public static final g73.g2 f269270d = new g73.g2();

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult f269271e;

    static {
        com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult getOnLineInfoInfoResult = new com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult();
        h73.g.f279492a.a(getOnLineInfoInfoResult);
        f269271e = getOnLineInfoInfoResult;
    }

    @Override // d73.i
    public void A8(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(key), g73.z0.class, g73.v1.f269336d);
    }

    @Override // d73.i
    public void C6() {
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), g73.a1.class, g73.w1.f269338d);
    }

    @Override // d73.i
    public void Ce(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, g73.v0.class, g73.r1.f269327d);
    }

    @Override // d73.i
    public void Dg(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(id6), g73.x0.class, g73.u1.f269334d);
    }

    @Override // d73.i
    public void Ef(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, handOff, g73.j1.class, g73.a2.f269254d);
    }

    @Override // d73.i
    public void Ja(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, handOff, g73.l1.class, g73.t1.f269332d);
    }

    @Override // d73.i
    public void Jc(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, handOff, g73.q1.class, g73.f2.f269268d);
    }

    @Override // d73.i
    public void Kg(java.lang.String id6, java.lang.String cdnURL, java.lang.String aesKey) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(cdnURL, "cdnURL");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, h73.e.a(h73.e.b(dm.i4.COL_ID, id6), h73.e.b("cdnURL", cdnURL), h73.e.b("aesKey", aesKey)), g73.n1.class, g73.d2.f269263d);
    }

    @Override // d73.i
    public void Ma(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, handOff, g73.g1.class, g73.x1.f269340d);
    }

    @Override // d73.i
    public boolean N1(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17) {
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        return false;
    }

    @Override // d73.i
    public void Q6(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
    }

    @Override // d73.i
    public boolean Qg() {
        h73.g.f279492a.a(f269271e);
        return f269271e.f77355h;
    }

    @Override // d73.i
    public void Qi(java.lang.String id6, java.lang.String arg) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(arg, "arg");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, h73.e.a(h73.e.b(dm.i4.COL_ID, id6), h73.e.b("arg", arg)), g73.m1.class, g73.c2.f269259d);
    }

    @Override // d73.i
    public boolean S8(java.lang.String id6, com.tencent.mm.pluginsdk.model.app.d info) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.w("HandOffServiceProxy", "uploadStart should only be called in MM process!");
        return false;
    }

    @Override // d73.i
    public void Sb(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, handOff, g73.i1.class, g73.z1.f269344d);
    }

    @Override // d73.i
    public void Ti(com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult onlineInfo) {
        kotlin.jvm.internal.o.g(onlineInfo, "onlineInfo");
        com.tencent.mars.xlog.Log.i("HandOffServiceProxy", "notifyUserStatusChange: " + onlineInfo);
        f269271e = onlineInfo;
    }

    @Override // d73.i
    public boolean Wa(java.lang.String id6, long j17) {
        kotlin.jvm.internal.o.g(id6, "id");
        return ((com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, h73.e.a(h73.e.b(dm.i4.COL_ID, id6), new h73.f(new h73.c("uploadedSize", j17))), g73.p1.class)).f68400d;
    }

    @Override // d73.i
    public void a9(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, handOff, g73.h1.class, g73.y1.f269342d);
    }

    @Override // d73.i
    public void e7(java.lang.String id6, java.lang.String appId, int i17, java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, h73.e.a(h73.e.b(dm.i4.COL_ID, id6), h73.e.b("appId", appId), new h73.f(new h73.b(com.tencent.mapsdk.internal.er.f49386e, i17)), h73.e.b("mediaId", mediaId)), g73.o1.class, g73.e2.f269265d);
    }

    @Override // d73.i
    public void f6(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, handOff, g73.k1.class, g73.b2.f269257d);
    }

    @Override // d73.i
    public void hb(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
    }

    @Override // d73.i
    public void i9(java.util.List ballInfoList) {
        kotlin.jvm.internal.o.g(ballInfoList, "ballInfoList");
    }

    @Override // d73.i
    public void k8() {
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), g73.w0.class, g73.s1.f269331d);
    }

    @Override // d73.i
    public void mb(java.lang.String message) {
        kotlin.jvm.internal.o.g(message, "message");
    }

    @Override // d73.i
    public com.tencent.mm.plugin.handoff.model.HandOff rb(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        return (com.tencent.mm.plugin.handoff.model.HandOff) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(id6), g73.c1.class);
    }

    @Override // d73.i
    public com.tencent.mm.plugin.handoff.model.HandOff t1() {
        return (com.tencent.mm.plugin.handoff.model.HandOff) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), g73.b1.class);
    }

    @Override // d73.i
    public void t7(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
    }

    @Override // d73.i
    public void tf(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
    }

    @Override // d73.i
    public com.tencent.mm.plugin.handoff.model.HandOff uh(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        return (com.tencent.mm.plugin.handoff.model.HandOff) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(key), g73.d1.class);
    }

    @Override // d73.i
    public void va(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
    }

    @Override // d73.i
    public void vg(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
    }

    @Override // d73.i
    public void wd(java.util.List multiTaskInfoList) {
        kotlin.jvm.internal.o.g(multiTaskInfoList, "multiTaskInfoList");
    }
}
