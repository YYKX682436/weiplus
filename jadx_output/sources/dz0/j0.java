package dz0;

/* loaded from: classes5.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244888d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f244889e;

    /* renamed from: f, reason: collision with root package name */
    public int f244890f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244891g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dz0.k0 f244892h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244893i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f244894m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244895n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m5 f244896o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(dz0.k0 k0Var, java.lang.String str, yz5.l lVar, com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244892h = k0Var;
        this.f244893i = str;
        this.f244894m = lVar;
        this.f244895n = maasSdkUIC;
        this.f244896o = m5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        dz0.j0 j0Var = new dz0.j0(this.f244892h, this.f244893i, this.f244894m, this.f244895n, this.f244896o, continuation);
        j0Var.f244891g = obj;
        return j0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0134  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
