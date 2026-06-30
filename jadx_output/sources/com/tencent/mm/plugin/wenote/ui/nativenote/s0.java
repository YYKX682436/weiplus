package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f188264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188265e;

    public s0(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, boolean z17) {
        this.f188265e = noteEditorUI;
        this.f188264d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188265e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onUpdateVKBVisibility 2 isVKBShow:%s", java.lang.Boolean.valueOf(noteEditorUI.N));
        boolean z17 = this.f188264d;
        if (z17 && !noteEditorUI.N) {
            noteEditorUI.showVKB();
        } else {
            if (z17 || !noteEditorUI.N) {
                return;
            }
            noteEditorUI.hideVKB();
        }
    }
}
