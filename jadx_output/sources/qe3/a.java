package qe3;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "createFrameSet";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        se3.e eVar;
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONObject optJSONObject = data.optJSONObject("frameJson");
        int optInt = optJSONObject != null ? optJSONObject.optInt(ya.b.INDEX, 0) : 0;
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "") : null;
        java.lang.String str = optString != null ? optString : "";
        java.lang.String optString2 = data.optString("frameSetName", "mp_timeline_card");
        oe3.c cVar = (oe3.c) this.f317890a;
        if (cVar != null && (eVar = cVar.f344796z) != null) {
            kotlin.jvm.internal.o.d(optString2);
            androidx.lifecycle.j0 j0Var = eVar.f406915e;
            java.util.Collection collection = (java.util.List) j0Var.getValue();
            if (collection == null) {
                collection = kz5.p0.f313996d;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            arrayList.add(optInt, new se3.f(optString2, str));
            j0Var.setValue(arrayList);
        }
        s().invoke(k());
    }
}
