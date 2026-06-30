package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes8.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188215d;

    public i1(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188215d = noteEditorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f188215d.m7(2);
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "current thread = " + java.lang.Thread.currentThread().getName() + ", call goBack upload note success");
    }
}
