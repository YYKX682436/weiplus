package zw1;

/* loaded from: classes5.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476824d;

    public v0(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476824d = collectMainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476824d;
        int b17 = i65.a.b(collectMainUI.getContext(), 37);
        android.view.ViewGroup.LayoutParams layoutParams = collectMainUI.X.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = b17;
            collectMainUI.X.setLayoutParams(layoutParams);
            collectMainUI.X.requestLayout();
        }
    }
}
