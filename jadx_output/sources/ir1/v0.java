package ir1;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f294061d;

    public v0(ir1.i1 i1Var) {
        this.f294061d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jr1.i iVar = jr1.i.f301360a;
        ir1.i1 i1Var = this.f294061d;
        int i17 = i1Var.f293986f;
        java.lang.String str = i1Var.f293985e;
        hr1.a aVar = i1Var.P;
        kotlin.jvm.internal.o.d(aVar);
        java.lang.String field_identityName = aVar.field_identityName;
        kotlin.jvm.internal.o.f(field_identityName, "field_identityName");
        hr1.a aVar2 = i1Var.P;
        kotlin.jvm.internal.o.d(aVar2);
        iVar.d(i17, str, field_identityName, aVar2.field_identityType, true, new ir1.u0(i1Var));
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
