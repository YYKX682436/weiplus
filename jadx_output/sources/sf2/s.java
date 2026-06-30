package sf2;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407269f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f407267d = hVar;
        this.f407268e = str;
        this.f407269f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.s(this.f407267d, continuation, this.f407268e, this.f407269f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.s sVar = (sf2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.ux1 ux1Var = (r45.ux1) ((xg2.i) this.f407267d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("searchAddPanelKtvMusic success, realKey: ");
        sb6.append(this.f407268e);
        sb6.append(", count: ");
        java.util.LinkedList linkedList = ux1Var.f387713d;
        sb6.append(linkedList != null ? new java.lang.Integer(linkedList.size()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", sb6.toString());
        this.f407269f.f310123d = ux1Var;
        return jz5.f0.f302826a;
    }
}
