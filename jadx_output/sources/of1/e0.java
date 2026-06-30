package of1;

/* loaded from: classes7.dex */
public final class e0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f344907a;

    public e0(of1.v0 v0Var) {
        this.f344907a = v0Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(this.f344907a.D1(), "evaluateJavascript " + ((java.lang.String) obj));
    }
}
