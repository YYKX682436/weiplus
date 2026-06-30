package k5;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final b5.w f304140d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f304141e;

    /* renamed from: f, reason: collision with root package name */
    public final a5.x0 f304142f;

    public m(b5.w wVar, java.lang.String str, a5.x0 x0Var) {
        this.f304140d = wVar;
        this.f304141e = str;
        this.f304142f = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f304140d.f17900f.f(this.f304141e, this.f304142f);
    }
}
