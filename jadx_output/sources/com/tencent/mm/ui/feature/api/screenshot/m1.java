package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes.dex */
public final class m1 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f208526a;

    public m1(com.tencent.mm.ipcinvoker.r rVar) {
        this.f208526a = rVar;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToBizTask", "success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        com.tencent.mm.ipcinvoker.r rVar = this.f208526a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17));
        }
    }
}
