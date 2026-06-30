package mc3;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mc3.f f325624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(mc3.f fVar) {
        super(0);
        this.f325624d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mc3.f fVar = this.f325624d;
        fVar.f325631m = true;
        boolean z17 = fVar.f325628g;
        java.lang.ref.WeakReference weakReference = fVar.f325629h;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        fVar.destroy();
        if (z17) {
            fVar.V(activity);
            java.util.Iterator it = ((java.util.HashSet) fVar.f325630i).iterator();
            while (it.hasNext()) {
                ((jc3.l0) it.next()).d0(false);
            }
        }
        fVar.f325631m = false;
        return jz5.f0.f302826a;
    }
}
