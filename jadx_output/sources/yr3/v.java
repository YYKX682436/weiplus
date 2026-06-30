package yr3;

/* loaded from: classes.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f465052d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f465053e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f465054f;

    /* renamed from: g, reason: collision with root package name */
    public int f465055g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f465056h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.p f465057i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465056h = str;
        this.f465057i = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yr3.v(this.f465056h, this.f465057i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yr3.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00de A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr3.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
