package u42;

/* loaded from: classes12.dex */
public class a implements u42.c {

    /* renamed from: a, reason: collision with root package name */
    public final u42.b f424638a = new u42.b();

    /* renamed from: b, reason: collision with root package name */
    public long f424639b;

    /* renamed from: c, reason: collision with root package name */
    public long f424640c;

    public a() {
        com.tencent.mm.sdk.platformtools.o4 e17 = g42.i.e();
        if (e17 != null) {
            this.f424639b = e17.getLong("mmkv_key_realtime_report_period", 0L);
            this.f424640c = e17.getLong("mmkv_key_realtime_report_lasttime", 0L);
        }
    }

    public static void d(int i17, java.lang.String str, final com.tencent.mm.modelbase.e3 e3Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.uj5();
        lVar.f70665b = new r45.vj5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/rtkvreport";
        lVar.f70667d = 716;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        final r45.uj5 uj5Var = (r45.uj5) a17.f70710a.f70684a;
        uj5Var.f387415d = o45.wf.f343025c;
        uj5Var.f387416e = o45.wf.f343024b;
        uj5Var.f387417f = o45.wf.f343027e;
        uj5Var.f387418g = wo.q.f447785f;
        uj5Var.f387419h = com.tencent.mm.sdk.platformtools.m2.d();
        uj5Var.f387420i = i17;
        if (i17 < 32337) {
            uj5Var.f387421m = "ClientIPV6," + str;
        } else {
            uj5Var.f387421m = "ClientIPV6,RegCountry," + str;
        }
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.modelbase.z2.d(a17, new com.tencent.mm.modelbase.e3(currentTimeMillis, uj5Var, e3Var) { // from class: u42.a$$c

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r45.uj5 f424645d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.modelbase.e3 f424646e;

            {
                this.f424645d = uj5Var;
                this.f424646e = e3Var;
            }

            @Override // com.tencent.mm.modelbase.e3
            public final int callback(int i18, int i19, java.lang.String str2, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.System.currentTimeMillis();
                java.lang.String str3 = this.f424645d.f387421m;
                com.tencent.mm.modelbase.e3 e3Var2 = this.f424646e;
                if (e3Var2 != null) {
                    return e3Var2.callback(i18, i19, str2, oVar, m1Var);
                }
                return 0;
            }
        }, false);
    }

    public static java.lang.String f(java.util.List list) {
        if (list == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (i17 < list.size() - 1) {
                sb6.append((java.lang.String) list.get(i17));
                sb6.append(",");
            } else {
                sb6.append((java.lang.String) list.get(i17));
            }
        }
        return sb6.toString();
    }

    public void a() {
        java.util.ArrayList<r45.uh0> arrayList;
        java.lang.String[] b17;
        this.f424638a.getClass();
        com.tencent.mm.sdk.platformtools.o4 f17 = g42.i.f();
        boolean z17 = false;
        if (f17 == null || (b17 = f17.b()) == null || b17.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.String str : b17) {
                byte[] j17 = f17.j(str);
                if (j17 != null && j17.length > 0) {
                    r45.uh0 uh0Var = new r45.uh0();
                    try {
                        uh0Var.parseFrom(j17);
                        arrayList.add(uh0Var);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("EdgeComputingRtReportCache", "[EdgeComputingRtReportCache] read parse realtimeReportItem throw Exception : " + e17.getMessage());
                    }
                }
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f424640c < this.f424639b * 1000) {
            com.tencent.mars.xlog.Log.i("EdgeComputingReporter", "report realtimeReport reportPeriod : " + this.f424639b + ", distance : " + (currentTimeMillis - this.f424640c));
            return;
        }
        if (arrayList.size() > 0 && com.tencent.mm.sdk.platformtools.x2.n()) {
            z17 = gm0.j1.d().h(new k42.a(arrayList, this), 0);
        }
        if (!z17) {
            if (arrayList.size() > 0) {
                for (r45.uh0 uh0Var2 : arrayList) {
                    java.util.LinkedList linkedList = uh0Var2.f387377f;
                    if (linkedList != null && linkedList.size() > 0) {
                        java.util.Iterator it = uh0Var2.f387377f.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(uh0Var2.f387376e, (java.lang.String) it.next());
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.e("EdgeComputingReporter", "report realtimeReport fail!");
        }
        com.tencent.mm.sdk.platformtools.o4 e18 = g42.i.e();
        if (e18 != null) {
            e18.putLong("mmkv_key_realtime_report_lasttime", currentTimeMillis);
        }
        this.f424640c = currentTimeMillis;
        com.tencent.mm.sdk.platformtools.o4 f18 = g42.i.f();
        if (f18 != null) {
            f18.d();
            if (f18.Y() >= 3145728) {
                f18.a0();
            }
        }
        t42.a.d(1);
    }

    public void b(java.lang.String str, int i17, java.util.List list) {
        int i18;
        java.lang.String str2;
        java.lang.String str3;
        if (u46.l.e(str) || i17 <= 0 || list == null || list.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            r42.b bVar = (r42.b) it.next();
            if (bVar == null) {
                return;
            }
            while (true) {
                i18 = bVar.f369512a;
                str2 = "";
                if (i18 <= i19) {
                    break;
                }
                arrayList.add("");
                i19++;
            }
            if (i18 >= i19) {
                int i27 = bVar.f369513b;
                if (i27 == 2) {
                    str2 = java.lang.String.valueOf(bVar.f369516e);
                } else if (i27 == 1) {
                    str2 = java.lang.String.valueOf(bVar.f369515d);
                } else if (i27 == 0 && (str3 = bVar.f369517f) != null) {
                    str2 = str3;
                }
                if (str2.contains(",")) {
                    str2 = str2.replace(",", "\\$");
                }
                arrayList.add(str2);
                i19++;
            }
        }
        this.f424638a.a(str, i17, f(arrayList));
    }

    public void c(int i17, java.util.List list) {
        int i18;
        java.lang.String str;
        java.lang.String str2;
        if (list == null || list.size() <= 0 || i17 <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("EdgeComputingReporter", "[EdgeComputingReporter] kvReportFieldData logID : " + i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            r42.b bVar = (r42.b) it.next();
            if (bVar == null) {
                return;
            }
            while (true) {
                i18 = bVar.f369512a;
                str = "";
                if (i18 <= i19) {
                    break;
                }
                arrayList.add("");
                i19++;
            }
            if (i18 >= i19) {
                int i27 = bVar.f369513b;
                if (i27 == 2) {
                    str = java.lang.String.valueOf(bVar.f369516e);
                } else if (i27 == 1) {
                    str = java.lang.String.valueOf(bVar.f369515d);
                } else if (i27 == 0 && (str2 = bVar.f369517f) != null) {
                    str = str2;
                }
                if (str.contains(",")) {
                    str = str.replace(",", "\\$");
                }
                arrayList.add(str);
                i19++;
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.p(i17, f(arrayList), false, false, true);
    }

    public void e(final int i17, java.util.List list) {
        int i18;
        java.lang.String str;
        java.lang.String str2;
        if (list == null || list.size() <= 0 || i17 <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("EdgeComputingReporter", "[EdgeComputingReporter] rtKVReportFieldData logID : " + i17);
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            r42.b bVar = (r42.b) it.next();
            if (bVar == null) {
                return;
            }
            while (true) {
                i18 = bVar.f369512a;
                str = "";
                if (i18 <= i19) {
                    break;
                }
                arrayList.add("");
                i19++;
            }
            if (i18 >= i19) {
                int i27 = bVar.f369513b;
                if (i27 == 2) {
                    str = java.lang.String.valueOf(bVar.f369516e);
                } else if (i27 == 1) {
                    str = java.lang.String.valueOf(bVar.f369515d);
                } else if (i27 == 0 && (str2 = bVar.f369517f) != null) {
                    str = str2;
                }
                if (str.contains(",")) {
                    str = str.replace(",", "\\$");
                }
                arrayList.add(str);
                i19++;
            }
        }
        d(i17, f(arrayList), new com.tencent.mm.modelbase.e3() { // from class: u42.a$$b
            @Override // com.tencent.mm.modelbase.e3
            public final int callback(int i28, int i29, java.lang.String str3, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
                int i37 = i17;
                if (i28 == 0 && i29 == 0) {
                    return 0;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.p(i37, u42.a.f(arrayList), false, false, true);
                return 0;
            }
        });
    }
}
