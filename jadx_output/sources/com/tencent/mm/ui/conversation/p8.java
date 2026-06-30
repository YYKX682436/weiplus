package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public final class p8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI f207967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI openImKefuServiceChattingUI) {
        super(0);
        this.f207967d = openImKefuServiceChattingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f207967d.getIntent();
        return java.lang.Boolean.valueOf(intent != null ? intent.getBooleanExtra("key_is_confirm_page_shown", false) : false);
    }
}
