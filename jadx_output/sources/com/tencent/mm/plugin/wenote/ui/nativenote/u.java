package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f188274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188276f;

    public u(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, int i17, int i18) {
        this.f188276f = noteEditorUI;
        this.f188274d = i17;
        this.f188275e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f188275e;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188276f;
        int i18 = this.f188274d;
        int i19 = i18 + i17;
        try {
            int itemCount = noteEditorUI.f188149o.getItemCount();
            if (i18 >= itemCount || i19 >= itemCount) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "[protected batch change] correct position = " + i18 + ", change end = " + i19 + ", item count = " + noteEditorUI.f188149o.getItemCount());
            } else {
                noteEditorUI.f188149o.notifyItemRangeChanged(i18, i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "[protected batch change] correct insert start = " + i18 + ", change end = " + i19 + ", item count = " + noteEditorUI.f188149o.getItemCount());
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "onNotifyItemRangeChanged error,positionStart:%d,count:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        }
    }
}
