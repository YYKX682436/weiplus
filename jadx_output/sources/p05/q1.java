package p05;

/* loaded from: classes5.dex */
public final class q1 implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map values, com.tencent.mm.modelbase.p0 addMsgInfo) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", "sysMsg consume: " + str + ", " + kz5.n0.g0(values.keySet(), null, null, null, 0, null, p05.o1.f350630d, 31, null) + ", " + kz5.n0.g0(values.values(), null, null, null, 0, null, p05.p1.f350637d, 31, null));
        java.lang.String str2 = (java.lang.String) values.get(".sysmsg.mmcvswitch.retry");
        int D1 = str2 == null || str2.length() == 0 ? 0 : com.tencent.mm.sdk.platformtools.t8.D1(str2, 0);
        if (D1 != 1) {
            if (D1 != 2) {
                return null;
            }
            p05.v2.f350704d.getClass();
            com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct wevisionSwitchResStruct = new com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct();
            if (tq5.i.f421269a == 0) {
                tq5.i.f421269a = 2014500;
            }
            wevisionSwitchResStruct.f62979d = tq5.i.f421269a;
            wevisionSwitchResStruct.f62981f = 3;
            wevisionSwitchResStruct.k();
            new p05.b().l().K(p05.t2.f350692a);
            return null;
        }
        com.tencent.mm.autogen.mmdata.rpt.WeVisionModelResStruct weVisionModelResStruct = new com.tencent.mm.autogen.mmdata.rpt.WeVisionModelResStruct();
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        weVisionModelResStruct.f62926d = tq5.i.f421269a;
        weVisionModelResStruct.f62931i = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Bi();
        weVisionModelResStruct.f62929g = 3;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisionModelReporter", "reportSysMsgCgi: " + weVisionModelResStruct.n());
        weVisionModelResStruct.k();
        p05.p3.f350639a.d(0L);
        return null;
    }
}
