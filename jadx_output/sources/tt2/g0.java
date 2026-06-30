package tt2;

/* loaded from: classes2.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421911d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f421912e;

    /* renamed from: f, reason: collision with root package name */
    public int f421913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f421914g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f421915h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421914g = h0Var;
        this.f421915h = h0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tt2.g0(this.f421914g, this.f421915h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tt2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f421913f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.h0 h0Var2 = this.f421914g;
            if (h0Var2.f310123d != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveGetProductPromoteReplayWidgetResponse has_replay:");
                r45.ju1 ju1Var = (r45.ju1) h0Var2.f310123d;
                sb6.append(ju1Var != null ? java.lang.Boolean.valueOf(ju1Var.getBoolean(0)) : null);
                sb6.append(", video_url:");
                r45.ju1 ju1Var2 = (r45.ju1) h0Var2.f310123d;
                sb6.append(ju1Var2 != null ? ju1Var2.getString(1) : null);
                sb6.append(", video_img_url:");
                r45.ju1 ju1Var3 = (r45.ju1) h0Var2.f310123d;
                sb6.append(ju1Var3 != null ? ju1Var3.getString(2) : null);
                com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListAdapter", sb6.toString());
                r45.ju1 ju1Var4 = (r45.ju1) h0Var2.f310123d;
                if (ju1Var4 != null && ju1Var4.getBoolean(0)) {
                    r45.ju1 ju1Var5 = (r45.ju1) h0Var2.f310123d;
                    java.lang.String string = ju1Var5 != null ? ju1Var5.getString(2) : null;
                    if (!(string == null || string.length() == 0)) {
                        r45.ju1 ju1Var6 = (r45.ju1) h0Var2.f310123d;
                        if (ju1Var6 == null || (str = ju1Var6.getString(2)) == null) {
                            str = "";
                        }
                        this.f421911d = str;
                        kotlin.jvm.internal.h0 h0Var3 = this.f421915h;
                        this.f421912e = h0Var3;
                        this.f421913f = 1;
                        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                        rVar.k();
                        v65.n nVar = new v65.n(rVar);
                        mn2.g1 g1Var = mn2.g1.f329975a;
                        wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329965s));
                        tt2.f0 f0Var = new tt2.f0(nVar);
                        b17.getClass();
                        b17.f447873d = f0Var;
                        b17.f();
                        obj = rVar.j();
                        if (obj == aVar) {
                            return aVar;
                        }
                        h0Var = h0Var3;
                    }
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h0Var = (kotlin.jvm.internal.h0) this.f421912e;
        kotlin.ResultKt.throwOnFailure(obj);
        h0Var.f310123d = obj;
        return jz5.f0.f302826a;
    }
}
