package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class dl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI f129080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI finderWxProfileJumpDetailUI) {
        super(0);
        this.f129080d = finderWxProfileJumpDetailUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f129080d.getIntent().getStringExtra("InteractionUsername");
        return stringExtra == null ? "" : stringExtra;
    }
}
