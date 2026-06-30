package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class ew extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f134304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        super(1);
        this.f134304d = sxVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f134304d;
            android.view.View h17 = sxVar.h();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$hidePanel$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$hidePanel$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View decorView = sxVar.getActivity().getWindow().getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) decorView).removeView(sxVar.h());
        }
        return jz5.f0.f302826a;
    }
}
