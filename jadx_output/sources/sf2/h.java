package sf2;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407153e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f407152d = hVar;
        this.f407153e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.h(this.f407152d, continuation, this.f407153e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.h hVar = (sf2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.zw1 zw1Var = (r45.zw1) ((xg2.i) this.f407152d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAddPanelTabSongList success, song count: ");
        sb6.append((zw1Var == null || (linkedList = zw1Var.f392415d) == null) ? null : new java.lang.Integer(linkedList.size()));
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", sb6.toString());
        this.f407153e.f310123d = zw1Var;
        return jz5.f0.f302826a;
    }
}
