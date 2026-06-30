package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class nb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI f129546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI) {
        super(0);
        this.f129546d = finderMsgFeedDetailUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f129546d.getIntent().getStringExtra("key_show_thank_tips_content");
        return stringExtra == null ? "" : stringExtra;
    }
}
