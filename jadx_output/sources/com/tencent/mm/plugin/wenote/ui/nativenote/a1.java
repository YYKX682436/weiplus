package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188178d;

    public a1(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188178d = noteEditorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188178d;
        db5.e1.s(noteEditorUI.getContext(), noteEditorUI.getString(com.tencent.mm.R.string.l_y), null);
    }
}
