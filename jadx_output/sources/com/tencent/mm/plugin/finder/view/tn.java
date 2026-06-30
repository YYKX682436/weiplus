package com.tencent.mm.plugin.finder.view;

/* loaded from: classes6.dex */
public final class tn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.c6 f133139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f133140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133141g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f133142h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(java.lang.String str, zy2.c6 c6Var, long j17, java.lang.String str2, long j18) {
        super(0);
        this.f133138d = str;
        this.f133139e = c6Var;
        this.f133140f = j17;
        this.f133141g = str2;
        this.f133142h = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(zy2.e6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) c17)).bj(this.f133138d, this.f133139e, this.f133140f, this.f133141g, this.f133142h);
        return jz5.f0.f302826a;
    }
}
