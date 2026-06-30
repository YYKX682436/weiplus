package ln5;

/* loaded from: classes15.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.refreshLayout.WxRefreshLayout f319918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f319919e;

    public b(com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout, boolean z17) {
        this.f319918d = wxRefreshLayout;
        this.f319919e = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        if (animation.getDuration() == 0) {
            return;
        }
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f319918d;
        wxRefreshLayout.A.f420872e = null;
        on5.g headerPlugin = wxRefreshLayout.getHeaderPlugin();
        tn5.a aVar = wxRefreshLayout.f213738h;
        if (headerPlugin == null) {
            aVar.e(sn5.b.f410157p);
            return;
        }
        sn5.b bVar = aVar.f420851b;
        sn5.b bVar2 = sn5.b.f410166y;
        if (!(bVar == bVar2)) {
            aVar.e(bVar2);
        }
        boolean z17 = this.f319919e;
        wxRefreshLayout.setRefreshingState(z17);
        wxRefreshLayout.x(z17);
    }
}
