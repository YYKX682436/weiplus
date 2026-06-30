package cy5;

/* loaded from: classes13.dex */
public class w implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f224919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cy5.y f224920c;

    public w(cy5.y yVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f224920c = yVar;
        this.f224918a = str;
        this.f224919b = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        cy5.y yVar = this.f224920c;
        by5.c4.f(yVar.m(), "readFile onReceiveValue: " + num);
        com.tencent.xweb.g.b(this.f224918a);
        cy5.y.v(yVar);
        yVar.G(this.f224919b, num.intValue());
    }
}
