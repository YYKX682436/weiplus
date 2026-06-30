package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes14.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.w f175718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs0.h f175719e;

    public s(com.tencent.mm.plugin.vlog.model.w wVar, rs0.h hVar) {
        this.f175718d = wVar;
        this.f175719e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.model.w wVar = this.f175718d;
        os0.g gVar = wVar.f175766o;
        if (gVar != null) {
            gVar.n();
        }
        wVar.f175766o = null;
        rs0.i.f399296a.u(this.f175719e);
    }
}
