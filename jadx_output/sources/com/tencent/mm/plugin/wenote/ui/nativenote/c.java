package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.d f188185d;

    public c(com.tencent.mm.plugin.wenote.ui.nativenote.d dVar) {
        this.f188185d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.d dVar = this.f188185d;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = dVar.f188189d;
        int i17 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.f188140e2;
        noteEditorUI.j7();
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 32;
        z9Var.f8532e = dVar.f188189d.A;
        favoriteOperationEvent.e();
        am.aa aaVar = favoriteOperationEvent.f54244h;
        boolean z17 = aaVar.f6142i;
        boolean z18 = aaVar.f6134a != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "filter itemInfo localId:%s isPause:%s ret:%s", java.lang.Long.valueOf(dVar.f188189d.A), java.lang.Boolean.valueOf(aaVar.f6142i), java.lang.Integer.valueOf(aaVar.f6134a));
        if (aaVar.f6136c == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "[handleShareToFriend] path = null");
            db5.e1.T(dVar.f188189d.getContext(), dVar.f188189d.getString(com.tencent.mm.R.string.cck));
            return;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "[handleShareToFriend] notDownload");
            db5.e1.T(dVar.f188189d.getContext(), dVar.f188189d.getString(com.tencent.mm.R.string.f489709i));
            return;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "[handleShareToFriend] notUpload");
            db5.e1.T(dVar.f188189d.getContext(), dVar.f188189d.getString(com.tencent.mm.R.string.f489710j));
            return;
        }
        long h17 = ip.c.h();
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI2 = dVar.f188189d;
        long j17 = noteEditorUI2.A;
        noteEditorUI2.getClass();
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        long j18 = F != null ? F.field_datatotalsize : 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "note2Send, totalSize:%s", java.lang.Long.valueOf(j18));
        if (j18 > h17) {
            db5.e1.T(dVar.f188189d.getContext(), dVar.f188189d.getString(com.tencent.mm.R.string.f491232cf0, com.tencent.mm.sdk.platformtools.t8.f0(h17)));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", 1);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("select_fav_local_id", dVar.f188189d.A);
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.a7(dVar.f188189d, intent);
        j45.l.v(dVar.f188189d, ".ui.transmit.SelectConversationUI", intent, 4102);
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI3 = dVar.f188189d;
        noteEditorUI3.X6(noteEditorUI3.A, 1, 0);
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
        dVar.f188189d.f100600g.f343487l++;
    }
}
