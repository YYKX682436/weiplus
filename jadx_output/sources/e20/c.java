package e20;

/* loaded from: classes9.dex */
public final class c implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f246473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pq.a f246474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e20.h f246475c;

    public c(android.webkit.ValueCallback valueCallback, pq.a aVar, e20.h hVar) {
        this.f246473a = valueCallback;
        this.f246474b = aVar;
        this.f246475c = hVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("ECS_O.Router.Wxa", "fakeNativeResultReceiver: " + str);
        android.webkit.ValueCallback valueCallback = this.f246473a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
        yz5.p pVar = this.f246474b.f357553c;
        if (pVar != null) {
            bw5.i8 i8Var = new bw5.i8();
            i8Var.f28492d = bw5.k8.EcsOpenPlatform_Native;
            boolean[] zArr = i8Var.f28496h;
            zArr[1] = true;
            i8Var.f28493e = this.f246475c.f414550a;
            zArr[2] = true;
            i8Var.f28494f = str;
            zArr[3] = true;
            pVar.invoke(bw5.j8.EcsOpenEventType_wxaNavBackToNative, i8Var);
        }
    }
}
