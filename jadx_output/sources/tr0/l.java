package tr0;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public long f421320d;

    /* renamed from: e, reason: collision with root package name */
    public int f421321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f421323g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tr0.t tVar, java.lang.Boolean bool, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f421322f = tVar;
        this.f421323g = bool;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new tr0.l(this.f421322f, this.f421323g, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((tr0.l) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[LOOP:0: B:33:0x00ed->B:34:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
