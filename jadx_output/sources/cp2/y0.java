package cp2;

/* loaded from: classes2.dex */
public final class y0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f220954a;

    public y0(cp2.q1 q1Var) {
        this.f220954a = q1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        cp2.q1 q1Var = this.f220954a;
        return kz5.c1.k(new jz5.l("behaviour_session_id", q1Var.a().getString(0)), new jz5.l("finder_context_id", q1Var.a().getString(1)), new jz5.l("finder_tab_context_id", q1Var.a().getString(2)));
    }
}
