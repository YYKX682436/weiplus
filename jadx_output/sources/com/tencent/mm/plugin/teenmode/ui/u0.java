package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI f173149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI bindGuardianMsgUI) {
        super(0);
        this.f173149d = bindGuardianMsgUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f173149d.getIntent().getStringExtra("intent_extra_bind_ticket");
    }
}
