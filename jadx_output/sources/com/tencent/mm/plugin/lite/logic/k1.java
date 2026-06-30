package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes8.dex */
public class k1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.h f143994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f143995f;

    public k1(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.lang.String str, com.tencent.mm.plugin.lite.api.h hVar) {
        this.f143995f = g1Var;
        this.f143993d = str;
        this.f143994e = hVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d;
        com.tencent.mm.plugin.lite.api.h hVar = this.f143994e;
        java.lang.String str = this.f143993d;
        if (!z17) {
            if (hVar != null) {
                hVar.fail(str, -1);
                return;
            }
            return;
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = this.f143995f.y(str, null);
        if (hVar != null) {
            if (y17 != null) {
                hVar.success(y17, 0);
            } else {
                hVar.fail(str, 2);
            }
        }
    }
}
