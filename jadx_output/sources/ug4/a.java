package ug4;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f427580f = "MBJsApiPerformLiveAction";

    @Override // lc3.c0
    public java.lang.String f() {
        return "performLiveAction";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        oe0.w wVar;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("action");
        com.tencent.mars.xlog.Log.i(this.f427580f, "action:" + optString);
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            s().invoke(h(1, "performLiveAction action null"));
        }
        xg4.p pVar = (xg4.p) this.f317890a;
        if (pVar != null && (wVar = pVar.B) != null) {
            wVar.a(optString, data);
        }
        s().invoke(k());
    }
}
