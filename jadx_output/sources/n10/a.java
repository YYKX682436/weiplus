package n10;

/* loaded from: classes.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "closePage";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        android.app.Activity B0;
        android.app.Activity B02;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("resultData");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("resultData", optString);
        lc3.e eVar = this.f317890a;
        if (eVar != null && (B02 = eVar.B0()) != null) {
            B02.setResult(-1, intent);
        }
        lc3.e eVar2 = this.f317890a;
        if (eVar2 != null && (B0 = eVar2.B0()) != null) {
            B0.finish();
        }
        s().invoke(k());
    }
}
