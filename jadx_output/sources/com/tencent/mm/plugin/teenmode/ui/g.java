package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI f172997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI authorizationDetailUI) {
        super(0);
        this.f172997d = authorizationDetailUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return ot0.q.v(this.f172997d.getIntent().getStringExtra("intent_extra_msg_content"));
    }
}
