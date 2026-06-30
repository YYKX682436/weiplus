package qf2;

/* loaded from: classes.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362341d;

    /* renamed from: e, reason: collision with root package name */
    public int f362342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f362343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km2.c f362344g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362345h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f362346i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362347m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(dk2.u4 u4Var, km2.c cVar, qf2.y1 y1Var, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362343f = u4Var;
        this.f362344g = cVar;
        this.f362345h = y1Var;
        this.f362346i = z17;
        this.f362347m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.e1(this.f362343f, this.f362344g, this.f362345h, this.f362346i, this.f362347m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x014a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
