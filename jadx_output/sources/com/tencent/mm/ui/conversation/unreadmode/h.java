package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI f208142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI) {
        super(0);
        this.f208142d = unreadConversationFmUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Float.valueOf(this.f208142d.getResources().getDisplayMetrics().heightPixels * 0.2f);
    }
}
