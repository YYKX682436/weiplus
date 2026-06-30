package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class l implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.n f159582d;

    public l(com.tencent.mm.plugin.scanner.ui.n nVar) {
        this.f159582d = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.scanner.ui.n nVar = this.f159582d;
        nVar.N.getHeight();
        nVar.N.getLineHeight();
        if (nVar.N.getText() != null && nVar.N.getHeight() > 0 && nVar.N.getLineHeight() > 0 && nVar.S == null) {
            if (nVar.N.getHeight() / nVar.N.getLineHeight() > 5 && !nVar.R && !nVar.Q) {
                nVar.P.setVisibility(0);
                nVar.N.setMaxLines(5);
                nVar.R = true;
                com.tencent.mm.plugin.scanner.ui.m mVar = nVar.W;
                if (mVar != null) {
                    java.lang.String str = nVar.f197780q;
                    if (((str == null || str.length() <= 0) ? null : (java.lang.Boolean) ((com.tencent.mm.plugin.scanner.ui.v0) mVar).f159657a.A.get(str)) == null) {
                        com.tencent.mm.plugin.scanner.ui.m mVar2 = nVar.W;
                        java.lang.String str2 = nVar.f197780q;
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        com.tencent.mm.plugin.scanner.ui.v0 v0Var = (com.tencent.mm.plugin.scanner.ui.v0) mVar2;
                        v0Var.getClass();
                        if (str2 != null && str2.length() > 0) {
                            v0Var.f159657a.A.put(str2, bool);
                        }
                        com.tencent.mm.ui.base.preference.r rVar = ((com.tencent.mm.plugin.scanner.ui.v0) nVar.W).f159657a.f159309d;
                        if (rVar != null) {
                            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
                        }
                    }
                }
            }
            int height = nVar.N.getHeight() / nVar.N.getLineHeight();
        }
        nVar.N.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
