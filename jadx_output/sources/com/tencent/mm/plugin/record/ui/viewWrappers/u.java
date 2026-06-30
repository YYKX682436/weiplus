package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes5.dex */
public class u implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Resources f155570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.x f155571b;

    public u(com.tencent.mm.plugin.record.ui.viewWrappers.x xVar, android.content.res.Resources resources) {
        this.f155571b = xVar;
        this.f155570a = resources;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.record.ui.viewWrappers.x xVar = this.f155571b;
        g4Var.c(0, 0, 0, xVar.f155581i.f155582a.getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy);
        if (!com.tencent.mm.app.plugin.k.a() || xVar.f155576d == null) {
            return;
        }
        if (!xVar.f155577e) {
            g4Var.c(0, 2, 0, xVar.f155581i.f155582a.getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
            g4Var.c(0, 4, 0, xVar.f155581i.f155582a.getString(com.tencent.mm.R.string.lsg), com.tencent.mm.R.raw.language_transfer_filled);
            g4Var.c(0, 3, 0, xVar.f155581i.f155582a.getString(com.tencent.mm.R.string.b3s), com.tencent.mm.R.raw.icons_filled_feedback_error);
        } else if (xVar.f155578f.f24265e != 2) {
            g4Var.c(0, 1, 0, xVar.f155581i.f155582a.getString(com.tencent.mm.R.string.b4a), com.tencent.mm.R.raw.icons_filled_translate);
        } else {
            g4Var.c(0, 2, 0, xVar.f155581i.f155582a.getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
        }
        com.tencent.mm.plugin.record.ui.viewWrappers.y yVar = xVar.f155581i;
        te5.x0.a(yVar.f155586e, g4Var, this.f155570a, xVar.f155579g.f256590a.f375408f, yVar.f155585d.Q0(), com.tencent.mm.sdk.platformtools.t8.u1(xVar.f155581i.f155585d.V1(), xVar.f155581i.f155585d.Q0()), xVar.f155581i.f155585d.I0(), 2);
    }
}
