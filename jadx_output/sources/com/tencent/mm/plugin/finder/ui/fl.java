package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class fl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI f129245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI finderWxProfileJumpDetailUI) {
        super(0);
        this.f129245d = finderWxProfileJumpDetailUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f129245d.getIntent().getIntExtra("InteractionScene", 0));
    }
}
