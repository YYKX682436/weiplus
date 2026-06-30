package hv4;

/* loaded from: classes8.dex */
public final class i implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f285297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.qx5 f285298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hv4.l f285299c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.sn3 f285300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285301e;

    public i(ot0.q qVar, r45.qx5 qx5Var, hv4.l lVar, r45.sn3 sn3Var, java.lang.String str) {
        this.f285297a = qVar;
        this.f285298b = qx5Var;
        this.f285299c = lVar;
        this.f285300d = sn3Var;
        this.f285301e = str;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        byte[] a17 = com.tencent.mm.sdk.platformtools.x.a(bitmap);
        ot0.k1 a18 = ot0.j1.a();
        ot0.q qVar = this.f285297a;
        java.lang.String str3 = this.f285298b.f384341g;
        hv4.l lVar = this.f285299c;
        java.lang.String str4 = lVar.f285308f.f371630o;
        ((ez.w0) a18).getClass();
        com.tencent.mm.pluginsdk.model.app.k0.I(qVar, str3, "", str4, "", a17);
        lVar.E(this.f285300d, this.f285301e);
    }
}
