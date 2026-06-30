package yt3;

/* loaded from: classes10.dex */
public final class r4 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f465646d;

    /* renamed from: e, reason: collision with root package name */
    public ru3.f f465647e;

    /* renamed from: f, reason: collision with root package name */
    public ct0.b f465648f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f465649g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f465650h;

    /* renamed from: i, reason: collision with root package name */
    public st3.s f465651i;

    /* renamed from: m, reason: collision with root package name */
    public st3.r f465652m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.q f465653n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f465654o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f465655p;

    /* renamed from: q, reason: collision with root package name */
    public int f465656q;

    public r4(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f465646d = context;
        this.f465650h = true;
        this.f465652m = new st3.r(0, 0, 0, 0, 0, 0, 0, 0, false, false, 0, 0, 0, 0, 16383, null);
        this.f465654o = kotlinx.coroutines.z0.i(kotlinx.coroutines.z0.b(), kotlinx.coroutines.t3.a(null, 1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (((yt3.r4) r7) != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(yt3.r4 r5, yz5.a r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof yt3.g4
            if (r0 == 0) goto L16
            r0 = r7
            yt3.g4 r0 = (yt3.g4) r0
            int r1 = r0.f465469i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f465469i = r1
            goto L1b
        L16:
            yt3.g4 r0 = new yt3.g4
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f465467g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f465469i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.f465465e
            r6 = r5
            yz5.a r6 = (yz5.a) r6
            java.lang.Object r5 = r0.f465464d
            yt3.r4 r5 = (yt3.r4) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r7 = r5.f465649g
            if (r7 == 0) goto L90
            st3.r r2 = r5.f465652m
            boolean r2 = r2.f412582j
            if (r2 != 0) goto L62
            boolean r2 = r7.T
            if (r2 == 0) goto L62
            r0.f465464d = r5
            r0.f465465e = r6
            r0.f465466f = r7
            r0.f465469i = r3
            java.lang.Object r7 = r5.d(r6, r0)
            if (r7 != r1) goto L5c
            goto L94
        L5c:
            yt3.r4 r7 = (yt3.r4) r7
            if (r7 != 0) goto L62
        L60:
            r1 = r4
            goto L94
        L62:
            st3.r r7 = r5.f465652m
            boolean r0 = r7.f412581i
            if (r0 == 0) goto L70
            boolean r7 = r7.f412582j
            if (r7 != 0) goto L90
            boolean r7 = es0.b.f256310a
            if (r7 == 0) goto L90
        L70:
            st3.s r7 = r5.f465651i
            if (r7 == 0) goto L77
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r7 = r7.f412588b
            goto L78
        L77:
            r7 = r4
        L78:
            if (r7 != 0) goto L90
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r6 = r5.h()
            if (r6 != 0) goto L81
            goto L60
        L81:
            r5.f(r6)
            nu3.m r5 = nu3.m.f340229a
            r6 = 2
            r5.n(r6)
            r6 = 1
            r5.i(r3, r6)
            goto L60
        L90:
            r6.invoke()
            r1 = r5
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.r4.a(yt3.r4, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(yt3.r4 r4Var) {
        android.content.Context context = r4Var.f465646d;
        if (context instanceof android.app.Activity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            ru3.f fVar = r4Var.f465647e;
            boolean z17 = false;
            if (fVar != null) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var = fVar.f399754a;
                if (u3Var != null ? u3Var.isShowing() : false) {
                    z17 = true;
                }
            }
            if (z17) {
                ru3.f fVar2 = r4Var.f465647e;
                if (fVar2 != null) {
                    fVar2.a();
                }
                r4Var.f465647e = null;
            }
        }
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara;
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.vfs.w6.h(str2);
        }
        android.graphics.Bitmap p17 = ai3.d.p(str);
        if (p17 != null) {
            dw3.c0 c0Var = dw3.c0.f244182a;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f465649g;
            com.tencent.mm.sdk.platformtools.x.D0(c0Var.f(p17, (recordConfigProvider == null || (videoTransPara = recordConfigProvider.f155676n) == null) ? 0 : videoTransPara.f71204t), 60, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(yz5.a r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.r4.d(yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lt3.f0 e(st3.s r38, st3.r r39) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.r4.e(st3.s, st3.r):lt3.f0");
    }

    public final void f(com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        com.tencent.mm.sdk.platformtools.o4.L().putBoolean("mediacodec_create_error", false);
        ut3.f.f431176c.a(this.f465646d, captureDataManager$CaptureVideoNormalModel);
    }

    public final void g(st3.r rVar) {
        int i17;
        int i18;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 154L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "start forceRemux");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f465649g;
        sb6.append(recordConfigProvider != null ? recordConfigProvider.B : null);
        sb6.append("_tmp");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f465649g;
        kotlin.jvm.internal.o.d(recordConfigProvider2);
        if (recordConfigProvider2.f155676n.f71206v == 2) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.f465649g;
            kotlin.jvm.internal.o.d(recordConfigProvider3);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(recordConfigProvider3.f155676n.D);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = this.f465649g;
            kotlin.jvm.internal.o.d(recordConfigProvider4);
            com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "ABA: Using Min Max QP Limitation: [%d], [%d] ", valueOf, java.lang.Integer.valueOf(recordConfigProvider4.f155676n.E));
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider5 = this.f465649g;
            kotlin.jvm.internal.o.d(recordConfigProvider5);
            i17 = recordConfigProvider5.f155676n.D;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider6 = this.f465649g;
            kotlin.jvm.internal.o.d(recordConfigProvider6);
            i18 = recordConfigProvider6.f155676n.E;
        } else {
            i17 = 0;
            i18 = 51;
        }
        int i19 = i18;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider7 = this.f465649g;
        java.lang.String str = recordConfigProvider7 != null ? recordConfigProvider7.B : null;
        int i27 = rVar.f412573a;
        int i28 = rVar.f412574b;
        int i29 = rVar.f412575c;
        kotlin.jvm.internal.o.d(recordConfigProvider7);
        int i37 = recordConfigProvider7.f155676n.f71202r;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider8 = this.f465649g;
        kotlin.jvm.internal.o.d(recordConfigProvider8);
        int remuxingVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.remuxingVFS(str, sb7, i27, i28, i29, i37, 8, recordConfigProvider8.f155676n.f71201q, 25.0f, rVar.f412577e, null, 0, false, i17, i19);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider9 = this.f465649g;
        com.tencent.mm.vfs.w6.c(sb7, recordConfigProvider9 != null ? recordConfigProvider9.B : null);
        com.tencent.mm.vfs.w6.h(sb7);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "minQP :" + i17 + "  maxQP :" + i19 + "  duration:" + remuxingVFS + " cost:" + elapsedRealtime2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 155L, elapsedRealtime2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel h() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.r4.h():com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel");
    }

    public final void i(lt3.f0 f0Var, st3.s sVar, st3.r rVar) {
        if (this.f465647e == null) {
            ru3.f fVar = new ru3.f();
            fVar.b(this.f465646d, false, com.tencent.mm.R.string.i1q, yt3.j4.f465508d);
            this.f465647e = fVar;
        }
        lt3.v vVar = lt3.v.f321277a;
        yt3.l4 l4Var = new yt3.l4(this, rVar, f0Var, sVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoMixHandler", "VideoMixHandler stopBgMix!");
        lt3.v.f321282f = l4Var;
        lt3.v.f321279c = true;
        java.util.ArrayList arrayList = lt3.v.f321280d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lt3.u uVar = new lt3.u((lt3.r) it.next());
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.l(new pm0.p(uVar));
        }
        arrayList.clear();
        if (lt3.v.f321278b) {
            return;
        }
        yz5.a aVar = lt3.v.f321282f;
        if (aVar != null) {
            aVar.invoke();
        }
        lt3.v.f321282f = null;
    }

    public final void j(ct0.b info, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f465648f = info;
        this.f465649g = configProvider;
        nu3.i iVar = nu3.i.f340218a;
        iVar.n("KEY_IS_CAPUTRE_BOOLEAN", java.lang.Boolean.valueOf(info.f222206c));
        if (info.f222206c) {
            iVar.n("KEY_CAPUTRE_VIDEO_PATH_STRING", info.d());
            iVar.n("KEY_CAPUTRE_THUMB_PATH_STRING", info.a() ? info.f222205b : info.f222210g);
        }
    }

    public final void k(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "time cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public final void m(st3.s editConfig) {
        boolean z17;
        kotlin.jvm.internal.o.g(editConfig, "editConfig");
        if (this.f465650h) {
            z17 = false;
            this.f465650h = false;
        } else {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "is repeat to return");
            return;
        }
        kotlinx.coroutines.r2 r2Var = this.f465655p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f465655p = kotlinx.coroutines.l.d(this.f465654o, null, null, new yt3.q4(this, editConfig, null), 3, null);
    }

    @Override // yt3.r2
    public void release() {
        kotlinx.coroutines.r2 r2Var = this.f465655p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
