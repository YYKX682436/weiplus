package nt1;

/* loaded from: classes9.dex */
public class e implements nt1.c {
    @Override // nt1.c
    public java.util.List b(com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        if (f9Var == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        k90.b bVar = (k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class));
        java.lang.String rj6 = bVar.rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false);
        nt1.c.a(arrayList, f9Var, rj6, 1);
        try {
            java.lang.String r17 = com.tencent.mm.vfs.w6.r(rj6);
            if (!r17.endsWith("/")) {
                r17 = r17.concat("/");
            }
            java.lang.String str = r17 + com.tencent.mm.vfs.w6.q(rj6) + "_hd.mp4";
            boolean j17 = com.tencent.mm.vfs.w6.j(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsgHandler", "local capture video, hdFilePath: %s, exist: %s", str, java.lang.Boolean.valueOf(j17));
            if (j17) {
                nt1.c.a(arrayList, f9Var, str, 5);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsgHandler", "try to get hd filePath error: %s", e17.getMessage());
        }
        java.lang.String tj6 = bVar.tj(f9Var, f9Var.z0(), false);
        if (f9Var.M2() && (v17 = ot0.q.v(f9Var.U1())) != null) {
            tj6 = v17.f348734z;
        }
        nt1.c.a(arrayList, f9Var, tj6, 2);
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.S)) {
            try {
                nt1.c.c(arrayList, f9Var, bVar.rj(f9Var, bm5.f0.f22570r, h17.S, false), 3, 0, new org.json.JSONObject().put("d", h17.f415015m).toString());
                nt1.c.a(arrayList, f9Var, bVar.tj(f9Var, h17.S, false), 4);
            } catch (org.json.JSONException unused) {
            }
        }
        return arrayList;
    }
}
