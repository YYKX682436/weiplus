package fm3;

/* loaded from: classes10.dex */
public final class g0 {

    /* renamed from: c, reason: collision with root package name */
    public static int f264072c;

    /* renamed from: d, reason: collision with root package name */
    public static int f264073d;

    /* renamed from: a, reason: collision with root package name */
    public static final fm3.g0 f264070a = new fm3.g0();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct f264071b = new com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f264074e = new java.util.LinkedHashMap();

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderPostStatusEvent>(a0Var) { // from class: com.tencent.mm.plugin.mv.model.MvCreateReportHelper$finderPostFinishListener$1
            {
                this.__eventId = 1254966226;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderPostStatusEvent finderPostStatusEvent) {
                com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct mvCreateActionStruct;
                java.lang.String str;
                com.tencent.mm.autogen.events.FinderPostStatusEvent event = finderPostStatusEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.vc vcVar = event.f54316g;
                if (vcVar != null && vcVar.f8189b && (mvCreateActionStruct = (com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct) fm3.g0.f264074e.remove(java.lang.Long.valueOf(vcVar.f8188a))) != null) {
                    r45.kv2 kv2Var = vcVar.f8190c;
                    if (kv2Var == null || (str = kv2Var.getString(0)) == null) {
                        str = "";
                    }
                    mvCreateActionStruct.f59485n = mvCreateActionStruct.b("MvObjectId", str, true);
                    mvCreateActionStruct.k();
                    mvCreateActionStruct.o();
                }
                return false;
            }
        }.alive();
    }

    public final void a(int i17, int i18) {
        com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c17 = c();
        c17.f59482k = 6L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('#');
        sb6.append(i18);
        c17.E = c17.b("MaterialCount", sb6.toString(), true);
        c17.k();
        c17.o();
    }

    public final void b(int i17, fm3.q data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c17 = c();
        c17.f59489r = c17.b("FeedId", data.a(), true);
        c17.f59490s = c17.b("FinderUin", data.b(), true);
        int i18 = f264072c;
        if (i18 != 1 && i18 != 2) {
            c17.f59493v = f264073d;
        }
        c17.f59495x = i17;
        c17.f59496y = i18;
        c17.A = data.d();
        c17.f59482k = 2L;
        c17.H = 1;
        c17.k();
        c17.o();
    }

    public final com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c() {
        return new com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct(f264071b.m());
    }
}
