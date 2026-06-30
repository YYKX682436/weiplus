package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes3.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f188271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188272e;

    public t0(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, int i17) {
        this.f188272e = noteEditorUI;
        this.f188271d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188272e;
        int i17 = this.f188271d;
        if (i17 == 0) {
            noteEditorUI.f188150p.setVisibility(8);
            return;
        }
        if (i17 == 1) {
            noteEditorUI.f188150p.setVisibility(0);
            android.view.View view = noteEditorUI.S;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$45", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$45", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 2) {
            noteEditorUI.f188150p.setVisibility(0);
            android.view.View view2 = noteEditorUI.S;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$45", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$45", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 != 3) {
            return;
        }
        noteEditorUI.f188150p.setVisibility(0);
        android.view.View view3 = noteEditorUI.S;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$45", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$45", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
