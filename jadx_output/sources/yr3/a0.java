package yr3;

/* loaded from: classes11.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.u5 f464717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr3.e0 f464718e;

    public a0(r45.u5 u5Var, yr3.e0 e0Var) {
        this.f464717d = u5Var;
        this.f464718e = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder$bindClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eq1.h hVar = eq1.h.f255812a;
        r45.u5 u5Var = this.f464717d;
        com.tencent.mm.protocal.protobuf.FinderObject d17 = hVar.d(u5Var.f387031f, u5Var.f387030e);
        java.lang.String str = u5Var.f387031f;
        java.lang.String str2 = u5Var.f387029d;
        yr3.e0 e0Var = this.f464718e;
        hVar.g(14, str, d17, str2, e0Var.f464784d.f448881o.d1());
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).s(e0Var.f464786f, e0Var.f464784d.f448881o.d1(), u5Var.f387031f, 14, ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(e0Var.f464784d.f448881o.d1()), d17 != null ? d17.getLiveInfo() : null);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder$bindClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
