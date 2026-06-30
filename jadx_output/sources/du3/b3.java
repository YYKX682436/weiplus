package du3;

/* loaded from: classes10.dex */
public final class b3 implements dl.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243544a;

    public b3(du3.t3 t3Var) {
        this.f243544a = t3Var;
    }

    @Override // dl.f
    public final boolean a(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.d(motionEvent);
        du3.t3.z(this.f243544a, motionEvent);
        return false;
    }
}
