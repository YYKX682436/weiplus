package vt2;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439951d;

    /* renamed from: e, reason: collision with root package name */
    public int f439952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt2.g f439953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gk2.e f439954g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.i56 f439955h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vt2.g gVar, gk2.e eVar, r45.i56 i56Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439953f = gVar;
        this.f439954g = eVar;
        this.f439955h = i56Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vt2.f(this.f439953f, this.f439954g, this.f439955h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vt2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f439952e;
        gk2.e eVar = this.f439954g;
        vt2.g gVar = this.f439953f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.app.Activity activity = gVar.f439956a;
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(activity, activity.getString(com.tencent.mm.R.string.f490604zq), false, 3, null);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            vt2.e eVar2 = new vt2.e(gVar, eVar, this.f439955h, null);
            this.f439951d = f17;
            this.f439952e = 1;
            java.lang.Object g17 = kotlinx.coroutines.l.g(p0Var, eVar2, this);
            if (g17 == aVar) {
                return aVar;
            }
            u3Var = f17;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f439951d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        java.util.List a17 = ((mm2.f6) eVar.a(mm2.f6.class)).f329039o.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : a17) {
            so2.j5 j5Var = (so2.j5) obj2;
            if ((j5Var instanceof cm2.i0) || ((j5Var instanceof cm2.m0) && ((cm2.m0) j5Var).f43368v.getInteger(42) != 10)) {
                arrayList.add(obj2);
            }
        }
        if (lVar != null) {
            gVar.f439958c.clear();
            gVar.f439958c.addAll(arrayList);
            vt2.j jVar = gVar.f439959d;
            if (jVar != null) {
                pm0.v.X(new vt2.i(jVar));
            }
        }
        u3Var.dismiss();
        return jz5.f0.f302826a;
    }
}
