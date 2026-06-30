package ep4;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f255733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ep4.j f255734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255736g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.jvm.internal.c0 c0Var, ep4.j jVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255733d = c0Var;
        this.f255734e = jVar;
        this.f255735f = str;
        this.f255736g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ep4.d(this.f255733d, this.f255734e, this.f255735f, this.f255736g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ep4.d dVar = (ep4.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0146 A[LOOP:0: B:13:0x00a8->B:35:0x0146, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126 A[EDGE_INSN: B:36:0x0126->B:37:0x0126 BREAK  A[LOOP:0: B:13:0x00a8->B:35:0x0146], SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep4.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
