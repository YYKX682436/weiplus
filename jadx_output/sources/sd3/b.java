package sd3;

/* loaded from: classes7.dex */
public final class b extends lc3.d0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "hideLoading";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MBJsApiHideLoading", "invoke");
        android.app.Dialog dialog = sd3.a.f406680a;
        if (dialog != null) {
            dialog.dismiss();
        }
        sd3.a.f406680a = null;
        return k();
    }
}
