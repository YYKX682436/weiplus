package rd3;

/* loaded from: classes.dex */
public final class k extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showToast";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        java.lang.String optString2 = data.optString("icon", "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        if (optString.length() == 0) {
            s().invoke(h(1, "title can not empty!"));
        }
        com.tencent.mars.xlog.Log.i("MBJsApiShowToast", "title:" + optString + " icon:" + optString2);
        int hashCode = optString2.hashCode();
        if (hashCode == -1867169789) {
            if (optString2.equals(ya.b.SUCCESS)) {
                db5.t7.h(com.tencent.mm.sdk.platformtools.x2.f193071a, optString);
            }
            db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, optString);
        } else if (hashCode != 3387192) {
            if (hashCode == 96784904 && optString2.equals("error")) {
                db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, optString);
            }
            db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, optString);
        } else {
            if (optString2.equals(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE)) {
                db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, optString);
            }
            db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, optString);
        }
        s().invoke(k());
    }
}
