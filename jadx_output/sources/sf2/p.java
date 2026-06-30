package sf2;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407234f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f407232d = hVar;
        this.f407233e = str;
        this.f407234f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.p(this.f407232d, continuation, this.f407233e, this.f407234f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.p pVar = (sf2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.wx1 wx1Var = (r45.wx1) ((xg2.i) this.f407232d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("searchAddPanelSmartBox success, content: ");
        sb6.append(this.f407233e);
        sb6.append(", count: ");
        java.util.LinkedList linkedList = wx1Var.f389552d;
        sb6.append(linkedList != null ? new java.lang.Integer(linkedList.size()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", sb6.toString());
        this.f407234f.f310123d = wx1Var;
        return jz5.f0.f302826a;
    }
}
