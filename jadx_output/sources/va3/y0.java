package va3;

/* loaded from: classes9.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q21.c f434389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434392g;

    public y0(va3.z0 z0Var, q21.c cVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f434389d = cVar;
        this.f434390e = str;
        this.f434391f = str2;
        this.f434392g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f434389d.d(this.f434390e, this.f434391f, this.f434392g);
    }
}
