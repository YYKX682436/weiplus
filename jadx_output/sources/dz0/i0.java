package dz0;

/* loaded from: classes5.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.yb f244876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f244877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f244878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244879h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244880i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(az0.yb ybVar, yz5.l lVar, kotlin.jvm.internal.g0 g0Var, com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244876e = ybVar;
        this.f244877f = lVar;
        this.f244878g = g0Var;
        this.f244879h = maasSdkUIC;
        this.f244880i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.i0(this.f244876e, this.f244877f, this.f244878g, this.f244879h, this.f244880i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
