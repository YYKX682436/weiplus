package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class k0 {
    public k0(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(com.tencent.mm.plugin.ting.uic.k0 k0Var, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, android.content.Context context) {
        bw5.v70 v70Var;
        k0Var.getClass();
        try {
            bw5.zo0 parseFrom = new bw5.zo0().parseFrom(multiTaskInfo.field_data);
            v70Var = parseFrom.f36075e[1] ? parseFrom.f36074d : new bw5.v70();
        } catch (java.lang.Exception e17) {
            rk4.k5.d("TingMultiTaskRegisterUIC listenItem parseError " + e17.getStackTrace() + ", " + e17.getMessage(), null);
            v70Var = null;
        }
        if (v70Var != null) {
            bw5.lp0 lp0Var = new bw5.lp0();
            lp0Var.j(v70Var);
            lp0Var.g(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            i95.m c17 = i95.n0.c(qk.k6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            qk.k6 k6Var = (qk.k6) c17;
            android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
            kotlin.jvm.internal.o.d(context2);
            qk.k6.I1(k6Var, context2, true, lp0Var, new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, bw5.x2.BizAudioEnterScene_StarListen, false, 25165815, null), null, null, null, null, null, null, null, 2032, null);
        }
    }
}
