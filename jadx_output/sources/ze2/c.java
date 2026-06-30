package ze2;

/* loaded from: classes3.dex */
public final class c implements we2.c0 {
    @Override // we2.c0
    public boolean a(we2.c cgiResp) {
        r45.nw1 nw1Var;
        r45.r71 r71Var;
        kotlin.jvm.internal.o.g(cgiResp, "cgiResp");
        int i17 = cgiResp.f445218a;
        int i18 = cgiResp.f445219b;
        we2.b bVar = cgiResp.f445220c;
        r45.nw1 nw1Var2 = (bVar == null || (r71Var = bVar.f445214a) == null) ? null : (r45.nw1) r71Var.getCustom(3);
        xy2.b bVar2 = xy2.b.f458155b;
        pm0.z.b(bVar2, "liveHeartBeatSvrErr", (nw1Var2 != null ? nw1Var2.getLong(0) : 0L) != 0, null, null, false, false, new ze2.a(i17, i18), 60, null);
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        pm0.z.b(bVar2, "liveHeartBeatLocalErr", ((e1Var == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0)) != 0, null, null, false, false, new ze2.b(i17, i18, nw1Var2), 60, null);
        return true;
    }
}
