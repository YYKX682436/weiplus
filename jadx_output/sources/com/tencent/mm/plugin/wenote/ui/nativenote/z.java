package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188315d;

    public z(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188315d = noteEditorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188315d;
        try {
            int x17 = ((androidx.recyclerview.widget.LinearLayoutManager) noteEditorUI.f188148n.getLayoutManager()).x();
            iz4.c l17 = noteEditorUI.J1.l(x17);
            if (l17 == null || l17.d() != 4 || ((iz4.l) l17).f296134r) {
                return;
            }
            noteEditorUI.j3(x17, 0L);
        } catch (java.lang.NullPointerException unused) {
        }
    }
}
