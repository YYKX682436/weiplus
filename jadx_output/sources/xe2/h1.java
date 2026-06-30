package xe2;

/* loaded from: classes3.dex */
public final class h1 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453867c = "LivePromoteInfoInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        jz5.f0 f0Var;
        gk2.e buContext;
        gk2.e buContext2;
        gk2.e buContext3;
        kn0.p pVar;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.f52 f52Var = new r45.f52();
        boolean z17 = false;
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                f52Var.parseFrom(byteString != null ? byteString.g() : null);
            }
        }
        java.lang.String str = "recive promote msg: " + pm0.b0.g(f52Var);
        java.lang.String str2 = this.f453867c;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (f52Var.getInteger(3) == 0 && f52Var.getInteger(0) == 19) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            byte[] byteArray = f52Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            cm2.t I2 = r4Var.I2(byteArray);
            cm2.g0 g0Var = I2 instanceof cm2.g0 ? (cm2.g0) I2 : null;
            r45.qy1 qy1Var = g0Var != null ? g0Var.f43346v : null;
            if (qy1Var != null) {
                r4Var.K2(str2, qy1Var);
            }
        }
        if ((f52Var.getInteger(3) == 1 || ((f52Var.getByteString(2) != null || f52Var.getBoolean(12)) && f52Var.getInteger(3) == 0) ? f52Var : null) != null) {
            dk2.ef efVar = dk2.ef.f233372a;
            tn0.w0 w0Var = dk2.ef.f233378d;
            if (w0Var != null && (pVar = w0Var.D) != null && pVar.i()) {
                z17 = true;
            }
            if (z17) {
                if (f52Var.getInteger(3) == 1) {
                    zl2.r4 r4Var2 = zl2.r4.f473950a;
                    byte[] byteArray2 = f52Var.toByteArray();
                    kotlin.jvm.internal.o.f(byteArray2, "toByteArray(...)");
                    cm2.t I22 = r4Var2.I2(byteArray2);
                    if (!(I22 instanceof cm2.t)) {
                        I22 = null;
                    }
                    com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                    com.tencent.mm.plugin.finder.feed.model.internal.r0 r0Var = (k0Var == null || (buContext3 = k0Var.getBuContext()) == null) ? null : ((mm2.f6) buContext3.a(mm2.f6.class)).f329049w;
                    cm2.t tVar = r0Var instanceof cm2.t ? (cm2.t) r0Var : null;
                    if (tVar != null && I22 != null && tVar.f43385d != I22.f43385d) {
                        com.tencent.mars.xlog.Log.i(str2, "promoteid no match dont del,promotingId:" + tVar.f43385d + ", newPromoteInfo:" + I22.f43385d);
                    }
                }
                com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
                if (k0Var2 != null) {
                    h(k0Var2, f52Var);
                }
            } else {
                com.tencent.mm.plugin.finder.live.view.k0 k0Var3 = dk2.ef.f233380e;
                if (k0Var3 != null) {
                    h(k0Var3, f52Var);
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    if (f52Var.getInteger(3) == 1) {
                        com.tencent.mm.plugin.finder.live.view.k0 k0Var4 = dk2.ef.f233380e;
                        mm2.f6 f6Var = (k0Var4 == null || (buContext2 = k0Var4.getBuContext()) == null) ? null : (mm2.f6) buContext2.a(mm2.f6.class);
                        if (f6Var != null) {
                            f6Var.c7(null);
                        }
                    } else {
                        com.tencent.mm.plugin.finder.live.view.k0 k0Var5 = dk2.ef.f233380e;
                        mm2.f6 f6Var2 = (k0Var5 == null || (buContext = k0Var5.getBuContext()) == null) ? null : (mm2.f6) buContext.a(mm2.f6.class);
                        if (f6Var2 != null) {
                            zl2.r4 r4Var3 = zl2.r4.f473950a;
                            byte[] byteArray3 = f52Var.toByteArray();
                            kotlin.jvm.internal.o.f(byteArray3, "toByteArray(...)");
                            cm2.t I23 = r4Var3.I2(byteArray3);
                            f6Var2.c7(I23 instanceof so2.j5 ? I23 : null);
                        }
                    }
                }
            }
        }
        if (f52Var.getInteger(8) > 0) {
            dk2.ef efVar2 = dk2.ef.f233372a;
            dk2.tb tbVar = dk2.ef.f233392k;
            tbVar.f234127h.post(new dk2.sb(f52Var.getInteger(8), tbVar, f52Var.getInteger(9)));
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20051};
    }

    public final void h(com.tencent.mm.plugin.finder.live.view.k0 k0Var, r45.f52 f52Var) {
        gk2.e buContext;
        if (f52Var.getInteger(3) == 1) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            bundle.putBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_ANCHOR", true);
            k0Var.statusChange(bVar, bundle);
            return;
        }
        if (f52Var.getBoolean(12)) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            if (!r4Var.w1()) {
                byte[] byteArray = f52Var.toByteArray();
                kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                boolean z17 = r4Var.I2(byteArray) instanceof cm2.t;
                long j17 = f52Var.getBoolean(11) ? e06.p.j(new e06.k(1, f52Var.getInteger(9)), c06.e.f37716d) : 0L;
                com.tencent.mars.xlog.Log.i(this.f453867c, "[notifyBubble] delay = " + j17);
                pm0.v.V(j17 * ((long) 1000), new xe2.g1(f52Var));
                return;
            }
        }
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
        com.tencent.mm.plugin.finder.feed.model.internal.r0 r0Var = (k0Var2 == null || (buContext = k0Var2.getBuContext()) == null) ? null : ((mm2.f6) buContext.a(mm2.f6.class)).f329049w;
        cm2.t tVar = r0Var instanceof cm2.t ? (cm2.t) r0Var : null;
        qo0.b bVar2 = f52Var.getLong(4) == (tVar != null ? tVar.f43385d : 0L) ? qo0.b.N2 : qo0.b.M2;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
        k0Var.statusChange(bVar2, bundle2);
    }
}
