package u4;

/* loaded from: classes13.dex */
public class b0 extends u4.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f424445a;

    public b0(u4.c0 c0Var, android.graphics.Rect rect) {
        this.f424445a = rect;
    }

    @Override // u4.a1
    public android.graphics.Rect a(androidx.transition.Transition transition) {
        android.graphics.Rect rect = this.f424445a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
