package nt1;

/* loaded from: classes9.dex */
public class b implements nt1.c {
    @Override // nt1.c
    public java.util.List b(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str = null;
        if (f9Var == null) {
            return null;
        }
        java.lang.String j17 = f9Var.j();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ot0.q v17 = j17 != null ? ot0.q.v(j17) : null;
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgMsgHandler", "content is null");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = v17.f348666i;
        if (i17 == 2) {
            com.tencent.mm.pluginsdk.model.app.d D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p);
            if (D0 != null) {
                nt1.c.a(arrayList, f9Var, D0.field_fileFullPath, 30);
            }
            d(arrayList, f9Var, 31);
        } else if (i17 == 19 || i17 == 24) {
            try {
                e(arrayList, i17 == 24 ? 60 : 50, f9Var, v17.f348663h0, 1, new java.util.ArrayList());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppMsgMsgHandler", e17, "Cannot parse record", new java.lang.Object[0]);
            }
        } else if (i17 == 130 || i17 == 6) {
            com.tencent.mm.pluginsdk.model.app.d D02 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p);
            if (D02 == null) {
                D02 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(f9Var.getMsgId(), f9Var.Q0());
            }
            if (D02 != null) {
                try {
                    str = new org.json.JSONObject().put("t", v17.n()).toString();
                } catch (java.lang.Exception unused) {
                }
                nt1.c.c(arrayList, f9Var, D02.field_fileFullPath, 34, 0, str);
            }
            d(arrayList, f9Var, 35);
        } else if (i17 != 7) {
            d(arrayList, f9Var, 38);
        } else {
            com.tencent.mm.pluginsdk.model.app.d D03 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p);
            if (D03 != null) {
                try {
                    str = new org.json.JSONObject().put("t", v17.f348654f).toString();
                } catch (java.lang.Exception unused2) {
                }
                nt1.c.c(arrayList, f9Var, D03.field_fileFullPath, 32, 0, str);
            }
            d(arrayList, f9Var, 33);
        }
        return arrayList;
    }

    public final void d(java.util.List list, com.tencent.mm.storage.f9 f9Var, int i17) {
        nt1.c.a(list, f9Var, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true), i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(java.util.List r17, int r18, com.tencent.mm.storage.f9 r19, java.lang.String r20, int r21, java.util.ArrayList r22) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nt1.b.e(java.util.List, int, com.tencent.mm.storage.f9, java.lang.String, int, java.util.ArrayList):int");
    }
}
