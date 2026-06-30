package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class ta extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        super(1);
        this.f174321d = textStatusEditActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "setForegroundPic requestEffect effectBitmap:" + bitmap);
        com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
        this.f174321d.J7(bitmap);
        return jz5.f0.f302826a;
    }
}
