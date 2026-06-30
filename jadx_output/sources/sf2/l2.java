package sf2;

/* loaded from: classes10.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f407196d = hVar;
        this.f407197e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.l2(this.f407196d, continuation, this.f407197e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.l2 l2Var = (sf2.l2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.LinkedList<r45.yx1> linkedList;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.gx1 gx1Var = (r45.gx1) ((xg2.i) this.f407196d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveKtvGetSongListRequest success, songToSing ");
        r45.zx1 zx1Var = gx1Var.f375593d;
        if (zx1Var == null || (linkedList = zx1Var.f392452d) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.yx1 yx1Var : linkedList) {
                arrayList.add(yx1Var.f391458d + ": " + yx1Var.f391466o.f371143d.f370351e + ", status " + yx1Var.f391464m);
            }
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongController", sb6.toString());
        this.f407197e.f310123d = gx1Var;
        return jz5.f0.f302826a;
    }
}
