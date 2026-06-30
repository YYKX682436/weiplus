package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.m2 f190460e;

    public l2(com.tencent.mm.pluginsdk.ui.chat.m2 m2Var, java.lang.String str) {
        this.f190460e = m2Var;
        this.f190459d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f190459d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "onTxtMsgSend, msg is null or nil? %s.", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str)));
        com.tencent.mm.pluginsdk.ui.chat.m2 m2Var = this.f190460e;
        if (m2Var.f190482a.f190090x0 == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        m2Var.f190482a.f190090x0.d(str);
    }
}
