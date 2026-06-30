package em1;

/* loaded from: classes7.dex */
public class m implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f255060a;

    public m(em1.d dVar, android.webkit.ValueCallback valueCallback) {
        this.f255060a = valueCallback;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        this.f255060a.onReceiveValue(str);
    }
}
