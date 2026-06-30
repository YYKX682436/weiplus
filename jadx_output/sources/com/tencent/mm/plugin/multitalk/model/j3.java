package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.b0 f150021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.a0 f150022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f150024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f150025h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.plugin.multitalk.model.b0 b0Var, com.tencent.mm.plugin.multitalk.model.a0 a0Var, java.lang.String str, android.graphics.Bitmap bitmap, int i17) {
        super(0);
        this.f150021d = b0Var;
        this.f150022e = a0Var;
        this.f150023f = str;
        this.f150024g = bitmap;
        this.f150025h = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f150021d.c();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f150022e.a(this.f150023f, this.f150024g, 90, this.f150025h);
        zj3.i.f473328a.a(4, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        return jz5.f0.f302826a;
    }
}
