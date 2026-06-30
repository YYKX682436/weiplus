package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class j3 implements j35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f188946a;

    public j3(com.tencent.mm.pluginsdk.model.app.IPCInstallApp iPCInstallApp, com.tencent.mm.ipcinvoker.r rVar) {
        this.f188946a = rVar;
    }

    @Override // j35.d
    public void a(boolean z17) {
        com.tencent.mm.ipcinvoker.r rVar = this.f188946a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17));
        }
    }
}
