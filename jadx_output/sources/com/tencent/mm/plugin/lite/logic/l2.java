package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class l2 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f144010a;

    public l2(com.tencent.mm.plugin.lite.logic.o2 o2Var, com.tencent.mm.ipcinvoker.r rVar) {
        this.f144010a = rVar;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        this.f144010a.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        this.f144010a.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
    }
}
