package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class vn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f133261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f133262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f133263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f133264g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(android.os.Bundle bundle, java.lang.Object obj, com.tencent.mm.plugin.finder.view.e3 e3Var, yz5.l lVar) {
        super(0);
        this.f133261d = bundle;
        this.f133262e = obj;
        this.f133263f = e3Var;
        this.f133264g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String a17 = ot5.e.a(((r45.nw6) this.f133262e).toByteArray());
        android.os.Bundle bundle = this.f133261d;
        bundle.putString("UserPreviewInfo", a17);
        com.tencent.mm.plugin.finder.view.ko koVar = com.tencent.mm.plugin.finder.view.ko.f132520a;
        com.tencent.mm.plugin.finder.view.e3 e3Var = this.f133263f;
        android.view.View rootView = e3Var.f131959f;
        kotlin.jvm.internal.o.f(rootView, "rootView");
        koVar.i(rootView, bundle);
        android.view.View rootView2 = e3Var.f131959f;
        kotlin.jvm.internal.o.f(rootView2, "rootView");
        koVar.l(rootView2, bundle);
        android.view.View rootView3 = e3Var.f131959f;
        kotlin.jvm.internal.o.f(rootView3, "rootView");
        koVar.j(rootView3, bundle);
        android.view.View rootView4 = e3Var.f131959f;
        kotlin.jvm.internal.o.f(rootView4, "rootView");
        koVar.k(rootView4, bundle, this.f133264g);
        android.view.View rootView5 = e3Var.f131959f;
        kotlin.jvm.internal.o.f(rootView5, "rootView");
        koVar.h(rootView5);
        return jz5.f0.f302826a;
    }
}
