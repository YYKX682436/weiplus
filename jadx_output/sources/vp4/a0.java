package vp4;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f438985d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f438986e;

    /* renamed from: f, reason: collision with root package name */
    public int f438987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vp4.b0 f438988g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ og3.d f438989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(vp4.b0 b0Var, og3.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438988g = b0Var;
        this.f438989h = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vp4.a0(this.f438988g, this.f438989h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vp4.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ?? r66;
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f438987f;
        vp4.b0 b0Var = this.f438988g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoForegroundRemuxChain", "come in remux foreground chain");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            vp4.u uVar = new vp4.u(b0Var, null);
            this.f438987f = 1;
            if (kotlinx.coroutines.l.g(g3Var, uVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f438985d = b0Var;
        og3.d dVar = this.f438989h;
        this.f438986e = dVar;
        this.f438987f = 2;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoForegroundRemuxChain", "come in VideoForegroundRemux");
        b0Var.f439013m = rVar;
        rVar.m(new vp4.v(b0Var));
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = b0Var.f439004d;
        kotlin.jvm.internal.o.d(recordConfigProvider);
        java.lang.String str3 = recordConfigProvider.B;
        if (android.text.TextUtils.isEmpty(str3)) {
            nu3.m.f340229a.n(1003);
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoForegroundRemuxChain", "reMux outPath is empty");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo(og3.h.f345164d, 1003, "Foreground remux output path is null", null, 8, null)));
            b0Var.f439013m = null;
        } else {
            android.os.Bundle bundle = dVar.f345160b;
            rp4.a aVar2 = b0Var.f439005e;
            vp4.s sVar = vp4.s.f439074a;
            if (aVar2 == null) {
                r66 = 0;
                str = "KEY_EXPORT_HEVC_HARD";
                str2 = "KEY_EXPORT_HEVC_SOFT";
                rp4.a a17 = sVar.a(recordConfigProvider, b0Var.f439009i, b0Var.f439002b, b0Var.f439003c, bundle != 0 ? bundle.getBoolean("KEY_EXPORT_HEVC_HARD", false) : false, bundle != 0 ? bundle.getBoolean("KEY_EXPORT_HEVC_SOFT", false) : false);
                b0Var.f439005e = a17;
                qz5.b.d(a17.b());
            } else {
                r66 = 0;
                str = "KEY_EXPORT_HEVC_HARD";
                str2 = "KEY_EXPORT_HEVC_SOFT";
            }
            rp4.a aVar3 = b0Var.f439005e;
            if (aVar3 != null) {
                aVar3.a(recordConfigProvider.f155676n);
            }
            vp4.z zVar = new vp4.z(b0Var, str3, rVar);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            nu3.m mVar = nu3.m.f340229a;
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setMuxStartTimeStamp >> " + elapsedRealtime);
            nu3.m.f340230b.P = elapsedRealtime;
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = b0Var.f439009i.f412588b;
            if (audioCacheInfo != null) {
                wt3.c1.f449387b.c(audioCacheInfo, new vp4.x(rVar, b0Var, bundle, zVar));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoForegroundRemuxChain", "remuxImpl no audio info");
                int i18 = bundle != 0 ? bundle.getInt("KEY_EXPORT_TARGET_VIDEO_BITRATE", r66) : r66;
                r45.h70 f17 = sVar.f(recordConfigProvider, b0Var.f439009i, b0Var.f439008h, bundle != 0 ? bundle.getBoolean(str2, r66) : r66, bundle != 0 ? bundle.getBoolean(str, r66) : r66, null, i18);
                if (f17 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VideoForegroundRemuxChain", "composition info is null");
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    rVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo(og3.h.f345164d, 1009, "ERROR_TARGET_BITRATE_ERROR remux error", null, 8, null)));
                    b0Var.f439013m = null;
                } else {
                    java.util.LinkedList<r45.ho6> tracks = f17.f375897d;
                    kotlin.jvm.internal.o.f(tracks, "tracks");
                    for (r45.ho6 ho6Var : tracks) {
                        rp4.x xVar = b0Var.f439008h;
                        if (xVar != null) {
                            r45.vl5 cropRect = ho6Var.f376344r.f378527e;
                            kotlin.jvm.internal.o.f(cropRect, "cropRect");
                            android.graphics.Rect rect = xVar.f398704i;
                            com.tencent.mm.plugin.vlog.model.x.g(rect, cropRect);
                            r45.vl5 contentRect = ho6Var.f376344r.f378529g;
                            kotlin.jvm.internal.o.f(contentRect, "contentRect");
                            com.tencent.mm.plugin.vlog.model.x.g(rect, contentRect);
                        }
                    }
                    st3.r rVar2 = b0Var.f439002b;
                    rp4.a aVar4 = b0Var.f439005e;
                    int i19 = aVar4 != null ? aVar4.f398609l : r66;
                    android.os.Bundle bundle2 = recordConfigProvider.M;
                    b0Var.f439012l = vp4.s.d(sVar, f17, recordConfigProvider, bundle2 != 0 ? bundle2.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", r66) : r66, rVar2, i19, i18, zVar, null, new vp4.y(b0Var), 128, null);
                }
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar5 = pz5.a.f359186d;
        return j17 == aVar ? aVar : j17;
    }
}
