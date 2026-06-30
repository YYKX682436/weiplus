package nx1;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx1.j f341291d;

    public h(nx1.j jVar) {
        this.f341291d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nx1.j jVar = this.f341291d;
        jVar.f341292a.dismiss();
        android.view.View view2 = jVar.f341293b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nx1.i iVar = jVar.f341294c;
        if (iVar != null) {
            com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) iVar;
            int c17 = nx1.b.c(editorUI.getContext());
            if (c17 == 2) {
                if (nx1.b.d(editorUI)) {
                    editorUI.f7();
                } else {
                    nx1.d.q().h(false);
                    nx1.b.a();
                    ix1.l lVar = new ix1.l();
                    lVar.f295338s = "";
                    lVar.f295312b = false;
                    lVar.f295317g = false;
                    lVar.f295313c = 0;
                    lVar.f295319i = true;
                    nx1.d.q().b(lVar, false);
                    editorUI.d7();
                }
            } else if (c17 == 3) {
                java.util.ArrayList b17 = nx1.b.b();
                if (nx1.d.q().g(b17)) {
                    editorUI.f7();
                } else {
                    nx1.d.q().h(false);
                    nx1.d.q().s(b17, null, false, true, false, false, false);
                    editorUI.b5();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
