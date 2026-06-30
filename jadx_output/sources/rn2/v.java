package rn2;

/* loaded from: classes15.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397890d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f397891e;

    /* renamed from: f, reason: collision with root package name */
    public int f397892f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397893g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rn2.w f397894h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(rn2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397894h = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        rn2.v vVar = new rn2.v(this.f397894h, continuation);
        vVar.f397893g = obj;
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
