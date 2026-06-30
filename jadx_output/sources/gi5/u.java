package gi5;

/* loaded from: classes12.dex */
public final class u implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mf3.k f272334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gi5.v f272335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gg3.c f272336c;

    public u(mf3.k kVar, gi5.v vVar, gg3.c cVar) {
        this.f272334a = kVar;
        this.f272335b = vVar;
        this.f272336c = cVar;
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        dn.g gVar;
        dn.g gVar2;
        float f17 = (n1Var == null || (gVar2 = n1Var.f71107e) == null) ? 0.0f : (float) gVar2.field_finishedLength;
        float f18 = (n1Var == null || (gVar = n1Var.f71107e) == null) ? -1.0f : (float) gVar.field_toltalLength;
        float f19 = f17 / f18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgress: ");
        mf3.k kVar = this.f272334a;
        sb6.append(kVar.getId());
        sb6.append(", progress: ");
        sb6.append(f19);
        sb6.append('(');
        sb6.append(f17);
        sb6.append('/');
        sb6.append(f18);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MediaGallery.RecordVideoStateManager", sb6.toString());
        this.f272335b.W6(kVar, gg3.d.f271732d, this.f272336c, new gg3.e(null, 0, f19, 3, null));
    }
}
