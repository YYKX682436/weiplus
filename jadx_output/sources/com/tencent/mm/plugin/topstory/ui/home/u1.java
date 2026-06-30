package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.y1 f175086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f175087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wm4.y f175088f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.plugin.topstory.ui.home.y1 y1Var, int i17, wm4.y yVar) {
        super(0);
        this.f175086d = y1Var;
        this.f175087e = i17;
        this.f175088f = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dn4.a aVar = dn4.a.f242033a;
        android.app.Activity context = this.f175086d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        aVar.b(context, "view_clk", this.f175087e);
        this.f175088f.f447329m.b();
        return jz5.f0.f302826a;
    }
}
