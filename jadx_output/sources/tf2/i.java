package tf2;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418923d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f418924e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f418925f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f418926g;

    /* renamed from: h, reason: collision with root package name */
    public int f418927h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tf2.k f418928i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(tf2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418928i = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tf2.i(this.f418928i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tf2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0206 -> B:8:0x0207). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01ee -> B:9:0x020e). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tf2.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
