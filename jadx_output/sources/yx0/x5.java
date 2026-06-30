package yx0;

/* loaded from: classes5.dex */
public final class x5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f467760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f467761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camerafun.MJAuditCaptureSettings f467763h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467764i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467765m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(int i17, boolean z17, yx0.b8 b8Var, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467760e = i17;
        this.f467761f = z17;
        this.f467762g = b8Var;
        this.f467763h = mJAuditCaptureSettings;
        this.f467764i = str;
        this.f467765m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.x5(this.f467760e, this.f467761f, this.f467762g, this.f467763h, this.f467764i, this.f467765m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.x5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.x5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
