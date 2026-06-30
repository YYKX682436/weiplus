package pl2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f356630d;

    public k(pl2.s sVar) {
        this.f356630d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pl2.s sVar = this.f356630d;
        if (sVar.f356656k.size() < 2) {
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = sVar.f356653h;
            if (wxRefreshLayout == null) {
                kotlin.jvm.internal.o.o("sidebarRvLayout");
                throw null;
            }
            wxRefreshLayout.setLoadingState(true);
            xx2.l lVar = sVar.f356648c;
            if (lVar == null) {
                kotlin.jvm.internal.o.o("finderSideBar");
                throw null;
            }
            android.view.View findViewById = lVar.f457984f.findViewById(com.tencent.mm.R.id.u4q);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) findViewById;
            mMProcessBar.setVisibility(0);
            mMProcessBar.d();
        }
    }
}
