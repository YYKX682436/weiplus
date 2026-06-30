package k93;

/* loaded from: classes11.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.d4 f305925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k93.j f305926e;

    public p(k93.j jVar, com.tencent.mm.storage.d4 d4Var) {
        this.f305926e = jVar;
        this.f305925d = d4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/widget/LabelAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k93.j jVar = this.f305926e;
        boolean z17 = jVar.f305902q;
        com.tencent.mm.storage.d4 d4Var = this.f305925d;
        if (z17) {
            k93.j.x(jVar, "" + d4Var.field_labelID, d4Var.field_labelName);
        } else {
            java.lang.String str = "" + d4Var.field_labelID;
            java.lang.String str2 = d4Var.field_labelName;
            jVar.getClass();
            f93.q5 q5Var = f93.q5.f260441a;
            boolean b17 = q5Var.b();
            android.content.Context context = jVar.f305898m;
            if (b17) {
                q5Var.d((android.app.Activity) context, str, str2);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LabelAdapter", "startActivity ContactEditLabel labelID:%s lebalName:%s", str, str2);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("label_id", str);
                intent.putExtra("label_name", str2);
                intent.putExtra("label_source", "label_source_SNS");
                intent.putExtra("last_page_source_type", 1);
                intent.setClass(context, com.tencent.mm.plugin.label.ui.ContactLabelEditUI.class);
                android.content.Context context2 = jVar.f305898m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "jumpToLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "jumpToLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
