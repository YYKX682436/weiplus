package df2;

/* loaded from: classes3.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f229925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.g f229926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f229927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.g gVar, kotlinx.coroutines.y0 y0Var) {
        super(2, continuation);
        this.f229925d = hVar;
        this.f229926e = gVar;
        this.f229927f = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.d(this.f229925d, continuation, this.f229926e, this.f229927f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.d dVar = (df2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.j01 j01Var = (r45.j01) ((xg2.i) this.f229925d).f454393b;
        ya2.g gVar = ya2.h.f460484a;
        df2.g gVar2 = this.f229926e;
        ya2.b2 b17 = gVar.b(((mm2.c1) gVar2.getStore().business(mm2.c1.class)).f328852o);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (b17 != null) {
            com.tencent.mm.protocal.protobuf.FinderContact i17 = ya2.d.i(b17);
            java.lang.String valueOf = java.lang.String.valueOf(c01.id.c());
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            ml2.l1 l1Var = ml2.l1.f327686m;
            y4Var.getClass();
            y4Var.f328295e0 = l1Var;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Ij(ml2.y2.f328253f, "", "", valueOf);
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.app.Activity activity = (android.app.Activity) gVar2.O6();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_SELECT_UNSPECIFIC_NOTICE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_SESSION_ID", valueOf);
            obj2 = mm2.c1.class;
            c61.ub.A3((c61.ub) c17, activity, intent, i17, 1012, true, java.lang.Boolean.TRUE, null, false, j01Var, null, 704, null);
            gVar2.m7("ClickBtn", false);
            f0Var = f0Var2;
        } else {
            obj2 = mm2.c1.class;
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("CreateNextNoticeGuide", "showBubble: finder contact is null, username=" + ((mm2.c1) gVar2.getStore().business(obj2)).f328852o);
        }
        return f0Var2;
    }
}
