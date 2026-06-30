package yx3;

/* loaded from: classes10.dex */
public final class n implements bo4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yx3.v f467916a;

    public n(yx3.v vVar) {
        this.f467916a = vVar;
    }

    @Override // bo4.a
    public final int getCurrentPosition() {
        yx3.k kVar = this.f467916a.f467943c;
        if (kVar != null) {
            return (int) kVar.b();
        }
        return 0;
    }
}
