package du3;

/* loaded from: classes10.dex */
public final class c3 implements dl.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243552a;

    public c3(du3.t3 t3Var) {
        this.f243552a = t3Var;
    }

    @Override // dl.f
    public final boolean a(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.d(motionEvent);
        du3.t3.z(this.f243552a, motionEvent);
        return false;
    }
}
