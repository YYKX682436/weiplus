package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class y6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f173198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI) {
        super(0);
        this.f173198d = teenModePrivatePwdUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f173198d.getIntent().getIntExtra("intent_process", -1));
    }
}
