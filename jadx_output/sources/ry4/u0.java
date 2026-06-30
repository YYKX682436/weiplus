package ry4;

/* loaded from: classes.dex */
public final class u0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401681a;

    public u0(ry4.d1 d1Var) {
        this.f401681a = d1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        ry4.d1 d1Var = this.f401681a;
        return kz5.c1.k(new jz5.l("weclawbot_username", d1Var.f401608d), new jz5.l("clawbot_shortcut_count", java.lang.Integer.valueOf(((java.util.ArrayList) d1Var.f401610f).size())), new jz5.l("is_clawbot_available", java.lang.Integer.valueOf(!d1Var.f401615n ? 1 : 0)));
    }
}
