package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f161015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.i0 f161017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f161018g;

    public f0(android.graphics.Bitmap bitmap, java.lang.String str, com.tencent.mm.plugin.setting.ui.setting.i0 i0Var, yz5.a aVar) {
        this.f161015d = bitmap;
        this.f161016e = str;
        this.f161017f = i0Var;
        this.f161018g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.graphics.Bitmap bitmap = this.f161015d;
        if (bitmap != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            h0Var.f310123d = byteArrayOutputStream.toByteArray();
        }
        java.lang.Object obj = h0Var.f310123d;
        if (obj == null || ((byte[]) obj).length <= 0) {
            return;
        }
        com.tencent.mm.plugin.setting.ui.setting.i0 i0Var = this.f161017f;
        yz5.a aVar = this.f161018g;
        java.lang.String str = this.f161016e;
        com.tencent.mm.sdk.platformtools.x.o0(str, new com.tencent.mm.plugin.setting.ui.setting.e0(h0Var, str, i0Var, aVar));
    }
}
