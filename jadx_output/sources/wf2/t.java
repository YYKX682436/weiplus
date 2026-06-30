package wf2;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f445618d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f445619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wf2.a0 f445620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445621g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(wf2.a0 a0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f445620f = a0Var;
        this.f445621g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wf2.t tVar = new wf2.t(this.f445620f, this.f445621g, continuation);
        tVar.f445619e = obj;
        return tVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wf2.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
