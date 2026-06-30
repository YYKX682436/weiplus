package fj3;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f263210d;

    /* renamed from: e, reason: collision with root package name */
    public int f263211e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f263212f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fj3.k f263213g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fj3.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f263213g = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        fj3.j jVar = new fj3.j(this.f263213g, continuation);
        jVar.f263212f = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fj3.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(1:(1:(1:(3:6|7|8)(2:10|11))(14:12|13|14|15|16|17|18|(1:20)|21|(1:23)|24|(1:26)(1:37)|27|(4:29|(1:31)|7|8)(14:32|33|34|(1:36)|16|17|18|(0)|21|(0)|24|(0)(0)|27|(0)(0))))(1:44))(2:46|(1:48)(1:49))|45|33|34|(0)|16|17|18|(0)|21|(0)|24|(0)(0)|27|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x007c -> B:16:0x007f). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fj3.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
