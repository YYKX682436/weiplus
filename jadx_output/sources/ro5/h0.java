package ro5;

/* loaded from: classes14.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f398202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ to5.a f398204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ro5.m1 m1Var, to5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398203e = m1Var;
        this.f398204f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ro5.h0(this.f398203e, this.f398204f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ro5.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro5.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
