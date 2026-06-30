package l41;

/* loaded from: classes4.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f315879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(yz5.l lVar, k41.g0 g0Var, android.content.Context context) {
        super(1);
        this.f315878d = lVar;
        this.f315879e = g0Var;
        this.f315880f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f315878d.invoke(java.lang.Boolean.valueOf(booleanValue));
        if (booleanValue) {
            k41.g0 g0Var = this.f315879e;
            java.lang.String str = g0Var.field_username;
            if (str == null) {
                str = "";
            }
            java.lang.String string = this.f315880f.getString(com.tencent.mm.R.string.g0p, g0Var.field_nickname);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.e1(c01.id.a());
            f9Var.u1(str);
            f9Var.d1(string);
            f9Var.setType(10000);
            cj6.M9(f9Var);
            g0Var.field_needReport = false;
            k41.o0.f(g0Var);
        }
        return jz5.f0.f302826a;
    }
}
