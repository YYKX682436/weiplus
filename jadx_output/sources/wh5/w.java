package wh5;

/* loaded from: classes12.dex */
public final class w implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final wh5.v f446099a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f446100b;

    /* renamed from: c, reason: collision with root package name */
    public final l70.d f446101c;

    /* renamed from: d, reason: collision with root package name */
    public final l70.d f446102d;

    /* renamed from: e, reason: collision with root package name */
    public final float f446103e;

    /* renamed from: f, reason: collision with root package name */
    public final float f446104f;

    /* renamed from: g, reason: collision with root package name */
    public float f446105g;

    /* renamed from: h, reason: collision with root package name */
    public float f446106h;

    public w(wh5.v mediaInfo, yz5.l progressCallback) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(progressCallback, "progressCallback");
        this.f446099a = mediaInfo;
        this.f446100b = progressCallback;
        this.f446101c = mediaInfo.d();
        this.f446102d = mediaInfo.h();
        this.f446103e = 0.5f;
        this.f446104f = 0.5f;
        j15.d dVar = new j15.d();
        java.lang.String j17 = mediaInfo.f446096a.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        dVar.fromXml(j17);
        long r17 = dVar.o().r();
        j15.c t17 = dVar.o().t();
        long o17 = t17 != null ? t17.o() : 1L;
        float f17 = (float) r17;
        float f18 = (float) (r17 + o17);
        this.f446103e = f17 / f18;
        this.f446104f = ((float) o17) / f18;
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        dn.g gVar;
        dn.g gVar2;
        dn.g gVar3;
        dn.g gVar4;
        java.lang.String str = n1Var != null ? n1Var.f71104b : null;
        l70.d dVar = this.f446101c;
        boolean b17 = kotlin.jvm.internal.o.b(str, dVar != null ? dVar.f316804e : null);
        float f17 = -1.0f;
        float f18 = 0.0f;
        wh5.v vVar = this.f446099a;
        if (b17) {
            float f19 = (n1Var == null || (gVar4 = n1Var.f71107e) == null) ? 0.0f : (float) gVar4.field_finishedLength;
            float f27 = (n1Var == null || (gVar3 = n1Var.f71107e) == null) ? -1.0f : (float) gVar3.field_toltalLength;
            vVar.getId();
            this.f446105g = f19 / f27;
        }
        java.lang.String str2 = n1Var != null ? n1Var.f71104b : null;
        l70.d dVar2 = this.f446102d;
        if (kotlin.jvm.internal.o.b(str2, dVar2 != null ? dVar2.f316804e : null)) {
            if (n1Var != null && (gVar2 = n1Var.f71107e) != null) {
                f18 = (float) gVar2.field_finishedLength;
            }
            if (n1Var != null && (gVar = n1Var.f71107e) != null) {
                f17 = (float) gVar.field_toltalLength;
            }
            vVar.getId();
            this.f446106h = f18 / f17;
        }
        float f28 = this.f446105g;
        float f29 = this.f446103e;
        float f37 = this.f446106h;
        float f38 = this.f446104f;
        float f39 = (f28 * f29) + (f37 * f38);
        com.tencent.mars.xlog.Log.i("MediaGallery.ChatLiveStateManager", "mediaId: " + vVar.getId() + " onFinalProgress: " + f39 + " = " + this.f446105g + " * " + f29 + " + " + this.f446106h + " * " + f38);
        this.f446100b.invoke(java.lang.Float.valueOf(f39));
    }
}
