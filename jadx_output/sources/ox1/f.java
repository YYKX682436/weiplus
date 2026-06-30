package ox1;

/* loaded from: classes12.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f349599d;

    public f(ox1.s sVar) {
        this.f349599d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorSelectManager", "delete");
        boolean z17 = ox1.s.K;
        ox1.s sVar = this.f349599d;
        if (!z17 || !sVar.f349615a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "delete: not init or not editable");
            sVar.p();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            if (ox1.s.a(sVar)) {
                mx1.a aVar = sVar.f349636v;
                if (aVar != null) {
                    ((com.tencent.mm.plugin.component.editor.EditorUI) aVar).h7();
                }
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            mx1.a aVar2 = sVar.f349636v;
            if (aVar2 != null) {
                com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) aVar2;
                db5.e1.A(editorUI, editorUI.getString(com.tencent.mm.R.string.boi), "", editorUI.getString(com.tencent.mm.R.string.boh), editorUI.getString(com.tencent.mm.R.string.bog), new com.tencent.mm.plugin.component.editor.y0(editorUI), null);
            } else {
                sVar.d();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
