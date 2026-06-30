package ik4;

/* loaded from: classes4.dex */
public final class g extends kk4.f0 {
    public float A;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.r2 f291923r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f291924s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashSet f291925t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f291926u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f291927v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.HashSet f291928w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashSet f291929x;

    /* renamed from: y, reason: collision with root package name */
    public long f291930y;

    /* renamed from: z, reason: collision with root package name */
    public long f291931z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f291924s = new java.util.HashSet();
        this.f291925t = new java.util.HashSet();
        this.f291926u = new java.util.HashSet();
        this.f291927v = new java.util.HashSet();
        this.f291928w = new java.util.HashSet();
        this.f291929x = new java.util.HashSet();
        this.f291930y = -1L;
        this.f291931z = -1L;
        this.A = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ik4.f
            if (r0 == 0) goto L13
            r0 = r7
            ik4.f r0 = (ik4.f) r0
            int r1 = r0.f291922h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291922h = r1
            goto L18
        L13:
            ik4.f r0 = new ik4.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f291920f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f291922h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f291919e
            java.lang.Object r0 = r0.f291918d
            ik4.g r0 = (ik4.g) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            long r4 = java.lang.System.currentTimeMillis()
            kotlinx.coroutines.r2 r7 = r6.f291923r
            if (r7 == 0) goto L51
            r0.f291918d = r6
            r0.f291919e = r4
            r0.f291922h = r3
            java.lang.Object r7 = r7.C(r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r0 = r6
            r1 = r4
        L4f:
            r4 = r1
            goto L52
        L51:
            r0 = r6
        L52:
            r7 = 0
            r0.f291923r = r7
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "waitResetFinish cost:"
            r7.<init>(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "MicroMsg.FlexiblePlayer"
            com.tencent.mars.xlog.Log.i(r0, r7)
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ik4.g.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kk4.f0, com.tencent.thumbplayer.api.ITPPlayer
    public void release() {
        super.release();
        this.f291924s.clear();
        this.f291925t.clear();
        this.f291926u.clear();
        this.f291927v.clear();
    }

    @Override // kk4.f0, com.tencent.thumbplayer.api.ITPPlayer
    public void setPlaySpeedRatio(float f17) {
        this.A = f17;
        super.setPlaySpeedRatio(f17);
    }

    @Override // kk4.f0, com.tencent.thumbplayer.api.ITPPlayer
    public void stop() {
        super.stop();
        this.f291924s.clear();
        this.f291925t.clear();
        this.f291926u.clear();
        this.f291927v.clear();
        this.A = 1.0f;
    }
}
