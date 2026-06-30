package jt2;

/* loaded from: classes3.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "notifyPrepareResourceResult";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        rs5.h hVar;
        kotlin.jvm.internal.o.g(data, "data");
        int optInt = data.optInt("result", -2);
        int optInt2 = data.optInt("callbackId", -1);
        rs5.h[] values = rs5.h.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                hVar = null;
                break;
            }
            hVar = values[i17];
            if (hVar.f399364d == optInt) {
                break;
            } else {
                i17++;
            }
        }
        if (hVar == null || optInt2 < 0) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MRJsApiNotifyPrepareResourceResult", "notify prepare resource result with invalid params: " + data, null);
            s().invoke(i(lc3.x.f317937d));
            return;
        }
        lc3.e eVar = this.f317890a;
        kotlin.jvm.internal.o.d(eVar);
        it2.x xVar = ((it2.k) eVar).f294511d;
        xVar.getClass();
        com.tencent.mars.xlog.Log.i("MagicRewardFeatureService", "notifyPrepareResourceResult: " + hVar + " with id " + optInt2);
        android.util.SparseArray sparseArray = xVar.f294538o;
        yz5.l lVar = (yz5.l) sparseArray.get(optInt2);
        if (lVar != null) {
            lVar.invoke(hVar);
        }
        sparseArray.remove(optInt2);
        s().invoke(k());
    }
}
