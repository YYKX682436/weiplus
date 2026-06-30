package r43;

/* loaded from: classes.dex */
public class n0 implements uh4.f0 {
    @Override // uh4.f0
    public void onDataChanged() {
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_25d9ac85a4bc", true);
        if (!isTeenMode || n17 == null) {
            return;
        }
        c01.h2.j("gh_25d9ac85a4bc");
    }
}
