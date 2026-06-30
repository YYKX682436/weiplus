package wo1;

/* loaded from: classes5.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f448048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f448049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f448051g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f448052h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f448053i;

    public x0(android.net.Uri uri, po1.d dVar, java.lang.String str, com.tencent.mm.ui.widget.dialog.u3 u3Var, wo1.a1 a1Var, long j17) {
        this.f448048d = uri;
        this.f448049e = dVar;
        this.f448050f = str;
        this.f448051g = u3Var;
        this.f448052h = a1Var;
        this.f448053i = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        to1.g gVar = to1.g.f420911a;
        po1.d a17 = po1.d.a(this.f448049e, null, null, null, null, this.f448050f, null, null, 111, null);
        po1.d dVar = this.f448049e;
        java.lang.String str = dVar.f357299e;
        android.net.Uri uri = this.f448048d;
        fo1.n g17 = gVar.g(uri, a17, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "result of save old device=" + g17 + ", device=" + dVar + ", path=" + this.f448050f + ", uri=" + uri);
        nf.e.f(new wo1.w0(this.f448051g, g17, this.f448052h, this.f448049e, this.f448053i));
    }
}
