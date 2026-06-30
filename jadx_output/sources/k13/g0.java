package k13;

/* loaded from: classes10.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI f303216d;

    public g0(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI forceNotifyShowUI) {
        this.f303216d = forceNotifyShowUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI.f137342s;
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI forceNotifyShowUI = this.f303216d;
        forceNotifyShowUI.getWindow().getDecorView().setKeepScreenOn(true);
        forceNotifyShowUI.getWindow().addFlags(128);
        boolean z17 = forceNotifyShowUI.f137350p;
        java.lang.String str = forceNotifyShowUI.f137327d;
        if (z17) {
            i95.m c17 = i95.n0.c(h13.l0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (!h13.l0.Ui((h13.l0) c17, null, 1, null)) {
                com.tencent.mars.xlog.Log.i(str, "PlaySound.playRoot");
                forceNotifyShowUI.f137345h = com.tencent.mm.sdk.platformtools.v5.d(forceNotifyShowUI.getContext(), com.tencent.mm.R.string.f492151ff0, com.tencent.mm.sdk.platformtools.u5.NOTSET, 2, true, null);
            }
        }
        if (forceNotifyShowUI.f137351q) {
            i95.m c18 = i95.n0.c(h13.l0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            if (h13.l0.Vi((h13.l0) c18, null, 1, null)) {
                com.tencent.mars.xlog.Log.i(str, "vibrator.vibrate");
                ((android.os.Vibrator) ((jz5.n) forceNotifyShowUI.f137344g).getValue()).vibrate(new long[]{1000, 1000, 1000, 1000}, 0);
            }
        }
        forceNotifyShowUI.f137352r = true;
    }
}
