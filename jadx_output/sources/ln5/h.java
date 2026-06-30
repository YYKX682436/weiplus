package ln5;

/* loaded from: classes15.dex */
public final class h extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.refreshLayout.WxRefreshLayout f319939d;

    public h(com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout) {
        this.f319939d = wxRefreshLayout;
    }

    @Override // qn5.a
    public void b(android.animation.Animator animator) {
        boolean z17 = false;
        if (animator != null && animator.getDuration() == 0) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        this.f319939d.setDirectLoadingState(true);
    }
}
