package t53;

/* loaded from: classes8.dex */
public final class l0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t53.m0 f415791d;

    public l0(t53.m0 m0Var) {
        this.f415791d = m0Var;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (w0Var.f316976d instanceof z53.i) {
            ((ku5.t0) ku5.t0.f312615d).h(new t53.k0(this.f415791d), "reportGameChatUnreadState");
        }
    }
}
