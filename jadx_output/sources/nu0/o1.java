package nu0;

/* loaded from: classes5.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340051d;

    /* renamed from: e, reason: collision with root package name */
    public int f340052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340053f = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.o1(this.f340053f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[Catch: all -> 0x010a, Exception -> 0x010c, TryCatch #0 {Exception -> 0x010c, blocks: (B:11:0x0022, B:15:0x0027, B:16:0x00c2, B:19:0x002c, B:20:0x00a8, B:22:0x00b8, B:36:0x0097), top: B:2:0x0009, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[LOOP:0: B:27:0x0071->B:29:0x0077, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d A[LOOP:1: B:32:0x0087->B:34:0x008d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.o1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
