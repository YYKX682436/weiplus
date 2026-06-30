package jt2;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "notifyLoadResult";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        rs5.g gVar;
        kotlin.jvm.internal.o.g(data, "data");
        int optInt = data.optInt("result", -2);
        rs5.g[] values = rs5.g.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                gVar = null;
                break;
            }
            gVar = values[i17];
            if (gVar.f399356d == optInt) {
                break;
            } else {
                i17++;
            }
        }
        java.lang.String optString = data.optString("errMsg");
        if (gVar == null) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MRJsApiNotifyLoadResult", "notify load result with invalid params: " + data, null);
            s().invoke(i(lc3.x.f317937d));
            return;
        }
        lc3.e eVar = this.f317890a;
        kotlin.jvm.internal.o.d(eVar);
        kotlin.jvm.internal.o.d(optString);
        it2.x xVar = ((it2.k) eVar).f294511d;
        xVar.getClass();
        com.tencent.mars.xlog.Log.i("MagicRewardFeatureService", "notify load result " + gVar + " with error " + optString);
        if (gVar != rs5.g.f399354e) {
            xVar.Di(new it2.q(gVar, optString));
        }
        s().invoke(k());
    }
}
