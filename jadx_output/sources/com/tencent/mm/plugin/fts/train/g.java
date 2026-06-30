package com.tencent.mm.plugin.fts.train;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f137819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr f137820e;

    public g(com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr wCSearchGroupTrainMgr, android.content.Context context) {
        this.f137820e = wCSearchGroupTrainMgr;
        this.f137819d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.train.o oVar;
        com.tencent.mm.plugin.fts.train.o oVar2;
        com.tencent.mm.plugin.fts.train.o oVar3;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean loadDefaultModelInternal = this.f137820e.loadDefaultModelInternal(this.f137819d);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(loadDefaultModelInternal);
        oVar = this.f137820e.model;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(oVar.f137866b);
        oVar2 = this.f137820e.model;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.GroupTrainMgr", "init: loadDefault ok=%s, version=%d, boosters=%d, cost=%dms", valueOf, valueOf2, java.lang.Integer.valueOf(oVar2.f137865a.size()), java.lang.Long.valueOf(currentTimeMillis2));
        if (loadDefaultModelInternal) {
            com.tencent.mm.plugin.fts.train.p.a(35);
            this.f137820e.registerWatchers();
            this.f137820e.triggerPrewarmAsync();
        } else {
            com.tencent.mm.plugin.fts.train.p.a(18);
            oVar3 = this.f137820e.model;
            if (oVar3.f137865a.isEmpty()) {
                com.tencent.mm.plugin.fts.train.p.a(20);
            }
        }
    }
}
