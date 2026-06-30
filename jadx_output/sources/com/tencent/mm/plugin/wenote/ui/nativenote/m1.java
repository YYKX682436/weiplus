package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class m1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188244d;

    public m1(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188244d = noteEditorUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        hz4.h hVar = ((hz4.f) hz4.f.wi()).f286407d;
        boolean z17 = true;
        if (hVar != null) {
            java.lang.String h17 = hVar.h();
            hz4.i iVar = hVar.f286418i;
            java.lang.String a17 = iVar.a(h17);
            boolean g17 = hVar.g();
            com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct favoriteNoteClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct();
            favoriteNoteClickReportStruct.f56344d = 16;
            favoriteNoteClickReportStruct.f56346f = favoriteNoteClickReportStruct.b("noteid", a17, true);
            favoriteNoteClickReportStruct.f56347g = g17 ? 1 : 0;
            favoriteNoteClickReportStruct.f56345e = favoriteNoteClickReportStruct.b("sessionID", iVar.f286425a, true);
            favoriteNoteClickReportStruct.k();
            if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                java.lang.String n17 = favoriteNoteClickReportStruct.n();
                kotlin.jvm.internal.o.f(n17, "toShowString(...)");
                com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteReporter", "report%s %s", 14547, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
            }
        }
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188244d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) noteEditorUI.getContext(), 1, false);
        k0Var.f211892z = new com.tencent.mm.plugin.wenote.ui.nativenote.m1$$a();
        k0Var.f211872n = new com.tencent.mm.plugin.wenote.ui.nativenote.n1(this);
        k0Var.f211881s = new com.tencent.mm.plugin.wenote.ui.nativenote.o1(this);
        if (noteEditorUI.f188164y0 == 2) {
            mz4.d dVar = noteEditorUI.J1;
            if (dVar.f333234f < 1 && dVar.f333233e < 1) {
                z17 = false;
            }
            if (!z17) {
                android.view.View findViewById = noteEditorUI.findViewById(com.tencent.mm.R.id.f482482fq);
                if (findViewById != null) {
                    findViewById.setTag(com.tencent.mm.R.id.nwn, "1");
                }
                return false;
            }
        }
        android.view.View findViewById2 = noteEditorUI.findViewById(com.tencent.mm.R.id.f482482fq);
        if (findViewById2 != null) {
            findViewById2.setTag(com.tencent.mm.R.id.nwn, "0");
        }
        if (noteEditorUI.f188164y0 == 2) {
            noteEditorUI.b5();
            mz4.a0 a0Var = noteEditorUI.f188155s;
            if (a0Var != null) {
                a0Var.f333220a.dismiss();
            }
            noteEditorUI.f188154r.setVisibility(8);
            if (noteEditorUI.C1) {
                nz4.y.h().c();
            }
        }
        noteEditorUI.f188141J.postDelayed(new com.tencent.mm.plugin.wenote.ui.nativenote.w1(this, k0Var), 100L);
        return false;
    }
}
