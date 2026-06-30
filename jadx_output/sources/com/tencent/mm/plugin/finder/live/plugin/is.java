package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class is implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113008a;

    public is(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f113008a = etVar;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            int i17 = com.tencent.mm.plugin.finder.live.plugin.et.J1;
            com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113008a;
            etVar.getClass();
            etVar.f112447l1 = null;
            pm0.v.L("Finder.LiveInputPlugin_requestLbs", true, new com.tencent.mm.plugin.finder.live.plugin.js(etVar));
        }
    }
}
