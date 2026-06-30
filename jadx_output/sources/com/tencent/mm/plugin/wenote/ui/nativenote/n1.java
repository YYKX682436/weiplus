package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class n1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.m1 f188245d;

    public n1(com.tencent.mm.plugin.wenote.ui.nativenote.m1 m1Var) {
        this.f188245d = m1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        int i17;
        mz4.d dVar;
        mz4.d dVar2;
        com.tencent.mm.plugin.wenote.ui.nativenote.m1 m1Var = this.f188245d;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = m1Var.f188244d;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(noteEditorUI.f188160x, noteEditorUI.f188159w);
        if (c01.ia.e(Li)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Note.NoteEditorUI", "forbidden all menu");
            return;
        }
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI2 = m1Var.f188244d;
        boolean booleanExtra = noteEditorUI2.getIntent().getBooleanExtra("show_jump_chat", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onCreateMMMenu: onlyShowJumpChat %b, mOpenNoteFromScene %d, mMsgSecurityPreviewType %d, mCanEditThisNote %b", java.lang.Boolean.valueOf(booleanExtra), java.lang.Integer.valueOf(noteEditorUI2.f188164y0), java.lang.Integer.valueOf(noteEditorUI2.f188163y), java.lang.Boolean.valueOf(noteEditorUI2.f188162x1));
        if (booleanExtra) {
            g4Var.a(21, com.tencent.mm.R.string.b2b);
        } else {
            int i18 = noteEditorUI2.f188164y0;
            com.tencent.mm.plugin.multitask.s0 s0Var = com.tencent.mm.plugin.multitask.s0.f150501a;
            if (i18 == 1) {
                int i19 = noteEditorUI2.f188163y;
                if (i19 < 2) {
                    if (i19 < 1) {
                        g4Var.f(4, noteEditorUI2.getString(com.tencent.mm.R.string.ccw));
                    }
                    cz4.f fVar = noteEditorUI2.F1;
                    if (fVar != null && fVar.w()) {
                        g4Var.f(15, noteEditorUI2.getString(com.tencent.mm.R.string.o_e));
                    }
                    if (noteEditorUI2.G1 != null && !noteEditorUI2.E) {
                        g4Var.f(17, s0Var.f(noteEditorUI2.getContext(), noteEditorUI2.G1.f300077a));
                    }
                    o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(noteEditorUI2.A);
                    if ((F != null && F.field_id != -1) || ((dVar2 = noteEditorUI2.J1) != null && dVar2.f333229a.stream().allMatch(new mz4.d$$c()))) {
                        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.Z6(noteEditorUI2, g4Var);
                    }
                    g4Var.f(3, noteEditorUI2.getString(com.tencent.mm.R.string.hjg));
                }
            } else if (i18 == 2) {
                if (!c01.ia.C(Li)) {
                    g4Var.f(0, noteEditorUI2.getString(com.tencent.mm.R.string.ccw));
                }
                if (qz4.a.a()) {
                    g4Var.f(7, noteEditorUI2.getContext().getString(com.tencent.mm.R.string.cbx));
                }
                cz4.f fVar2 = noteEditorUI2.F1;
                if (fVar2 != null && fVar2.w()) {
                    g4Var.f(15, noteEditorUI2.getString(com.tencent.mm.R.string.o_e));
                }
                if (noteEditorUI2.G1 != null && !noteEditorUI2.E) {
                    g4Var.f(17, s0Var.f(noteEditorUI2.getContext(), noteEditorUI2.G1.f300077a));
                }
                if (!noteEditorUI2.f188162x1) {
                    g4Var.f(14, noteEditorUI2.getString(com.tencent.mm.R.string.ccl));
                }
                java.lang.String str = (java.lang.String) com.tencent.mm.model.newabtest.z.Ai().z0("100353").t0().get("Close");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    z17 = false;
                    i17 = 0;
                } else {
                    z17 = false;
                    i17 = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
                }
                if (i17 == 0) {
                    z17 = true;
                }
                if (z17) {
                    g4Var.f(8, noteEditorUI2.getContext().getString(com.tencent.mm.R.string.f492637ha1));
                }
                o72.r2 F2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(noteEditorUI2.A);
                if ((F2 != null && F2.field_id != -1) || ((dVar = noteEditorUI2.J1) != null && dVar.f333229a.stream().allMatch(new mz4.d$$c()))) {
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.Z6(noteEditorUI2, g4Var);
                }
                g4Var.f(1, noteEditorUI2.getString(com.tencent.mm.R.string.f491195ca4));
                g4Var.f(2, noteEditorUI2.getContext().getString(com.tencent.mm.R.string.f490367t0));
            } else if (i18 == 4) {
                if (!c01.ia.C(Li)) {
                    g4Var.f(9, noteEditorUI2.getString(com.tencent.mm.R.string.ccw));
                }
                cz4.f fVar3 = noteEditorUI2.F1;
                if (fVar3 != null && fVar3.w()) {
                    g4Var.f(15, noteEditorUI2.getString(com.tencent.mm.R.string.o_e));
                }
                if (noteEditorUI2.G1 != null && !noteEditorUI2.E) {
                    g4Var.f(17, s0Var.f(noteEditorUI2.getContext(), noteEditorUI2.G1.f300077a));
                }
                if (qz4.a.a()) {
                    g4Var.f(12, noteEditorUI2.getContext().getString(com.tencent.mm.R.string.cbx));
                }
                g4Var.f(10, noteEditorUI2.getString(com.tencent.mm.R.string.hjg));
            } else if (i18 == 5 && !c01.ia.C(Li)) {
                g4Var.f(20, noteEditorUI2.getString(com.tencent.mm.R.string.ccw));
            }
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            g4Var.f(19, "test_auto_save");
        }
    }
}
