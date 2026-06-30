package ke4;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f307026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsLivePhotoMenuEvent f307027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ke4.c f307028f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f307029g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.autogen.events.SnsLivePhotoMenuEvent snsLivePhotoMenuEvent, ke4.c cVar, r45.jj4 jj4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f307027e = snsLivePhotoMenuEvent;
        this.f307028f = cVar;
        this.f307029g = jj4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
        ke4.b bVar = new ke4.b(this.f307027e, this.f307028f, this.f307029g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
        java.lang.Object invokeSuspend = ((ke4.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        jz5.f0 f0Var;
        int i17;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f307026d;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        r45.jj4 jj4Var = this.f307029g;
        ke4.c cVar = this.f307028f;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f307027e.f54822g.f6612a == 3) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getShareHelper$p", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
                dd4.e0 e0Var = cVar.f307031b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getShareHelper$p", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
                this.f307026d = 1;
                c17 = e0Var.c(34, jj4Var, this);
                if (c17 == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
                    return aVar;
                }
            }
            f0Var = f0Var2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
            return f0Var;
        }
        if (i18 != 1) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
            throw illegalStateException;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        c17 = obj;
        java.lang.String videoPath = (java.lang.String) c17;
        if (videoPath == null || videoPath.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoShareHelper", "videoPath is error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
            return f0Var2;
        }
        java.lang.String r17 = com.tencent.mm.plugin.sns.model.i1.r(jj4Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoShareHelper", "videoDownloadFinish videoPath: " + videoPath + " imgPath: " + r17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getInfo$p", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
        xc4.p pVar = cVar.f307036g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getInfo$p", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
        java.lang.String a17 = pVar != null ? pVar.a1() : "";
        int i19 = jj4Var.Y;
        int i27 = (int) (jj4Var.R * 1000);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportScene", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportScene", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
        int i28 = cVar.f307030a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
        android.content.Context context = cVar.f307032c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
        if (context == null) {
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
        kotlin.jvm.internal.o.d(r17);
        long j17 = jj4Var.Z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exportLivePhoto", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoExportHelper", "exportLivePhoto >> snsId: " + a17 + ", mediaIndex: " + i19 + ", videoPath: " + videoPath + ", coverPath: " + r17 + ", coverTimeStampMs: " + j17);
        if (ca4.z0.C(r17) == 4) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            i17 = i27;
            sb6.append(com.tencent.mm.vfs.w6.i(r17, false));
            sb6.append("_tmp");
            str = sb6.toString();
            com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(r17));
            ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(com.tencent.mm.vfs.w6.i(r17, false), str, 2);
        } else {
            i17 = i27;
            str = r17;
        }
        bs.b wi6 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_file");
        if (wi6 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exportLivePhoto", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper");
        } else {
            bs.b wi7 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_permission");
            if (wi7 != null) {
                java.lang.String a18 = q75.c.a("jpg");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoExportHelper", "exportPath: " + a18 + " destCoverPath: " + str);
                f0Var = f0Var2;
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null))), null, null, new le4.b(wi7, wi6, videoPath, str, a18, j17, currentTimeMillis, context, a17, i19, i28, i17, null), 3, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exportLivePhoto", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
                return f0Var;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exportLivePhoto", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper");
        }
        f0Var = f0Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper$menuEventListener$1$callback$1");
        return f0Var;
    }
}
