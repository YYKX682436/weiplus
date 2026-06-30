package e33;

/* loaded from: classes10.dex */
public class g implements kn5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f247232a;

    public g(e33.b0 b0Var) {
        this.f247232a = b0Var;
    }

    @Override // kn5.g
    public void a(android.view.MotionEvent motionEvent, android.view.View view) {
        e33.b0.x(this.f247232a, view);
    }

    @Override // kn5.g
    public boolean b(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18, android.view.View view) {
        if (java.lang.Math.abs(f17) <= 0.0f) {
            return false;
        }
        e33.b0.x(this.f247232a, view);
        return false;
    }
}
