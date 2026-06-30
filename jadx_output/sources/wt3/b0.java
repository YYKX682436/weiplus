package wt3;

/* loaded from: classes5.dex */
public class b0 extends wt3.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f449382o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(im5.b lifeCycleKeeper, java.util.ArrayList images, int i17) {
        super(lifeCycleKeeper, null);
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        kotlin.jvm.internal.o.g(images, "images");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f449382o = arrayList;
        arrayList.addAll(images);
        this.f449396e = i17;
    }

    @Override // wt3.e
    public wt3.n0 f(wt3.q classifier) {
        kotlin.jvm.internal.o.g(classifier, "classifier");
        return new wt3.k0(this.f449382o, this.f449396e, classifier);
    }

    @Override // wt3.e
    public boolean i() {
        return this instanceof qv3.b;
    }
}
