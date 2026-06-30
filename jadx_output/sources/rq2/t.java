package rq2;

/* loaded from: classes2.dex */
public final class t extends db2.y2 {
    public t() {
        super(new java.util.LinkedList(), null);
    }

    @Override // db2.y2
    public java.util.LinkedList B() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        rq2.s sVar = rq2.s.f398879a;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.HashSet hashSet = rq2.s.f398886h;
        synchronized (hashSet) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                rq2.q qVar = (rq2.q) it.next();
                r45.m31 m31Var = new r45.m31();
                m31Var.set(0, 3);
                m31Var.set(2, java.lang.Integer.valueOf(qVar.f398868i));
                m31Var.set(4, java.lang.Integer.valueOf((int) qVar.f398871l));
                m31Var.set(5, java.lang.Integer.valueOf((int) qVar.f398872m));
                m31Var.set(9, java.lang.Integer.valueOf((int) qVar.f398874o));
                m31Var.set(6, java.lang.Integer.valueOf((int) qVar.f398873n));
                m31Var.set(10, qVar.f398867h);
                r45.xw xwVar = qVar.f398877r;
                if (xwVar != null) {
                    m31Var.set(16, java.lang.Long.valueOf(xwVar.f390547q));
                    m31Var.set(17, java.lang.Long.valueOf(xwVar.f390537d));
                    m31Var.set(18, java.lang.Long.valueOf(xwVar.f390538e));
                    m31Var.set(19, java.lang.Long.valueOf(xwVar.f390539f));
                    m31Var.set(20, java.lang.Long.valueOf(xwVar.f390540g));
                    m31Var.set(21, java.lang.Long.valueOf(xwVar.f390541h));
                    m31Var.set(22, java.lang.Long.valueOf(xwVar.f390543m));
                    m31Var.set(23, java.lang.Long.valueOf(xwVar.f390544n));
                }
                linkedList2.add(m31Var);
                pm0.v.K(null, new rq2.r(qVar));
                com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "getStatsReportFluencyInfo real report: \npullType = " + qVar.f398868i + ", \nenterCost = " + qVar.f398871l + ", \ncgiCost = " + qVar.f398872m + ",\ndbCost = " + qVar.f398874o + ",\ndebugMessage = " + qVar.f398867h + ",\nisFromClick = " + rq2.s.f398882d + ",\ntabName = " + qVar.f398870k + ",\nstart_time = " + m31Var.getLong(16) + "\nstart_connect_time = " + m31Var.getLong(17) + "\nconnect_successful_time = " + m31Var.getLong(18) + "\nstart_tls_handshake_time = " + m31Var.getLong(19) + "\ntls_handshake_successful_time = " + m31Var.getLong(20) + "\nstart_send_packet_time = " + m31Var.getLong(21) + "\nstart_read_packet_time = " + m31Var.getLong(22) + "\nread_packet_finished_time = " + m31Var.getLong(23));
            }
            rq2.s.f398886h.clear();
        }
        linkedList.addAll(linkedList2);
        return linkedList;
    }

    @Override // db2.y2, az2.j
    /* renamed from: C */
    public void A(int i17, int i18, java.lang.String str, r45.tw2 resp, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.NearbyLiveCgiStatusReport", "onCgiEnd errType: " + i17 + " errCode: " + i18 + " errMsg: " + str);
    }
}
