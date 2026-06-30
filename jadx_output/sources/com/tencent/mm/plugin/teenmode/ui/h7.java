package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class h7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f173026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI) {
        super(0);
        this.f173026d = teenModePrivatePwdUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f173026d.getIntent().getBooleanExtra("Intent_UseResult", false));
    }
}
