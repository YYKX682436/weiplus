package mm2;

/* loaded from: classes3.dex */
public final class z4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f329603d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f329604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.e5 f329605f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(mm2.e5 e5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329605f = e5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mm2.z4 z4Var = new mm2.z4(this.f329605f, continuation);
        z4Var.f329604e = obj;
        return z4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.z4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009d -> B:5:0x00a0). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.z4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
