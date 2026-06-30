package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class md implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sd f129519a;

    public md(com.tencent.mm.plugin.finder.ui.sd sdVar) {
        this.f129519a = sdVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.SelectCoverHelper", "ITEM_ID_CLEAR_PHOTO bOk：" + z17);
        if (!z17) {
            com.tencent.mars.xlog.Log.i("Finder.SelectCoverHelper", "ITEM_ID_CLEAR_PHOTO 取消");
            return;
        }
        com.tencent.mm.plugin.finder.ui.sd sdVar = this.f129519a;
        sdVar.d();
        com.tencent.mm.plugin.finder.ui.rd rdVar = new com.tencent.mm.plugin.finder.ui.rd(sdVar);
        so2.w5 w5Var = sdVar.f129805c;
        w5Var.getClass();
        pf5.e.launch$default(w5Var, null, null, new so2.t5(w5Var, rdVar, null), 3, null);
    }
}
