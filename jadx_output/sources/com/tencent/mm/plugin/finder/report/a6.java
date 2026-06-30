package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f124949a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.report.j f124950b = new com.tencent.mm.plugin.finder.report.j();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f124951c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f124952d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f124953e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f124954f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public long f124955g;

    public final long a(int i17) {
        java.util.Collection values = (i17 == 1 ? this.f124952d : this.f124954f).values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            kotlin.jvm.internal.o.d((java.lang.Integer) it.next());
            j17 += r2.intValue();
        }
        return j17;
    }

    public final void b(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.HashMap hashMap = i17 == 1 ? this.f124952d : this.f124954f;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, 1);
            return;
        }
        java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
        if (num != null) {
        }
    }

    public final void c(long j17, long j18, java.lang.String finderUsername) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        com.tencent.mm.plugin.finder.report.j jVar = this.f124950b;
        jVar.f125078a = 0L;
        jVar.f125079b = "";
        jVar.f125080c = 0L;
        jVar.f125081d = 0L;
        this.f124949a = false;
        this.f124955g = 0L;
        ((java.util.HashSet) this.f124951c).clear();
        ((java.util.HashSet) this.f124953e).clear();
        this.f124952d.clear();
        this.f124954f.clear();
        jVar.f125078a = j17;
        jVar.f125081d = j18;
        long c17 = c01.id.c();
        jVar.f125080c = c17;
        java.lang.String valueOf = java.lang.String.valueOf(c17);
        kotlin.jvm.internal.o.g(valueOf, "<set-?>");
        jVar.f125079b = valueOf;
        jVar.f125082e = finderUsername;
        this.f124949a = true;
    }

    public final void d(r45.qt2 qt2Var) {
        com.tencent.mm.autogen.mmdata.rpt.FinderChatListStruct finderChatListStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderChatListStruct();
        com.tencent.mm.plugin.finder.report.j jVar = this.f124950b;
        finderChatListStruct.f56604d = jVar.f125078a;
        finderChatListStruct.f56605e = jVar.f125081d;
        finderChatListStruct.f56607g = finderChatListStruct.b("chatlistSessionid", jVar.f125079b, true);
        finderChatListStruct.f56608h = this.f124952d.size();
        finderChatListStruct.f56609i = a(1);
        finderChatListStruct.f56610j = a(2);
        finderChatListStruct.f56611k = this.f124954f.size();
        finderChatListStruct.f56612l = this.f124955g;
        finderChatListStruct.f56614n = 0L;
        finderChatListStruct.f56613m = java.lang.System.currentTimeMillis() - jVar.f125080c;
        if (qt2Var != null) {
            finderChatListStruct.f56606f = qt2Var.getInteger(7);
        }
        if (jVar.f125082e.length() > 0) {
            finderChatListStruct.f56615o = finderChatListStruct.b("finderusername", jVar.f125082e, true);
        }
        finderChatListStruct.k();
        com.tencent.mm.plugin.finder.report.p pVar = com.tencent.mm.plugin.finder.report.p.f125222a;
        java.lang.String n17 = finderChatListStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("FinderChatReporter", "report20688 ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false)));
        this.f124949a = false;
    }

    public final void e(java.util.Set curRecordSet) {
        kotlin.jvm.internal.o.g(curRecordSet, "curRecordSet");
        java.util.Set set = this.f124951c;
        if (this.f124949a) {
            java.util.Set g17 = kz5.q1.g(curRecordSet, set);
            com.tencent.mars.xlog.Log.i("RecordFinderChatList", "latestExposeRecords" + g17 + "，size:" + g17.size());
            if (!g17.isEmpty()) {
                java.util.Iterator it = g17.iterator();
                while (it.hasNext()) {
                    b((java.lang.String) it.next(), 1);
                }
            }
            set.clear();
            java.util.Iterator it6 = curRecordSet.iterator();
            while (it6.hasNext()) {
                set.add((java.lang.String) it6.next());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pvCount:");
            sb6.append(a(1));
            sb6.append(": uvCount:");
            sb6.append(this.f124952d.size());
            com.tencent.mars.xlog.Log.i("RecordFinderChatList", sb6.toString());
        }
    }
}
