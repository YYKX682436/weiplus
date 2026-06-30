package mm2;

/* loaded from: classes3.dex */
public final class f1 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public r45.z02 f329020f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f329021g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    public final void N6(r45.z02 z02Var) {
        this.f329020f = z02Var;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f329020f = null;
        this.f329021g = false;
    }
}
