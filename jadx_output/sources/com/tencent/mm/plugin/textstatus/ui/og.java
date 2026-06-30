package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class og extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusTransparentActivity f174155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(com.tencent.mm.plugin.textstatus.ui.TextStatusTransparentActivity textStatusTransparentActivity) {
        super(0);
        this.f174155d = textStatusTransparentActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bi4.d1 d1Var = new bi4.d1();
        byte[] byteArrayExtra = this.f174155d.getIntent().getByteArrayExtra("SET_TEXT_PARAMS");
        if (byteArrayExtra != null) {
            d1Var.parseFrom(byteArrayExtra);
        }
        return d1Var;
    }
}
