package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class on extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f132797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f132798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f132799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f132800g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(com.tencent.mm.plugin.finder.view.e3 e3Var, android.os.Bundle bundle, boolean z17, yz5.l lVar) {
        super(0);
        this.f132797d = e3Var;
        this.f132798e = bundle;
        this.f132799f = z17;
        this.f132800g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.ko koVar = com.tencent.mm.plugin.finder.view.ko.f132520a;
        android.view.View rootView = this.f132797d.f131959f;
        kotlin.jvm.internal.o.f(rootView, "rootView");
        com.tencent.mm.plugin.finder.view.ko.a(koVar, rootView, this.f132798e, this.f132799f, this.f132800g);
        return jz5.f0.f302826a;
    }
}
