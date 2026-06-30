package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f188254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188255e;

    public q(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, int i17) {
        this.f188255e = noteEditorUI;
        this.f188254d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f188254d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188255e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "huahuastart: onNotifyItemChanged,position is %d %s", valueOf, java.lang.Long.valueOf(noteEditorUI.A));
        if (i17 < noteEditorUI.f188149o.getItemCount()) {
            noteEditorUI.f188149o.notifyItemChanged(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "[protected change] correct position = " + i17 + ", item count = " + noteEditorUI.f188149o.getItemCount());
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "[protected change] error position = " + i17 + ", item count = " + noteEditorUI.f188149o.getItemCount());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "huahuaend: onNotifyItemChanged,position is %d", java.lang.Integer.valueOf(i17));
    }
}
