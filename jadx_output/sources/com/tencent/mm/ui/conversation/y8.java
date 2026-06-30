package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public final class y8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment f208273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment openImKefuChattingUIFragment) {
        super(0);
        this.f208273d = openImKefuChattingUIFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent;
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest;
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment openImKefuChattingUIFragment = this.f208273d;
        android.content.Intent intent2 = openImKefuChattingUIFragment.getIntent();
        if (intent2 != null && (openIMKefuStartConversationRequest = (com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest) intent2.getParcelableExtra("key_start_conversation_request")) != null) {
            return openIMKefuStartConversationRequest;
        }
        androidx.fragment.app.FragmentActivity thisActivity = openImKefuChattingUIFragment.thisActivity();
        if (thisActivity == null || (intent = thisActivity.getIntent()) == null) {
            return null;
        }
        return (com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest) intent.getParcelableExtra("key_start_conversation_request");
    }
}
