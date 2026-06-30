package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class p2 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f139730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.s2 f139732c;

    public p2(com.tencent.mm.plugin.game.luggage.jsapi.s2 s2Var, com.tencent.mm.ipcinvoker.r rVar, java.lang.String str) {
        this.f139732c = s2Var;
        this.f139730a = rVar;
        this.f139731b = str;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        this.f139730a.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mm.ipcinvoker.r rVar = this.f139730a;
        if (wxaLiteAppInfo == null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
        } else {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(this.f139732c.a(this.f139731b)));
        }
    }
}
