package i81;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f289597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.yc f289599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i81.q f289600g;

    public l(i81.q qVar, boolean z17, java.lang.String str, com.tencent.mm.plugin.appbrand.ui.yc ycVar) {
        this.f289600g = qVar;
        this.f289597d = z17;
        this.f289598e = str;
        this.f289599f = ycVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f289600g.a(this.f289597d, this.f289598e, this.f289599f);
    }
}
