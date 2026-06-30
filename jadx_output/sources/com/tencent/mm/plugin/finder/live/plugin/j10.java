package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z10 f113046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m70 f113047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113048f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j10(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, r45.m70 m70Var, java.lang.String str) {
        super(0);
        this.f113046d = z10Var;
        this.f113047e = m70Var;
        this.f113048f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = this.f113046d.f115261m.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        s40.w0.z5((s40.w0) c17, context, this.f113047e, null, this.f113048f, "2", 4, null);
        return jz5.f0.f302826a;
    }
}
