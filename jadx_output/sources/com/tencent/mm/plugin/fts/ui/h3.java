package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes3.dex */
public class h3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f138071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI f138072e;

    public h3(com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI fTSServiceNotifyUI) {
        this.f138072e = fTSServiceNotifyUI;
        this.f138071d = r0;
        java.lang.String[] strArr = {fTSServiceNotifyUI.getResources().getString(com.tencent.mm.R.string.idx), fTSServiceNotifyUI.getResources().getString(com.tencent.mm.R.string.icd)};
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f138071d.length;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.fts.ui.i3 i3Var = (com.tencent.mm.plugin.fts.ui.i3) k3Var;
        i3Var.f138077d.setTag(java.lang.Integer.valueOf(i17));
        i3Var.f138077d.setText(this.f138071d[i17]);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI fTSServiceNotifyUI = this.f138072e;
        return new com.tencent.mm.plugin.fts.ui.i3(fTSServiceNotifyUI, android.view.LayoutInflater.from(fTSServiceNotifyUI.getContext()).inflate(com.tencent.mm.R.layout.bc9, (android.view.ViewGroup) null));
    }
}
