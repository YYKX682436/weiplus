package gx1;

/* loaded from: classes12.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.b0 f277334d;

    public z(gx1.b0 b0Var) {
        this.f277334d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVoiceItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx1.b0 b0Var = this.f277334d;
        ix1.n nVar = b0Var.G;
        if (nVar != null && nVar.f295349w.booleanValue()) {
            b0Var.G.f295350x = java.lang.Boolean.TRUE;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVoiceItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
