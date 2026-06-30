package vf2;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436333d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f436334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vf2.q f436335f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vf2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436335f = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        vf2.e eVar = new vf2.e(this.f436335f, continuation);
        eVar.f436334e = obj;
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vf2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ca  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vf2.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
