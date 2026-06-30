package ub5;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ub5.j f426222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f426223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f426224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f426225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f426226h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f426227i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xj.m f426228m;

    public f(ub5.j jVar, java.util.List list, android.app.Activity activity, com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.storage.z3 z3Var, yz5.a aVar, xj.m mVar) {
        this.f426222d = jVar;
        this.f426223e = list;
        this.f426224f = activity;
        this.f426225g = k0Var;
        this.f426226h = z3Var;
        this.f426227i = aVar;
        this.f426228m = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/sheet/ForwardBottomSheetHelper$tryDecorateBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ub5.j jVar = this.f426222d;
        if (jVar != null) {
            ub5.j.a(jVar, 3, null, null, 6, null);
        }
        if (com.tencent.mm.ui.chatting.n3.w(this.f426223e)) {
            android.app.Activity activity = this.f426224f;
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
            u1Var.g(activity.getString(com.tencent.mm.R.string.ncg));
            u1Var.a(true);
            u1Var.m(com.tencent.mm.R.string.ohw);
            u1Var.b(new ub5.e(this.f426224f, this.f426225g, this.f426223e, this.f426226h, this.f426222d, this.f426227i, this.f426228m));
            u1Var.q(false);
        } else {
            ub5.g.f426229a.a(this.f426224f, this.f426225g, this.f426223e, this.f426226h, this.f426222d, this.f426227i, this.f426228m);
        }
        this.f426225g.u();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/sheet/ForwardBottomSheetHelper$tryDecorateBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
