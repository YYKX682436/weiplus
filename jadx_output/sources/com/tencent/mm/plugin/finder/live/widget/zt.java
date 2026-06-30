package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class zt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pu f120609d;

    public zt(com.tencent.mm.plugin.finder.live.widget.pu puVar) {
        this.f120609d = puVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.pu puVar = this.f120609d;
        java.lang.Object obj = puVar.f118381d;
        q80.z zVar = obj instanceof q80.z ? (q80.z) obj : null;
        if (zVar != null) {
            zVar.R1(new com.tencent.mm.plugin.finder.live.widget.yt(puVar));
        }
    }
}
