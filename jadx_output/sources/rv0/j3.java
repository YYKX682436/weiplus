package rv0;

/* loaded from: classes5.dex */
public final class j3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f400060d;

    /* renamed from: e, reason: collision with root package name */
    public int f400061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400062f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.MusicSegment f400063g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rv0.f f400064h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(rv0.n1 n1Var, com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, rv0.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400062f = n1Var;
        this.f400063g = musicSegment;
        this.f400064h = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.j3(this.f400062f, this.f400063g, this.f400064h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.j3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        rv0.f fVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400061e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.kh q76 = this.f400062f.q7();
            com.tencent.maas.base.MJID mjid = this.f400063g.f48532a;
            kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
            ex0.o m76 = q76.m7(mjid);
            if (m76 != null) {
                rv0.f fVar2 = this.f400064h;
                this.f400060d = fVar2;
                this.f400061e = 1;
                obj = m76.G(this);
                if (obj == aVar) {
                    return aVar;
                }
                fVar = fVar2;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fVar = (rv0.f) this.f400060d;
        kotlin.ResultKt.throwOnFailure(obj);
        float[] fArr = (float[]) obj;
        if (fArr != null) {
            fVar.getClass();
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJWaveformView mJWaveformView = fVar.L;
            if (mJWaveformView == null) {
                kotlin.jvm.internal.o.o("wave");
                throw null;
            }
            com.tencent.maas.model.time.MJTimeRange mJTimeRange = fVar.M;
            if (mJTimeRange == null) {
                kotlin.jvm.internal.o.o("presentationTimeRange");
                throw null;
            }
            long milliseconds = (long) mJTimeRange.getDuration().toMilliseconds();
            long milliseconds2 = (long) fVar.N.toMilliseconds();
            if (milliseconds > 0) {
                mJWaveformView.f69414m = fArr;
                mJWaveformView.f69416o = 50;
                mJWaveformView.f69410f = milliseconds;
                mJWaveformView.f69411g = milliseconds;
                mJWaveformView.f69412h = ((fArr.length * 1.0f) / 50) * 1000;
                mJWaveformView.f69413i = milliseconds2;
                if (mJWaveformView.f69418q > 0) {
                    mJWaveformView.a(mJWaveformView.b());
                }
                mJWaveformView.postInvalidate();
            }
        }
        return jz5.f0.f302826a;
    }
}
