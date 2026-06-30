package cq2;

/* loaded from: classes2.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f221389d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f221390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f221391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f221392g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f221393h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f221394i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ys5.e f221395m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ aq2.k f221396n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r45.fa2 fa2Var, int i17, int i18, com.tencent.mm.protobuf.g gVar, ys5.e eVar, aq2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f221391f = fa2Var;
        this.f221392g = i17;
        this.f221393h = i18;
        this.f221394i = gVar;
        this.f221395m = eVar;
        this.f221396n = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        cq2.h hVar = new cq2.h(this.f221391f, this.f221392g, this.f221393h, this.f221394i, this.f221395m, this.f221396n, continuation);
        hVar.f221390e = obj;
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cq2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00dc  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cq2.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
