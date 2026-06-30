package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188189d;

    public d(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188189d = noteEditorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.bq0 bq0Var;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188189d;
        mz4.d dVar = noteEditorUI.J1;
        java.lang.String p17 = dVar.p(true);
        if (noteEditorUI.f7(p17)) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 12;
            z9Var.f8547t = 23;
            z9Var.f8532e = noteEditorUI.A;
            favoriteOperationEvent.e();
        } else {
            if (noteEditorUI.G || noteEditorUI.E) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "syncWNNoteFavItem noteeditorui, do savewnnotefavitem %s", java.lang.Long.valueOf(noteEditorUI.A));
                mz4.j0 j0Var = noteEditorUI.f188147m;
                noteEditorUI.A7(p17, true, true, j0Var.f333306n, j0Var.f333307o, j0Var.f333308p, dVar.n(p17));
            } else if (noteEditorUI.F) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "syncWNNoteFavItem noteeditorui, do updateWNNoteFavitem %s", java.lang.Long.valueOf(noteEditorUI.A));
                mz4.j0 j0Var2 = noteEditorUI.f188147m;
                noteEditorUI.A7(p17, false, true, j0Var2.f333306n, j0Var2.f333307o, j0Var2.f333308p, dVar.n(p17));
            } else {
                noteEditorUI.G7(false);
            }
            noteEditorUI.f188167z1 = true;
        }
        if (noteEditorUI.V1 == null) {
            return;
        }
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(noteEditorUI.A);
        if (F != null && (bq0Var = F.field_favProto) != null) {
            java.util.Iterator it = bq0Var.f370964f.iterator();
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (gp0Var.I == 3 && (gp0Var.f375435s2 != 0 || gp0Var.V1 != 0)) {
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wenote.ui.nativenote.b(this));
                    return;
                }
            }
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wenote.ui.nativenote.c(this));
    }
}
