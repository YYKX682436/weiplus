package dk5;

/* loaded from: classes9.dex */
public final class l2 {
    public l2(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String str, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        java.lang.String string;
        if (str == null || f9Var == null) {
            return;
        }
        if (z17) {
            long o17 = c01.w9.o(f9Var.Q0());
            f9Var.e1(o17 == f9Var.getCreateTime() ? 1 + o17 : o17);
            f9Var.r1(1);
            int s17 = pt0.f0.f358209b1.s(f9Var.Q0(), f9Var.getMsgId(), f9Var);
            if (s17 <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.RecordRetransmitLogic", "update resend msgInfo " + f9Var.getMsgId() + ' ' + f9Var.Q0() + " fail ret:" + s17);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.RecordRetransmitLogic", "resend msgInfo createTime " + f9Var.getMsgId() + ' ' + f9Var.Q0() + " from:" + k35.m1.e(o17) + " to:" + k35.m1.e(f9Var.getCreateTime()));
        }
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        java.lang.String str2 = "";
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        gu.k kVar = new gu.k(str, cVar);
        if (z17) {
            kVar.f275616s = "resend_record";
            kVar.f412185g = true;
            kVar.f275619v = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(f9Var);
            s15.w wVar = new s15.w();
            v05.b k17 = cVar.k();
            if (k17 != null && (string = k17.getString(k17.f432315e + 44)) != null) {
                str2 = string;
            }
            wVar.fromXml(str2);
            kVar.f275620w = wVar;
        } else {
            kVar.f275616s = "forward_record";
            kVar.f275617t = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(f9Var);
        }
        v05.b k18 = cVar.k();
        if ((k18 != null && k18.getInteger(k18.f368365d + 6) == 24) && kVar.f275617t != null) {
            i95.m c17 = i95.n0.c(qx.d0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            qx.d0 d0Var = (qx.d0) c17;
            java.lang.String str3 = kVar.f275614q;
            oi3.g gVar = kVar.f275617t;
            java.lang.String string2 = gVar != null ? gVar.getString(gVar.f345617d + 3) : null;
            oi3.g gVar2 = kVar.f275617t;
            if (((px.a) d0Var).Ni(str3, string2, gVar2 != null ? gVar2.getLong(gVar2.f345617d + 0) : 0L, null)) {
                return;
            }
        }
        ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).getClass();
        kotlinx.coroutines.flow.j d17 = qi3.x.f363761a.d(new ru.u(kVar));
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new dk5.k2(d17, null), 1, null);
        }
    }
}
