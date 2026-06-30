package pu;

/* loaded from: classes12.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358402d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f358404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f358405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qi3.f0 f358406h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f358407i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pu.f0 f358408m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, qi3.f0 f0Var, ut.q0 q0Var, pu.f0 f0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358404f = c0Var;
        this.f358405g = msgIdTalker;
        this.f358406h = f0Var;
        this.f358407i = q0Var;
        this.f358408m = f0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pu.z zVar = new pu.z(this.f358404f, this.f358405g, this.f358406h, this.f358407i, this.f358408m, continuation);
        zVar.f358403e = obj;
        return zVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
