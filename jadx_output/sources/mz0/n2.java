package mz0;

/* loaded from: classes5.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.x2 f333010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(mz0.x2 x2Var) {
        super(0);
        this.f333010d = x2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.x2 x2Var = this.f333010d;
        r45.ib6 ib6Var = (r45.ib6) x2Var.M.getValue();
        if (ib6Var == null) {
            return null;
        }
        mz0.x2.J7(x2Var, ib6Var.f376911f, "", java.lang.Boolean.valueOf(ib6Var.f376916n));
        java.lang.String templateId = ib6Var.f376910e;
        kotlin.jvm.internal.o.f(templateId, "templateId");
        java.lang.String musicId = ib6Var.f376911f;
        kotlin.jvm.internal.o.f(musicId, "musicId");
        return new mz0.a(templateId, musicId, java.lang.Boolean.valueOf(ib6Var.f376916n));
    }
}
