package z31;

/* loaded from: classes7.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "postPlayableMessageToMiniProgramLib";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        x31.a E0;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("extra");
        com.tencent.mars.xlog.Log.i("MagicNewPlayable.MbJsApiPostPlayableMessageToMiniProgramLib", "extra:" + optString);
        z31.a aVar = (z31.a) this.f317890a;
        if (aVar != null && (E0 = aVar.E0()) != null) {
            x31.b[] bVarArr = x31.b.f451599d;
            kotlin.jvm.internal.o.d(optString);
            E0.b(3, "", optString);
        }
        s().invoke(k());
    }
}
