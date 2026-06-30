package ur1;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.o4 f430352d;

    public h(com.tencent.wechat.mm.biz.o4 o4Var) {
        this.f430352d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ur1.j jVar = ur1.j.f430354a;
        int i17 = this.f430352d.f218435e;
        ur1.j.f430355b = i17;
        ur1.j.f430357d.A("bizLastPersonalCenterTimestamp", i17);
        java.util.LinkedList scenes = this.f430352d.f218434d;
        kotlin.jvm.internal.o.f(scenes, "scenes");
        if (!scenes.isEmpty()) {
            java.util.LinkedList<com.tencent.wechat.mm.biz.n4> scenes2 = this.f430352d.f218434d;
            kotlin.jvm.internal.o.f(scenes2, "scenes");
            for (com.tencent.wechat.mm.biz.n4 n4Var : scenes2) {
                if (n4Var.f218382d == com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE) {
                    ur1.j.f430356c = n4Var != null ? n4Var.f218383e : 0;
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        }
        ((ku5.t0) ku5.t0.f312615d).h(ur1.g.f430351d, "BizFlutterDigestHelper");
    }
}
