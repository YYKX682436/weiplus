package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class ej extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fj f112426b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(com.tencent.mm.plugin.finder.live.plugin.fj fjVar, java.lang.Class cls) {
        super(cls);
        this.f112426b = fjVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.sy2 result = (r45.sy2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#onPollingSuccess isMount=");
        com.tencent.mm.plugin.finder.live.plugin.fj fjVar = this.f112426b;
        sb6.append(fjVar.f112562q);
        com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskBubblePlugin", sb6.toString());
        if (fjVar.f112562q) {
            ym5.a1.f(new com.tencent.mm.plugin.finder.live.plugin.dj(fjVar, result));
        }
    }
}
