package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.b0 f150032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.a0 f150033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f150035g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f150036h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.tencent.mm.plugin.multitalk.model.b0 b0Var, com.tencent.mm.plugin.multitalk.model.a0 a0Var, java.lang.String str, android.graphics.Bitmap bitmap, int i17) {
        super(0);
        this.f150032d = b0Var;
        this.f150033e = a0Var;
        this.f150034f = str;
        this.f150035g = bitmap;
        this.f150036h = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitalk.model.b0 b0Var = this.f150032d;
        if (b0Var != null) {
            b0Var.c();
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f150033e.a(this.f150034f, this.f150035g, 90, this.f150036h);
        zj3.i.f473328a.a(4, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        return jz5.f0.f302826a;
    }
}
