package k13;

/* loaded from: classes10.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI f303218d;

    public h0(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI forceNotifyShowUI) {
        this.f303218d = forceNotifyShowUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI.f137342s;
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI forceNotifyShowUI = this.f303218d;
        forceNotifyShowUI.V6();
        forceNotifyShowUI.f137350p = false;
        forceNotifyShowUI.f137351q = false;
    }
}
