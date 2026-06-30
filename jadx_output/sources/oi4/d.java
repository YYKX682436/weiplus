package oi4;

/* loaded from: classes9.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f345629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f345630e;

    public d(com.tencent.mm.storage.z3 z3Var, in5.s0 s0Var) {
        this.f345629d = z3Var;
        this.f345630e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/like/HalfScreenLikeItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.storage.z3 z3Var = this.f345629d;
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 54);
        j45.l.n(this.f345630e.f293121e, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 213);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(z3Var.d1(), 4L);
        hi4.k kVar = hi4.m.f281555f;
        java.lang.String d17 = z3Var.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        kVar.c(d17, 201);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/like/HalfScreenLikeItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
