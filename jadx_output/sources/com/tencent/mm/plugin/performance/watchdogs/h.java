package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.i f153052d;

    public h(com.tencent.mm.plugin.performance.watchdogs.i iVar) {
        this.f153052d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.performance.watchdogs.i iVar = this.f153052d;
        com.tencent.mm.plugin.performance.watchdogs.b bVar = iVar.f153061h;
        if (bVar != null) {
            bVar.a(new com.tencent.mm.plugin.performance.watchdogs.g(iVar));
        }
    }
}
