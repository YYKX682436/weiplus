package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.o1 f188283d;

    public v1(com.tencent.mm.plugin.wenote.ui.nativenote.o1 o1Var) {
        this.f188283d = o1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188283d.f188247d.f188244d;
        dp.a.makeText(noteEditorUI, noteEditorUI.getString(com.tencent.mm.R.string.j3u), 0).show();
    }
}
