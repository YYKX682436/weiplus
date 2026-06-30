package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI f161141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        super(0);
        this.f161141d = colorfulChatroomQRCodeUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f161141d.getIntent().getStringExtra("from_userName");
        return stringExtra == null ? "" : stringExtra;
    }
}
