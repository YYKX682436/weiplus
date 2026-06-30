package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class e2 implements gh5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188200a;

    public e2(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188200a = noteEditorUI;
    }

    @Override // gh5.a
    public void b(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onKeyboardChangeAfter newKeyboardState=");
        sb6.append(z17);
        sb6.append(" contentHeight=");
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188200a;
        sb6.append(noteEditorUI.f188148n.getMeasuredHeight());
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", sb6.toString());
        noteEditorUI.N = z17;
        if (z17 && !noteEditorUI.F7()) {
            noteEditorUI.y7(1, 0L);
        }
        if (noteEditorUI.C1) {
            noteEditorUI.E7();
        }
    }
}
