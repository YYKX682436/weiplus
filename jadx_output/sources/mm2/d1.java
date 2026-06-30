package mm2;

/* loaded from: classes3.dex */
public final class d1 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public r45.m70 f328951f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f328952g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    public final boolean N6() {
        r45.b84 b84Var = (r45.b84) ((mm2.e1) business(mm2.e1.class)).f328988r.getCustom(47);
        if (b84Var != null) {
            return b84Var.getBoolean(0);
        }
        return false;
    }

    public final boolean O6() {
        r45.b84 b84Var = (r45.b84) ((mm2.e1) business(mm2.e1.class)).f328988r.getCustom(47);
        return b84Var != null && b84Var.getInteger(5) == 1;
    }
}
