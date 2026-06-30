package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public final class p9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI f207968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI openImKefuServiceConversationUI) {
        super(0);
        this.f207968d = openImKefuServiceConversationUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f207968d.getIntent();
        return java.lang.Boolean.valueOf(intent != null ? intent.getBooleanExtra("key_back_to_launcher_ui_when_finish", false) : false);
    }
}
