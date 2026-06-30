package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes3.dex */
public class c2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f138028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSChattingConvUI f138029e;

    public c2(com.tencent.mm.plugin.fts.ui.FTSChattingConvUI fTSChattingConvUI) {
        this.f138029e = fTSChattingConvUI;
        if (com.tencent.mm.storage.z3.R4(fTSChattingConvUI.f137957p)) {
            this.f138028d = r2;
            java.lang.String[] strArr = {fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.ich), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.icd), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.icg), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.ice), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.ick), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.ici), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.icj), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.icc)};
        } else {
            this.f138028d = r2;
            java.lang.String[] strArr2 = {fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.icd), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.icg), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.ice), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.ick), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.ici), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.icj), fTSChattingConvUI.getResources().getString(com.tencent.mm.R.string.icc)};
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f138028d.length;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.fts.ui.d2 d2Var = (com.tencent.mm.plugin.fts.ui.d2) k3Var;
        d2Var.f138039d.setTag(java.lang.Integer.valueOf(i17));
        d2Var.f138039d.setText(this.f138028d[i17]);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.fts.ui.FTSChattingConvUI fTSChattingConvUI = this.f138029e;
        return new com.tencent.mm.plugin.fts.ui.d2(fTSChattingConvUI, android.view.LayoutInflater.from(fTSChattingConvUI.getContext()).inflate(com.tencent.mm.R.layout.bc9, (android.view.ViewGroup) null));
    }
}
