package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public final class t9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI f208087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI openImKefuServiceConversationUI) {
        super(0);
        this.f208087d = openImKefuServiceConversationUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f208087d.getIntent();
        if (intent != null) {
            return (com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest) intent.getParcelableExtra("key_start_conversation_request");
        }
        return null;
    }
}
