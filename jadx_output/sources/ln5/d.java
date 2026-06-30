package ln5;

/* loaded from: classes15.dex */
public final class d extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.refreshLayout.WxRefreshLayout f319924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f319925e;

    public d(com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout, boolean z17) {
        this.f319924d = wxRefreshLayout;
        this.f319925e = z17;
    }

    @Override // qn5.a
    public void b(android.animation.Animator animator) {
        if (animator != null && animator.getDuration() == 0) {
            return;
        }
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f319924d;
        wxRefreshLayout.getCValues().f330213f = false;
        if (this.f319925e) {
            wxRefreshLayout.E(true);
        }
        tn5.a aVar = wxRefreshLayout.f213738h;
        if (aVar.f420851b == sn5.b.f410154m) {
            aVar.c(sn5.b.f410157p);
        }
    }
}
