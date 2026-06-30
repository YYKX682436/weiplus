package x63;

/* loaded from: classes5.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f452266a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f452267b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f452268c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f452269d = new java.util.concurrent.ConcurrentHashMap();

    public void a(long j17, y63.a aVar, y63.a aVar2, boolean z17, int i17) {
        if (j17 < 0 || aVar == null) {
            return;
        }
        this.f452266a.put(java.lang.Long.valueOf(j17), new android.util.Pair(aVar.field_username, aVar.field_key));
        this.f452267b.put(java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17));
        this.f452269d.put(java.lang.Long.valueOf(j17), new x63.o(this, aVar, aVar2, i17));
    }

    public void b(y63.a aVar, java.lang.String str, java.lang.String str2) {
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireReportManager", "reportSolitaireActive() groupSolitatire == null");
            return;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str2, aVar.field_firstMsgId);
        if (aVar.field_msgSvrId == 0) {
            aVar.field_msgSvrId = Li.I0();
            ((t63.e) i95.n0.c(t63.e.class)).Bi().W0(aVar, true);
        }
        c(aVar, true, str, aVar.field_msgSvrId);
    }

    public final void c(y63.a aVar, boolean z17, java.lang.String str, long j17) {
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireReportManager", "reportSolitaireActive() MsgSvrId==0 key:%s", aVar.field_key);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireReportManager", "reportSolitaireActive() MsgSvrId==%s key:%s", java.lang.Long.valueOf(j17), aVar.field_key);
        com.tencent.mm.autogen.mmdata.rpt.SolitaireActiveStruct solitaireActiveStruct = new com.tencent.mm.autogen.mmdata.rpt.SolitaireActiveStruct();
        solitaireActiveStruct.f60829l = solitaireActiveStruct.b("Identifier", aVar.field_key, true);
        solitaireActiveStruct.f60821d = solitaireActiveStruct.b("ChatName", aVar.field_username, true);
        solitaireActiveStruct.f60822e = solitaireActiveStruct.b("LaunchUserName", aVar.field_creator, true);
        if (z17) {
            solitaireActiveStruct.f60823f = solitaireActiveStruct.b("MsgUserName", str, true);
        } else {
            solitaireActiveStruct.f60823f = solitaireActiveStruct.b("MsgUserName", aVar.field_creator, true);
        }
        solitaireActiveStruct.f60824g = j17;
        if (aVar.L == 1) {
            solitaireActiveStruct.f60825h = aVar.H.length();
        }
        solitaireActiveStruct.f60826i = aVar.f459651J.length();
        solitaireActiveStruct.f60827j = aVar.I.length();
        if (z17) {
            solitaireActiveStruct.f60828k = 1L;
        } else {
            solitaireActiveStruct.f60828k = 2L;
        }
        solitaireActiveStruct.k();
    }

    public void d(y63.a aVar, int i17, int i18) {
        com.tencent.mm.autogen.mmdata.rpt.SolitaireClickReportStruct solitaireClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SolitaireClickReportStruct();
        solitaireClickReportStruct.f60834h = solitaireClickReportStruct.b("Identifier", aVar.field_key, true);
        solitaireClickReportStruct.f60830d = solitaireClickReportStruct.b("ChatName", aVar.field_username, true);
        solitaireClickReportStruct.f60831e = aVar.field_msgSvrId;
        solitaireClickReportStruct.f60832f = i17;
        solitaireClickReportStruct.f60833g = i18;
        solitaireClickReportStruct.k();
    }

    public void e(java.util.List list, int i17) {
        if (list == null && list.size() == 0) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f((y63.a) it.next(), i17);
        }
    }

    public void f(y63.a aVar, int i17) {
        if (aVar == null) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.SolitaireDropReportStruct solitaireDropReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SolitaireDropReportStruct();
        solitaireDropReportStruct.f60839h = solitaireDropReportStruct.b("Identifier", aVar.field_key, true);
        solitaireDropReportStruct.f60835d = solitaireDropReportStruct.b("ChatName", aVar.field_username, true);
        solitaireDropReportStruct.f60836e = solitaireDropReportStruct.b("LaunchUserName", aVar.field_creator, true);
        solitaireDropReportStruct.f60837f = aVar.field_msgSvrId;
        solitaireDropReportStruct.f60838g = i17;
        solitaireDropReportStruct.k();
    }

    public void g(y63.a aVar, int i17, int i18, boolean z17) {
        com.tencent.mm.autogen.mmdata.rpt.SolitaireFormatInputEnterReportStruct solitaireFormatInputEnterReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SolitaireFormatInputEnterReportStruct();
        solitaireFormatInputEnterReportStruct.f60845i = solitaireFormatInputEnterReportStruct.b("Identifier", aVar.field_key, true);
        solitaireFormatInputEnterReportStruct.f60840d = solitaireFormatInputEnterReportStruct.b("ChatName", aVar.field_username, true);
        solitaireFormatInputEnterReportStruct.f60841e = aVar.field_msgSvrId;
        solitaireFormatInputEnterReportStruct.f60842f = i17;
        solitaireFormatInputEnterReportStruct.f60843g = i18;
        if (z17) {
            solitaireFormatInputEnterReportStruct.f60844h = 2L;
        } else {
            solitaireFormatInputEnterReportStruct.f60844h = 1L;
        }
        solitaireFormatInputEnterReportStruct.k();
    }

    public void h(java.lang.String str, int i17) {
        com.tencent.mm.autogen.mmdata.rpt.SolitaireTipsShowReportStruct solitaireTipsShowReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SolitaireTipsShowReportStruct();
        solitaireTipsShowReportStruct.f60851d = solitaireTipsShowReportStruct.b("ChatName", str, true);
        solitaireTipsShowReportStruct.f60852e = i17;
        solitaireTipsShowReportStruct.k();
    }

    public void i(y63.a aVar, y63.a aVar2, int i17) {
        if (aVar == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new x63.l(this, aVar2, aVar, i17));
    }
}
