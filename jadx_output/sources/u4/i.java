package u4;

/* loaded from: classes13.dex */
public class i extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f424489d;

    public i(androidx.transition.ChangeBounds changeBounds, android.view.ViewGroup viewGroup) {
        this.f424489d = viewGroup;
    }

    @Override // u4.d1, u4.b1
    public void a(androidx.transition.Transition transition) {
        u4.s1.a(this.f424489d, true);
    }

    @Override // u4.d1, u4.b1
    public void c(androidx.transition.Transition transition) {
        u4.s1.a(this.f424489d, false);
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        u4.s1.a(this.f424489d, false);
        transition.E(this);
    }
}
