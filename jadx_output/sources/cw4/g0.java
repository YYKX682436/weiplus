package cw4;

/* loaded from: classes8.dex */
public final class g0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw4.m0 f224220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f224221b;

    public g0(cw4.m0 m0Var, yz5.a aVar) {
        this.f224220a = m0Var;
        this.f224221b = aVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(this.f224220a.f224239e, "execute js success!");
        yz5.a aVar = this.f224221b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
