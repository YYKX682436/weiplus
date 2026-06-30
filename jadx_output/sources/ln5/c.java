package ln5;

/* loaded from: classes15.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.refreshLayout.WxRefreshLayout f319920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f319921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f319922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f319923g;

    public c(com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout, float f17, int i17, boolean z17) {
        this.f319920d = wxRefreshLayout;
        this.f319921e = f17;
        this.f319922f = i17;
        this.f319923g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f319920d;
        if (wxRefreshLayout.f213738h.f420852c == sn5.b.f410164w) {
            tn5.f fVar = wxRefreshLayout.A;
            fVar.b();
            wxRefreshLayout.getCValues().f330218k = wxRefreshLayout.getMeasuredWidth() / 2.0f;
            wxRefreshLayout.f213738h.e(sn5.b.f410159r);
            float f17 = wxRefreshLayout.getHeaderConfig().f330235a == 0 ? wxRefreshLayout.getHeaderConfig().f330238d : wxRefreshLayout.getHeaderConfig().f330235a;
            float f18 = this.f319921e;
            if (f18 < 10.0f) {
                f18 *= f17;
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(wxRefreshLayout.getCValues().f330209b, (int) f18);
            ofInt.setDuration(this.f319922f);
            ofInt.setInterpolator(new pn5.a(0));
            boolean z17 = this.f319923g;
            ofInt.addUpdateListener(new ln5.a(wxRefreshLayout, z17));
            ofInt.addListener(new ln5.b(wxRefreshLayout, z17));
            ofInt.start();
            fVar.f420872e = ofInt;
        }
    }
}
