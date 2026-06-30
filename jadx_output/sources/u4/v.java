package u4;

/* loaded from: classes13.dex */
public class v extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f424567d;

    public v(androidx.transition.Fade fade, android.view.View view) {
        this.f424567d = view;
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        u4.w1.c(this.f424567d, 1.0f);
        transition.E(this);
    }
}
