package ko3;

/* loaded from: classes12.dex */
public class o0 implements com.tencent.mm.modelbase.u0 {
    public final void a() {
        gm0.j1.d().a(3644, this);
        gm0.j1.d().a(3789, this);
        gm0.j1.d().a(836, this);
        gm0.j1.d().a(3944, this);
    }

    public final void b() {
        gm0.j1.d().q(3644, this);
        gm0.j1.d().q(3789, this);
        gm0.j1.d().q(836, this);
        gm0.j1.d().q(3944, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.g gVar;
        r45.fo0 fo0Var;
        com.tencent.mm.protobuf.g gVar2;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = str;
        objArr[3] = java.lang.Integer.valueOf(m1Var == null ? -1 : m1Var.getType());
        com.tencent.mars.xlog.Log.i("TrustRequestManager", java.lang.String.format("onSceneEnd: errType = %s errCode = %s errMsg =  %s reqType = %s", objArr));
        fo3.s sVar = fo3.s.INSTANCE;
        if (i17 == 0 && i18 == 0) {
            if (m1Var.getType() == 3644 || m1Var.getType() == 3789) {
                r45.ho0 ho0Var = ((o45.sh) ((go3.b) m1Var).getReqResp().getRespObj()).f343008a;
                if (ho0Var != null && (gVar = ho0Var.f376327d) != null) {
                    sVar.Le(gVar.g(), 1, i18);
                }
            } else if ((m1Var.getType() == 836 || m1Var.getType() == 3944) && (fo0Var = ((o45.ph) ((go3.a) m1Var).getReqResp().getRespObj()).f342996a) != null && (gVar2 = fo0Var.f374480d) != null) {
                sVar.Le(gVar2.g(), 2, i18);
            }
        }
        if (i18 != 0) {
            sVar.Le(null, 0, i18);
        }
        b();
    }
}
