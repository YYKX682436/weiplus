package tz4;

/* loaded from: classes12.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz4.k f423372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tz4.l f423373e;

    public n(tz4.l lVar, tz4.k kVar) {
        this.f423373e = lVar;
        this.f423372d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tz4.l lVar = this.f423373e;
        android.view.View view2 = lVar.f423355a;
        char c17 = (view2 == null || view2.getVisibility() == 8) ? (char) 0 : lVar.f423356b.getVisibility() == 0 ? (char) 3 : (char) 1;
        boolean z17 = (c17 == 3 || c17 == 0) ? false : true;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) this.f423372d;
        noteEditorUI.z7(!z17, 0L);
        android.view.View view3 = noteEditorUI.S;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI", "onClickExtendBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI", "onClickExtendBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        noteEditorUI.y7(z17 ? 3 : 2, 100L);
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
