package fn4;

/* loaded from: classes15.dex */
public class v0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.z0 f264614d;

    public v0(fn4.z0 z0Var) {
        this.f264614d = z0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "onSceneEnd, errType: %s, errCode: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), m1Var);
        if (!m1Var.equals(this.f264614d.f264634d)) {
            if (m1Var.equals(this.f264614d.f264635e)) {
                gm0.j1.d().q(1943, this.f264614d.f264636f);
                this.f264614d.f264635e = null;
                sm4.h hVar = (sm4.h) m1Var;
                if (i17 == 0 && i18 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "onSceneEnd relevantVideoNetScene %s", ((r45.s97) hVar.f409944e.f70711b.f70700a).f385587f);
                    ((ku5.t0) ku5.t0.f312615d).h(new fn4.u0(this, hVar), "TopStory.DecodeRelevantResult");
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "requestRelVideo failed!, errType:%s, errCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    uu4.a.a(2);
                    return;
                }
            }
            return;
        }
        gm0.j1.d().q(1943, this.f264614d.f264636f);
        fn4.z0 z0Var = this.f264614d;
        z0Var.f264634d = null;
        sm4.k kVar = (sm4.k) m1Var;
        if (i17 == 0 && i18 == 0) {
            fn4.y0 y0Var = new fn4.y0(z0Var, null);
            y0Var.f264625d = ((r45.s97) kVar.f409957e.f70711b.f70700a).f385587f;
            y0Var.f264626e = kVar.f409958f.f387513s == 0;
            ((ku5.t0) ku5.t0.f312615d).h(y0Var, "TopStory.DecodeRecommendResultTask");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryVideoDataMgr", "fetch page failed!, response json: %s", ((r45.s97) kVar.f409957e.f70711b.f70700a).f385587f);
        uu4.a.a(2);
        this.f264614d.f264631a.A4(-1, str);
        this.f264614d.f264632b = false;
    }
}
