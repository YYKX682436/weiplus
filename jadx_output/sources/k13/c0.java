package k13;

/* loaded from: classes8.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI f303198d;

    public c0(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI) {
        this.f303198d = forceNotifyListUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI = this.f303198d;
        forceNotifyListUI.f137340i.clear();
        forceNotifyListUI.f137340i.addAll(((h13.l0) i95.n0.c(h13.l0.class)).Bi());
        forceNotifyListUI.runOnUiThread(new k13.b0(forceNotifyListUI));
    }
}
