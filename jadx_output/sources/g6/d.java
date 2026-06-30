package g6;

/* loaded from: classes14.dex */
public final class d implements g6.e {

    /* renamed from: b, reason: collision with root package name */
    public static final g6.d f269031b = new g6.d();

    @Override // g6.e
    public java.lang.Object a(g6.f fVar, c6.l lVar, kotlin.coroutines.Continuation continuation) {
        if (lVar instanceof c6.q) {
            ((coil.target.ImageViewTarget) fVar).a(((c6.q) lVar).f38863a);
        } else if (lVar instanceof c6.f) {
            ((coil.target.ImageViewTarget) fVar).d(lVar.a());
        }
        return jz5.f0.f302826a;
    }

    public java.lang.String toString() {
        return "coil.transition.NoneTransition";
    }
}
