package pr0;

/* loaded from: classes14.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xr0.h f357813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr0.d f357814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f357815g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xr0.h hVar, pr0.d dVar, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357813e = hVar;
        this.f357814f = dVar;
        this.f357815g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.c(this.f357813e, this.f357814f, this.f357815g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
