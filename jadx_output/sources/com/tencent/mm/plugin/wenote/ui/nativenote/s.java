package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f188262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188263e;

    public s(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, int i17) {
        this.f188263e = noteEditorUI;
        this.f188262d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188263e;
        int i17 = this.f188262d;
        try {
            if (i17 < noteEditorUI.f188149o.getItemCount()) {
                noteEditorUI.f188149o.notifyItemInserted(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "[protected insert] correct position = " + i17 + ", item count = " + noteEditorUI.f188149o.getItemCount());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "[protected insert] error position = " + i17 + ", item count = " + noteEditorUI.f188149o.getItemCount());
            }
        } catch (java.lang.Exception e17) {
            try {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Note.NoteEditorUI", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "onNotifyItemInserted error,positionStart:%d", java.lang.Integer.valueOf(i17));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "onNotifyItemRemoved error,positionStart:%d", java.lang.Integer.valueOf(i17));
            }
        }
    }
}
