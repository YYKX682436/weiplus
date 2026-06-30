package dk2;

/* loaded from: classes12.dex */
public final class ob implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f233849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f233850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.f f233851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.cb f233852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f233853h;

    public ob(dk2.tb tbVar, int i17, com.tencent.mm.protobuf.f fVar, dk2.cb cbVar, boolean z17) {
        this.f233849d = tbVar;
        this.f233850e = i17;
        this.f233851f = fVar;
        this.f233852g = cbVar;
        this.f233853h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dk2.tb tbVar = this.f233849d;
        gk2.e eVar = tbVar.f234126g;
        int i17 = this.f233850e;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FinderLivePollingService", "startPolling but liveContext = null: " + i17 + ", " + tbVar.c());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPolling ");
        sb6.append(i17);
        sb6.append(' ');
        com.tencent.mm.protobuf.f fVar = this.f233851f;
        sb6.append(fVar);
        sb6.append(' ');
        sb6.append(tbVar.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", sb6.toString());
        tbVar.f234123d.put(i17, this.f233852g);
        dk2.bb bbVar = new dk2.bb(i17, fVar);
        java.util.PriorityQueue priorityQueue = tbVar.f234120a;
        kz5.h0.A(priorityQueue, new dk2.nb(i17));
        tbVar.f234121b.remove(java.lang.Integer.valueOf(i17));
        if (!((java.util.LinkedList) tbVar.f234124e).contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", "startPolling but cmdId not in enabled list " + i17);
            bbVar.f233250f = true;
            bbVar.f233252h = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        if (this.f233853h) {
            ((java.util.LinkedList) tbVar.f234125f).add(java.lang.Integer.valueOf(i17));
        }
        priorityQueue.add(bbVar);
        dk2.tb.b(tbVar);
    }
}
