package sl0;

/* loaded from: classes11.dex */
public class a0 extends ll0.c {

    /* renamed from: e, reason: collision with root package name */
    public static final sl0.a0 f409049e = new sl0.a0();

    public boolean b(java.lang.String str) {
        return ((java.lang.Boolean) a("isChatAlbert" + str, new sl0.y(this, str))).booleanValue();
    }

    public boolean c(com.tencent.mm.storage.z3 z3Var) {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(z3Var.d1());
    }

    public boolean d(java.lang.String str) {
        return ((java.lang.Boolean) a("seeHisSns" + str, new sl0.z(this, str))).booleanValue();
    }

    public int e(java.lang.String str) {
        return ((java.lang.Integer) a("withSomeoneMessageAll" + str, new sl0.v(this, str))).intValue();
    }

    public int f(java.lang.String str) {
        return ((java.lang.Integer) a("withSomeoneMessageTo" + str, new sl0.w(this, str))).intValue();
    }
}
