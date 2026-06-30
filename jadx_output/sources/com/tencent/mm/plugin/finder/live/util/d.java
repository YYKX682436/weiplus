package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f115470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f115471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f115472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.jvm.internal.h0 h0Var, android.graphics.Bitmap bitmap, yz5.l lVar) {
        super(1);
        this.f115470d = h0Var;
        this.f115471e = bitmap;
        this.f115472f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        yz5.l lVar = this.f115472f;
        if (bitmap != null) {
            com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.plugin.finder.live.util.i.f115541b;
            java.lang.Object obj2 = this.f115470d.f310123d;
            android.graphics.Bitmap resource = this.f115471e;
            kotlin.jvm.internal.o.f(resource, "$resource");
            r2Var.put(obj2, new jz5.l(resource, bitmap));
            new android.graphics.Canvas(bitmap).drawColor(1711276032);
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        } else if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
