package vj4;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f437684d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f437685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vj4.d f437686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437687g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.l5 f437688h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vj4.d dVar, java.lang.String str, com.tencent.mm.plugin.appbrand.service.l5 l5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f437686f = dVar;
        this.f437687g = str;
        this.f437688h = l5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        vj4.c cVar = new vj4.c(this.f437686f, this.f437687g, this.f437688h, continuation);
        cVar.f437685e = obj;
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vj4.c) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e7 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vj4.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
