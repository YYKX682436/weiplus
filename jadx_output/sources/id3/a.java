package id3;

@fd3.a(name = "batchUpdateWepkg")
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid3/a;", "Llc3/e;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/d;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a<T extends lc3.e> extends com.tencent.mm.plugin.magicbrush.jsapi.base.d {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f290909h = "MBJsApiBatchUpdateWepkg";

    @Override // com.tencent.mm.plugin.magicbrush.jsapi.base.d
    public void c(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String str = this.f290909h;
        com.tencent.mars.xlog.Log.i(str, "invokeInMM");
        java.lang.String optString = data.optString("pkgIdList");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
                if (jSONArray.length() > 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.String optString2 = jSONArray.optString(i17);
                        kotlin.jvm.internal.o.d(optString2);
                        arrayList.add(optString2);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                        com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent = new com.tencent.mm.autogen.events.WepkgNotifyEvent();
                        am.t20 t20Var = wepkgNotifyEvent.f54992g;
                        t20Var.f7969a = 8;
                        t20Var.f7975g = 0;
                        t20Var.f7976h = arrayList;
                        wepkgNotifyEvent.e();
                        a(e());
                        return;
                    }
                }
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.e(str, "data is not json");
                lc3.z zVar = lc3.t.f317920a;
                lc3.c0 c0Var = this.f148050g;
                if (c0Var != null) {
                    a(c0Var.i(zVar));
                    return;
                } else {
                    kotlin.jvm.internal.o.o("mFakeJsApi");
                    throw null;
                }
            }
        }
        a(d(6, "pkgIds is null"));
    }
}
