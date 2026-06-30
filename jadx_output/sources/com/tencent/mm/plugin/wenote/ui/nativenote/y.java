package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188312d;

    public y(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188312d = noteEditorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188312d;
        com.tencent.mm.plugin.wenote.ui.nativenote.adapter.NoteLinearLayoutManager noteLinearLayoutManager = noteEditorUI.K;
        if (noteLinearLayoutManager != null) {
            int i17 = noteEditorUI.W;
            int i18 = noteEditorUI.X;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(noteLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$28", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            noteLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(noteLinearLayoutManager, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$28", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            noteEditorUI.U = noteEditorUI.W;
            noteEditorUI.V = noteEditorUI.X;
        }
    }
}
