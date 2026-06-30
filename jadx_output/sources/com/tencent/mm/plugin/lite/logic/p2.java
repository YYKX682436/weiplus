package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class p2 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f144044a;

    public p2(com.tencent.mm.plugin.lite.logic.r2 r2Var, com.tencent.mm.ipcinvoker.r rVar) {
        this.f144044a = rVar;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        this.f144044a.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        this.f144044a.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
    }
}
