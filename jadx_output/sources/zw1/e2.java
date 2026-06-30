package zw1;

/* loaded from: classes15.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476617d;

    public e2(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476617d = collectMainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        this.f476617d.f96413y.getLocationInWindow(iArr);
        com.tencent.mm.plugin.collect.ui.CollectMainUI.f96385e2 = iArr[1];
    }
}
