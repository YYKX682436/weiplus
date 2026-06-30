package ix5;

/* loaded from: classes16.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f295647d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f295648e;

    /* renamed from: f, reason: collision with root package name */
    public int f295649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295650g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295651h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295652i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295650g = str;
        this.f295651h = str2;
        this.f295652i = str3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix5.j(this.f295650g, this.f295651h, this.f295652i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x02dc  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ix5.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
