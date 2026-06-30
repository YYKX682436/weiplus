package df2;

/* loaded from: classes.dex */
public final class kq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230594d;

    /* renamed from: e, reason: collision with root package name */
    public int f230595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.ar f230596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(df2.ar arVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230596f = arVar;
        this.f230597g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.kq(this.f230596f, this.f230597g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.kq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.kq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
