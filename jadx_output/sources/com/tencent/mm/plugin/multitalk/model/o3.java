package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f150059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f150061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f150062g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f150063h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(java.util.ArrayList arrayList, java.lang.String str, android.graphics.Bitmap bitmap, int i17, int i18) {
        super(0);
        this.f150059d = arrayList;
        this.f150060e = str;
        this.f150061f = bitmap;
        this.f150062g = i17;
        this.f150063h = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (com.tencent.mm.plugin.multitalk.model.a0 a0Var : this.f150059d) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            a0Var.a(this.f150060e, this.f150061f, this.f150062g, this.f150063h);
            zj3.i.f473328a.a(3, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        return jz5.f0.f302826a;
    }
}
