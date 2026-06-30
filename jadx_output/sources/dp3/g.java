package dp3;

/* loaded from: classes9.dex */
public abstract class g {
    public static gp3.q a(android.content.Context context, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject) {
        gp3.q qVar = new gp3.q(context);
        if (com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.N)) {
            qVar.N = context.getString(com.tencent.mm.R.string.f493581kt5);
        } else {
            qVar.N = context.getString(com.tencent.mm.R.string.f493578kt2);
        }
        qVar.M = new dp3.e(mallTransactionObject, context);
        return qVar;
    }

    public static void b(int i17, android.content.Context context, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject) {
        if (i17 != 0) {
            if (i17 == 1) {
                com.tencent.mm.wallet_core.ui.r1.g(context, mallTransactionObject.D);
                return;
            } else {
                if (i17 != 2) {
                    return;
                }
                com.tencent.mm.wallet_core.ui.r1.V(context, mallTransactionObject.N, false);
                return;
            }
        }
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(mallTransactionObject.C, true);
        if (n17 == null || !n17.r2()) {
            com.tencent.mm.wallet_core.ui.r1.a0(context, mallTransactionObject.C);
        } else {
            com.tencent.mm.wallet_core.ui.r1.S(context, mallTransactionObject.C);
        }
    }
}
