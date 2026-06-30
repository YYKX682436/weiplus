package zw1;

/* loaded from: classes5.dex */
public class q4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476765a;

    public q4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f476765a = walletCollectQrCodeUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiApplyQRcode，cgiBack.errType：%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar2.f70615a), java.lang.Integer.valueOf(fVar2.f70616b));
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476765a;
        if (walletCollectQrCodeUI.isFinishing() || walletCollectQrCodeUI.isDestroyed() || (fVar = fVar2.f70618d) == null) {
            return null;
        }
        if (fVar2.f70615a == 0 && fVar2.f70616b == 0) {
            r45.ov ovVar = (r45.ov) fVar;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = walletCollectQrCodeUI.E;
            if ((z2Var == null || !z2Var.h()) && walletCollectQrCodeUI.f96435d != 2) {
                ww1.a3 l76 = walletCollectQrCodeUI.l7(1);
                com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(walletCollectQrCodeUI, 1, 3, false);
                walletCollectQrCodeUI.E = z2Var2;
                z2Var2.f212058g.setFocusable(false);
                walletCollectQrCodeUI.E.m(ovVar.f382536g.f389135d, ovVar.f382537h.f389135d);
                android.widget.TextView textView = new android.widget.TextView(walletCollectQrCodeUI);
                textView.setPadding(i65.a.b(walletCollectQrCodeUI, 24), i65.a.b(walletCollectQrCodeUI, 40), i65.a.b(walletCollectQrCodeUI, 24), i65.a.b(walletCollectQrCodeUI, 24));
                textView.setTextSize(1, i65.a.q(walletCollectQrCodeUI.getContext()) * 17.0f);
                textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
                textView.setTextColor(walletCollectQrCodeUI.getResources().getColor(com.tencent.mm.R.color.FG_0));
                textView.setText(ovVar.f382533d);
                walletCollectQrCodeUI.E.t(textView);
                androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(walletCollectQrCodeUI, null);
                ww1.y yVar = new ww1.y(walletCollectQrCodeUI, ovVar.f382535f);
                yVar.f450355e = ovVar.f382534e;
                yVar.f450358h = walletCollectQrCodeUI;
                recyclerView.setFocusable(false);
                recyclerView.setAdapter(yVar);
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(walletCollectQrCodeUI));
                recyclerView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                walletCollectQrCodeUI.E.j(recyclerView);
                yVar.f450357g = new zw1.t4(walletCollectQrCodeUI, ovVar, l76);
                zw1.v4 v4Var = new zw1.v4(walletCollectQrCodeUI, ovVar);
                zw1.x4 x4Var = new zw1.x4(walletCollectQrCodeUI, ovVar);
                walletCollectQrCodeUI.E.b(false);
                com.tencent.mm.ui.widget.dialog.z2 z2Var3 = walletCollectQrCodeUI.E;
                z2Var3.D = v4Var;
                z2Var3.E = x4Var;
                z2Var3.C();
                walletCollectQrCodeUI.I = walletCollectQrCodeUI.E.f212058g.getMeasuredHeight();
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
