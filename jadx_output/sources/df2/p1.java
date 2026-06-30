package df2;

/* loaded from: classes3.dex */
public final class p1 extends if2.b implements if2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public static final void Z6(df2.p1 p1Var, r45.v94 v94Var) {
        p1Var.getClass();
        if (v94Var.getBoolean(0)) {
            mm2.c1 c1Var = (mm2.c1) p1Var.business(mm2.c1.class);
            int i17 = (int) ((mm2.c1) p1Var.business(mm2.c1.class)).f328866q;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            c1Var.p8(i17 | 1073741824);
            return;
        }
        mm2.c1 c1Var2 = (mm2.c1) p1Var.business(mm2.c1.class);
        int i18 = (int) ((mm2.c1) p1Var.business(mm2.c1.class)).f328866q;
        java.util.regex.Pattern pattern2 = pm0.v.f356802a;
        c1Var2.p8(i18 & (-1073741825));
    }
}
