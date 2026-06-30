package wt3;

/* loaded from: classes5.dex */
public abstract class c0 extends wt3.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(im5.b lifeCycleKeeper, int i17) {
        super(lifeCycleKeeper, null);
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        this.f449396e = i17;
    }

    @Override // wt3.e
    public void b() {
    }

    @Override // wt3.e
    public wt3.n0 f(wt3.q classifier) {
        kotlin.jvm.internal.o.g(classifier, "classifier");
        return new wt3.w0(classifier);
    }

    @Override // wt3.e
    public boolean i() {
        return false;
    }
}
