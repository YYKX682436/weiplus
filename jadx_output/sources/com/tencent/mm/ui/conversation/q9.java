package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public final class q9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI f208027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI openImKefuServiceConversationUI) {
        super(0);
        this.f208027d = openImKefuServiceConversationUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f208027d.getIntent();
        return java.lang.Integer.valueOf(intent != null ? intent.getIntExtra("open_im_kefu_conversation_list_ui_from_scene", -1) : -1);
    }
}
