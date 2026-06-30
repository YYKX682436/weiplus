package zw1;

/* loaded from: classes5.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476864d;

    public z0(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476864d = collectMainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476864d;
        dp.a.makeText(collectMainUI.getContext(), collectMainUI.getString(com.tencent.mm.R.string.b_v), 1).show();
    }
}
