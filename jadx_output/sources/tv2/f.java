package tv2;

/* loaded from: classes10.dex */
public final class f extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f422300h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.f0 f422301i;

    /* renamed from: m, reason: collision with root package name */
    public pv2.g f422302m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$feedDeleteListener$1 f422303n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$feedDeleteListener$1] */
    public f(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f422300h = finderObj;
        this.f422302m = new tv2.x(finderObj, 2);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f422303n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$feedDeleteListener$1
            {
                this.__eventId = -108499199;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
                com.tencent.mm.autogen.events.FeedDeleteEvent event = feedDeleteEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.da daVar = event.f54247g;
                long j17 = daVar.f6438b;
                if (j17 == 0) {
                    return false;
                }
                tv2.f fVar = tv2.f.this;
                if (j17 != fVar.f422300h.getLocalId()) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "feedDeleteListener localId:" + daVar.f6438b);
                cu2.t tVar = cu2.u.f222441a;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = fVar.f422300h;
                if (tVar.k(finderItem.getLocalId())) {
                    return false;
                }
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.setUploadLogicError(200);
                }
                com.tencent.mm.plugin.vlog.model.f0 f0Var = fVar.f422301i;
                if (f0Var == null) {
                    return false;
                }
                com.tencent.mm.plugin.vlog.model.f0.b(f0Var, null, 1, null);
                return false;
            }
        };
    }

    @Override // pv2.g
    public int a() {
        return 2;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        boolean isLongVideo = this.f422300h.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 20L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 20L, 1L);
            }
        }
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        boolean isLongVideo = this.f422300h.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 20L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 20L, 1L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0360, code lost:
    
        if ((r3 == null || r3.length() == 0) != false) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0a23 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0658 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x03ea  */
    /* JADX WARN: Type inference failed for: r0v60, types: [yy0.m7] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 2740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv2.f.j():pv2.g");
    }

    public final java.lang.String k() {
        java.lang.String a17;
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(this.f422300h.getMediaList());
        return (mb4Var == null || (a17 = hc2.l0.a(mb4Var)) == null) ? "" : a17;
    }

    public final jz5.l l(long j17, int i17, java.lang.String str, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, r45.mb4 mb4Var, com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject, int i18) {
        kotlin.jvm.internal.f0 f0Var;
        com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "remuxComposition outputPath:" + str);
        r45.h70 h70Var = (r45.h70) mb4Var.getCustom(21);
        if (h70Var == null) {
            h70Var = new r45.h70();
        }
        r45.h70 h70Var2 = h70Var;
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        f0Var2.f310116d = -1;
        r45.i70 i70Var = h70Var2.f375902i;
        if (i70Var == null) {
            i70Var = new r45.i70();
        }
        r45.i70 i70Var2 = i70Var;
        i70Var2.f376775d = str;
        i95.m c17 = i95.n0.c(bg0.v.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        i70Var2.f376792x = bg0.v.Tg((bg0.v) c17, false, 0L, 2, null);
        java.lang.Object obj = new java.lang.Object();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        com.tencent.mm.plugin.vlog.model.n nVar = new com.tencent.mm.plugin.vlog.model.n();
        ((bg0.a0) i95.n0.c(bg0.a0.class)).getClass();
        nVar.f175684c = 1;
        r45.dd4 dd4Var = (r45.dd4) mb4Var.getCustom(14);
        nVar.f175682a = dd4Var != null ? dd4Var.getInteger(7) : 0;
        nVar.f175683b = true;
        if (com.tencent.mm.plugin.finder.storage.t70.f127590a.t2()) {
            long j18 = uv2.e.f431378c;
            if (j18 > 0) {
                videoTransPara.C = (int) ((((float) j18) / 1048576.0f) * 0.38f);
                com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "ABA finder video maxVideoSize:" + videoTransPara.C);
            }
            nVar.i(true, videoTransPara);
        }
        nVar.f175693l = new tv2.b(new kotlin.jvm.internal.e0(), this, i17, i18);
        this.f422301i = nVar;
        float a17 = com.tencent.mm.plugin.vlog.model.f0.a(nVar, h70Var2, false, new tv2.c(this, f0Var2, i17, finderMediaReportObject, j17, str, i70Var2, videoTransPara, h70Var2, obj, c0Var), 2, null);
        synchronized (obj) {
            if (c0Var.f310112d) {
                f0Var = f0Var2;
            } else {
                com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "wait " + i17);
                try {
                    obj.wait();
                } catch (java.lang.InterruptedException unused) {
                    com.tencent.mars.xlog.Log.e("Finder.LogPost.FinderMediaProcessStage", "wait interrupted");
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify ");
                sb6.append(i17);
                sb6.append(", ");
                f0Var = f0Var2;
                sb6.append(f0Var.f310116d);
                com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", sb6.toString());
            }
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.f422300h.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setMpError(f0Var.f310116d);
        }
        cu2.u.f222441a.l(this.f422300h);
        return new jz5.l(java.lang.Integer.valueOf(f0Var.f310116d), java.lang.Float.valueOf(a17));
    }

    public final jz5.l m(long j17, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, r45.mb4 mb4Var, java.lang.String str, com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject, boolean z17, int i17, int i18) {
        android.graphics.Rect rect;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        kotlin.jvm.internal.f0 f0Var;
        android.graphics.Rect rect2;
        kotlin.jvm.internal.c0 c0Var;
        java.lang.String str2;
        java.util.LinkedList list;
        int i38;
        int i39;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 0L, 1L);
        g0Var.C(1523L, 0L, 1L);
        ((ag0.m) ((bg0.u) i95.n0.c(bg0.u.class))).Ai(z17);
        java.lang.Object obj = new java.lang.Object();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        java.lang.String string = mb4Var.getString(0);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (string == null) {
            return new jz5.l(-1000, valueOf);
        }
        r45.dd4 dd4Var = (r45.dd4) mb4Var.getCustom(14);
        if (dd4Var == null) {
            return new jz5.l(java.lang.Integer.valueOf(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND), valueOf);
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.f0 f0Var3 = new kotlin.jvm.internal.f0();
        int i47 = videoTransPara.f71194g;
        qc0.d1 Ai = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).Ai(string, true);
        i95.m c17 = i95.n0.c(bg0.v.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.vlog.model.l0 Z2 = bg0.v.Z2((bg0.v) c17, string, false, 2, null);
        com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) Z2;
        i1Var.c(dd4Var.getInteger(3));
        i1Var.a(dd4Var.getInteger(3));
        com.tencent.mm.plugin.vlog.model.k0 Bi = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Bi(kz5.b0.c(Z2));
        if (Ai != null) {
            int i48 = Ai.f361363a;
            int i49 = Ai.f361364b;
            int i57 = Ai.f361368f;
            if (i57 == 90 || i57 == 270) {
                i49 = i48;
                i48 = i49;
            }
            i1Var.f175624i.f175787d.set(0, 0, i48, i49);
            ((com.tencent.mm.plugin.vlog.model.h1) Bi).u(i48, i49);
            rect = rect3;
            rect.set(0, 0, i48, i49);
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo origin = finderMediaReportObject.getOrigin();
            if (origin == null) {
                i38 = i48;
                i39 = i49;
            } else {
                i38 = i48;
                i39 = i49;
                origin.setVideoDuration((int) Ai.f361366d);
            }
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo origin2 = finderMediaReportObject.getOrigin();
            if (origin2 != null) {
                origin2.setWidth(Ai.f361363a);
            }
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo origin3 = finderMediaReportObject.getOrigin();
            if (origin3 != null) {
                origin3.setHeight(Ai.f361364b);
            }
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo origin4 = finderMediaReportObject.getOrigin();
            if (origin4 != null) {
                origin4.setVideoBitrate(Ai.f361367e);
            }
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo origin5 = finderMediaReportObject.getOrigin();
            if (origin5 != null) {
                origin5.setAudioBitrate(Ai.f361370h);
            }
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo origin6 = finderMediaReportObject.getOrigin();
            if (origin6 != null) {
                origin6.setFps((int) Ai.f361365c);
            }
            i27 = i38;
            i28 = i39;
            i19 = 0;
        } else {
            rect = rect3;
            i19 = 0;
            i27 = 0;
            i28 = 0;
        }
        r45.c07 c07Var = (r45.c07) dd4Var.getCustom(i19);
        if (c07Var != null) {
            if (z17) {
                c0Var = c0Var2;
                str2 = "notify longvideo, ";
                rect.set(c07Var.getInteger(i19), c07Var.getInteger(3), c07Var.getInteger(2), c07Var.getInteger(1));
            } else {
                c0Var = c0Var2;
                str2 = "notify longvideo, ";
                r45.s23 s23Var = (r45.s23) dd4Var.getCustom(1);
                if (s23Var != null && (list = s23Var.getList(0)) != null) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.setValues(kz5.n0.P0(list));
                    float[] fArr = new float[9];
                    matrix.getValues(fArr);
                    float f17 = fArr[0];
                    float f18 = fArr[3];
                    double sqrt = (float) java.lang.Math.sqrt((f17 * f17) + (f18 * f18));
                    if (sqrt <= 0.0d) {
                        sqrt = 1.0d;
                    }
                    uv2.e eVar = uv2.e.f431376a;
                    int i58 = i27;
                    i37 = i28;
                    int t17 = eVar.t((int) java.lang.Math.floor((c07Var.getInteger(1) - c07Var.getInteger(3)) / sqrt));
                    i29 = i58;
                    f0Var = f0Var3;
                    int t18 = eVar.t((int) java.lang.Math.floor((c07Var.getInteger(2) - c07Var.getInteger(0)) / sqrt));
                    int floor = (int) java.lang.Math.floor(c07Var.getInteger(0) / sqrt);
                    rect2 = rect;
                    int floor2 = (int) java.lang.Math.floor(c07Var.getInteger(3) / sqrt);
                    rect2.set(floor, floor2, t18 + floor, t17 + floor2);
                }
            }
            i29 = i27;
            i37 = i28;
            f0Var = f0Var3;
            rect2 = rect;
        } else {
            i29 = i27;
            i37 = i28;
            f0Var = f0Var3;
            rect2 = rect;
            c0Var = c0Var2;
            str2 = "notify longvideo, ";
        }
        f0Var2.f310116d = z17 ? dd4Var.getInteger(4) : uv2.e.f431376a.t(dd4Var.getInteger(4));
        kotlin.jvm.internal.f0 f0Var4 = f0Var;
        f0Var4.f310116d = z17 ? dd4Var.getInteger(5) : uv2.e.f431376a.t(dd4Var.getInteger(5));
        com.tencent.mm.plugin.vlog.model.h1 h1Var = (com.tencent.mm.plugin.vlog.model.h1) Bi;
        h1Var.t(rect2);
        if (z17) {
            long j18 = uv2.e.f431378c;
            if (j18 > 0) {
                videoTransPara.C = (int) ((((float) j18) / 1048576.0f) * 0.38f);
                com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "ABA finder video maxVideoSize:" + videoTransPara.C);
            }
        }
        com.tencent.mm.plugin.vlog.model.g0 wi6 = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).wi(Bi);
        android.util.Size size = new android.util.Size(i29, i37);
        com.tencent.mm.plugin.vlog.model.p pVar = (com.tencent.mm.plugin.vlog.model.p) wi6;
        pVar.e(str, videoTransPara, size, rect2, false, true);
        r45.h70 f19 = pVar.f();
        r45.i70 i70Var = f19.f375902i;
        i70Var.f376775d = str;
        i70Var.f376792x = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ui(z17, h1Var.g());
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        com.tencent.mm.plugin.vlog.model.n nVar = new com.tencent.mm.plugin.vlog.model.n();
        ((bg0.a0) i95.n0.c(bg0.a0.class)).getClass();
        nVar.f175684c = 2;
        r45.dd4 dd4Var2 = (r45.dd4) mb4Var.getCustom(14);
        nVar.f175682a = dd4Var2 != null ? dd4Var2.getInteger(7) : 0;
        nVar.i(true, videoTransPara);
        nVar.f175693l = new tv2.d(new kotlin.jvm.internal.e0(), this, i17, i18);
        this.f422301i = nVar;
        f19.f375909s = dd4Var.getString(8);
        kotlin.jvm.internal.f0 f0Var5 = new kotlin.jvm.internal.f0();
        f0Var5.f310116d = -1;
        kotlin.jvm.internal.c0 c0Var3 = c0Var;
        float a17 = com.tencent.mm.plugin.vlog.model.f0.a(nVar, f19, false, new tv2.e(this, f0Var5, finderMediaReportObject, j17, str, z17, f0Var2, f0Var4, videoTransPara, obj, c0Var3), 2, null);
        synchronized (obj) {
            if (!c0Var3.f310112d) {
                com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "wait longvideo");
                try {
                    obj.wait();
                } catch (java.lang.InterruptedException unused) {
                    com.tencent.mars.xlog.Log.e("Finder.LogPost.FinderMediaProcessStage", "wait interrupted");
                }
                com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", str2 + f0Var5.f310116d);
            }
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.f422300h.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setMpError(f0Var5.f310116d);
        }
        cu2.u.f222441a.l(this.f422300h);
        return new jz5.l(java.lang.Integer.valueOf(f0Var5.f310116d), java.lang.Float.valueOf(a17));
    }

    public final void n(pv2.g gVar) {
        dead();
        this.f422302m = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.tencent.mm.modelcontrol.VideoTransPara r24, r45.mb4 r25, java.lang.String r26, r45.mb4 r27, int r28, com.tencent.mm.protocal.protobuf.FinderMediaReportObject r29, float r30, float r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv2.f.o(com.tencent.mm.modelcontrol.VideoTransPara, r45.mb4, java.lang.String, r45.mb4, int, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, float, float, boolean):void");
    }

    public final void p(float f17) {
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int i17 = (int) (45 * f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f422300h;
        sb6.append(finderItem.getLocalId());
        sb6.append(" updateProgress  ");
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", sb6.toString());
        if (finderItem.getPostInfo().getInteger(4) < i17) {
            finderItem.getPostInfo().set(4, java.lang.Integer.valueOf(i17));
            cu2.u.f222441a.l(finderItem);
        }
        com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
        long localId = finderItem.getLocalId();
        am.ga gaVar = feedPostProgressEvent.f54250g;
        gaVar.f6749a = localId;
        gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
        feedPostProgressEvent.e();
    }
}
