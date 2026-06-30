package su0;

/* loaded from: classes5.dex */
public final class j implements yu0.f {

    /* renamed from: a, reason: collision with root package name */
    public final pp0.s0 f412657a;

    /* renamed from: b, reason: collision with root package name */
    public final su0.a f412658b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f412659c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f412660d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f412661e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f412662f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f412663g;

    public j(pp0.s0 internalService, su0.a listener) {
        kotlin.jvm.internal.o.g(internalService, "internalService");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f412657a = internalService;
        this.f412658b = listener;
        this.f412659c = new java.util.concurrent.locks.ReentrantLock();
        this.f412660d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f412661e = new java.util.concurrent.ConcurrentHashMap();
        this.f412662f = new java.util.HashMap();
        this.f412663g = new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // yu0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(yu0.c r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su0.j.a(yu0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yu0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r12, yu0.e r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r12 = r14 instanceof su0.c
            if (r12 == 0) goto L13
            r12 = r14
            su0.c r12 = (su0.c) r12
            int r0 = r12.f412636m
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r12.f412636m = r0
            goto L18
        L13:
            su0.c r12 = new su0.c
            r12.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r12.f412634h
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f412636m
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 != r2) goto L38
            java.lang.Object r13 = r12.f412633g
            com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo r13 = (com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo) r13
            java.lang.Object r13 = r12.f412632f
            yu0.q r13 = (yu0.q) r13
            java.lang.Object r13 = r12.f412631e
            yu0.e r13 = (yu0.e) r13
            java.lang.Object r12 = r12.f412630d
            su0.j r12 = (su0.j) r12
            kotlin.ResultKt.throwOnFailure(r14)
            goto Lb5
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L40:
            kotlin.ResultKt.throwOnFailure(r14)
            yu0.s r14 = r13.f465787b
            r1 = r14
            yu0.q r1 = (yu0.q) r1
            java.lang.String r1 = r1.f465831b
            yu0.q r14 = (yu0.q) r14
            com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo r4 = r14.f465833d
            if (r4 != 0) goto L5a
            java.lang.String r12 = "MJTTSTaskExecutor"
            java.lang.String r13 = "queryGroupResult: response == null"
            com.tencent.mars.xlog.Log.e(r12, r13)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        L5a:
            java.lang.String r1 = r14.f465830a
            java.lang.String r3 = r14.f465831b
            java.nio.ByteBuffer r10 = r11.e(r1, r3)
            if (r10 == 0) goto L78
            r10.rewind()
            java.lang.Object r6 = r14.f465834e
            java.lang.String r7 = r14.f465830a
            java.lang.String r8 = r14.f465831b
            java.lang.String r9 = r14.f465832c
            su0.a r12 = r11.f412658b
            r5 = r12
            vu0.r r5 = (vu0.r) r5
            r5.a(r6, r7, r8, r9, r10)
            goto Lbb
        L78:
            r12.f412630d = r11
            r12.f412631e = r13
            r12.f412632f = r14
            r12.f412633g = r4
            r12.f412636m = r2
            oz5.n r2 = new oz5.n
            kotlin.coroutines.Continuation r12 = pz5.f.b(r12)
            r2.<init>(r12)
            yu0.s r12 = r13.f465787b
            yu0.q r12 = (yu0.q) r12
            java.lang.Object r5 = r12.f465834e
            int r12 = r1.length()
            float r12 = (float) r12
            r13 = 1092616192(0x41200000, float:10.0)
            float r12 = r12 / r13
            r13 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r1 <= 0) goto La0
            r12 = r13
        La0:
            r13 = 1000(0x3e8, float:1.401E-42)
            float r13 = (float) r13
            float r13 = r13 * r12
            long r6 = (long) r13
            su0.d r8 = new su0.d
            r8.<init>(r11, r14, r2)
            r3 = r11
            r3.d(r4, r5, r6, r8)
            java.lang.Object r14 = r2.a()
            if (r14 != r0) goto Lb5
            return r0
        Lb5:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r2 = r14.booleanValue()
        Lbb:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: su0.j.b(java.lang.String, yu0.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f412659c;
        reentrantLock.lock();
        try {
            java.lang.Integer num = (java.lang.Integer) this.f412662f.remove(obj);
            if (num != null) {
                pp0.s0 s0Var = this.f412657a;
                int intValue = num.intValue();
                dz0.s2 s2Var = (dz0.s2) s0Var;
                synchronized (s2Var) {
                    if (!s2Var.f245006b) {
                        s2Var.f245005a.b(intValue);
                    }
                }
            }
            java.lang.Runnable runnable = (java.lang.Runnable) this.f412663g.remove(obj);
            if (runnable != null) {
                this.f412660d.removeCallbacksAndMessages(runnable);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // yu0.f
    public void cancel() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f412659c;
        reentrantLock.lock();
        java.util.HashMap hashMap = this.f412662f;
        try {
            java.util.Set keySet = hashMap.keySet();
            kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
            java.util.Iterator it = kz5.n0.S0(keySet).iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            hashMap.clear();
            this.f412660d.removeCallbacksAndMessages(null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo, java.lang.Object obj, long j17, yz5.l lVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f412659c;
        reentrantLock.lock();
        try {
            su0.f fVar = new su0.f(this, mJAsyncSpeechSubmitResponseInfo, obj, lVar);
            this.f412663g.put(obj, fVar);
            this.f412660d.postDelayed(fVar, j17);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final java.nio.ByteBuffer e(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str + str2;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f412661e;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) concurrentHashMap.get(str3);
        if (byteBuffer == null) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(uu0.l.a("silk", str3));
            if (!r6Var.m() || r6Var.C() == 0) {
                byteBuffer = null;
            } else {
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((int) r6Var.C());
                java.io.InputStream C = com.tencent.mm.vfs.w6.C(r6Var);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = C.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        allocate.put(bArr, 0, read);
                    }
                    vz5.b.a(C, null);
                    byteBuffer = allocate;
                } finally {
                }
            }
        }
        if (byteBuffer != null) {
            concurrentHashMap.put(str3, byteBuffer);
        }
        return byteBuffer;
    }
}
