package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class se implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req f202673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.te f202674b;

    public se(com.tencent.mm.ui.chatting.te teVar, com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req req) {
        this.f202674b = teVar;
        this.f202673a = req;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.ui.chatting.te teVar = this.f202674b;
        if (z17) {
            java.util.Map map = teVar.f202724i.f202746b;
            com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req req = this.f202673a;
            ((java.util.HashMap) map).put(req.transaction, req);
        }
        com.tencent.mm.pluginsdk.model.app.a5 a5Var = teVar.f202723h;
        if (a5Var != null) {
            a5Var.a(z17, z18);
        }
    }
}
