package kf3;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI f307431d;

    public t0(com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI) {
        this.f307431d = massSendHistoryUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("postDelayed enterHighLightMsgId:");
        com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI = this.f307431d;
        sb6.append(massSendHistoryUI.f148527e);
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendHistoryUI", sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.K0(massSendHistoryUI.f148527e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MassSendHistoryUI", "postDelayed enterHighLightMsgId empty");
            return;
        }
        kf3.k0 k0Var = massSendHistoryUI.f148528f;
        java.lang.String str = k0Var.f307376o;
        if3.y s07 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? null : if3.k0.Ai().s0(str);
        if (s07 != null) {
            int z07 = if3.k0.Ai().z0(s07.f291213f);
            com.tencent.mars.xlog.Log.i("MicroMsg.MassSendHistoryAdapter", "getHighLightPosition %s", java.lang.Integer.valueOf(k0Var.f307379r - z07));
            i17 = k0Var.f307379r - z07;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MassSendHistoryAdapter", "getHighLightPosition %s", -1);
            i17 = -1;
        }
        if (i17 != -1) {
            int firstVisiblePosition = i17 - massSendHistoryUI.f148526d.getFirstVisiblePosition();
            massSendHistoryUI.f148526d.setSelection(i17);
            massSendHistoryUI.f148526d.post(new kf3.l0(this, firstVisiblePosition));
        } else {
            androidx.appcompat.app.AppCompatActivity context = massSendHistoryUI.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = massSendHistoryUI.getString(com.tencent.mm.R.string.m6f);
            e4Var.c();
        }
    }
}
