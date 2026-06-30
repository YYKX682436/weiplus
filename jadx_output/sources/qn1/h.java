package qn1;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f364987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f364988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qn1.d f364989f;

    public h(qn1.d dVar, int i17, int i18) {
        this.f364989f = dVar;
        this.f364987d = i17;
        this.f364988e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        qn1.c.i().k().e();
        this.f364989f.f(this.f364987d, this.f364988e);
    }
}
