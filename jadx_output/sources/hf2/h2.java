package hf2;

/* loaded from: classes10.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h84 f281077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.a1 f281078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hf2.l2 f281079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(r45.h84 h84Var, bm2.a1 a1Var, hf2.l2 l2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281077e = h84Var;
        this.f281078f = a1Var;
        this.f281079g = l2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.h2(this.f281077e, this.f281078f, this.f281079g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.h2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0233  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
