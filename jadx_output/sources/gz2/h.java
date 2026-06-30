package gz2;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277737d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gz2.i f277739f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gz2.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277739f = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        gz2.h hVar = new gz2.h(this.f277739f, continuation);
        hVar.f277738e = obj;
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gz2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0035 -> B:5:0x0038). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gz2.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
