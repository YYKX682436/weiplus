package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ho0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mo0 f112853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f112855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f112856g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112857h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fp f112858i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.go0 f112859m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho0(com.tencent.mm.plugin.finder.live.plugin.mo0 mo0Var, java.lang.String str, boolean z17, int i17, java.lang.String str2, com.tencent.mm.plugin.finder.live.plugin.fp fpVar, com.tencent.mm.plugin.finder.live.plugin.go0 go0Var) {
        super(0);
        this.f112853d = mo0Var;
        this.f112854e = str;
        this.f112855f = z17;
        this.f112856g = i17;
        this.f112857h = str2;
        this.f112858i = fpVar;
        this.f112859m = go0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.mo0 mo0Var = this.f112853d;
        int i17 = mo0Var.f113551f + 1;
        mo0Var.f113551f = i17;
        com.tencent.mm.plugin.finder.live.plugin.hp hpVar = com.tencent.mm.plugin.finder.live.plugin.dq.f112318x1;
        java.lang.String str = this.f112854e;
        boolean z17 = this.f112855f;
        int i18 = this.f112856g;
        hpVar.a(str, z17 ? i18 : i17, this.f112857h, z17 ? i18 : 1, z17, this.f112858i, kz5.b0.c(this.f112859m));
        return jz5.f0.f302826a;
    }
}
