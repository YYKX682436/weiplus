package z;

/* loaded from: classes14.dex */
public final class r implements n0.e5 {

    /* renamed from: d, reason: collision with root package name */
    public final z.w2 f468810d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f468811e;

    /* renamed from: f, reason: collision with root package name */
    public z.w f468812f;

    /* renamed from: g, reason: collision with root package name */
    public long f468813g;

    /* renamed from: h, reason: collision with root package name */
    public long f468814h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f468815i;

    public r(z.w2 typeConverter, java.lang.Object obj, z.w wVar, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(typeConverter, "typeConverter");
        this.f468810d = typeConverter;
        this.f468811e = n0.s4.c(obj, null, 2, null);
        this.f468812f = wVar != null ? z.x.a(wVar) : z.s.c(typeConverter, obj);
        this.f468813g = j17;
        this.f468814h = j18;
        this.f468815i = z17;
    }

    @Override // n0.e5
    public java.lang.Object getValue() {
        return this.f468811e.getValue();
    }

    public java.lang.String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + ((z.x2) this.f468810d).f468874b.invoke(this.f468812f) + ", isRunning=" + this.f468815i + ", lastFrameTimeNanos=" + this.f468813g + ", finishedTimeNanos=" + this.f468814h + ')';
    }

    public /* synthetic */ r(z.w2 w2Var, java.lang.Object obj, z.w wVar, long j17, long j18, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(w2Var, obj, (i17 & 4) != 0 ? null : wVar, (i17 & 8) != 0 ? Long.MIN_VALUE : j17, (i17 & 16) != 0 ? Long.MIN_VALUE : j18, (i17 & 32) != 0 ? false : z17);
    }
}
