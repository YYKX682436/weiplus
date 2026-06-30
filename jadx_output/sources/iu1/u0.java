package iu1;

/* loaded from: classes9.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI f294959d;

    public u0(com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI cardNewBaseUI) {
        this.f294959d = cardNewBaseUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardNewBaseUI", "remove location in task");
        com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI.U6(this.f294959d, -3, false, 2, null);
    }
}
