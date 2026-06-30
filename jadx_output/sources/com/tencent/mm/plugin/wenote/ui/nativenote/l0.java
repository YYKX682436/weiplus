package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class l0 implements mz4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188233a;

    public l0(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188233a = noteEditorUI;
    }

    @Override // mz4.q
    public void a(java.lang.String str, iz4.k kVar) {
        int i17;
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "compressNoteVideo onExportFinish");
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188233a;
        android.app.ProgressDialog progressDialog = noteEditorUI.M;
        if (progressDialog != null) {
            progressDialog.dismiss();
            noteEditorUI.M = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str) || kVar == null || kVar.f296120w) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "file not exist or user canceled");
        } else {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            int i18 = 0;
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
            long g17 = ip.c.g();
            int vj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).vj();
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (((m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L) < g17) {
                kVar.f296135s = str;
                com.tencent.mm.plugin.wenote.ui.nativenote.k0 k0Var = new com.tencent.mm.plugin.wenote.ui.nativenote.k0(this, kVar);
                mz4.j0 j0Var = noteEditorUI.f188147m;
                mz4.d dVar = noteEditorUI.J1;
                dVar.getClass();
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText d17 = j0Var.d();
                if (d17 != null) {
                    i18 = d17.getPosInDataList();
                    i17 = d17.f188114l1;
                } else {
                    i17 = -1;
                }
                if (!dVar.s(k0Var, i18, i17, d17)) {
                    noteEditorUI.J1.t(kVar, noteEditorUI.f188147m.d(), true, true, false, true, false);
                }
            } else {
                dp.a.makeText(noteEditorUI.getContext(), noteEditorUI.getString(com.tencent.mm.R.string.cds, java.lang.Integer.valueOf(vj6)), 1).show();
            }
        }
        noteEditorUI.z7(true, 100L);
        noteEditorUI.y7(1, 0L);
    }

    @Override // mz4.q
    public void b(java.lang.String str, iz4.k kVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "compressNoteVideo onImportFinish");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str) || kVar == null) {
            return;
        }
        kVar.f296117t = str;
    }
}
