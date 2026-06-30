package ir1;

/* loaded from: classes5.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f294036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.p5 f294037e;

    public q0(ir1.i1 i1Var, com.tencent.wechat.mm.biz.p5 p5Var) {
        this.f294036d = i1Var;
        this.f294037e = p5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ir1.i1 i1Var = this.f294036d;
        i1Var.f293984d.B();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f294037e.f218476f);
        j45.l.j(i1Var.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
