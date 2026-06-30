package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class kn extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f132517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f132518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132519f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(com.tencent.mm.plugin.finder.view.e3 e3Var, android.content.Context context, java.lang.String str) {
        super(1);
        this.f132517d = e3Var;
        this.f132518e = context;
        this.f132519f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.f132517d.h();
            android.content.Intent intent = new android.content.Intent();
            xy2.c.c(this.f132518e, intent);
            intent.addFlags(67108864);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub.c7((c61.ub) c17, this.f132518e, this.f132519f, 2, intent, null, null, null, null, 240, null);
        }
        return jz5.f0.f302826a;
    }
}
