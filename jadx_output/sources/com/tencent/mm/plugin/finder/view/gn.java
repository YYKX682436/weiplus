package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class gn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e1 f132176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f132177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f132178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f132179g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f132180h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(com.tencent.mm.plugin.finder.view.e1 e1Var, com.tencent.mm.plugin.finder.view.e3 e3Var, android.os.Bundle bundle, boolean z17, yz5.l lVar) {
        super(0);
        this.f132176d = e1Var;
        this.f132177e = e3Var;
        this.f132178f = bundle;
        this.f132179g = z17;
        this.f132180h = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f132176d.a();
        com.tencent.mm.plugin.finder.view.ko koVar = com.tencent.mm.plugin.finder.view.ko.f132520a;
        android.view.View rootView = this.f132177e.f131959f;
        kotlin.jvm.internal.o.f(rootView, "rootView");
        com.tencent.mm.plugin.finder.view.ko.a(koVar, rootView, this.f132178f, this.f132179g, this.f132180h);
        return jz5.f0.f302826a;
    }
}
