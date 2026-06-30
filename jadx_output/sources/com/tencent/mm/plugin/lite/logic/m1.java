package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes8.dex */
public class m1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.h f144014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f144016g;

    public m1(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.lang.String str, com.tencent.mm.plugin.lite.api.h hVar, java.lang.String str2) {
        this.f144016g = g1Var;
        this.f144013d = str;
        this.f144014e = hVar;
        this.f144015f = str2;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d;
        java.lang.String str = this.f144015f;
        com.tencent.mm.plugin.lite.api.h hVar = this.f144014e;
        if (!z17) {
            if (hVar != null) {
                hVar.fail(str, 5);
                return;
            }
            return;
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = this.f144016g.y(this.f144013d, null);
        if (hVar != null) {
            if (y17 != null) {
                hVar.success(y17, 0);
            } else {
                hVar.fail(str, 2);
            }
        }
    }
}
