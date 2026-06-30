package yb1;

/* loaded from: classes.dex */
public final class i implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f460658a;

    public i(kotlinx.coroutines.q qVar) {
        this.f460658a = qVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPageContentService", "html webview execute javascript: " + str);
        ((kotlinx.coroutines.r) this.f460658a).resumeWith(kotlin.Result.m521constructorimpl(str));
    }
}
