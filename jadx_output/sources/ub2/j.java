package ub2;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f426064d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f426065e;

    /* renamed from: f, reason: collision with root package name */
    public int f426066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f426068h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f426069i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ub2.k f426070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f426071n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str, long j17, long j18, ub2.k kVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426067g = str;
        this.f426068h = j17;
        this.f426069i = j18;
        this.f426070m = kVar;
        this.f426071n = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ub2.j(this.f426067g, this.f426068h, this.f426069i, this.f426070m, this.f426071n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ub2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long uptimeMillis;
        gp.d dVar;
        java.lang.String str;
        long j17;
        java.lang.ThreadLocal threadLocal;
        android.graphics.Bitmap frameAtTime;
        zj0.a aVar;
        boolean z17;
        java.lang.Object g17;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f426066f;
        long j18 = this.f426069i;
        long j19 = this.f426068h;
        java.lang.String str2 = this.f426067g;
        try {
            try {
                if (i17 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    uptimeMillis = android.os.SystemClock.uptimeMillis();
                    dVar = new gp.d();
                    try {
                        dVar.setDataSource(str2);
                        long j27 = 1000;
                        zj0.a aVar3 = new zj0.a();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        aVar3.c(java.lang.Long.valueOf(j19 * j27));
                        yj0.a.d(dVar, aVar3.b(), "com/tencent/mm/plugin/finder/core/FinderPostWatermarkDetHelper$watermarkDetectInner$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        threadLocal = zj0.c.f473285a;
                        threadLocal.set(aVar3);
                        long longValue = ((java.lang.Long) aVar3.a(0)).longValue();
                        zj0.c.a();
                        frameAtTime = dVar.getFrameAtTime(longValue);
                        yj0.a.e(dVar, frameAtTime, "com/tencent/mm/plugin/finder/core/FinderPostWatermarkDetHelper$watermarkDetectInner$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        aVar = new zj0.a();
                        aVar.c(java.lang.Long.valueOf(j18 * j27));
                        str = str2;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        str = str2;
                    }
                    try {
                        yj0.a.d(dVar, aVar.b(), "com/tencent/mm/plugin/finder/core/FinderPostWatermarkDetHelper$watermarkDetectInner$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        threadLocal.set(aVar);
                        long longValue2 = ((java.lang.Long) aVar.a(0)).longValue();
                        zj0.c.a();
                        android.graphics.Bitmap frameAtTime2 = dVar.getFrameAtTime(longValue2);
                        yj0.a.e(dVar, frameAtTime2, "com/tencent/mm/plugin/finder/core/FinderPostWatermarkDetHelper$watermarkDetectInner$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (frameAtTime != null) {
                            arrayList.add(frameAtTime);
                        }
                        if (frameAtTime2 != null) {
                            arrayList.add(frameAtTime2);
                        }
                        if (!arrayList.isEmpty()) {
                            ub2.k kVar = this.f426070m;
                            this.f426065e = dVar;
                            this.f426064d = uptimeMillis;
                            this.f426066f = 1;
                            kVar.getClass();
                            g17 = ub2.n.f426084a.a() ? kotlinx.coroutines.l.g((ub2.b) ((jz5.n) kVar.f426072a).getValue(), new ub2.l(arrayList, null), this) : java.lang.Boolean.FALSE;
                            if (g17 == aVar2) {
                                return aVar2;
                            }
                            j17 = uptimeMillis;
                        } else {
                            z17 = false;
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        j17 = uptimeMillis;
                        com.tencent.mars.xlog.Log.printErrStackTrace("FinderPostWatermarkDetHelper", th, "WatermarkDetect", new java.lang.Object[0]);
                        dVar.release();
                        z17 = false;
                        uptimeMillis = j17;
                        com.tencent.mars.xlog.Log.i("FinderPostWatermarkDetHelper", "[watermarkDet] video index:" + this.f426071n + ", has watermark: " + z17 + ", detectTime:" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ", startTimeMs:" + j19 + " endTimeMs:" + j18 + ", path:" + str);
                        return java.lang.Boolean.valueOf(z17);
                    }
                } else {
                    if (i17 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j17 = this.f426064d;
                    dVar = (gp.d) this.f426065e;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        g17 = obj;
                        str = str2;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        str = str2;
                        try {
                            com.tencent.mars.xlog.Log.printErrStackTrace("FinderPostWatermarkDetHelper", th, "WatermarkDetect", new java.lang.Object[0]);
                            try {
                                dVar.release();
                            } catch (java.lang.RuntimeException unused) {
                            }
                            z17 = false;
                            uptimeMillis = j17;
                            com.tencent.mars.xlog.Log.i("FinderPostWatermarkDetHelper", "[watermarkDet] video index:" + this.f426071n + ", has watermark: " + z17 + ", detectTime:" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ", startTimeMs:" + j19 + " endTimeMs:" + j18 + ", path:" + str);
                            return java.lang.Boolean.valueOf(z17);
                        } finally {
                            try {
                                dVar.release();
                            } catch (java.lang.RuntimeException unused2) {
                            }
                        }
                    }
                }
            } catch (java.lang.RuntimeException unused3) {
                com.tencent.mars.xlog.Log.i("FinderPostWatermarkDetHelper", "[watermarkDet] video index:" + this.f426071n + ", has watermark: " + z17 + ", detectTime:" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ", startTimeMs:" + j19 + " endTimeMs:" + j18 + ", path:" + str);
                return java.lang.Boolean.valueOf(z17);
            }
            z17 = ((java.lang.Boolean) g17).booleanValue();
            uptimeMillis = j17;
        } catch (java.lang.Throwable th9) {
            th = th9;
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderPostWatermarkDetHelper", th, "WatermarkDetect", new java.lang.Object[0]);
            dVar.release();
            z17 = false;
            uptimeMillis = j17;
            com.tencent.mars.xlog.Log.i("FinderPostWatermarkDetHelper", "[watermarkDet] video index:" + this.f426071n + ", has watermark: " + z17 + ", detectTime:" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ", startTimeMs:" + j19 + " endTimeMs:" + j18 + ", path:" + str);
            return java.lang.Boolean.valueOf(z17);
        }
    }
}
