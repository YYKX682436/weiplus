package g4;

/* loaded from: classes5.dex */
public final class q1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268502d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f268503e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f268504f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268505g;

    /* renamed from: h, reason: collision with root package name */
    public int f268506h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g4.t1 f268507i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(g4.t1 t1Var, g4.f4 f4Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f268507i = t1Var;
    }

    @Override // yz5.q
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) obj3;
        kotlin.jvm.internal.o.g(continuation, "continuation");
        g4.q1 q1Var = new g4.q1(this.f268507i, null, continuation);
        q1Var.f268502d = (g4.m1) obj;
        q1Var.f268503e = booleanValue;
        return q1Var.invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ee  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00bf -> B:52:0x00c3). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
