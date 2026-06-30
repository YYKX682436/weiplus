package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class wk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI f129994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI finderWxProfileJumpDetailUI) {
        super(0);
        this.f129994d = finderWxProfileJumpDetailUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f129994d.getIntent().getStringExtra("InteractionNickname");
        return stringExtra == null ? "" : stringExtra;
    }
}
