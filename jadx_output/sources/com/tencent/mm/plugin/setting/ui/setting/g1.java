package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f161060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI f161062f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f161063g;

    public g1(android.graphics.Bitmap bitmap, java.lang.String str, com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI, yz5.a aVar) {
        this.f161060d = bitmap;
        this.f161061e = str;
        this.f161062f = colorfulChatroomQRCodeUI;
        this.f161063g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (this.f161060d != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            this.f161060d.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            h0Var.f310123d = byteArrayOutputStream.toByteArray();
        }
        java.lang.Object obj = h0Var.f310123d;
        if (obj == null || ((byte[]) obj).length <= 0) {
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f161061e);
        try {
            com.tencent.mm.plugin.setting.ui.setting.e1 e1Var = new com.tencent.mm.plugin.setting.ui.setting.e1(h0Var);
            boolean z17 = com.tencent.mm.sdk.platformtools.x.f193064a;
            com.tencent.mm.sdk.platformtools.x.o0(r6Var.o(), e1Var);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.setting.ui.setting.f1(this.f161063g));
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String o17 = r6Var.o();
            androidx.appcompat.app.AppCompatActivity context = this.f161062f.getContext();
            ((ub0.r) oVar).getClass();
            q75.c.f(o17, context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ColorfulChatroomQRCodeUI", e17, "", new java.lang.Object[0]);
        }
    }
}
