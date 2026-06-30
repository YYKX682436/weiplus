package hg2;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f281379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f281380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f281381g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.eu0 f281382h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281383i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281384m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(gk2.e eVar, android.content.Context context, com.tencent.mm.plugin.finder.live.view.k0 k0Var, r45.eu0 eu0Var, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281379e = eVar;
        this.f281380f = context;
        this.f281381g = k0Var;
        this.f281382h = eu0Var;
        this.f281383i = str;
        this.f281384m = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hg2.o(this.f281379e, this.f281380f, this.f281381g, this.f281382h, this.f281383i, this.f281384m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hg2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281378d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean l76 = ((mm2.c1) this.f281379e.a(mm2.c1.class)).l7();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            hg2.n nVar = new hg2.n(l76, this.f281381g, null);
            this.f281378d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        l81.b1 b1Var = new l81.b1();
        r45.eu0 eu0Var = this.f281382h;
        java.lang.String str2 = this.f281383i;
        java.lang.String str3 = this.f281384m;
        gk2.e eVar = this.f281379e;
        java.lang.String string = eu0Var.getString(0);
        java.lang.String string2 = eu0Var.getString(1);
        b1Var.f317014b = string;
        b1Var.f317022f = string2;
        b1Var.f317032k = 1205;
        com.tencent.mm.plugin.appbrand.config.l lVar = new com.tencent.mm.plugin.appbrand.config.l();
        float f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        if (com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation == 2) {
            f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        }
        lVar.f77522b = (int) ((ae2.in.f3688a.h0() / 100.0f) * f17);
        lVar.f77526f = k91.s2.f305760d;
        lVar.f77534n = false;
        lVar.f77531k = k91.t2.f305768f;
        b1Var.G = lVar.a();
        b1Var.f317028i = new hg2.m(str2, str3, eVar, str);
        dk2.q4.f233938a.n(this.f281380f, this.f281379e, b1Var, this.f281381g);
        return jz5.f0.f302826a;
    }
}
