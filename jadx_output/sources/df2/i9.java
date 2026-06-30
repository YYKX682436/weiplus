package df2;

/* loaded from: classes.dex */
public final class i9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final df2.i9 f230385d = new df2.i9();

    public i9() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.jw1 it = (r45.jw1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(it.getString(2));
        sb6.append(" port:");
        r45.b8 b8Var = (r45.b8) it.getCustom(1);
        sb6.append(b8Var != null ? b8Var.getString(0) : null);
        sb6.append(", duration");
        r45.b8 b8Var2 = (r45.b8) it.getCustom(1);
        sb6.append(b8Var2 != null ? java.lang.Integer.valueOf(b8Var2.getInteger(1)) : null);
        sb6.append(", land:");
        r45.b8 b8Var3 = (r45.b8) it.getCustom(0);
        sb6.append(b8Var3 != null ? b8Var3.getString(0) : null);
        sb6.append(", duration:");
        r45.b8 b8Var4 = (r45.b8) it.getCustom(0);
        sb6.append(b8Var4 != null ? java.lang.Integer.valueOf(b8Var4.getInteger(1)) : null);
        return sb6.toString();
    }
}
