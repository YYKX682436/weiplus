package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188206d;

    public g0(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188206d = noteEditorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188206d;
        dp.a.makeText(noteEditorUI, noteEditorUI.getString(com.tencent.mm.R.string.j3v), 0).show();
    }
}
