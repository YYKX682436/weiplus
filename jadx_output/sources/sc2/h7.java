package sc2;

/* loaded from: classes2.dex */
public final class h7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(in5.s0 s0Var) {
        super(1);
        this.f405951d = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2;
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f3147h;
        long j17 = 0;
        com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "onJumpViewUnFocus feedId=".concat(pm0.v.u((p0Var == null || (baseFinderFeed2 = p0Var.f453244f) == null) ? 0L : baseFinderFeed2.getItemId())));
        in5.s0 s0Var = this.f405951d;
        java.lang.Object obj2 = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = obj2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2 : null;
        if (baseFinderFeed3 != null && hc2.o0.D(baseFinderFeed3.getFeedObject().getFeedObject(), false)) {
            com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "onJumpViewUnFocus feedId=".concat(pm0.v.u(baseFinderFeed3.getItemId())));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("hasObserver", java.lang.String.valueOf(true));
            xc2.p0 p0Var2 = observer.f3147h;
            java.lang.Object obj3 = p0Var2 != null ? p0Var2.f453246h : null;
            xc2.n0 n0Var = obj3 instanceof xc2.n0 ? (xc2.n0) obj3 : null;
            long j18 = n0Var != null ? n0Var.f453230i : 0L;
            if (p0Var2 != null && (baseFinderFeed = p0Var2.f453244f) != null) {
                j17 = baseFinderFeed.getItemId();
            }
            long j19 = j17;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.p1 p1Var = (com.tencent.mm.plugin.finder.viewmodel.component.p1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.p1.class);
            if (p1Var != null) {
                p1Var.O6(j19, "onJumpViewUnFocus", jSONObject, j18);
            }
        }
        xc2.p0 p0Var3 = observer.f3147h;
        android.view.View view = observer.f3143d;
        if (p0Var3 != null && view != null) {
            p0Var3.A = false;
            s0Var.itemView.setTag(com.tencent.mm.R.id.eid, java.lang.Boolean.FALSE);
            observer.w(s0Var, view, p0Var3);
        }
        return jz5.f0.f302826a;
    }
}
