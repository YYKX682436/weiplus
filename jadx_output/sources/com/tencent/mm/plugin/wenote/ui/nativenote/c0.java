package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.d0 f188186d;

    public c0(com.tencent.mm.plugin.wenote.ui.nativenote.d0 d0Var) {
        this.f188186d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.d0 d0Var = this.f188186d;
        d0Var.f188193g.dismiss();
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = d0Var.f188194h;
        com.tencent.mm.ui.widget.snackbar.j.c(noteEditorUI.getString(com.tencent.mm.R.string.f_p), null, noteEditorUI, null, null);
    }
}
