package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class p60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo0.b f113835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f113836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f113837f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p60(qo0.b bVar, android.os.Bundle bundle, com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        super(0);
        this.f113835d = bVar;
        this.f113836e = bundle;
        this.f113837f = r60Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] byteArray;
        byte[] byteArray2;
        int ordinal = this.f113835d.ordinal();
        boolean z17 = false;
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f113837f;
        if (ordinal != 111) {
            kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
            android.os.Bundle bundle = this.f113836e;
            switch (ordinal) {
                case 117:
                    if (bundle != null && (byteArray = bundle.getByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA")) != null) {
                        zl2.r4 r4Var = zl2.r4.f473950a;
                        cm2.t I2 = r4Var.I2(byteArray);
                        if (I2 != null && I2.f43389h > 0) {
                            kotlinx.coroutines.r2 r2Var = r60Var.B;
                            if (r2Var != null && r2Var.a()) {
                                z17 = true;
                            }
                            if (z17) {
                                java.lang.Long l17 = r60Var.D;
                                long j17 = I2.f43385d;
                                if (l17 != null && l17.longValue() == j17 && kotlin.jvm.internal.o.b(r60Var.E, I2.f43396r)) {
                                    com.tencent.mars.xlog.Log.i(r60Var.f114098s, "same item, don not repeat delay!!, only update data!");
                                    ((mm2.f6) r60Var.P0(mm2.f6.class)).c7(I2);
                                    break;
                                }
                            }
                        }
                        cm2.t I22 = r4Var.I2(byteArray);
                        if (I22 != null) {
                            r60Var.w1();
                            r60Var.B = kotlinx.coroutines.l.d(i2Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.l60(I22, r60Var, null), 3, null);
                            break;
                        }
                    }
                    break;
                case 118:
                    if (bundle != null && (byteArray2 = bundle.getByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA")) != null) {
                        zl2.r4 r4Var2 = zl2.r4.f473950a;
                        cm2.t I23 = r4Var2.I2(byteArray2);
                        if (I23 != null && I23.f43389h > 0) {
                            kotlinx.coroutines.r2 r2Var2 = r60Var.B;
                            if (r2Var2 != null && r2Var2.a()) {
                                z17 = true;
                            }
                            if (z17) {
                                java.lang.Long l18 = r60Var.D;
                                long j18 = I23.f43385d;
                                if (l18 != null && l18.longValue() == j18 && kotlin.jvm.internal.o.b(r60Var.E, I23.f43396r)) {
                                    com.tencent.mars.xlog.Log.i(r60Var.f114098s, "same item, don not repeat delay!!, only update data!");
                                    ((mm2.f6) r60Var.P0(mm2.f6.class)).c7(I23);
                                    break;
                                }
                            }
                        }
                        r60Var.w1();
                        cm2.t I24 = r4Var2.I2(byteArray2);
                        if (I24 != null) {
                            r60Var.B = kotlinx.coroutines.l.d(i2Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.n60(r60Var, I24, null), 3, null);
                            break;
                        }
                    }
                    break;
                case 119:
                    r60Var.w1();
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.o60(bundle, r60Var));
                    break;
            }
        } else if (r60Var.f114100u instanceof com.tencent.mm.plugin.finder.live.plugin.cj) {
            r60Var.z1(false, false, false);
        }
        return jz5.f0.f302826a;
    }
}
