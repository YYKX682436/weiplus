package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI f173068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI authorizationDetailUI) {
        super(0);
        this.f173068d = authorizationDetailUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(this.f173068d.getIntent().getLongExtra("intent_extra_msg_svrid", 0L));
    }
}
