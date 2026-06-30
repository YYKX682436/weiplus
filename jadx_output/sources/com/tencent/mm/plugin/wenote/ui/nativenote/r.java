package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f188258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188259e;

    public r(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, int i17) {
        this.f188259e = noteEditorUI;
        this.f188258d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188259e;
        int i17 = this.f188258d;
        try {
            if (i17 < noteEditorUI.f188149o.getItemCount()) {
                noteEditorUI.f188149o.notifyItemRemoved(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "[protected remove] correct position = " + i17 + ", item count = " + noteEditorUI.f188149o.getItemCount());
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "[protected remove] error position = " + i17 + ", item count = " + noteEditorUI.f188149o.getItemCount());
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "onNotifyItemRemoved error,positionStart:%d", java.lang.Integer.valueOf(i17));
        }
    }
}
