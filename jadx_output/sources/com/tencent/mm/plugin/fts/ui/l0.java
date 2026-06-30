package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class l0 implements com.tencent.mm.plugin.fts.ui.widget.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseMainUI f138100a;

    public l0(com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI) {
        this.f138100a = fTSBaseMainUI;
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.a1
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI = this.f138100a;
        fTSBaseMainUI.L1.f138153r.A = str2;
        fTSBaseMainUI.f137937y0.t(str2, k23.r2.f303684f);
        com.tencent.mm.plugin.fts.ui.FTSBaseMainUI.v7(fTSBaseMainUI, str2);
        z50.e.f470163a.a(vu4.a.F, vu4.b.D, 3, 6, z13.f.Y6(fTSBaseMainUI.getContext()).a7(), fTSBaseMainUI.f137937y0.g());
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.a1
    public void b(java.lang.String str) {
        this.f138100a.f137937y0.t(str, k23.r2.f303684f);
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.a1
    public void c(boolean z17, boolean z18, java.lang.String str) {
        com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI = this.f138100a;
        fTSBaseMainUI.f137937y0.r(str);
        com.tencent.mm.plugin.fts.ui.FTSBaseMainUI.v7(fTSBaseMainUI, str);
        if (z17) {
            return;
        }
        if (z18) {
            fTSBaseMainUI.q7(fTSBaseMainUI.getString(com.tencent.mm.R.string.fh9));
        } else {
            fTSBaseMainUI.q7(fTSBaseMainUI.getString(com.tencent.mm.R.string.fh_));
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.a1
    public void d() {
        com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI = this.f138100a;
        com.tencent.mm.ui.tools.o3 o3Var = fTSBaseMainUI.f137937y0.f210323h;
        if (o3Var != null) {
            if (o3Var instanceof com.tencent.mm.plugin.fts.ui.widget.v) {
                ((com.tencent.mm.plugin.fts.ui.widget.v) o3Var).setCursorVisible(false);
            } else if (o3Var instanceof com.tencent.mm.plugin.fts.ui.widget.FTSActionBarSearchView) {
                ((com.tencent.mm.plugin.fts.ui.widget.FTSActionBarSearchView) o3Var).setCursorVisible(false);
            }
        }
        fTSBaseMainUI.L1.f138153r.f267961z = 1;
        if (!com.tencent.mm.plugin.fts.ui.n3.h()) {
            fTSBaseMainUI.x7(false, b23.e.f17388d);
        }
        fTSBaseMainUI.f137937y0.q(fTSBaseMainUI.getContext().getString(com.tencent.mm.R.string.fh7));
        z50.e.f470163a.a(vu4.a.E, vu4.b.D, 3, 6, z13.f.Y6(fTSBaseMainUI.getContext()).a7(), fTSBaseMainUI.f137937y0.g());
    }
}
