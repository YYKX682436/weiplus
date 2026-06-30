package k93;

/* loaded from: classes11.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.d4 f305923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k93.j f305924e;

    public o(k93.j jVar, com.tencent.mm.storage.d4 d4Var) {
        this.f305924e = jVar;
        this.f305923d = d4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/widget/LabelAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        com.tencent.mm.storage.d4 d4Var = this.f305923d;
        sb6.append(d4Var.field_labelID);
        k93.j.x(this.f305924e, sb6.toString(), d4Var.field_labelName);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
