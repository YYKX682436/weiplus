package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f113582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(java.util.List list, android.view.ViewGroup viewGroup) {
        super(0);
        this.f113582d = list;
        this.f113583e = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ff2.c cVar = ff2.c.f261638a;
        android.view.ViewGroup infoCardContainer = this.f113583e;
        kotlin.jvm.internal.o.f(infoCardContainer, "$infoCardContainer");
        cVar.b(this.f113582d, infoCardContainer, true, null);
        return jz5.f0.f302826a;
    }
}
