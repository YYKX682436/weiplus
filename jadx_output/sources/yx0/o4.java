package yx0;

/* loaded from: classes5.dex */
public final class o4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467505d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467506e;

    /* renamed from: f, reason: collision with root package name */
    public int f467507f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467508g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f467509h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(yx0.b8 b8Var, pp0.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467508g = b8Var;
        this.f467509h = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.o4(this.f467508g, this.f467509h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.o4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0200 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x021e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.o4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
