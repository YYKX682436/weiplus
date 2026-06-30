package gx;

/* loaded from: classes7.dex */
public final class g extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setScreenReaderInfo";
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
        java.lang.String optString2 = data.optString("semanticLabel");
        com.tencent.mars.xlog.Log.i("MBJsApiSetScreenReaderInfo", "frameSetName: " + optString + ", semanticLabel: " + optString2);
        if (!(optString == null || optString.length() == 0)) {
            if (!(optString2 == null || optString2.length() == 0)) {
                cx.w0 w0Var = (cx.w0) this.f317890a;
                if (w0Var != null) {
                    kotlin.jvm.internal.o.d(optString);
                    kotlin.jvm.internal.o.d(optString2);
                    gx.f fVar = new gx.f(this, optString);
                    com.tencent.mm.flutter.plugin.proto.i builder = com.tencent.mm.flutter.plugin.proto.j.f67978h.toBuilder();
                    builder.f67975d = 1 | builder.f67975d;
                    builder.f67976e = optString;
                    builder.onChanged();
                    builder.f67975d |= 2;
                    builder.f67977f = optString2;
                    builder.onChanged();
                    com.tencent.mm.flutter.plugin.proto.j buildPartial = builder.buildPartial();
                    if (!buildPartial.isInitialized()) {
                        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
                    }
                    w0Var.f224479x.n("setScreenReaderInfo", buildPartial.toByteArray(), new cx.u0(fVar));
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    s().invoke(j(lc3.x.f317936c, "context null"));
                    return;
                }
                return;
            }
        }
        s().invoke(j(lc3.x.f317937d, "frameSetName or semanticLabel is empty"));
    }
}
