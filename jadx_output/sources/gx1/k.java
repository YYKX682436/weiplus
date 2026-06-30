package gx1;

/* loaded from: classes12.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.l f277300d;

    public k(gx1.l lVar) {
        this.f277300d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx1.l lVar = this.f277300d;
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) lVar.f277291d.f341332b;
        editorUI.getClass();
        qx1.q qVar = editorUI.f96500g;
        if (qVar != null) {
            qVar.d(null);
        }
        android.content.Context context = lVar.f277304f.getContext();
        if (lVar.i() == 5) {
            ix1.b bVar = (ix1.b) lVar.f277303e;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.component.editor.EditorFileUI.class);
            try {
                r45.gp0 gp0Var = bVar.f295324m;
                if (gp0Var == null) {
                    gp0Var = bVar.f295325n;
                }
                intent.putExtra("data_item_key", gp0Var.toByteArray());
            } catch (java.io.IOException unused) {
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            lVar.i();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
