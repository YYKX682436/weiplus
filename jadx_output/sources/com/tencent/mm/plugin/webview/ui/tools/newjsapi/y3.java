package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class y3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f186675e;

    public y3(int i17, nw4.k kVar, int i18, boolean z17, int i19) {
        this.f186674d = kVar;
        this.f186675e = z17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        int i17;
        int i18;
        nw4.k kVar = this.f186674d;
        g4Var.h(2147483646, kVar.f340860a.getString(com.tencent.mm.R.string.hr_), com.tencent.mm.R.raw.icons_filled_share, kVar.f340860a.getResources().getColor(com.tencent.mm.R.color.f478502m));
        g4Var.h(2147483645, kVar.f340860a.getString(com.tencent.mm.R.string.hra), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0);
        if (this.f186675e) {
            boolean Ui = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui();
            boolean Ai = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ai();
            int i19 = Ui ? com.tencent.mm.R.string.pau : com.tencent.mm.R.string.oco;
            if (Ai) {
                i17 = com.tencent.mm.R.raw.photo_accounts_filled;
                i18 = com.tencent.mm.R.color.Blue_100;
            } else {
                i17 = com.tencent.mm.R.raw.subscriptions_filled;
                i18 = com.tencent.mm.R.color.Indigo_100;
            }
            g4Var.h(2147483644, kVar.f340860a.getString(i19), i17, kVar.f340860a.getResources().getColor(i18));
        }
    }
}
