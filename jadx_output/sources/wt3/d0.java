package wt3;

/* loaded from: classes5.dex */
public final class d0 implements wt3.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt3.e0 f449390a;

    public d0(wt3.e0 e0Var) {
        this.f449390a = e0Var;
    }

    @Override // wt3.i0
    public void a(java.util.LinkedList bgmList, boolean z17, boolean z18, long j17) {
        kotlin.jvm.internal.o.g(bgmList, "bgmList");
        wt3.e0 e0Var = this.f449390a;
        e0Var.f449405n = false;
        wt3.i0 i0Var = e0Var.f449407t;
        if (i0Var != null) {
            i0Var.a(bgmList, z17, z18, j17);
        }
    }

    @Override // wt3.i0
    public android.app.Activity getActivity() {
        wt3.i0 i0Var = this.f449390a.f449407t;
        if (i0Var != null) {
            return i0Var.getActivity();
        }
        return null;
    }
}
