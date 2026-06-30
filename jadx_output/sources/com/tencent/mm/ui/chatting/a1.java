package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class a1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.v0 f198357a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.ui.chatting.v0 v0Var, android.os.Looper looper) {
        super(looper);
        this.f198357a = v0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.ui.chatting.v0 v0Var = this.f198357a;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "reset speaker");
            boolean z17 = true;
            v0Var.F(true);
            com.tencent.mm.ui.chatting.component.ro roVar = v0Var.f202773s;
            if (roVar != null ? roVar.f199865e : v0Var.M) {
                z17 = false;
            }
            v0Var.f202775u = z17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AutoPlay", e17, "", new java.lang.Object[0]);
        }
    }
}
