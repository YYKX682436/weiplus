package qg5;

@j95.b
/* loaded from: classes8.dex */
public final class e3 extends jm0.o implements ct.k3 {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f362962m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f362963n = "";

    public final v05.b Zi(com.tencent.mm.storage.f9 f9Var) {
        v05.b bVar = new v05.b();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        bVar.fromXml(U1);
        return bVar;
    }

    public int aj(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        if (com.tencent.mm.storage.z3.R4(str)) {
            return 2;
        }
        if (kotlin.jvm.internal.o.b(str, c01.z1.r())) {
            return 4;
        }
        return kotlin.jvm.internal.o.b(str, "filehelper") ? 3 : 1;
    }

    public int bj(v05.b bVar) {
        java.lang.String C;
        boolean z17 = false;
        if (bVar == null) {
            return 0;
        }
        try {
            v05.a aVar = (v05.a) bVar.getCustom(bVar.f432315e + 8);
            if (aVar != null && (C = aVar.C()) != null) {
                if (C.length() > 0) {
                    z17 = true;
                }
            }
            return z17 ? 1 : 2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.YuanBaoChatRecordsReportFeatureService", e17, "getFieldFileSource failed", new java.lang.Object[0]);
            return 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int cj(com.tencent.mm.storage.f9 r13, v05.b r14) {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L9d
            if (r14 != 0) goto L7
            goto L9d
        L7:
            int r1 = r14.f432315e
            int r2 = r14.f368365d
            java.lang.Class<pt.j0> r3 = pt.j0.class
            i95.m r3 = i95.n0.c(r3)     // Catch: java.lang.Exception -> L93
            pt.j0 r3 = (pt.j0) r3     // Catch: java.lang.Exception -> L93
            int r4 = r2 + 2
            java.lang.String r4 = r14.getString(r4)     // Catch: java.lang.Exception -> L93
            int r5 = r1 + 8
            com.tencent.mm.protobuf.f r5 = r14.getCustom(r5)     // Catch: java.lang.Exception -> L93
            v05.a r5 = (v05.a) r5     // Catch: java.lang.Exception -> L93
            if (r5 == 0) goto L29
            java.lang.String r5 = r5.r()     // Catch: java.lang.Exception -> L93
            if (r5 != 0) goto L2b
        L29:
            java.lang.String r5 = ""
        L2b:
            ez.e r3 = (ez.e) r3     // Catch: java.lang.Exception -> L93
            java.lang.String r3 = r3.cj(r13, r4, r5, r0)     // Catch: java.lang.Exception -> L93
            com.tencent.mm.vfs.r6 r4 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> L93
            r4.<init>(r3)     // Catch: java.lang.Exception -> L93
            te5.h r3 = te5.h.f418649a     // Catch: java.lang.Exception -> L93
            int r5 = r3.d(r13)     // Catch: java.lang.Exception -> L93
            boolean r6 = r4.m()     // Catch: java.lang.Exception -> L93
            r7 = 1
            if (r6 == 0) goto L61
            long r8 = r4.C()     // Catch: java.lang.Exception -> L93
            int r1 = r1 + 8
            com.tencent.mm.protobuf.f r1 = r14.getCustom(r1)     // Catch: java.lang.Exception -> L93
            v05.a r1 = (v05.a) r1     // Catch: java.lang.Exception -> L93
            if (r1 == 0) goto L59
            int r4 = r1.f368364d     // Catch: java.lang.Exception -> L93
            int r4 = r4 + r0
            long r10 = r1.getLong(r4)     // Catch: java.lang.Exception -> L93
            goto L5b
        L59:
            r10 = 0
        L5b:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 < 0) goto L61
            r1 = r7
            goto L62
        L61:
            r1 = r0
        L62:
            int r2 = r2 + 6
            int r14 = r14.getInteger(r2)     // Catch: java.lang.Exception -> L93
            r2 = 74
            if (r14 != r2) goto L6e
            r14 = r7
            goto L6f
        L6e:
            r14 = r0
        L6f:
            boolean r13 = r3.b(r13)     // Catch: java.lang.Exception -> L93
            r2 = 9
            if (r5 != r2) goto L79
            r2 = r7
            goto L7a
        L79:
            r2 = r0
        L7a:
            if (r1 == 0) goto L7e
            r0 = r7
            goto L9d
        L7e:
            if (r2 == 0) goto L83
            r13 = 5
        L81:
            r0 = r13
            goto L9d
        L83:
            if (r14 == 0) goto L87
            r13 = 4
            goto L81
        L87:
            if (r1 != 0) goto L8d
            if (r13 != 0) goto L8d
            r13 = 2
            goto L81
        L8d:
            if (r1 != 0) goto L9d
            if (r13 == 0) goto L9d
            r13 = 3
            goto L81
        L93:
            r13 = move-exception
            java.lang.String r14 = "getFieldIsFileDownload failed"
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "MicroMsg.YuanBaoChatRecordsReportFeatureService"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r13, r14, r1)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.e3.cj(com.tencent.mm.storage.f9, v05.b):int");
    }

    public java.util.Map fj(java.lang.String journeyId) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(journeyId, "journeyId");
        qg5.b3 b3Var = (qg5.b3) ((java.util.concurrent.ConcurrentHashMap) this.f362962m).get(journeyId);
        return (b3Var == null || (map = b3Var.f362931c) == null) ? kz5.q0.f314001d : kz5.c1.s(map);
    }

    public java.lang.String hj(java.lang.String journeyId) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(journeyId, "journeyId");
        qg5.b3 b3Var = (qg5.b3) ((java.util.concurrent.ConcurrentHashMap) this.f362962m).get(journeyId);
        if (b3Var != null && (str = b3Var.f362929a) != null) {
            return str;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        return uuid;
    }

    public final dy1.r ij() {
        return (dy1.r) i95.n0.c(dy1.r.class);
    }

    public final java.util.Map mj(java.lang.String str, java.lang.String str2) {
        return kz5.c1.m(kz5.c1.k(new jz5.l("chat_username", str), new jz5.l("enter_source", java.lang.Integer.valueOf(aj(str)))), str2 != null ? kz5.b1.e(new jz5.l("share_session_id", hj(str2))) : kz5.q0.f314001d);
    }

    public java.util.Map nj(java.lang.String journeyId) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(journeyId, "journeyId");
        qg5.b3 b3Var = (qg5.b3) ((java.util.concurrent.ConcurrentHashMap) this.f362962m).get(journeyId);
        return (b3Var == null || (map = b3Var.f362930b) == null) ? kz5.q0.f314001d : kz5.c1.s(map);
    }

    public void oj(java.lang.String journeyId) {
        kotlin.jvm.internal.o.g(journeyId, "journeyId");
        ((java.util.concurrent.ConcurrentHashMap) this.f362962m).remove(journeyId);
    }

    public void pj(java.lang.String journeyId) {
        kotlin.jvm.internal.o.g(journeyId, "journeyId");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        qj(journeyId, uuid);
    }

    public void qj(java.lang.String journeyId, java.lang.String shareSessionId) {
        kotlin.jvm.internal.o.g(journeyId, "journeyId");
        kotlin.jvm.internal.o.g(shareSessionId, "shareSessionId");
        ((java.util.concurrent.ConcurrentHashMap) this.f362962m).put(journeyId, new qg5.b3(shareSessionId, null, null, 6, null));
        this.f362963n = journeyId;
    }

    public void rj(java.lang.String journeyId, java.util.Map info) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(journeyId, "journeyId");
        kotlin.jvm.internal.o.g(info, "info");
        qg5.b3 b3Var = (qg5.b3) ((java.util.concurrent.ConcurrentHashMap) this.f362962m).get(journeyId);
        if (b3Var == null || (map = b3Var.f362931c) == null) {
            return;
        }
        map.putAll(info);
    }

    public void sj(java.lang.String journeyId, java.util.Map parameters) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(journeyId, "journeyId");
        kotlin.jvm.internal.o.g(parameters, "parameters");
        qg5.b3 b3Var = (qg5.b3) ((java.util.concurrent.ConcurrentHashMap) this.f362962m).get(journeyId);
        if (b3Var == null || (map = b3Var.f362930b) == null) {
            return;
        }
        map.putAll(parameters);
    }

    public void tj(java.lang.Integer num, java.lang.Boolean bool) {
        if (num == null || bool == null) {
            return;
        }
        rj("journey_analyze", kz5.b1.e(new jz5.l("yuanbao_msg_analytics_view_type", bool.booleanValue() ? "2" : "1")));
        bool.booleanValue();
        ((cy1.a) ij()).Hj("multi_select_record_preview", "view_clk", kz5.c1.m(nj("journey_analyze"), kz5.c1.k(new jz5.l("clk_preview_btn", num), new jz5.l("yuanbao_msg_analytics_view_type", java.lang.Integer.valueOf(bool.booleanValue() ? 2 : 1)))), 35480);
    }

    public void uj(int i17) {
        ((cy1.a) ij()).Hj("yuanbao_legal_popup", "view_clk", kz5.c1.m(nj("journey_copy"), kz5.b1.e(new jz5.l("clk_popup_btn", java.lang.Integer.valueOf(i17)))), 35480);
    }

    public void vj(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        java.lang.String str2;
        if (f9Var != null) {
            if (str == null || str.length() == 0) {
                return;
            }
            v05.b Zi = Zi(f9Var);
            v05.a aVar = (v05.a) Zi.getCustom(Zi.f432315e + 8);
            if (aVar == null || (str2 = aVar.r()) == null) {
                str2 = "";
            }
            sj("journey_summarize", kz5.c1.m(mj(str, "journey_summarize"), kz5.c1.k(new jz5.l("share_type", 10), new jz5.l("file_extension", str2), new jz5.l("yuanbao_landing_type", 2), new jz5.l("is_file_download", java.lang.Integer.valueOf(cj(f9Var, Zi))), new jz5.l("file_source", java.lang.Integer.valueOf(bj(Zi))))));
            ((cy1.a) ij()).Hj("yuanbao_menu_sum_btn", "view_clk", nj("journey_summarize"), 35480);
        }
    }

    public void wj(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (f9Var != null) {
            if (str == null || str.length() == 0) {
                return;
            }
            v05.b Zi = Zi(f9Var);
            int i17 = Zi.f368365d;
            sj("journey_summarize", kz5.c1.m(mj(str, "journey_summarize"), kz5.c1.k(new jz5.l("share_type", 9), new jz5.l("article_url", java.net.URLEncoder.encode(Zi.getString(i17 + 9), com.tencent.mapsdk.internal.rv.f51270c)), new jz5.l("yuanbao_landing_type", 2), new jz5.l("account_article_title", Zi.getString(i17 + 2)))));
            ((cy1.a) ij()).Hj("yuanbao_menu_sum_btn", "view_clk", nj("journey_summarize"), 35480);
        }
    }

    public boolean xj(java.lang.String str, java.lang.String str2) {
        try {
            if (str == null) {
                str = "";
            }
            java.lang.String host = new java.net.URL(str).getHost();
            if (host != null && r26.i0.n(host, "tencent.com", false)) {
                if (str2 != null && r26.n0.B(str2, "元宝", false)) {
                    return true ^ nj(this.f362963n).isEmpty();
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }
}
