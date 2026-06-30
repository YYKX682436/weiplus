package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class x6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f173189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI) {
        super(0);
        this.f173189d = teenModePrivatePwdUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (com.tenpay.android.wechat.TempSecureEditText) this.f173189d.findViewById(com.tencent.mm.R.id.kpq);
    }
}
