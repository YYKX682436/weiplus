package v13;

/* loaded from: classes5.dex */
public final class e extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public long f432531f;

    /* renamed from: g, reason: collision with root package name */
    public long f432532g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.i f432533h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.fts.t tVar = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137379d;
        if (tVar != null) {
            tVar.b(-86016, new v13.a(this));
        }
        final jm0.o oVar = this.f300267d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent>(oVar) { // from class: com.tencent.mm.plugin.fts.plc.FTSQueryClickRecallFSC$onAccountInit$1
            {
                this.__eventId = -981145195;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent) {
                com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent event = updateSearchIndexAtOnceEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkRecallRequest timeInterval:");
                v13.e eVar = v13.e.this;
                sb6.append(eVar.f432532g);
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSQueryClickRecallPLC", sb6.toString());
                java.lang.String str = gm0.j1.b().j() + "_recall_last_request_time";
                long c17 = c01.id.c();
                long j17 = eVar.f432532g;
                if (!new v65.b("MicroMsg.FTSQueryClickRecallPLC", c17, com.tencent.mm.sdk.platformtools.o4.L().q(str, 0L), j17 < 600000 ? 600000L : j17).b()) {
                    return false;
                }
                com.tencent.mm.sdk.platformtools.o4.L().B(str, c17);
                com.tencent.mm.modelbase.i iVar = eVar.f432533h;
                if (iVar != null) {
                    iVar.j();
                }
                r45.xc4 xc4Var = new r45.xc4();
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70667d = 4534;
                lVar.f70666c = "/cgi-bin/mmsearch-bin/localsearchdict";
                lVar.f70664a = xc4Var;
                lVar.f70665b = new r45.yc4();
                com.tencent.mm.modelbase.o a17 = lVar.a();
                com.tencent.mm.modelbase.i iVar2 = new com.tencent.mm.modelbase.i();
                iVar2.p(a17);
                eVar.f432533h = iVar2;
                pq5.g l17 = iVar2.l();
                if (l17 == null) {
                    return false;
                }
                l17.q(new v13.b(eVar));
                return false;
            }
        }.alive();
    }

    @Override // jm0.g
    public void S6() {
        com.tencent.mm.modelbase.i iVar = this.f432533h;
        if (iVar != null) {
            iVar.j();
        }
    }
}
