package u4;

/* loaded from: classes13.dex */
public class j1 extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.transition.TransitionSet f424505d;

    public j1(androidx.transition.TransitionSet transitionSet) {
        this.f424505d = transitionSet;
    }

    @Override // u4.d1, u4.b1
    public void b(androidx.transition.Transition transition) {
        androidx.transition.TransitionSet transitionSet = this.f424505d;
        if (transitionSet.P) {
            return;
        }
        transitionSet.R();
        transitionSet.P = true;
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        androidx.transition.TransitionSet transitionSet = this.f424505d;
        int i17 = transitionSet.N - 1;
        transitionSet.N = i17;
        if (i17 == 0) {
            transitionSet.P = false;
            transitionSet.p();
        }
        transition.E(this);
    }
}
