package zw1;

/* loaded from: classes5.dex */
public class t4 implements ww1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ov f476804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476806c;

    public t4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, r45.ov ovVar, ww1.a3 a3Var) {
        this.f476806c = walletCollectQrCodeUI;
        this.f476804a = ovVar;
        this.f476805b = a3Var;
    }

    @Override // ww1.w
    public void a(android.view.View view, int i17) {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476806c;
        android.view.View view2 = walletCollectQrCodeUI.F;
        if (view2 != null) {
            ((android.widget.LinearLayout) walletCollectQrCodeUI.F.findViewById(com.tencent.mm.R.id.c3j)).setVisibility(4);
            ((android.widget.LinearLayout) walletCollectQrCodeUI.F.findViewById(com.tencent.mm.R.id.c3h)).setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdy, ((android.widget.TextView) walletCollectQrCodeUI.F.findViewById(com.tencent.mm.R.id.c3m)).getText()));
        }
        ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.c3j)).setVisibility(0);
        r45.ov ovVar = this.f476804a;
        if (i17 == ovVar.f382535f.size()) {
            walletCollectQrCodeUI.L = true;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.c3l);
            linearLayout.setVisibility(0);
            com.tencent.mm.ui.widget.edittext.PasterEditText pasterEditText = (com.tencent.mm.ui.widget.edittext.PasterEditText) linearLayout.findViewById(com.tencent.mm.R.id.c3k);
            pasterEditText.postDelayed(new zw1.r4(this, pasterEditText), 50L);
            walletCollectQrCodeUI.E.b(!com.tencent.mm.sdk.platformtools.t8.K0(pasterEditText.getText().toString()));
            if (!walletCollectQrCodeUI.K) {
                walletCollectQrCodeUI.f96434J = walletCollectQrCodeUI.E.f212058g.getMeasuredHeight();
            }
        } else {
            walletCollectQrCodeUI.L = false;
            android.view.View view3 = walletCollectQrCodeUI.F;
            ww1.a3 a3Var = this.f476805b;
            if (view3 != null) {
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view3.findViewById(com.tencent.mm.R.id.c3l);
                if (linearLayout2.getVisibility() == 0) {
                    linearLayout2.setVisibility(8);
                    linearLayout2.clearFocus();
                    linearLayout2.postDelayed(new zw1.s4(this), 200L);
                }
                ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.c3h)).setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdz, a3Var.P));
            }
            walletCollectQrCodeUI.E.b(true);
            a3Var.P = ((r45.hg5) ovVar.f382535f.get(i17)).f376139d;
            if (!walletCollectQrCodeUI.K) {
                walletCollectQrCodeUI.I = walletCollectQrCodeUI.E.f212058g.getMeasuredHeight();
            }
        }
        walletCollectQrCodeUI.F = view;
    }
}
