package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.v f137404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.g f137405e;

    public f(com.tencent.mm.plugin.fts.g gVar, p13.v vVar) {
        this.f137405e = gVar;
        this.f137404d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        o13.x xVar = (o13.x) this.f137405e.f137408o.get();
        if (xVar != null) {
            xVar.X2(this.f137404d);
        }
    }
}
