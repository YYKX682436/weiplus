package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188217d;

    public j(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188217d = noteEditorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188217d;
        noteEditorUI.V1 = db5.e1.Q(noteEditorUI.getContext(), "", noteEditorUI.getString(com.tencent.mm.R.string.f489711k), false, true, new com.tencent.mm.plugin.wenote.ui.nativenote.i(this));
    }
}
