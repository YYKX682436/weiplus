package sd3;

/* loaded from: classes7.dex */
public final class c extends lc3.d0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showLoading";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        com.tencent.mars.xlog.Log.i("MBJsApiShowLoading", "title:" + optString);
        lc3.e eVar = this.f317890a;
        com.tencent.mm.ui.widget.dialog.u3 c17 = com.tencent.mm.ui.widget.dialog.u3.c(eVar != null ? eVar.B0() : null, optString, false, 3, null);
        c17.show();
        android.app.Dialog dialog = sd3.a.f406680a;
        if (dialog != null) {
            dialog.dismiss();
        }
        sd3.a.f406680a = c17;
        return k();
    }
}
