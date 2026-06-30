package jg0;

/* loaded from: classes12.dex */
public final class m extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f299589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.d0 f299591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(jg0.x xVar, qi3.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f299590e = xVar;
        this.f299591f = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new jg0.m(this.f299590e, this.f299591f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((jg0.m) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x025e  */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.CharSequence, java.lang.String] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
