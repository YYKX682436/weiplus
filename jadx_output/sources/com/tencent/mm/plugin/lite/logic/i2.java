package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class i2 implements kh0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f143984a;

    public i2(com.tencent.mm.plugin.lite.logic.j2 j2Var, com.tencent.mm.ipcinvoker.r rVar) {
        this.f143984a = rVar;
    }

    @Override // kh0.e
    public void a(java.lang.String str) {
        this.f143984a.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
    }

    @Override // kh0.e
    public void onSuccess(java.lang.String str) {
        this.f143984a.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
    }
}
