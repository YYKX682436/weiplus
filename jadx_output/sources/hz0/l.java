package hz0;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f286273d;

    /* renamed from: e, reason: collision with root package name */
    public int f286274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f286275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJExportSettings f286277h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f286278i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286280n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286281o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f286282p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kotlinx.coroutines.q qVar, java.lang.String str, com.tencent.maas.instamovie.MJExportSettings mJExportSettings, com.tencent.maas.model.time.MJTimeRange mJTimeRange, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f286275f = qVar;
        this.f286276g = str;
        this.f286277h = mJExportSettings;
        this.f286278i = mJTimeRange;
        this.f286279m = str2;
        this.f286280n = str3;
        this.f286281o = str4;
        this.f286282p = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hz0.l(this.f286275f, this.f286276g, this.f286277h, this.f286278i, this.f286279m, this.f286280n, this.f286281o, this.f286282p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hz0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object o17;
        com.tencent.maas.export.c cVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f286274e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.i5 i5Var = az0.i5.f15557a;
            this.f286274e = 1;
            o17 = i5Var.o(this);
            if (o17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (com.tencent.maas.export.c) this.f286273d;
                kotlin.ResultKt.throwOnFailure(obj);
                hz0.m mVar = hz0.m.f286283a;
                java.lang.String str = cVar.f48010a;
                kotlin.jvm.internal.o.f(str, "value(...)");
                com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundWorkManager", "enqueueWork >> workTagId: ".concat(str));
                a5.c0 c0Var = new a5.c0(com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork.class);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("KEY_EXPORT_BACKGROUND_WORK_TAG_ID", str);
                a5.m mVar2 = new a5.m(hashMap);
                a5.m.d(mVar2);
                c0Var.f1430c.f297768e = mVar2;
                ((java.util.HashSet) c0Var.f1431d).add(str);
                a5.t0 a17 = c0Var.a();
                kotlin.jvm.internal.o.f(a17, "build(...)");
                b5.w.c(com.tencent.mm.sdk.platformtools.x2.f193071a).a((a5.d0) a17);
                i95.m c17 = i95.n0.c(g65.a.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                java.lang.String str2 = cVar.f48010a;
                kotlin.jvm.internal.o.f(str2, "value(...)");
                g65.a.hg((g65.a) c17, 34, 10, str2, 0, 0, 0, 0L, 0L, 0L, 0L, 0, null, null, null, null, 32760, null);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            o17 = obj;
        }
        com.tencent.maas.export.MJExportManager mJExportManager = (com.tencent.maas.export.MJExportManager) o17;
        kotlinx.coroutines.q qVar = this.f286275f;
        if (mJExportManager != null) {
            hz0.m mVar3 = hz0.m.f286283a;
            try {
                b5.w.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TemplateBackgroundWorkManager", "checkWorkManagerInit is error " + e17.getMessage());
                z17 = false;
            }
            if (z17) {
                com.tencent.maas.model.time.MJTimeRange mJTimeRange = com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange;
                java.lang.String str3 = this.f286276g;
                if (android.text.TextUtils.isEmpty(str3)) {
                    throw new java.lang.IllegalArgumentException("input clipbundle id should not be null");
                }
                com.tencent.maas.instamovie.MJExportSettings mJExportSettings = this.f286277h;
                if (mJExportSettings == null) {
                    throw new java.lang.IllegalArgumentException("export settings should not be null");
                }
                com.tencent.maas.export.c d17 = mJExportManager.d(new com.tencent.maas.export.MJExportRequest(str3, this.f286278i, mJExportSettings));
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String str4 = d17.f48010a;
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(str4));
                dm.ib ibVar = new dm.ib();
                ibVar.field_work_id = str4;
                ibVar.field_work_type = 4001;
                ibVar.field_work_code = -1;
                ibVar.field_output_video_path = this.f286279m;
                ibVar.field_output_thumb_path = this.f286280n;
                ibVar.field_clip_bundle_id = str3;
                ibVar.field_clip_bundle_local_path = this.f286281o;
                ibVar.field_confirm_remux_time_stamp = java.lang.System.currentTimeMillis();
                ibVar.field_is_killed_process_restart = 2;
                ibVar.field_export_video_duration_ms = this.f286282p;
                this.f286273d = d17;
                this.f286274e = 2;
                java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new iz0.c(ibVar, null), this);
                if (g17 != pz5.a.f359186d) {
                    g17 = f0Var;
                }
                if (g17 == aVar) {
                    return aVar;
                }
                cVar = d17;
                hz0.m mVar4 = hz0.m.f286283a;
                java.lang.String str5 = cVar.f48010a;
                kotlin.jvm.internal.o.f(str5, "value(...)");
                com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundWorkManager", "enqueueWork >> workTagId: ".concat(str5));
                a5.c0 c0Var2 = new a5.c0(com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork.class);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("KEY_EXPORT_BACKGROUND_WORK_TAG_ID", str5);
                a5.m mVar22 = new a5.m(hashMap2);
                a5.m.d(mVar22);
                c0Var2.f1430c.f297768e = mVar22;
                ((java.util.HashSet) c0Var2.f1431d).add(str5);
                a5.t0 a172 = c0Var2.a();
                kotlin.jvm.internal.o.f(a172, "build(...)");
                b5.w.c(com.tencent.mm.sdk.platformtools.x2.f193071a).a((a5.d0) a172);
                i95.m c172 = i95.n0.c(g65.a.class);
                kotlin.jvm.internal.o.f(c172, "getService(...)");
                java.lang.String str22 = cVar.f48010a;
                kotlin.jvm.internal.o.f(str22, "value(...)");
                g65.a.hg((g65.a) c172, 34, 10, str22, 0, 0, 0, 0L, 0L, 0L, 0L, 0, null, null, null, null, 32760, null);
                return f0Var;
            }
        }
        hz0.m mVar5 = hz0.m.f286283a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundWorkManager", "dealBackgroundWork: init failed");
        ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
        return f0Var;
    }
}
