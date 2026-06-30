package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.i0 f141041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.i2 f141042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(x0.i0 i0Var, com.tencent.mm.plugin.game.ui.i2 i2Var) {
        super(1);
        this.f141041d = i0Var;
        this.f141042e = i2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.game.ui.i2 i2Var;
        com.tencent.mm.sdk.platformtools.o4 R;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        x0.i0 i0Var = this.f141041d;
        java.util.Iterator it = i0Var.iterator();
        int i17 = 0;
        while (true) {
            x0.s0 s0Var = (x0.s0) it;
            boolean hasNext = s0Var.hasNext();
            i2Var = this.f141042e;
            if (!hasNext) {
                i17 = -1;
                break;
            }
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.game.ui.i2) s0Var.next()).f141416a, i2Var.f141416a)) {
                break;
            }
            i17++;
        }
        if (i17 >= 0) {
            com.tencent.mm.plugin.game.ui.i2 i2Var2 = (com.tencent.mm.plugin.game.ui.i2) i0Var.get(i17);
            java.lang.String id6 = i2Var2.f141416a;
            kotlin.jvm.internal.o.g(id6, "id");
            java.lang.String title = i2Var2.f141417b;
            kotlin.jvm.internal.o.g(title, "title");
            i0Var.set(i17, new com.tencent.mm.plugin.game.ui.i2(id6, title, i2Var2.f141418c, booleanValue));
            java.lang.String str = i2Var.f141416a;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
            if (com.tencent.mm.plugin.game.model.w.a() && str != null && (R = com.tencent.mm.sdk.platformtools.o4.R("GameCenter.DebugTool")) != null) {
                R.G(str, valueOf.booleanValue());
            }
        }
        return jz5.f0.f302826a;
    }
}
