package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class m4 extends com.tencent.mm.ui.widget.dialog.k2 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.LayoutInflater f180490d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f180491e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.MaxListView f180492f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f180493g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.g0 f180494h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.j4 f180495i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.k4 f180496m;

    public m4(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        this.f180490d = android.view.LayoutInflater.from(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d6f, (android.view.ViewGroup) null);
        this.f180491e = inflate;
        this.f180492f = (com.tencent.mm.ui.base.MaxListView) inflate.findViewById(com.tencent.mm.R.id.pcb);
        this.f180493g = (android.widget.TextView) this.f180491e.findViewById(com.tencent.mm.R.id.pc9);
        com.tencent.mm.plugin.wallet_core.ui.j4 j4Var = new com.tencent.mm.plugin.wallet_core.ui.j4(this);
        this.f180495i = j4Var;
        this.f180492f.setAdapter((android.widget.ListAdapter) j4Var);
        this.f180491e.findViewById(com.tencent.mm.R.id.pc_).setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.g4(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.wallet_core.ui.m4 c(android.content.Context r16, com.tencent.mm.plugin.wallet_core.model.Orders r17, java.lang.String r18, com.tencent.mm.plugin.wallet_core.ui.k4 r19, android.content.DialogInterface.OnCancelListener r20) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.m4.c(android.content.Context, com.tencent.mm.plugin.wallet_core.model.Orders, java.lang.String, com.tencent.mm.plugin.wallet_core.ui.k4, android.content.DialogInterface$OnCancelListener):com.tencent.mm.plugin.wallet_core.ui.m4");
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletFavorDialog", "dismiss exception, e = " + e17.getMessage());
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f180491e);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.wallet_core.ui.j4 j4Var;
        if (i17 == 4 && (j4Var = this.f180495i) != null) {
            at4.o0 o0Var = j4Var.f180358g;
            this.f180496m.a(this.f180494h.g(o0Var.a(o0Var.f13911c, -1)));
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }
}
