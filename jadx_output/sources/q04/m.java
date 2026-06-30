package q04;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q04.r f359385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q04.r rVar) {
        super(0);
        this.f359385d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.c1 a17;
        long c17 = c01.id.c();
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(r04.a.class);
        }
        r04.d dVar = (r04.d) ((r04.a) a17).P6(r04.d.class);
        p75.n0 n0Var = dm.ba.f235908o;
        n0Var.getClass();
        p75.d dVar2 = dm.ba.f235909p;
        java.lang.String value = java.lang.String.valueOf(c01.id.c());
        dVar2.getClass();
        kotlin.jvm.internal.o.g(value, "value");
        java.lang.String column = dVar2.z();
        kotlin.jvm.internal.o.g(column, "column");
        p75.p pVar = p75.p.f352683h;
        java.lang.String tag = dVar.f368356h;
        kotlin.jvm.internal.o.g(tag, "tag");
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.f352676a;
        java.lang.String str = column + ' ' + pVar + " ?";
        java.lang.String[] strArr = {value};
        kotlin.jvm.internal.o.g(table, "table");
        l75.k0 Q4 = dVar.f193147g.Q4();
        com.tencent.mars.xlog.Log.i(tag, "cleanExpireData result:" + ((Q4 != null ? Q4.delete(table, str, strArr) : -1) > 0));
        com.tencent.mars.xlog.Log.i(this.f359385d.f359398d, "cleanExpireData cost:" + (c01.id.c() - c17));
        return jz5.f0.f302826a;
    }
}
