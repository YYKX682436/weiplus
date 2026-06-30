package jd3;

/* loaded from: classes.dex */
public final class d implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final jd3.d f299176a = new jd3.d();

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MBJsApiInjectJsFiles", "inject js result:" + ((java.lang.String) obj));
    }
}
