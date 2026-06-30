package dw3;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.k f244219a = new dw3.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f244220b = jz5.h.b(dw3.i.f244214d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f244221c = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r11, int r12, java.lang.String r13) {
        /*
            r10 = this;
            com.tencent.mm.autogen.mmdata.rpt.MediaFileReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.MediaFileReportStruct
            r0.<init>()
            r0.f59137i = r12
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r2 = com.tencent.mm.vfs.z7.a(r11)
            r1.<init>(r2)
            java.lang.String r2 = r1.r()
            java.lang.String r3 = "MediaDirPath"
            r4 = 1
            java.lang.String r2 = r0.b(r3, r2, r4)
            r0.f59132d = r2
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "MediaFilePath"
            java.lang.String r2 = r0.b(r3, r2, r4)
            r0.f59133e = r2
            long r2 = r1.B()
            r0.f59135g = r2
            java.util.Date r2 = new java.util.Date
            long r5 = r1.B()
            r2.<init>(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ModifiedTimeStr"
            java.lang.String r2 = r0.b(r3, r2, r4)
            r0.f59134f = r2
            boolean r2 = r1.y()
            if (r2 == 0) goto L73
            com.tencent.mm.vfs.r6[] r1 = r1.G()
            r2 = 0
            if (r1 == 0) goto L5c
            int r3 = r1.length
            if (r3 != 0) goto L56
            r3 = r4
            goto L57
        L56:
            r3 = r2
        L57:
            if (r3 == 0) goto L5a
            goto L5c
        L5a:
            r3 = r2
            goto L5d
        L5c:
            r3 = r4
        L5d:
            if (r3 != 0) goto L79
            kotlin.jvm.internal.o.d(r1)
            int r3 = r1.length
        L63:
            if (r2 >= r3) goto L79
            r5 = r1[r2]
            long r6 = r0.f59136h
            long r8 = r5.C()
            long r6 = r6 + r8
            r0.f59136h = r6
            int r2 = r2 + 1
            goto L63
        L73:
            long r1 = r1.C()
            r0.f59136h = r1
        L79:
            java.lang.String r1 = "SessionId"
            java.lang.String r1 = r0.b(r1, r13, r4)
            r0.f59138j = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "report type:"
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r2 = " path:"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " modified time:"
            r1.append(r2)
            java.lang.String r2 = r0.f59134f
            r1.append(r2)
            java.lang.String r2 = " size:"
            r1.append(r2)
            long r2 = r0.f59136h
            r1.append(r2)
            java.lang.String r2 = " sessionId: "
            r1.append(r2)
            r1.append(r13)
            r13 = 32
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            java.lang.String r1 = "MicroMsg.MediaFileReporter"
            com.tencent.mars.xlog.Log.i(r1, r13)
            if (r12 != r4) goto Lc4
            r0.k()
            goto Lc9
        Lc4:
            java.util.concurrent.ConcurrentHashMap r12 = dw3.k.f244221c
            r12.put(r11, r0)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dw3.k.a(java.lang.String, int, java.lang.String):void");
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f244220b).getValue();
    }

    public final void c(java.lang.String path, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_media_clean_report_enale, true)) {
            a(path, 2, sessionId);
        }
    }

    public final void d(java.lang.String dir) {
        kotlin.jvm.internal.o.g(dir, "dir");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileReporter", "registerDailyReport dir:".concat(dir));
        java.util.Set w17 = b().w("MicroMsg.MediaFileReporter", new java.util.HashSet());
        w17.add(dir);
        b().F("MicroMsg.MediaFileReporter", w17);
        int i17 = 0;
        for (java.lang.Object obj : w17) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileReporter", "currernt register index:" + i17 + " dir:" + ((java.lang.String) obj));
            i17 = i18;
        }
    }

    public final void e(java.lang.String path, long j17) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileReporter", "setDeleteCostTimeToReport >> " + path + ". " + j17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f244221c;
        com.tencent.mm.autogen.mmdata.rpt.MediaFileReportStruct mediaFileReportStruct = (com.tencent.mm.autogen.mmdata.rpt.MediaFileReportStruct) concurrentHashMap.get(path);
        if (mediaFileReportStruct != null) {
            mediaFileReportStruct.f59139k = j17;
            mediaFileReportStruct.k();
        }
    }
}
