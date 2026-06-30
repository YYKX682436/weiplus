package wt3;

/* loaded from: classes5.dex */
public class g0 extends wt3.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f449417o;

    /* renamed from: p, reason: collision with root package name */
    public final long f449418p;

    /* renamed from: q, reason: collision with root package name */
    public final long f449419q;

    /* renamed from: r, reason: collision with root package name */
    public final int f449420r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(im5.b lifeCycleKeeper, java.lang.String videoPath, long j17, long j18, int i17) {
        super(lifeCycleKeeper, videoPath);
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        this.f449417o = videoPath;
        this.f449418p = j17;
        this.f449419q = j18;
        this.f449420r = 1000;
        this.f449396e = i17;
    }

    @Override // wt3.e
    public wt3.n0 f(wt3.q classifier) {
        kotlin.jvm.internal.o.g(classifier, "classifier");
        return new wt3.e1(this.f449417o, this.f449418p, this.f449419q, this.f449396e, this.f449420r, new wt3.f0(this), classifier);
    }

    @Override // wt3.e
    public boolean i() {
        return true;
    }

    public void l(long j17) {
        this.f449395d = j17;
    }
}
