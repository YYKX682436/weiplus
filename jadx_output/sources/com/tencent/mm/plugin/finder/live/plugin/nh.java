package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.qh f113632d;

    public nh(com.tencent.mm.plugin.finder.live.plugin.qh qhVar) {
        this.f113632d = qhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.qh qhVar = this.f113632d;
        if (qhVar.a1()) {
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.qh.t1(qhVar);
    }
}
