package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class l0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f188978d;

    public l0(com.tencent.mm.storage.f9 f9Var) {
        this.f188978d = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.ResendMsgEvent resendMsgEvent = new com.tencent.mm.autogen.events.ResendMsgEvent();
        resendMsgEvent.f54704g.f8032a = this.f188978d;
        resendMsgEvent.e();
    }
}
