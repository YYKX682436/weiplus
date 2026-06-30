package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class l90 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xy2 f113367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f113368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(r45.xy2 xy2Var, com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, java.lang.Class cls) {
        super(cls);
        this.f113367b = xy2Var;
        this.f113368c = ea0Var;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.yy2 result = (r45.yy2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String string = result.getString(1);
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f113368c;
        if (string != null) {
            if (string.length() > 0) {
                com.tencent.mars.xlog.Log.i(ea0Var.f112390t, "update request id: ".concat(string));
                ((mm2.c1) ea0Var.S0().a(mm2.c1.class)).y9(string);
            }
        }
        r45.xy2 xy2Var = this.f113367b;
        if (xy2Var.getInteger(2) == 1) {
            xy2Var.set(2, 0);
            dk2.ef.f233392k.h(2, xy2Var);
        }
        so2.j5 j5Var = ((mm2.f6) ea0Var.S0().a(mm2.f6.class)).f329049w;
        r45.y23 y23Var = (r45.y23) result.getCustom(0);
        boolean z17 = j5Var instanceof cm2.m0;
        java.lang.String str = ea0Var.f112390t;
        if (z17 && y23Var != null) {
            cm2.m0 m0Var = (cm2.m0) j5Var;
            if (y23Var.getLong(0) == m0Var.f43369w) {
                m0Var.f43368v = y23Var;
                com.tencent.mars.xlog.Log.i(str, "[updateCouponBubble] " + m0Var);
                qo0.b bVar = qo0.b.N2;
                android.os.Bundle bundle = new android.os.Bundle();
                r45.f52 J2 = zl2.r4.f473950a.J2(m0Var);
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", J2 != null ? J2.toByteArray() : null);
                ea0Var.f112387q.statusChange(bVar, bundle);
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update fail,resp:");
        java.lang.Object obj = y23Var;
        if (y23Var == null) {
            obj = "";
        }
        sb6.append(pm0.b0.b(obj));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }
}
