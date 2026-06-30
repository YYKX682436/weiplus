package id2;

/* loaded from: classes3.dex */
public final class i4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f290617d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f290618e;

    /* renamed from: f, reason: collision with root package name */
    public int f290619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ id2.j4 f290620g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(id2.j4 j4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290620g = j4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.i4(this.f290620g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.i4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0205 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0281  */
    /* JADX WARN: Type inference failed for: r7v10, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.i4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
