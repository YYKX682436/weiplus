package cw1;

/* loaded from: classes12.dex */
public final /* synthetic */ class e5$$b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.e5 f222919d;

    @Override // java.lang.Runnable
    public final void run() {
        cw1.e5 e5Var = this.f222919d;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = e5Var.f222917r;
        cleanChattingOldUI.f95748p.setMessage(cleanChattingOldUI.getString(com.tencent.mm.R.string.b8w, java.lang.Integer.valueOf(java.lang.Math.min(100, ((e5Var.f222913n + e5Var.f222914o) * 100) / e5Var.f222915p))));
    }
}
