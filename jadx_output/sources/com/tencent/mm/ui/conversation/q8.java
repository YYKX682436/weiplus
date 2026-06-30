package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public final class q8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI f208026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI openImKefuServiceChattingUI) {
        super(0);
        this.f208026d = openImKefuServiceChattingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f208026d.getIntent();
        if (intent != null) {
            return (com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest) intent.getParcelableExtra("key_start_conversation_request");
        }
        return null;
    }
}
