package nt1;

/* loaded from: classes12.dex */
public interface c {
    static boolean a(java.util.List list, com.tencent.mm.storage.f9 f9Var, java.lang.String str, int i17) {
        return c(list, f9Var, str, i17, 0, null);
    }

    static boolean c(java.util.List list, com.tencent.mm.storage.f9 f9Var, java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(str);
        if (m17 == null) {
            return false;
        }
        ot1.h hVar = new ot1.h();
        hVar.field_msgId = f9Var.getMsgId();
        hVar.field_msgType = f9Var.getType();
        hVar.field_username = f9Var.Q0();
        hVar.field_msgtime = f9Var.getCreateTime();
        hVar.field_flags = f9Var.A0() == 1 ? 1L : 0L;
        hVar.field_msgSubType = i17;
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z7 d17 = b3Var.d(a17);
        if (d17 != null) {
            java.lang.String str4 = d17.f213279f;
            if (str4 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l18)) {
                    d17 = new com.tencent.mm.vfs.z7(d17.f213277d, d17.f213278e, l18, d17.f213280g, d17.f213281h);
                }
            }
            hVar.field_path = d17.toString();
        } else {
            hVar.field_path = str;
        }
        hVar.field_size = m17.f213233c;
        hVar.field_diskSpace = m17.f213234d;
        hVar.field_subIdx = i18;
        hVar.field_detail = str2;
        java.lang.String str5 = hVar.field_path;
        if (str5 == null || str5.startsWith("wcf://c2c_origin_image/") || hVar.field_path.startsWith("wcf://c2c_origin_video/")) {
            return false;
        }
        if (m17 instanceof com.tencent.mm.vfs.k5) {
            try {
                hVar.y0(((com.tencent.mm.vfs.k5) m17).f213029h);
            } catch (java.lang.Exception e17) {
                int i19 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CalcWxNewService", e17, "Failed to set UUID", new java.lang.Object[0]);
            }
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (com.tencent.mm.vfs.e8.f(((ot1.h) it.next()).field_path, hVar.field_path)) {
                return false;
            }
        }
        list.add(hVar);
        return true;
    }

    java.util.List b(com.tencent.mm.storage.f9 f9Var);
}
