package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class v2 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f139756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.x2 f139758c;

    public v2(com.tencent.mm.plugin.game.luggage.jsapi.x2 x2Var, com.tencent.mm.ipcinvoker.r rVar, java.lang.String str) {
        this.f139758c = x2Var;
        this.f139756a = rVar;
        this.f139757b = str;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        this.f139756a.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mm.ipcinvoker.r rVar = this.f139756a;
        if (wxaLiteAppInfo == null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
        } else {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(this.f139758c.a(this.f139757b)));
        }
    }
}
