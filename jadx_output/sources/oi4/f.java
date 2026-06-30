package oi4;

/* loaded from: classes9.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f345631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f345632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kj4.b f345633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oi4.g f345634g;

    public f(com.tencent.mm.storage.z3 z3Var, in5.s0 s0Var, kj4.b bVar, oi4.g gVar) {
        this.f345631d = z3Var;
        this.f345632e = s0Var;
        this.f345633f = bVar;
        this.f345634g = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/like/LikeHistoryItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.storage.z3 z3Var = this.f345631d;
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 54);
        in5.s0 s0Var = this.f345632e;
        j45.l.n(s0Var.f293121e, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 213);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(z3Var.d1(), 4L);
        hi4.k kVar = hi4.m.f281555f;
        java.lang.String d17 = z3Var.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        kVar.c(d17, 201);
        java.lang.String str = this.f345633f.f308452d;
        mj4.h t17 = ai4.m0.f5173a.G().t(str);
        oi4.g gVar = this.f345634g;
        if (t17 != null) {
            java.lang.String a17 = en1.a.a();
            kotlin.jvm.internal.o.f(a17, "username(...)");
            gVar.n(a17, t17, null);
        } else {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gVar.p(context, str, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/like/LikeHistoryItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
