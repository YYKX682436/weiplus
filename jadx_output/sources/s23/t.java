package s23;

/* loaded from: classes4.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f402332d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f402333e;

    /* renamed from: f, reason: collision with root package name */
    public int f402334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s23.x f402335g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s23.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f402335g = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s23.t(this.f402335g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s23.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x02a8, code lost:
    
        if (r5 < r12) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c2 A[LOOP:0: B:18:0x0169->B:53:0x02c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ce A[SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s23.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
