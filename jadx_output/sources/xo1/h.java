package xo1;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f455753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f455753d = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        nf.e.f(new xo1.g(this.f455753d, it));
        return jz5.f0.f302826a;
    }
}
