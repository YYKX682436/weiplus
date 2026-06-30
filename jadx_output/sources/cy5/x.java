package cy5;

/* loaded from: classes13.dex */
public class x implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f224922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cy5.y f224923c;

    public x(cy5.y yVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f224923c = yVar;
        this.f224921a = str;
        this.f224922b = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        cy5.y yVar = this.f224923c;
        by5.c4.f(yVar.m(), "readFile onReceiveValue: " + num);
        com.tencent.xweb.g.b(this.f224921a);
        cy5.y.v(yVar);
        yVar.G(this.f224922b, num.intValue());
    }
}
