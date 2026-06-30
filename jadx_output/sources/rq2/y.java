package rq2;

/* loaded from: classes2.dex */
public final class y extends db2.y2 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y() {
        /*
            r4 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r45.qt2 r1 = new r45.qt2
            r1.<init>()
            r2 = 5
            r3 = 135(0x87, float:1.89E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.set(r2, r3)
            r4.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rq2.y.<init>():void");
    }

    @Override // db2.y2
    public java.util.LinkedList B() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        rq2.d dVar = rq2.d.f398816a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getStatsReportFluencyInfo reportedDataSize: ");
        java.util.HashSet hashSet = rq2.d.f398823h;
        sb6.append(hashSet.size());
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", sb6.toString());
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        synchronized (hashSet) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                rq2.a aVar = (rq2.a) it.next();
                r45.m31 m31Var = new r45.m31();
                m31Var.set(0, 3);
                m31Var.set(2, java.lang.Integer.valueOf(aVar.f398800k));
                m31Var.set(4, java.lang.Integer.valueOf((int) aVar.f398805p));
                m31Var.set(13, java.lang.Integer.valueOf(aVar.f398794e));
                m31Var.set(5, java.lang.Integer.valueOf((int) aVar.f398806q));
                m31Var.set(9, java.lang.Integer.valueOf((int) aVar.f398808s));
                m31Var.set(6, java.lang.Integer.valueOf((int) aVar.f398807r));
                m31Var.set(11, java.lang.Integer.valueOf(aVar.f398802m));
                int i17 = (int) (aVar.f398798i - aVar.f398790a);
                if (i17 < 1) {
                    i17 = 1;
                }
                m31Var.set(14, java.lang.Integer.valueOf(i17));
                java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (aVar.f398798i - rq2.d.f398824i));
                if (!java.lang.Boolean.valueOf(valueOf.intValue() > 0).booleanValue()) {
                    valueOf = null;
                }
                m31Var.set(15, java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 1));
                m31Var.set(10, aVar.f398799j);
                r45.xw xwVar = aVar.f398810u;
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
                pm0.v.K(null, new rq2.c(aVar));
                com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "getStatsReportFluencyInfo real report: \npullType = " + aVar.f398800k + ", \ncommentScene = " + aVar.f398802m + ", \nglobalInitCost = " + m31Var.getInteger(4) + ",\ncgiType = " + aVar.f398794e + "\ncgiCost = " + aVar.f398806q + ",\ndbCost = " + aVar.f398808s + ",\nshouUICost = " + aVar.f398807r + ",\nloadingTimeCost = " + m31Var.getInteger(15) + ",\ntotalTimeCost = " + m31Var.getInteger(14) + ",\ndebugMessage = " + aVar.f398799j + ",\nisFromClick = " + rq2.d.f398819d + ",\ntabName = " + aVar.f398804o + ",\nstart_time = " + m31Var.getLong(16) + "\nstart_connect_time = " + m31Var.getLong(17) + "\nconnect_successful_time = " + m31Var.getLong(18) + "\nstart_tls_handshake_time = " + m31Var.getLong(19) + "\ntls_handshake_successful_time = " + m31Var.getLong(20) + "\nstart_send_packet_time = " + m31Var.getLong(21) + "\nstart_read_packet_time = " + m31Var.getLong(22) + "\nread_packet_finished_time = " + m31Var.getLong(23));
            }
            rq2.d.f398823h.clear();
        }
        linkedList.addAll(linkedList2);
        return linkedList;
    }

    @Override // db2.y2, az2.j
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(int i17, int i18, java.lang.String str, r45.tw2 resp, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.NewSquareLiveCgiStatusReport", "onCgiEnd errType: " + i17 + " errCode: " + i18 + " errMsg: " + str);
    }
}
