package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes7.dex */
public final class to extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.uo f136049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f136050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(com.tencent.mm.plugin.finder.viewmodel.component.uo uoVar, long j17) {
        super(1);
        this.f136049d = uoVar;
        this.f136050e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(it, this.f136049d.Q6(this.f136050e)));
    }
}
