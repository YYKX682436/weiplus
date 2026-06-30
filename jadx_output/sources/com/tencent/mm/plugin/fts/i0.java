package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public class i0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.d0 f137419n;

    public i0(com.tencent.mm.plugin.fts.d0 d0Var, com.tencent.mm.plugin.fts.e0 e0Var) {
        this.f137419n = d0Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "InitResourceTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.vfs.x1 m17;
        o("start");
        int i17 = 0;
        try {
            for (java.lang.String str : new java.lang.String(com.tencent.mm.vfs.w6.N("assets:///fts/fts_t2s.txt", 0, -1)).split("\n")) {
                java.lang.String[] split = str.split(",");
                o13.s.f342265k.put(split[0], split[1]);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.PluginFTS", e17, e17.getMessage(), new java.lang.Object[0]);
            this.f137419n.rj("LoadFTSPinYinFail");
        }
        o("t2s");
        try {
            java.lang.String[] split2 = new java.lang.String(com.tencent.mm.vfs.w6.N("assets:///fts/fts_py.txt", 0, -1)).split("\n");
            int i18 = 0;
            while (i18 < split2.length) {
                java.lang.String[] split3 = split2[i18].split(",");
                java.lang.String str2 = split3[i17];
                int length = split3.length - 1;
                java.lang.String[] strArr = new java.lang.String[length];
                int i19 = i17;
                while (i19 < length) {
                    int i27 = i19 + 1;
                    if (i27 < split3.length) {
                        strArr[i19] = split3[i27];
                    }
                    i19 = i27;
                }
                if (length > 0) {
                    int i28 = i17;
                    while (i28 < length) {
                        java.lang.String str3 = strArr[i28];
                        q13.b bVar = o13.s.f342264j;
                        if (bVar.f359683a.add(str3)) {
                            char[] charArray = str3.toLowerCase().toCharArray();
                            q13.c cVar = bVar.f359684b;
                            for (int i29 = i17; i29 < charArray.length; i29++) {
                                char c17 = charArray[i29];
                                int i37 = c17 - 'a';
                                q13.c[] cVarArr = cVar.f359685a;
                                if (cVarArr[i37] == null) {
                                    cVarArr[i37] = new q13.c(c17);
                                }
                                cVar = cVarArr[i37];
                            }
                            cVar.f359686b = true;
                        }
                        i28++;
                        i17 = 0;
                    }
                    o13.s.f342266l.put(str2, strArr);
                }
                i18++;
                i17 = 0;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.PluginFTS", e18, e18.getMessage(), new java.lang.Object[0]);
            this.f137419n.rj("LoadFTST2SFail");
        }
        o("py");
        o13.o oVar = o13.p.f342249b;
        gm0.j1.i();
        java.lang.String h17 = gm0.j1.u().h();
        com.tencent.mm.vfs.z7 a17 = h17 == null ? null : com.tencent.mm.vfs.z7.a(h17);
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17 == null ? new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l("FTS5IndexMicroMsg_encrypt.db", false, false), null, null) : new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, com.tencent.mm.vfs.e8.l(a17.f213279f + "/FTS5IndexMicroMsg_encrypt.db", false, false), a17.f213280g, a17.f213281h), null);
        oVar.f342243a = ((m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L) / 1048576;
        oVar.f342244b = this.f137419n.f137381f.k(-301L, 0L);
        oVar.f342245c = this.f137419n.f137381f.k(-302L, 0L);
        oVar.f342247e = this.f137419n.f137381f.k(-303L, 0L);
        oVar.f342246d = this.f137419n.f137381f.k(-304L, 0L);
        long k17 = this.f137419n.f137381f.k(-300L, 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = o13.n.f342241a;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(k17);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (timeInMillis == calendar.getTimeInMillis()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "not need to report fts data");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSReportApiLogic", "reportIDKeyFTSData %d %d %d %d %d", java.lang.Long.valueOf(oVar.f342243a), java.lang.Long.valueOf(oVar.f342244b), java.lang.Long.valueOf(oVar.f342245c), java.lang.Long.valueOf(oVar.f342247e), java.lang.Long.valueOf(oVar.f342246d));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            o13.p.a(arrayList, 729, 0, 1);
            if (oVar.f342243a > 1536) {
                o13.p.a(arrayList, 729, 1, 1);
            }
            if (oVar.f342244b >= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                o13.p.a(arrayList, 729, 2, 1);
            }
            if (oVar.f342245c >= 5000) {
                o13.p.a(arrayList, 729, 3, 1);
            }
            if (oVar.f342247e >= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                o13.p.a(arrayList, 729, 4, 1);
            }
            if (oVar.f342246d >= 1000000) {
                o13.p.a(arrayList, 729, 5, 1);
            }
            jx3.f.INSTANCE.b(arrayList, false);
            this.f137419n.f137381f.q(-300L, currentTimeMillis);
        }
        o("reportData");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "ftsDBSize: %s mainEnDBPath:%s", com.tencent.mm.sdk.platformtools.t8.h0(com.tencent.mm.vfs.w6.k(gm0.j1.u().h() + "FTS5IndexMicroMsg_encrypt.db")), com.tencent.mm.sdk.platformtools.t8.h0(com.tencent.mm.vfs.w6.k(gm0.j1.u().g())));
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{T2S: %d PY: %d}", java.lang.Integer.valueOf(o13.s.f342265k.size()), java.lang.Integer.valueOf(o13.s.f342266l.size()));
    }
}
