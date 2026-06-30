package md3;

/* loaded from: classes.dex */
public final class o extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "launchApplication";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        data.toString();
        u(data, mq0.a.f330521p, "");
        vz.p1 p1Var = (vz.p1) i95.n0.c(vz.p1.class);
        lc3.e eVar = this.f317890a;
        ((uz.e2) p1Var).wi(eVar != null ? eVar.B0() : null, data, new md3.n(this, data));
    }

    public final void u(lc3.a0 a0Var, mq0.a aVar, java.lang.String str) {
        mq0.z zVar;
        java.lang.String optString = a0Var.optString("bizInfo", "");
        kotlin.jvm.internal.o.d(optString);
        boolean z17 = true;
        if (!(optString.length() == 0) && r26.n0.B(optString, "1030436212907001", false)) {
            java.util.Map k17 = kz5.c1.k(new jz5.l("uxinfo", optString), new jz5.l("errMsg", str), new jz5.l("isMbAd", "true"));
            i95.m c17 = i95.n0.c(mq0.d0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            mq0.d0.M3((mq0.d0) c17, aVar, k17, null, 4, null);
            try {
                java.lang.String optString2 = a0Var.optString("traceId", "");
                java.lang.String optString3 = a0Var.optString("frameSetName", "");
                java.lang.String optString4 = a0Var.optString("implType", "");
                java.lang.String optString5 = a0Var.optString("bizName", "");
                java.lang.String optString6 = a0Var.optString("bizScene", "");
                switch (aVar.ordinal()) {
                    case 23:
                        zVar = mq0.z.f330647u;
                        break;
                    case 24:
                        zVar = mq0.z.f330648v;
                        break;
                    case 25:
                        zVar = mq0.z.f330649w;
                        break;
                    default:
                        zVar = null;
                        break;
                }
                mq0.z zVar2 = zVar;
                if (zVar2 != null) {
                    java.util.Map l17 = kz5.c1.l(new jz5.l("apiName", "launchApplication"));
                    if (optString.length() > 0) {
                        l17.put("uxinfo", optString);
                    }
                    if (str.length() <= 0) {
                        z17 = false;
                    }
                    if (z17) {
                        l17.put("errMsg", str);
                    }
                    mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
                    if (c0Var != null) {
                        kotlin.jvm.internal.o.d(optString5);
                        kotlin.jvm.internal.o.d(optString6);
                        kotlin.jvm.internal.o.d(optString2);
                        kotlin.jvm.internal.o.d(optString3);
                        kotlin.jvm.internal.o.d(optString4);
                        mq0.c0.ig(c0Var, zVar2, optString5, optString6, optString2, optString3, optString4, null, l17, 64, null);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
