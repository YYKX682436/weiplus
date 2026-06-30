package ln;

/* loaded from: classes11.dex */
public class q implements vg3.q4 {
    public final void b(com.tencent.mm.storage.a3 a3Var, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = "null";
        boolean z17 = false;
        if (a3Var != null) {
            try {
                if (com.tencent.mm.sdk.platformtools.t8.K0(a3Var.field_associateOpenIMRoomName)) {
                    com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str2);
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    objArr[0] = str;
                    objArr[1] = java.lang.Boolean.valueOf(a3Var.J0());
                    objArr[2] = str2;
                    if (z07 != null) {
                        str3 = java.lang.Boolean.valueOf(z07.J0());
                    }
                    objArr[3] = str3;
                    com.tencent.mars.xlog.Log.i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "associateRoomName %s finish %s, imunionRoomName %s finish %s", objArr);
                    if (z07 != null && !z07.J0()) {
                        z07.field_openIMRoomMigrateStatus = 2;
                        z07.field_associateOpenIMRoomName = str;
                        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(z07);
                        z17 = true;
                    }
                    if (z17) {
                        a3Var.field_openIMRoomMigrateStatus = 1;
                    } else {
                        a3Var.field_openIMRoomMigrateStatus = 3;
                    }
                    a3Var.field_associateOpenIMRoomName = str2;
                    ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(a3Var);
                    if (z17) {
                        ((nn.j) i95.n0.c(nn.j.class)).Ni().c(str, str2);
                        return;
                    }
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "handleInfo Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                return;
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        if (a3Var != null) {
            java.lang.String str4 = a3Var.field_associateOpenIMRoomName;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            str3 = str4 == null ? "" : str4;
        }
        objArr2[0] = str3;
        com.tencent.mars.xlog.Log.e("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "handleInfo member:%s", objArr2);
    }

    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = "";
        if (!(str == null ? "" : str).equals("IMUnionRoom2AssociateRoom")) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "consumeNewXml subType:%s", objArr);
        if (map == null) {
            return null;
        }
        try {
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.associateroomname");
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String trim = str3.trim();
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.imunionroomname");
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String trim2 = str4.trim();
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = trim2 == null ? "" : trim2;
            if (trim != null) {
                str2 = trim;
            }
            objArr2[1] = str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "consumeNewXml %s %s", objArr2);
            if (com.tencent.mm.storage.z3.N4(trim) && !com.tencent.mm.sdk.platformtools.t8.K0(trim2)) {
                com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(trim);
                if (z07 == null) {
                    ((c01.k7) c01.n8.a()).b(trim, 8, new ln.p(this, trim, trim2));
                } else {
                    b(z07, trim, trim2);
                }
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "consumeNewXml Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return null;
        }
    }
}
