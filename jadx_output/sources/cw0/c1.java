package cw0;

/* loaded from: classes5.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f222619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.d1 f222620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f222621f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.maas.model.time.MJTime mJTime, cw0.d1 d1Var, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222619d = mJTime;
        this.f222620e = d1Var;
        this.f222621f = clipSegment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cw0.c1(this.f222619d, this.f222620e, this.f222621f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw0.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        java.nio.FloatBuffer floatBuffer;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cw0.d1 d1Var = this.f222620e;
        com.tencent.maas.model.time.MJTime mJTime = d1Var.f222623a;
        com.tencent.maas.model.time.MJTime mJTime2 = this.f222619d;
        com.tencent.maas.model.time.MJTimeRange mJTimeRange = mJTime2.bigThan(mJTime) ? new com.tencent.maas.model.time.MJTimeRange(com.tencent.maas.model.time.MJTime.ZeroTime, d1Var.f222623a) : new com.tencent.maas.model.time.MJTimeRange(com.tencent.maas.model.time.MJTime.ZeroTime, mJTime2);
        dx0.o.c(mJTimeRange);
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f222621f;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.maas.moviecomposing.AudioWaveformProvider audioWaveformProvider = new com.tencent.maas.moviecomposing.AudioWaveformProvider(clipSegment);
            audioWaveformProvider.c(50.0f, 0);
            com.tencent.maas.moviecomposing.a a17 = audioWaveformProvider.a(mJTimeRange, 0);
            if (a17 != null && (floatBuffer = a17.f48459a) != null) {
                new java.lang.Integer(floatBuffer.capacity());
            }
            audioWaveformProvider.b();
            m521constructorimpl = kotlin.Result.m521constructorimpl(a17);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        com.tencent.maas.moviecomposing.a aVar2 = (com.tencent.maas.moviecomposing.a) m521constructorimpl;
        if (aVar2 == null) {
            return new float[0];
        }
        java.nio.FloatBuffer a18 = d1Var.f222624b.a(aVar2.f48459a);
        if (a18 == null) {
            return new float[0];
        }
        int capacity = a18.capacity();
        float[] fArr = new float[capacity];
        a18.get(fArr);
        return kz5.v.r(fArr, 1, capacity);
    }
}
