package dq0;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f242300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f242300d = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Double d17 = (java.lang.Double) obj;
        java.lang.ref.WeakReference weakReference = this.f242300d;
        if (d17 != null) {
            yz5.l lVar = (yz5.l) weakReference.get();
            if (lVar != null) {
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(d17)));
            }
        } else {
            yz5.l lVar2 = (yz5.l) weakReference.get();
            if (lVar2 != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Double.valueOf(0.0d))));
            }
        }
        return jz5.f0.f302826a;
    }
}
