package h53;

/* loaded from: classes7.dex */
public class o implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f279063a;

    public o(h53.p pVar, android.webkit.ValueCallback valueCallback) {
        this.f279063a = valueCallback;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        android.webkit.ValueCallback valueCallback = this.f279063a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
    }
}
