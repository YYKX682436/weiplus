package oa2;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oa2.w f343832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f343833f;

    public q(java.lang.String str, oa2.w wVar, com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        this.f343831d = str;
        this.f343832e = wVar;
        this.f343833f = finderContact;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$initDesigner$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean h17 = ya2.g.h(ya2.h.f460484a, this.f343831d, null, false, false, 14, null);
        com.tencent.mm.protocal.protobuf.FinderContact contact = this.f343833f;
        oa2.w wVar = this.f343832e;
        if (h17) {
            kotlin.jvm.internal.o.f(contact, "$contact");
            if (wVar.f343844i == null) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) wVar.getContext(), 1, true);
                k0Var.q(wVar.getContext().getResources().getString(com.tencent.mm.R.string.f491289cn3), 17);
                k0Var.f211872n = new oa2.k(wVar);
                k0Var.f211881s = new oa2.l(wVar, contact);
                k0Var.f211854d = new oa2.m(wVar);
                wVar.f343844i = k0Var;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = wVar.f343844i;
            if (k0Var2 != null && !k0Var2.i()) {
                k0Var2.v();
            }
        } else {
            kotlin.jvm.internal.o.f(contact, "$contact");
            wVar.X6(contact, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$initDesigner$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
