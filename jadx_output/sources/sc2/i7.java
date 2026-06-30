package sc2;

/* loaded from: classes2.dex */
public final class i7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final sc2.i7 f405975d = new sc2.i7();

    public i7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f3147h;
        android.view.View view = observer.f3143d;
        if (p0Var != null && view != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = p0Var.f453244f;
            if (baseFinderFeed != null && hc2.o0.D(baseFinderFeed.getFeedObject().getFeedObject(), false)) {
                com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "onPause feedId=".concat(pm0.v.u(baseFinderFeed.getItemId())));
            }
            p0Var.A = false;
            observer.x(view, p0Var);
        }
        return jz5.f0.f302826a;
    }
}
