package fn4;

/* loaded from: classes4.dex */
public class t0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm4.e f264609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.z0 f264610e;

    public t0(fn4.z0 z0Var, sm4.e eVar) {
        this.f264610e = z0Var;
        this.f264609d = eVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if ((m1Var instanceof sm4.e) && m1Var.equals(this.f264609d)) {
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            this.f264609d.getClass();
            d17.q(2579, this);
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryVideoDataMgr", "fetch videourl failed!, errType %s, errCode %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                return;
            }
            r45.bl5 bl5Var = (r45.bl5) ((sm4.e) m1Var).f409936e.f70711b.f70700a;
            ((ku5.t0) ku5.t0.f312615d).g(new fn4.s0(this, bl5Var));
        }
    }
}
