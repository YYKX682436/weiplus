package vw3;

/* loaded from: classes.dex */
public final class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerXLogUI f440982d;

    public h7(com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI) {
        this.f440982d = repairerXLogUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(lp0.b.g0(), false);
        if (s17 != null) {
            java.util.Iterator it = s17.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.vfs.x1) it.next()).a();
            }
        }
        com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI = this.f440982d;
        repairerXLogUI.runOnUiThread(new vw3.g7(repairerXLogUI));
    }
}
