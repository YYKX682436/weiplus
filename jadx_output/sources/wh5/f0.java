package wh5;

/* loaded from: classes12.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh5.g0 f446056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wh5.v f446057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l70.d f446058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l70.d f446059h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446060i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(wh5.g0 g0Var, wh5.v vVar, l70.d dVar, l70.d dVar2, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446056e = g0Var;
        this.f446057f = vVar;
        this.f446058g = dVar;
        this.f446059h = dVar2;
        this.f446060i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wh5.f0(this.f446056e, this.f446057f, this.f446058g, this.f446059h, this.f446060i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wh5.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh5.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
