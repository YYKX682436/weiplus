package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class r7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f135774e;

    public r7(in5.s0 s0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f135773d = s0Var;
        this.f135774e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderControversialAlertUIC$updateControversialAlert$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = this.f135773d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo it = this.f135774e;
        kotlin.jvm.internal.o.f(it, "$it");
        xc2.y2.L(y2Var, context, new xc2.p0(it), null, null, null, 28, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderControversialAlertUIC$updateControversialAlert$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
