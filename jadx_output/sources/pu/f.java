package pu;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358294d;

    /* renamed from: e, reason: collision with root package name */
    public int f358295e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f358297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f358298h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ru.j f358299i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlinx.coroutines.r2 r2Var, kotlin.jvm.internal.h0 h0Var, ru.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358297g = r2Var;
        this.f358298h = h0Var;
        this.f358299i = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pu.f fVar = new pu.f(this.f358297g, this.f358298h, this.f358299i, continuation);
        fVar.f358296f = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
