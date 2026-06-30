package ls3;

/* loaded from: classes8.dex */
public class e implements ct.g3 {
    public static void b() {
        c01.w9.k("qqmail");
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k("qqmail");
        ks3.k0 wi6 = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi();
        wi6.getClass();
        com.tencent.mm.vfs.w6.f("wcf://mailapp/");
        wi6.f();
    }

    @Override // ct.g3
    public void th(int i17) {
        if ((i17 & 1) != 0) {
            b();
        }
    }
}
