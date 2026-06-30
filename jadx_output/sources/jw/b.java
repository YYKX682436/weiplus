package jw;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getFrameSetOffsetInfo";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetName");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            s().invoke(h(1, "empty frameSetName"));
        }
        hw.c0 c0Var = (hw.c0) this.f317890a;
        if (c0Var != null) {
            jw.a aVar = new jw.a(this);
            fw.v vVar = c0Var.f285362x;
            vVar.getClass();
            com.tencent.mm.flutter.plugin.proto.d0 h17 = com.tencent.mm.flutter.plugin.proto.e0.h();
            h17.g(optString);
            vVar.n("getFrameSetOffsetInfo", h17.build().toByteArray(), new fw.r(aVar));
        }
    }
}
