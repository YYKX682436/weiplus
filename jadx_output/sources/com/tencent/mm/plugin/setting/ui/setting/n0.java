package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI f161342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f161343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI, android.graphics.Bitmap bitmap) {
        super(0);
        this.f161342d = colorfulChatroomQRCodeUI;
        this.f161343e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f161342d;
        androidx.appcompat.app.AppCompatActivity context = colorfulChatroomQRCodeUI.getContext();
        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
        dp.a.makeText(context, colorfulChatroomQRCodeUI.getString(com.tencent.mm.R.string.f492304g00, q75.c.e()), 1).show();
        this.f161343e.recycle();
        return jz5.f0.f302826a;
    }
}
