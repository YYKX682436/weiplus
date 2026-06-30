package df2;

/* loaded from: classes3.dex */
public final class hu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ju f230353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f230354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yd5 f230355f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(df2.ju juVar, boolean z17, r45.yd5 yd5Var) {
        super(0);
        this.f230353d = juVar;
        this.f230354e = z17;
        this.f230355f = yd5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.ju juVar = this.f230353d;
        ((mm2.c1) juVar.business(mm2.c1.class)).W = this.f230354e;
        java.lang.String string = this.f230355f.getString(1);
        if (string == null) {
            string = "";
        }
        long integer = r0.getInteger(3) * 1000;
        kotlinx.coroutines.r2 r2Var = juVar.f230500n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        juVar.f230500n = com.tencent.mm.plugin.finder.live.util.y.o(juVar, null, null, new df2.gu(juVar, string, integer, null), 3, null);
        return jz5.f0.f302826a;
    }
}
