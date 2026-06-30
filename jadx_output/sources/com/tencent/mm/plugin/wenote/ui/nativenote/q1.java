package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.r1 f188257d;

    public q1(com.tencent.mm.plugin.wenote.ui.nativenote.r1 r1Var) {
        this.f188257d = r1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188257d.f188261e.f188267e.f188247d.f188244d;
        dp.a.makeText(noteEditorUI, noteEditorUI.getString(com.tencent.mm.R.string.j3u), 0).show();
    }
}
