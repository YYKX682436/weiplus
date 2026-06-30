package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.i f153041d;

    public f(com.tencent.mm.plugin.performance.watchdogs.i iVar) {
        this.f153041d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.performance.watchdogs.i iVar = this.f153041d;
        com.tencent.mm.plugin.performance.watchdogs.b bVar = iVar.f153059f;
        if (bVar != null) {
            bVar.a(new com.tencent.mm.plugin.performance.watchdogs.e(iVar));
        }
    }
}
