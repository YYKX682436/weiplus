package fo5;

/* loaded from: classes14.dex */
public final class f3 implements com.tencent.mm.plugin.voipmp.platform.z0, com.tencent.mm.plugin.voipmp.platform.x {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.voipmp.platform.y0 f264984a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.voipmp.platform.w f264985b;

    /* renamed from: c, reason: collision with root package name */
    public static fo5.a f264986c;

    static {
        fo5.f3 f3Var = new fo5.f3();
        try {
            fp.d0.n("aff_biz");
            fp.d0.n("zidl2");
            com.tencent.mm.plugin.voipmp.platform.v0 v0Var = com.tencent.mm.plugin.voipmp.platform.v0.f177287b;
            v0Var.a(new com.tencent.mm.plugin.voipmp.platform.v(f3Var), "native", fo5.t2.f265120a);
            v0Var.b(new com.tencent.mm.plugin.voipmp.platform.x0(f3Var), "native", fo5.u2.f265123a);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipmpCoreServiceCenter", e17, "init block", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.voipmp.platform.g1.f177260a = fo5.v2.f265133a;
    }
}
