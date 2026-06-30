package xc5;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f453441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc5.l f453442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f453443f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf3.a f453444g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f453445h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f453446i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, xc5.l lVar, int i17, qf3.a aVar, java.util.List list2, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453441d = list;
        this.f453442e = lVar;
        this.f453443f = i17;
        this.f453444g = aVar;
        this.f453445h = list2;
        this.f453446i = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.f(this.f453441d, this.f453442e, this.f453443f, this.f453444g, this.f453445h, this.f453446i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xc5.f fVar = (xc5.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List list = this.f453441d;
        boolean z17 = !list.isEmpty();
        qf3.a aVar2 = this.f453444g;
        xc5.l lVar = this.f453442e;
        if (z17) {
            lVar.f453522d.addAll(0, list);
            lVar.f453526h = this.f453443f;
            aVar2.h1(lVar.f453522d, new java.util.ArrayList(list));
        }
        java.util.List list2 = this.f453445h;
        if (!list2.isEmpty()) {
            lVar.f453522d.addAll(list2);
            lVar.f453527i = this.f453446i;
            ((lf3.c0) aVar2).W6(lVar.f453522d, new java.util.ArrayList(list2));
        }
        if (!list.isEmpty()) {
            aVar2.T3(list.size());
        }
        lVar.f453530o = true;
        return jz5.f0.f302826a;
    }
}
