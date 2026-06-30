package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class uw extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.vw f114624b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(com.tencent.mm.plugin.finder.live.plugin.vw vwVar, java.lang.Class cls) {
        super(cls);
        this.f114624b = vwVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.uy2 result = (r45.uy2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#onPollingSuccess isMount=");
        com.tencent.mm.plugin.finder.live.plugin.vw vwVar = this.f114624b;
        sb6.append(vwVar.f114826q);
        com.tencent.mars.xlog.Log.i("FinderLiveLogoReceivePlugin", sb6.toString());
        if (vwVar.f114826q) {
            ym5.a1.f(new com.tencent.mm.plugin.finder.live.plugin.tw(vwVar, result));
        }
    }
}
