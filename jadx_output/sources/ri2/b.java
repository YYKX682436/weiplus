package ri2;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396041d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f396042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ri2.j f396043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ri2.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396043f = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ri2.b bVar = new ri2.b(this.f396043f, continuation);
        bVar.f396042e = obj;
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ri2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:5:0x0059). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri2.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
