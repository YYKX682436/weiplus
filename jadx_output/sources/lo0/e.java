package lo0;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo0.g f319983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lo0.g gVar) {
        super(1);
        this.f319983d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        lo0.g gVar = (lo0.g) it.get();
        boolean z17 = true;
        if (!(gVar == null) && !kotlin.jvm.internal.o.b(gVar, this.f319983d)) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
