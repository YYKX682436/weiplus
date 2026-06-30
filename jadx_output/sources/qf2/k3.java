package qf2;

/* loaded from: classes.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362451d;

    /* renamed from: e, reason: collision with root package name */
    public int f362452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f362453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oi2.a f362454g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(qf2.q3 q3Var, oi2.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362453f = q3Var;
        this.f362454g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.k3(this.f362453f, this.f362454g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.k3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0184  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.k3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
