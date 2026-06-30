package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ed implements com.tencent.mm.plugin.finder.live.plugin.jp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f112399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ad f112400b;

    public ed(kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.ad adVar) {
        this.f112399a = continuation;
        this.f112400b = adVar;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.jp
    public void a(boolean z17, int i17, com.tencent.mm.plugin.finder.live.plugin.ip errType, java.lang.String str, java.lang.Long l17, int i18, java.lang.String str2, java.lang.String str3, ek2.i2 i2Var) {
        kotlin.jvm.internal.o.g(errType, "errType");
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveChargePayPluginEx", "after pay left balance:" + l17);
        } else {
            int ordinal = errType.ordinal();
            com.tencent.mm.plugin.finder.live.plugin.ad adVar = this.f112400b;
            if (ordinal == 1) {
                pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.fd(str3, adVar));
            } else if (ordinal == 2) {
                if (i17 == 10003) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.id(adVar));
                } else {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.fd(str3, adVar));
                }
            }
        }
        this.f112399a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
    }
}
