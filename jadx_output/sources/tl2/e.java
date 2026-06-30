package tl2;

/* loaded from: classes3.dex */
public final class e extends androidx.transition.TransitionSet {
    public e(u4.d1 d1Var) {
        b0(0);
        X(new androidx.transition.ChangeBounds());
        X(new androidx.transition.Fade(1));
        X(new tl2.c());
        X(new tl2.w());
        X(new tl2.a0());
        X(new tl2.x());
        if (d1Var != null) {
            T(d1Var);
        }
    }
}
