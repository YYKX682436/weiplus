package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f188218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188219e;

    public j0(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, java.util.ArrayList arrayList) {
        this.f188219e = noteEditorUI;
        this.f188218d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.util.ArrayList arrayList2 = this.f188218d;
            int size = arrayList2.size();
            noteEditorUI = this.f188219e;
            if (i19 >= size) {
                break;
            }
            java.lang.String str = (java.lang.String) arrayList2.get(i19);
            iz4.f fVar = new iz4.f();
            fVar.f296134r = true;
            fVar.f296133q = 2;
            fVar.f296131o = noteEditorUI.J1.j();
            fVar.f296103a = hz4.l.b(fVar.toString(), 18);
            r45.gp0 gp0Var = new r45.gp0();
            noteEditorUI.P = gp0Var;
            gp0Var.e0(fVar.f296103a);
            java.lang.String c17 = qz4.c.c(str, hz4.l.c(noteEditorUI.P));
            fVar.f296138t = c17;
            fVar.f296135s = qz4.c.d(c17, hz4.l.e(noteEditorUI.P));
            arrayList.add(fVar);
            i19++;
        }
        android.app.ProgressDialog progressDialog = noteEditorUI.M;
        if (progressDialog == null || !progressDialog.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "user canceled");
            return;
        }
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
        if (!dVar.s(arrayList, i18, i17, d17)) {
            noteEditorUI.J1.u(arrayList, noteEditorUI.f188147m.d(), true, true, false, true, false);
        }
        noteEditorUI.z7(true, 100L);
        noteEditorUI.y7(1, 0L);
    }
}
