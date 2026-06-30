package t93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/y;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class y extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.content.Context context;
        com.tencent.mars.xlog.Log.i("LiteAppJsApiShareFinderShop", "invoke appId:" + str + ",data:" + jSONObject);
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 == null || (context = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            context = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlinx.coroutines.l.d(context instanceof androidx.appcompat.app.AppCompatActivity ? v65.m.b((androidx.appcompat.app.AppCompatActivity) context) : kotlinx.coroutines.i2.f310477d, null, null, new t93.x(context, jSONObject, this, null), 3, null);
    }
}
