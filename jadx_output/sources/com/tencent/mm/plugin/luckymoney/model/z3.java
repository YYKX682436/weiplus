package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public abstract class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static j05.e f145735a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.luckymoney.model.i f145736b;

    public static void a(android.content.Context context, com.tencent.mm.plugin.luckymoney.model.i iVar) {
        com.tencent.mm.ui.widget.dialog.u3 O = db5.e1.O(context, null, 3, com.tencent.mm.R.style.f494256i6, context.getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.luckymoney.model.o3(iVar));
        if (!(context instanceof com.tencent.mm.ui.MMFragmentActivity)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePreview", "context is not MMFragmentActivity: %s", context.getClass().getName());
            return;
        }
        pq5.g l17 = iVar.l();
        l17.f((com.tencent.mm.ui.MMFragmentActivity) context);
        l17.q(new com.tencent.mm.plugin.luckymoney.model.r3(O, context));
    }

    public static void b() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y2("1@fackuser");
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().J0("1@fackuser");
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y2("1@fackuser");
    }

    public static void c(android.content.Context context, java.lang.String str, j05.e eVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePreview", "do get red packet preview from scan，url: %s", str);
        f145735a = null;
        com.tencent.mm.plugin.luckymoney.model.i iVar = f145736b;
        if (iVar != null) {
            iVar.j();
            f145736b = null;
        }
        f145735a = eVar;
        com.tencent.mm.plugin.luckymoney.model.i iVar2 = new com.tencent.mm.plugin.luckymoney.model.i(0, str, "");
        f145736b = iVar2;
        a(context, iVar2);
    }

    public static void d() {
        if (((int) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q("1@fackuser").E2) > 0) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k("1@fackuser");
        }
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.X1("1@fackuser");
        z3Var.M1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gn8));
        z3Var.N2();
        z3Var.E2 = -99L;
        z3Var.V2(3);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().s0(z3Var, false);
    }
}
