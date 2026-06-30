package pk2;

/* loaded from: classes3.dex */
public final class j3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355865d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f355866e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f355867f;

    /* renamed from: g, reason: collision with root package name */
    public int f355868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355869h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f355870i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f355871m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f355872n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(pk2.o9 o9Var, pk2.q3 q3Var, r45.t62 t62Var, com.tencent.mm.plugin.finder.view.e3 e3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355869h = o9Var;
        this.f355870i = q3Var;
        this.f355871m = t62Var;
        this.f355872n = e3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk2.j3(this.f355869h, this.f355870i, this.f355871m, this.f355872n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.j3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        az2.f fVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355868g;
        r45.t62 config = this.f355871m;
        pk2.q3 q3Var = this.f355870i;
        pk2.o9 o9Var = this.f355869h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.MMActivity context = o9Var.f356078d;
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f9y);
            pk2.h3 h3Var = pk2.h3.f355812d;
            kotlin.jvm.internal.o.g(context, "context");
            az2.f fVar2 = new az2.f();
            fVar2.f16128c = 500L;
            new java.lang.ref.WeakReference(context);
            az2.q qVar = new az2.q();
            if (string != null) {
                qVar.f16149c = string;
            }
            qVar.f16150d = h3Var;
            qVar.f16152a = new java.lang.ref.WeakReference(context);
            fVar2.f16127b = qVar;
            fVar2.a();
            this.f355865d = fVar2;
            this.f355866e = q3Var;
            this.f355867f = config;
            this.f355868g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            q3Var.f356189j = new pk2.i3(new v65.n(rVar));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.gc gcVar = q3Var.f356189j;
            kotlin.jvm.internal.o.g(config, "config");
            hb2.i.f280054e.n(config, gcVar);
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
            fVar = fVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (az2.f) this.f355865d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        fVar.b();
        q3Var.f356189j = null;
        if (booleanValue) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_RECOMMEND_CONFIG_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(config.toByteArray()));
            this.f355872n.h();
        } else {
            com.tencent.mars.xlog.Log.e("AnchorRecommendOption", "modifyLiveUserRecommendSetting: cgi fail");
            com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(mMActivity);
            e4Var.f211776c = mMActivity.getResources().getString(com.tencent.mm.R.string.luw);
            e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}
