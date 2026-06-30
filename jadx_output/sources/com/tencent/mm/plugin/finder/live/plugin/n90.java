package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class n90 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f113601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f113602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, r45.ch1 ch1Var) {
        super(0);
        this.f113601d = ea0Var;
        this.f113602e = ch1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f113601d;
        so2.j5 j5Var = ((mm2.f6) ea0Var.P0(mm2.f6.class)).f329049w;
        cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
        if (m0Var != null && (byteString = this.f113602e.getByteString(4)) != null) {
            byte[] g17 = byteString.g();
            r45.od2 od2Var = new r45.od2();
            try {
                od2Var.parseFrom(g17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                od2Var = null;
            }
            if (od2Var != null && m0Var.f43385d == od2Var.getLong(1)) {
                r45.y23 y23Var = m0Var.f43368v;
                com.tencent.mm.protobuf.g byteString2 = od2Var.getByteString(0);
                if (byteString2 != null) {
                    byte[] g18 = byteString2.g();
                    r45.ax4 ax4Var = new r45.ax4();
                    try {
                        ax4Var.parseFrom(g18);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                        ax4Var = null;
                    }
                    if (ax4Var != null) {
                        java.util.Iterator it = ax4Var.getList(0).iterator();
                        while (it.hasNext()) {
                            r45.gs6 gs6Var = (r45.gs6) it.next();
                            r45.y23 y23Var2 = (r45.y23) gs6Var.getCustom(1);
                            if (y23Var2 != null) {
                                if (gs6Var.getInteger(2) == 1) {
                                    r45.bd5 b17 = st2.w1.b(y23Var2);
                                    java.lang.Integer valueOf = b17 != null ? java.lang.Integer.valueOf(b17.getInteger(13)) : null;
                                    r45.bd5 b18 = st2.w1.b(y23Var);
                                    if (!kotlin.jvm.internal.o.b(valueOf, b18 != null ? java.lang.Integer.valueOf(b18.getInteger(13)) : null)) {
                                    }
                                }
                                int integer = gs6Var.getInteger(0);
                                if (integer == 1) {
                                    y23Var.set(54, y23Var2.getList(54));
                                } else if (integer == 2) {
                                    y23Var.set(70, (r45.bd5) y23Var2.getCustom(70));
                                    r45.mw3 mw3Var = (r45.mw3) y23Var.getCustom(44);
                                    if (mw3Var != null) {
                                        r45.mw3 mw3Var2 = (r45.mw3) y23Var2.getCustom(44);
                                        mw3Var.set(4, mw3Var2 != null ? (r45.bd5) mw3Var2.getCustom(4) : null);
                                    }
                                }
                            }
                        }
                        xt2.e3.j(ea0Var.y1(), m0Var.f43368v, true, false, 4, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
