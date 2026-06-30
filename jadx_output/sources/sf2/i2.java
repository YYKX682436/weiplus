package sf2;

/* loaded from: classes10.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f407169d = hVar;
        this.f407170e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.i2(this.f407169d, continuation, this.f407170e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.i2 i2Var = (sf2.i2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.kx1 kx1Var = (r45.kx1) ((xg2.i) this.f407169d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveKtvGetSongSungListRequest success, songHasSung ");
        java.util.LinkedList<r45.yx1> song_sung_list = kx1Var.f379014d;
        kotlin.jvm.internal.o.f(song_sung_list, "song_sung_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(song_sung_list, 10));
        for (r45.yx1 yx1Var : song_sung_list) {
            arrayList.add(yx1Var.f391458d + ": " + yx1Var.f391466o.f371143d.f370351e + ", status " + yx1Var.f391464m);
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", sb6.toString());
        this.f407170e.f310123d = kx1Var;
        return jz5.f0.f302826a;
    }
}
