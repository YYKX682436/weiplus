package wt3;

/* loaded from: classes5.dex */
public class q {

    /* renamed from: g, reason: collision with root package name */
    public static final wt3.k f449470g = new wt3.k(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f449471h = kz5.c0.i("MODEL_VIDEO_IMG_FEAT", "MODEL_VIDEO_CLASSIFICATION", "MODEL_AUDIO_CNN", "MODEL_AUDIO_TASK_IMAGE_FEAT", "MODEL_AUDIO_TASK_FUSION", "MODEL_AUDIO_TASK_AUDIO_FEAT", "MODEL_AUDIO_PREPARE");

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.maas.utils.MJVideoClassifier f449472a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f449473b;

    /* renamed from: c, reason: collision with root package name */
    public kotlinx.coroutines.y0 f449474c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f449475d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f449476e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.f1 f449477f;

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", "destroy");
        kotlinx.coroutines.r2 r2Var = this.f449476e;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17 || this.f449472a == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", "isReleased to return");
            return;
        }
        kotlinx.coroutines.y0 y0Var = this.f449474c;
        this.f449476e = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new wt3.m(this, null), 3, null) : null;
        android.os.HandlerThread handlerThread = this.f449473b;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    public final kotlinx.coroutines.r2 b(android.graphics.Bitmap bmpCom, int i17, int i18, long j17) {
        kotlin.jvm.internal.o.g(bmpCom, "bmpCom");
        kotlinx.coroutines.y0 y0Var = this.f449474c;
        if (y0Var != null) {
            return kotlinx.coroutines.l.d(y0Var, null, null, new wt3.n(this, bmpCom, i17, i18, j17, null), 3, null);
        }
        return null;
    }

    public java.util.List c() {
        return f449470g.b(kz5.b0.c("MODEL_VIDEO_BGM_FEATURE"));
    }

    public java.lang.String d() {
        return "MODEL_VIDEO_BGM_FEATURE";
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("Thread_AudioMaasClassifier");
        handlerThread.start();
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(t26.e.b(new android.os.Handler(handlerThread.getLooper()), null, 1, null));
        this.f449474c = a17;
        this.f449473b = handlerThread;
        this.f449475d = kotlinx.coroutines.l.d(a17, null, null, new wt3.o(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof wt3.p
            if (r0 == 0) goto L13
            r0 = r6
            wt3.p r0 = (wt3.p) r0
            int r1 = r0.f449466f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f449466f = r1
            goto L18
        L13:
            wt3.p r0 = new wt3.p
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f449464d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f449466f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.r2 r6 = r5.f449475d
            java.lang.String r2 = "MicroMsg.AudioMaasClassifier"
            if (r6 != 0) goto L40
            java.lang.String r6 = "waitReady >> initJob is null"
            com.tencent.mars.xlog.Log.e(r2, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L40:
            r4 = 0
            if (r6 == 0) goto L4a
            boolean r6 = r6.a()
            if (r6 != r3) goto L4a
            r4 = r3
        L4a:
            if (r4 == 0) goto L5e
            java.lang.String r6 = "waitReady to join the init job"
            com.tencent.mars.xlog.Log.w(r2, r6)
            kotlinx.coroutines.r2 r6 = r5.f449475d
            if (r6 == 0) goto L5e
            r0.f449466f = r3
            java.lang.Object r6 = r6.C(r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wt3.q.f(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
