package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f188210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188211e;

    public h0(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, android.app.Dialog dialog) {
        this.f188211e = noteEditorUI;
        this.f188210d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f188210d.dismiss();
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188211e;
        com.tencent.mm.ui.widget.snackbar.j.c(noteEditorUI.getString(com.tencent.mm.R.string.f_p), null, noteEditorUI, null, null);
    }
}
