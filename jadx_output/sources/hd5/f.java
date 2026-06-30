package hd5;

/* loaded from: classes9.dex */
public final class f implements he5.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ he5.t f280597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hd5.j f280598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hd5.n f280599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd5.q f280600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hd5.o f280601e;

    public f(he5.t tVar, hd5.j jVar, hd5.n nVar, hd5.q qVar, hd5.o oVar) {
        this.f280597a = tVar;
        this.f280598b = jVar;
        this.f280599c = nVar;
        this.f280600d = qVar;
        this.f280601e = oVar;
    }

    public final void a() {
        this.f280597a.close();
        ((tb5.d0) ((tb5.n0) this.f280598b.f280612c.f460708c.a(tb5.n0.class))).m0("preProcessDataList", this.f280599c);
        this.f280600d.f280634f = this.f280597a.a();
        hd5.q qVar = this.f280600d;
        qVar.f280632d = ((java.util.LinkedList) qVar.f280631c).size();
        this.f280600d.f280637i = this.f280597a.d();
        sd5.p.a("preProcessDataList", new hd5.d(this.f280598b, this.f280600d));
        this.f280598b.a();
        ((tb5.d0) ((tb5.n0) this.f280598b.f280612c.f460708c.a(tb5.n0.class))).m0("handleMsgPreLoad", this.f280599c);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sd5.p.a("handleMsgPreLoad", new hd5.e(this.f280598b, this.f280600d, this.f280599c));
        hd5.v loader = this.f280600d.f280640l;
        kotlin.jvm.internal.o.f(loader, "loader");
        hd5.q qVar2 = this.f280600d;
        hd5.j jVar = this.f280598b;
        synchronized (loader) {
            if (qVar2.f280638j.get()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "cancel source apply");
                return;
            }
            yb5.l lVar = jVar.f280612c.f460726u;
            java.util.List dataListToSet = qVar2.f280639k;
            kotlin.jvm.internal.o.f(dataListToSet, "dataListToSet");
            lVar.getClass();
            lVar.f460740a = dataListToSet;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "sourceFinish action:" + this.f280599c + " addCount:" + this.f280600d.f280632d + " totalCount:" + this.f280600d.f280634f + " calDuration:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " queryCreateTime:" + this.f280600d.f280637i);
            this.f280598b.a();
            hd5.o oVar = this.f280601e;
            if (oVar != null) {
                oVar.next();
            }
        }
    }
}
