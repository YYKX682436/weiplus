package hv4;

/* loaded from: classes8.dex */
public final class j implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f285302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hv4.l f285303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.sn3 f285304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285305d;

    public j(ot0.q qVar, hv4.l lVar, r45.sn3 sn3Var, java.lang.String str) {
        this.f285302a = qVar;
        this.f285303b = lVar;
        this.f285304c = sn3Var;
        this.f285305d = str;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        byte[] a17 = com.tencent.mm.sdk.platformtools.x.a(bitmap);
        ot0.k1 a18 = ot0.j1.a();
        ot0.q qVar = this.f285302a;
        hv4.l lVar = this.f285303b;
        java.lang.String str3 = lVar.f285308f.f371630o;
        ((ez.w0) a18).getClass();
        com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", str3, "", a17);
        lVar.E(this.f285304c, this.f285305d);
    }
}
