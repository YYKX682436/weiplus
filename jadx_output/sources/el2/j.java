package el2;

/* loaded from: classes3.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f253831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f253833f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xg2.h hVar, kotlin.coroutines.Continuation continuation, el2.i0 i0Var, com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        super(2, continuation);
        this.f253831d = hVar;
        this.f253832e = i0Var;
        this.f253833f = finderContact;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new el2.j(this.f253831d, continuation, this.f253832e, this.f253833f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        el2.j jVar = (el2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.nw1 nw1Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.j01 j01Var = (r45.j01) ((xg2.i) this.f253831d).f454393b;
        i95.m c17 = i95.n0.c(c61.ub.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.ub ubVar = (c61.ub) c17;
        android.content.Context context = this.f253832e.f118183e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f253833f;
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        c61.ub.A3(ubVar, activity, intent, finderContact, 1012, true, java.lang.Boolean.valueOf(((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0)) > 0), null, false, j01Var, null, 704, null);
        return jz5.f0.f302826a;
    }
}
