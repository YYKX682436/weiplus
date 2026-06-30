package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class fb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI f129231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI) {
        super(0);
        this.f129231d = finderMsgFeedDetailUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f129231d.getIntent().getIntExtra("KEY_INVOKE_SOURCE_TYPE", 0));
    }
}
