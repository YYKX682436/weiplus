package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class s8 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.t8 f208067d;

    public s8(com.tencent.mm.ui.conversation.t8 t8Var) {
        this.f208067d = t8Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting loading cancel");
        this.f208067d.f208081a = true;
    }
}
