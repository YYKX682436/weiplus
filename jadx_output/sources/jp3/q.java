package jp3;

/* loaded from: classes.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f301023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301024e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301023d = z17;
        this.f301024e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jp3.q(this.f301023d, this.f301024e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jp3.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jp3.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
