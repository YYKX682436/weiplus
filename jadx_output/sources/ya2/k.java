package ya2;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f460499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.ref.WeakReference weakReference) {
        super(2);
        this.f460499d = weakReference;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zy2.i5 i5Var;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g((cp0.n) obj, "<anonymous parameter 0>");
        java.lang.ref.WeakReference weakReference = this.f460499d;
        if (weakReference != null && (i5Var = (zy2.i5) weakReference.get()) != null) {
            i5Var.a(java.lang.Integer.valueOf(bitmap != null ? 0 : -1));
        }
        return jz5.f0.f302826a;
    }
}
