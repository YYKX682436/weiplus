package sv2;

/* loaded from: classes10.dex */
public final class m extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413331h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f413332i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f413333m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.f0 f413334n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f413335o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f413336p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413331h = draftItem;
        this.f413332i = "LogPost.FinderDraftMediaProcessStage";
        this.f413333m = draftItem.t0();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f413336p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderDraftModifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage$draftModifyListener$1
            {
                this.__eventId = -881666027;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderDraftModifyEvent finderDraftModifyEvent) {
                com.tencent.mm.autogen.events.FinderDraftModifyEvent event = finderDraftModifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                sv2.m mVar = sv2.m.this;
                am.za zaVar = event.f54269g;
                if (!(zaVar != null && zaVar.f8549a == mVar.f413331h.field_localId)) {
                    return false;
                }
                java.lang.String str = mVar.f413332i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canceled ");
                com.tencent.mm.plugin.finder.storage.x80 x80Var = mVar.f413331h;
                sb6.append(x80Var.field_localId);
                sb6.append(", ");
                sb6.append(x80Var.field_objectId);
                sb6.append(", modifyType:");
                sb6.append(zaVar != null ? java.lang.Integer.valueOf(zaVar.f8550b) : null);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                mVar.f413335o = true;
                com.tencent.mm.plugin.vlog.model.f0 f0Var = mVar.f413334n;
                if (f0Var != null) {
                    com.tencent.mm.plugin.vlog.model.f0.b(f0Var, null, 1, null);
                }
                return true;
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
        boolean isLongVideo = this.f413333m.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 20L, 1L);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 20L, 1L);
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
        boolean isLongVideo = this.f413333m.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 20L, 1L);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 20L, 1L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0344, code lost:
    
        if ((r3 == null || r3.length() == 0) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0905, code lost:
    
        if (r2 == null) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0907, code lost:
    
        r0 = java.lang.Integer.valueOf(r2.f361363a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x090f, code lost:
    
        r1.append(r0);
        r1.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0917, code lost:
    
        if (r2 == null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0919, code lost:
    
        r0 = java.lang.Integer.valueOf(r2.f361364b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0921, code lost:
    
        r1.append(r0);
        com.tencent.mars.xlog.Log.i(r11, r1.toString());
        r7 = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.plugin.finder.report.p2.H(r7, "andr_Video_Compress_Fail", r14.f413333m, 0, null, 12, null);
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).nj("error", r37, false, r4, r10);
        com.tencent.mm.plugin.finder.report.p2.H(r7, "andr_Video_Compress_Fail", r14.f413333m, 0, null, 12, null);
        r0 = new sv2.c(r12, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0920, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x090e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x062c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x03ce  */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 2921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv2.m.j():pv2.g");
    }

    public final java.lang.String k() {
        java.lang.String a17;
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(this.f413333m.getMediaList());
        return (mb4Var == null || (a17 = hc2.l0.a(mb4Var)) == null) ? "" : a17;
    }

    public final jz5.l l(long j17, int i17, java.lang.String str, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, r45.mb4 mb4Var, com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject, int i18) {
        kotlin.jvm.internal.f0 f0Var;
        com.tencent.mars.xlog.Log.i(this.f413332i, "remuxComposition outputPath:" + str);
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
        r45.dd4 dd4Var = (r45.dd4) mb4Var.getCustom(14);
        nVar.f175682a = dd4Var != null ? dd4Var.getInteger(7) : 0;
        nVar.f175683b = true;
        if (com.tencent.mm.plugin.finder.storage.t70.f127590a.t2()) {
            uv2.e eVar = uv2.e.f431376a;
            long j18 = uv2.e.f431378c;
            if (j18 > 0) {
                videoTransPara.C = (int) ((((float) j18) / 1048576.0f) * 0.38f);
                com.tencent.mars.xlog.Log.i(this.f413332i, "ABA finder video maxVideoSize:" + videoTransPara.C);
            }
            nVar.i(true, videoTransPara);
        }
        nVar.f175693l = new sv2.i(new kotlin.jvm.internal.e0(), this, i17, i18);
        this.f413334n = nVar;
        float a17 = com.tencent.mm.plugin.vlog.model.f0.a(nVar, h70Var2, false, new sv2.j(this, f0Var2, i17, finderMediaReportObject, j17, str, i70Var2, videoTransPara, h70Var2, obj, c0Var), 2, null);
        synchronized (obj) {
            if (c0Var.f310112d) {
                f0Var = f0Var2;
            } else {
                com.tencent.mars.xlog.Log.i(this.f413332i, "wait " + i17);
                try {
                    obj.wait();
                } catch (java.lang.InterruptedException unused) {
                    com.tencent.mars.xlog.Log.e(this.f413332i, "wait interrupted");
                }
                java.lang.String str2 = this.f413332i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify ");
                sb6.append(i17);
                sb6.append(", ");
                f0Var = f0Var2;
                sb6.append(f0Var.f310116d);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            }
        }
        return new jz5.l(java.lang.Integer.valueOf(f0Var.f310116d), java.lang.Float.valueOf(a17));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l m(long r29, com.tencent.mm.modelcontrol.VideoTransPara r31, r45.mb4 r32, java.lang.String r33, com.tencent.mm.protocal.protobuf.FinderMediaReportObject r34, boolean r35, int r36, int r37, com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct r38) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv2.m.m(long, com.tencent.mm.modelcontrol.VideoTransPara, r45.mb4, java.lang.String, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, boolean, int, int, com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct):jz5.l");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0368  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(com.tencent.mm.modelcontrol.VideoTransPara r23, r45.mb4 r24, java.lang.String r25, r45.mb4 r26, int r27, com.tencent.mm.protocal.protobuf.FinderMediaReportObject r28, float r29, float r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv2.m.n(com.tencent.mm.modelcontrol.VideoTransPara, r45.mb4, java.lang.String, r45.mb4, int, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, float, float, boolean):void");
    }

    public final void o(float f17) {
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int i17 = (int) (45 * f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413331h;
        sb6.append(x80Var.field_localId);
        sb6.append(" updateProgress  ");
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(this.f413332i, sb6.toString());
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f413333m;
        if (finderItem.getPostInfo().getInteger(4) < i17) {
            finderItem.getPostInfo().set(4, java.lang.Integer.valueOf(i17));
            cu2.o.f222430a.b(x80Var);
        }
        com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
        long j17 = x80Var.field_localId;
        am.ga gaVar = feedPostProgressEvent.f54250g;
        gaVar.f6749a = j17;
        gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
        feedPostProgressEvent.e();
    }
}
