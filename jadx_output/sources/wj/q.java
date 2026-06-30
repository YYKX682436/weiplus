package wj;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f446476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj.m f446477e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.Set set, xj.m mVar) {
        super(0);
        this.f446476d = set;
        this.f446477e = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = this.f446476d.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).invoke(this.f446477e);
        }
        return jz5.f0.f302826a;
    }
}
