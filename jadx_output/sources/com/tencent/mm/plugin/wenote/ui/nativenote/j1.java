package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class j1 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188220d;

    public j1(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188220d = noteEditorUI;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.f188140e2;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188220d;
        noteEditorUI.getClass();
        noteEditorUI.runOnUiThread(new com.tencent.mm.plugin.wenote.ui.nativenote.i1(noteEditorUI));
    }
}
