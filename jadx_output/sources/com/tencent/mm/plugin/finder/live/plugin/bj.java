package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bj implements oe0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.cj f112041a;

    public bj(com.tencent.mm.plugin.finder.live.plugin.cj cjVar) {
        this.f112041a = cjVar;
    }

    @Override // oe0.w
    public void a(java.lang.String action, org.json.JSONObject params) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.plugin.finder.live.plugin.cj cjVar = this.f112041a;
        com.tencent.mars.xlog.Log.i(cjVar.f112160h, "finderLiveCallback action:".concat(action));
        if (kotlin.jvm.internal.o.b(action, "dynamicCardServerLost")) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.aj(cjVar));
        }
    }
}
