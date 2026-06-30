package zl2;

/* loaded from: classes3.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f473815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f473816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f473818g;

    public i1(gk2.e eVar, com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context, yz5.a aVar) {
        this.f473815d = eVar;
        this.f473816e = k0Var;
        this.f473817f = context;
        this.f473818g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkIfRoleMysterious$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gk2.e eVar = this.f473815d;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.c1) eVar.a(mm2.c1.class)).F1;
        if (finderJumpInfo != null) {
            android.content.Context context = this.f473817f;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.ta.g(ya2.e1.f460472a, context, finderJumpInfo, new zl2.h1(eVar, context, this.f473818g), null, false, 24, null);
        }
        this.f473816e.u();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkIfRoleMysterious$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
