package cq5;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final cq5.i f221543a = new cq5.i();

    /* renamed from: b, reason: collision with root package name */
    public static long f221544b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f221545c;

    /* renamed from: d, reason: collision with root package name */
    public static long f221546d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f221547e;

    /* renamed from: f, reason: collision with root package name */
    public static long f221548f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f221549g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f221550h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f221551i;

    static {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        f221550h = uuid;
        f221551i = "";
    }

    public static void a(cq5.i iVar, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = android.os.SystemClock.elapsedRealtime();
        }
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FReportService", "markConnectStart() startTimeMs:" + j17);
        f221544b = j17;
        f221545c = false;
    }

    public static void b(cq5.i iVar, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = android.os.SystemClock.elapsedRealtime();
        }
        iVar.getClass();
        if (f221546d <= 0 || f221547e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2FReportService", "markTransmitStart() startTimeMs:" + j17);
            f221546d = j17;
            f221547e = false;
        }
    }

    public final void c(cq5.e outType) {
        kotlin.jvm.internal.o.g(outType, "outType");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportAppOutBackground() outType:");
        int i17 = outType.f221524d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FReportService", sb6.toString());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("app_out_background", kz5.c1.k(new jz5.l("face2face_session_id", f221550h), new jz5.l("qrcode_id", f221551i), new jz5.l("face2face_send_file_out_type", java.lang.Integer.valueOf(i17))), 37575);
    }

    public final void d(cq5.a clkType) {
        kotlin.jvm.internal.o.g(clkType, "clkType");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportClickEvent() clkType:");
        int i17 = clkType.f221501d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FReportService", sb6.toString());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("face2face_session_id", f221550h), new jz5.l("qrcode_id", f221551i), new jz5.l("face2face_clk_type", java.lang.Integer.valueOf(i17))), 37575);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0 < 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(cq5.b r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "connectResult"
            kotlin.jvm.internal.o.g(r8, r0)
            boolean r0 = cq5.i.f221545c
            if (r0 == 0) goto La
            return
        La:
            long r0 = cq5.i.f221544b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1d
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = cq5.i.f221544b
            long r0 = r0 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1e
        L1d:
            r0 = r2
        L1e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "reportConnect() result:"
            r4.<init>(r5)
            int r8 = r8.f221508d
            r4.append(r8)
            java.lang.String r5 = " durationMs:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = " retryCnt:"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.F2FReportService"
            com.tencent.mars.xlog.Log.i(r5, r4)
            cq5.i.f221544b = r2
            r2 = 1
            cq5.i.f221545c = r2
            java.lang.Class<dy1.r> r2 = dy1.r.class
            i95.m r2 = i95.n0.c(r2)
            dy1.r r2 = (dy1.r) r2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            jz5.l r3 = new jz5.l
            java.lang.String r4 = "qrcode_connect_result"
            r3.<init>(r4, r8)
            java.lang.String r8 = cq5.i.f221551i
            jz5.l r4 = new jz5.l
            java.lang.String r5 = "qrcode_id"
            r4.<init>(r5, r8)
            java.lang.String r8 = cq5.i.f221550h
            jz5.l r5 = new jz5.l
            java.lang.String r6 = "face2face_session_id"
            r5.<init>(r6, r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            jz5.l r0 = new jz5.l
            java.lang.String r1 = "process_time_ms"
            r0.<init>(r1, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            jz5.l r9 = new jz5.l
            java.lang.String r1 = "retry_cnt"
            r9.<init>(r1, r8)
            jz5.l[] r8 = new jz5.l[]{r3, r4, r5, r0, r9}
            java.util.Map r8 = kz5.c1.k(r8)
            r9 = 37575(0x92c7, float:5.2654E-41)
            cy1.a r2 = (cy1.a) r2
            java.lang.String r0 = "qrcode_connect"
            r2.Ej(r0, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cq5.i.e(cq5.b, int):void");
    }

    public final void f(long j17, int i17, int i18, int i19, long j18, cq5.c select_type) {
        kotlin.jvm.internal.o.g(select_type, "select_type");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportSelectPhotoFiles() timeMs:");
        sb6.append(j17);
        sb6.append(" fileCnt:");
        sb6.append(i17);
        sb6.append(" totalSize:");
        sb6.append(j18);
        sb6.append(" type:");
        int i27 = select_type.f221513d;
        sb6.append(i27);
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FReportService", sb6.toString());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("select_photo_files", kz5.c1.k(new jz5.l("qrcode_id", f221551i), new jz5.l("face2face_session_id", f221550h), new jz5.l("process_time_ms", java.lang.Long.valueOf(j17)), new jz5.l("file_cnt", java.lang.Integer.valueOf(i17)), new jz5.l("add_photo_num", java.lang.Integer.valueOf(i18)), new jz5.l("add_video_num", java.lang.Integer.valueOf(i19)), new jz5.l("total_size", java.lang.Long.valueOf(j18)), new jz5.l("select_type", java.lang.Integer.valueOf(i27))), 37575);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r1 < 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(cq5.g r9) {
        /*
            r8 = this;
            java.lang.String r0 = "qrcode_total_result"
            kotlin.jvm.internal.o.g(r9, r0)
            boolean r1 = cq5.i.f221549g
            if (r1 == 0) goto La
            return
        La:
            long r1 = cq5.i.f221548f
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L1d
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r5 = cq5.i.f221548f
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1e
        L1d:
            r1 = r3
        L1e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "reportTotal() result:"
            r5.<init>(r6)
            int r9 = r9.f221537d
            r5.append(r9)
            java.lang.String r6 = " durationMs:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.F2FReportService"
            com.tencent.mars.xlog.Log.i(r6, r5)
            cq5.i.f221548f = r3
            r3 = 1
            cq5.i.f221549g = r3
            java.lang.Class<dy1.r> r3 = dy1.r.class
            i95.m r3 = i95.n0.c(r3)
            dy1.r r3 = (dy1.r) r3
            java.lang.String r4 = cq5.i.f221551i
            jz5.l r5 = new jz5.l
            java.lang.String r6 = "qrcode_id"
            r5.<init>(r6, r4)
            java.lang.String r4 = cq5.i.f221550h
            jz5.l r6 = new jz5.l
            java.lang.String r7 = "face2face_session_id"
            r6.<init>(r7, r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            jz5.l r2 = new jz5.l
            java.lang.String r4 = "process_time_ms"
            r2.<init>(r4, r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            jz5.l r1 = new jz5.l
            r1.<init>(r0, r9)
            jz5.l[] r9 = new jz5.l[]{r5, r6, r2, r1}
            java.util.Map r9 = kz5.c1.k(r9)
            r0 = 37575(0x92c7, float:5.2654E-41)
            cy1.a r3 = (cy1.a) r3
            java.lang.String r1 = "qrcode_total"
            r3.Ej(r1, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cq5.i.g(cq5.g):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r2 < 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(cq5.h r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "qrcode_transmit_result"
            kotlin.jvm.internal.o.g(r0, r1)
            boolean r2 = cq5.i.f221547e
            if (r2 == 0) goto Lc
            return
        Lc:
            long r2 = cq5.i.f221546d
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L1f
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r6 = cq5.i.f221546d
            long r2 = r2 - r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L20
        L1f:
            r2 = r4
        L20:
            cq5.i.f221546d = r4
            r4 = 1
            cq5.i.f221547e = r4
            java.lang.Class<gz.l> r4 = gz.l.class
            i95.m r4 = i95.n0.c(r4)
            gz.l r4 = (gz.l) r4
            kp.s r4 = (kp.s) r4
            r4.getClass()
            com.tencent.wechat.aff.local_connection.d r4 = com.tencent.wechat.aff.local_connection.d.f217358c
            long r5 = r4.d()
            long r7 = r4.c()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "reportTransmit() result:"
            r4.<init>(r9)
            int r0 = r0.f221542d
            r4.append(r0)
            java.lang.String r9 = " durationMs:"
            r4.append(r9)
            r4.append(r2)
            java.lang.String r9 = " maxTransmitSpeed:"
            r4.append(r9)
            r4.append(r7)
            java.lang.String r9 = " avgTransmitSpeed:"
            r4.append(r9)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = "MicroMsg.F2FReportService"
            com.tencent.mars.xlog.Log.i(r9, r4)
            java.lang.Class<dy1.r> r4 = dy1.r.class
            i95.m r4 = i95.n0.c(r4)
            dy1.r r4 = (dy1.r) r4
            java.lang.String r9 = cq5.i.f221551i
            jz5.l r10 = new jz5.l
            java.lang.String r11 = "qrcode_id"
            r10.<init>(r11, r9)
            java.lang.String r9 = cq5.i.f221550h
            jz5.l r11 = new jz5.l
            java.lang.String r12 = "face2face_session_id"
            r11.<init>(r12, r9)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            jz5.l r12 = new jz5.l
            java.lang.String r3 = "process_time_ms"
            r12.<init>(r3, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            jz5.l r13 = new jz5.l
            r13.<init>(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            jz5.l r14 = new jz5.l
            java.lang.String r1 = "max_transmit_speed"
            r14.<init>(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            jz5.l r15 = new jz5.l
            java.lang.String r1 = "avg_transmit_speed"
            r15.<init>(r1, r0)
            jz5.l[] r0 = new jz5.l[]{r10, r11, r12, r13, r14, r15}
            java.util.Map r0 = kz5.c1.k(r0)
            r1 = 37575(0x92c7, float:5.2654E-41)
            cy1.a r4 = (cy1.a) r4
            java.lang.String r2 = "qrcode_transmit"
            r4.Ej(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cq5.i.h(cq5.h):void");
    }

    public final void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.F2FReportService", "reset()");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        f221550h = uuid;
        f221551i = "";
        f221544b = 0L;
        f221545c = false;
        f221546d = 0L;
        f221547e = false;
        f221548f = 0L;
        f221549g = false;
    }
}
