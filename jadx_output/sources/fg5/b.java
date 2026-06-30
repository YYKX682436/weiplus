package fg5;

/* loaded from: classes11.dex */
public final class b extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final yf5.j0 f262498d;

    /* renamed from: e, reason: collision with root package name */
    public long f262499e;

    /* renamed from: f, reason: collision with root package name */
    public long f262500f;

    public b(yf5.j0 adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f262498d = adapter;
    }

    public final fg5.a a() {
        long j17;
        long j18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = ((yf5.w0) this.f262498d).f461985q.f461847d;
        long j19 = 0;
        if (list != null) {
            int size = list.size();
            long j27 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                yf5.x xVar = (yf5.x) list.get(i17);
                com.tencent.mm.storage.l4 l4Var = xVar != null ? xVar.f461995d : null;
                if (l4Var != null && xVar.f462014z == 2) {
                    j27 += l4Var.d1();
                    j19++;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.String h17 = l4Var.h1();
                    if (h17 == null) {
                        h17 = "";
                    }
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, h17);
                    jSONObject.put("unreadmsgcnt", l4Var.d1());
                    jSONObject.put("msgtime", l4Var.w0() / 1000);
                    jSONObject.put("pos", i17);
                    arrayList.add(jSONObject);
                }
            }
            j18 = j19;
            j17 = j27;
        } else {
            j17 = 0;
            j18 = 0;
        }
        java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) arrayList).toString();
        kotlin.jvm.internal.o.f(jSONArray, "toString(...)");
        return new fg5.a(j17, j18, r26.i0.t(jSONArray, ",", ";", false));
    }

    public final long b() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.conversation.RepairerConfigConvUnreadMode()) == 1 ? 3L : 2L;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        fg5.a a17 = a();
        long b17 = b();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationForegroundListener", "onAppBackground unreadMsgOut=" + a17.f262495a + ", unreadSessOut=" + a17.f262496b + ", userGreyType=" + b17);
        com.tencent.mm.autogen.mmdata.rpt.MainSessionUnReadReportStruct mainSessionUnReadReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MainSessionUnReadReportStruct();
        mainSessionUnReadReportStruct.f59126f = a17.f262495a;
        mainSessionUnReadReportStruct.f59127g = a17.f262496b;
        mainSessionUnReadReportStruct.f59128h = mainSessionUnReadReportStruct.b("unread_sess_out_detail", a17.f262497c, true);
        mainSessionUnReadReportStruct.f59124d = this.f262499e;
        mainSessionUnReadReportStruct.f59125e = this.f262500f;
        mainSessionUnReadReportStruct.f59129i = b17;
        mainSessionUnReadReportStruct.f59130j = com.tencent.mm.ui.conversation.unreadmode.e0.f208130b ? 1L : 0L;
        mainSessionUnReadReportStruct.f59131k = 20260429L;
        mainSessionUnReadReportStruct.k();
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        fg5.a a17 = a();
        long j17 = a17.f262495a;
        this.f262499e = j17;
        long j18 = a17.f262496b;
        this.f262500f = j18;
        long b17 = b();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationForegroundListener", "onAppForeground unreadMsgIn=" + j17 + ", unreadSessIn=" + j18 + " userGreyType=" + b17);
        com.tencent.mm.autogen.mmdata.rpt.MainSessionUnReadEntryReportStruct mainSessionUnReadEntryReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MainSessionUnReadEntryReportStruct();
        mainSessionUnReadEntryReportStruct.f59119d = j17;
        mainSessionUnReadEntryReportStruct.f59120e = j18;
        mainSessionUnReadEntryReportStruct.f59121f = mainSessionUnReadEntryReportStruct.b("unread_sess_in_detail", a17.f262497c, true);
        mainSessionUnReadEntryReportStruct.f59122g = b17;
        mainSessionUnReadEntryReportStruct.f59123h = 20260429L;
        mainSessionUnReadEntryReportStruct.k();
    }
}
