package gx;

/* loaded from: classes7.dex */
public final class i extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setTimelineWidgetStatus";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetName");
        boolean optBoolean = data.optBoolean("isCompete");
        com.tencent.mars.xlog.Log.i("MBJsApiSetTimelineWidgetStatus", "frameSetName: " + optString + ", isCompete: " + optBoolean);
        cx.w0 w0Var = (cx.w0) this.f317890a;
        if (w0Var != null) {
            kotlin.jvm.internal.o.d(optString);
            gx.h hVar = new gx.h(this, optString);
            com.tencent.mm.flutter.plugin.proto.g0 j17 = com.tencent.mm.flutter.plugin.proto.h0.j();
            j17.f67966d |= 1;
            j17.f67967e = optString;
            j17.onChanged();
            long j18 = optBoolean ? 1L : 0L;
            j17.f67966d |= 2;
            j17.f67968f = j18;
            j17.onChanged();
            w0Var.f224479x.n("setTimelineWidgetStatus", j17.build().toByteArray(), new cx.v0(hVar));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            s().invoke(j(lc3.x.f317936c, "context null"));
        }
    }
}
