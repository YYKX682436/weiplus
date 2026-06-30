package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public final class g implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.h f189304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189305e;

    public g(com.tencent.mm.pluginsdk.model.h hVar, java.lang.String str) {
        this.f189304d = hVar;
        this.f189305e = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.pluginsdk.model.h hVar = this.f189304d;
        hVar.getClass();
        java.lang.String bizUserName = this.f189305e;
        kotlin.jvm.internal.o.g(bizUserName, "bizUserName");
        com.tencent.mm.pluginsdk.model.b0.f189197a.a(bizUserName, false, hVar.f189325a, new com.tencent.mm.pluginsdk.model.f(hVar));
        return true;
    }
}
