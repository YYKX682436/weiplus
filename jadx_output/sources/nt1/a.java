package nt1;

/* loaded from: classes9.dex */
public class a implements nt1.c {
    @Override // nt1.c
    public java.util.List b(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        java.lang.String j17 = f9Var.j();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ot0.q v17 = j17 != null ? ot0.q.v(j17) : null;
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgImgMsgHandler", "content is null");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.pluginsdk.model.app.d D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p);
        if (D0 != null) {
            nt1.c.a(arrayList, f9Var, D0.field_fileFullPath, 30);
        }
        nt1.c.a(arrayList, f9Var, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true), 31);
        return arrayList;
    }
}
