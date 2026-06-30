package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class in extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f134759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar) {
        super(1);
        this.f134759d = mnVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject it = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f134759d;
        mnVar.W6(false);
        com.tencent.mm.plugin.finder.viewmodel.component.mn.O6(mnVar, false);
        android.view.View Q6 = mnVar.Q6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(Q6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Q6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(Q6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$requestRefresh$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.app.Activity context = mnVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        kotlin.jvm.internal.o.d(ggVar);
        ggVar.W6(true, false);
        ggVar.T6();
        return jz5.f0.f302826a;
    }
}
