package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m70 f124536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124537f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, r45.m70 m70Var, java.lang.String str) {
        super(0);
        this.f124535d = s1Var;
        this.f124536e = m70Var;
        this.f124537f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124535d;
        s40.w0.z5(w0Var, s1Var.f124718b, this.f124536e, s1Var.f124719c, this.f124537f, null, 16, null);
        return jz5.f0.f302826a;
    }
}
