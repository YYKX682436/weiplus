package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f188268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188270f;

    public t(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, int i17, int i18) {
        this.f188270f = noteEditorUI;
        this.f188268d = i17;
        this.f188269e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f188269e;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188270f;
        int i18 = this.f188268d;
        int i19 = i18 + i17;
        try {
            int itemCount = noteEditorUI.f188149o.getItemCount();
            if (i18 >= itemCount || i19 >= itemCount) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "[protected batch insert] correct position = " + i18 + ", insert end = " + i19 + ", item count = " + noteEditorUI.f188149o.getItemCount());
            } else {
                noteEditorUI.f188149o.notifyItemRangeInserted(i18, i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "[protected batch insert] correct insert start = " + i18 + ", insert end = " + i19 + ", item count = " + noteEditorUI.f188149o.getItemCount());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Note.NoteEditorUI", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "onNotifyitemRangeInsert error,positionStart:%d,count:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        }
    }
}
