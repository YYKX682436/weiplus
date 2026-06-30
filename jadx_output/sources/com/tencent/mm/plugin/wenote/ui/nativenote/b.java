package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.d f188183d;

    public b(com.tencent.mm.plugin.wenote.ui.nativenote.d dVar) {
        this.f188183d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.d dVar = this.f188183d;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = dVar.f188189d;
        int i17 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.f188140e2;
        noteEditorUI.j7();
        com.tencent.mars.xlog.Log.w("MicroMsg.Note.NoteEditorUI", "containC2CVoiceMsg: %d", java.lang.Long.valueOf(dVar.f188189d.A));
        db5.e1.T(dVar.f188189d.getContext(), dVar.f188189d.getString(com.tencent.mm.R.string.f491209om));
    }
}
