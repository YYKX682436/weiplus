package wj;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final wj.a1 f446374d = new wj.a1();

    public a1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.c0 c0Var = e42.c0.clicfg_miniprogram_open_admb_in_motivating_v3;
        boolean mj6 = ((h62.d) e0Var).mj(c0Var, pInt, pInt2);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(c0Var, -1);
        com.tencent.mars.xlog.Log.i("MagicAdvertiseFeatureService", "motivateAdOpen value: " + Ni + ", groupId: " + pInt2.value + ", hit: " + mj6 + ' ');
        return new xj.k(Ni == 1, mj6 ? pInt2.value : 0);
    }
}
