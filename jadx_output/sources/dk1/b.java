package dk1;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f233112d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f233113e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f233114f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f233115g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f233116h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f233117i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f233118m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f233119n;

    /* renamed from: o, reason: collision with root package name */
    public int f233120o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f233121p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage f233122q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ak1.a f233123r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ dk1.k f233124s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage appBrandPrivacyUseRecordPage, ak1.a aVar, dk1.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233121p = h0Var;
        this.f233122q = appBrandPrivacyUseRecordPage;
        this.f233123r = aVar;
        this.f233124s = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk1.b(this.f233121p, this.f233122q, this.f233123r, this.f233124s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c6  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk1.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
