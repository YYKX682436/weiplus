package st2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f412381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f412383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(st2.h1 h1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f412382e = h1Var;
        this.f412383f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new st2.k(this.f412382e, this.f412383f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((st2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Ni;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f412381d;
        st2.h1 h1Var = this.f412382e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.feature.finder.live.z5 z5Var = (com.tencent.mm.feature.finder.live.z5) i95.n0.c(com.tencent.mm.feature.finder.live.z5.class);
            android.content.Context context = h1Var.f412333d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gk2.e eVar = h1Var.f412335f;
            this.f412381d = 1;
            Ni = z5Var.Ni(context, 0L, eVar, 1, true, false, this);
            if (Ni == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            Ni = obj;
        }
        r45.s42 s42Var = (r45.s42) Ni;
        java.util.LinkedList<r45.q42> list = s42Var != null ? s42Var.getList(1) : null;
        if ((list == null || list.isEmpty()) || !h1Var.z()) {
            h1Var.r();
        } else {
            h1Var.i().setVisibility(0);
            if (h1Var.f412332J == null) {
                android.content.Context context2 = h1Var.f412333d.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                xt2.u1 u1Var = new xt2.u1(context2, 0L, 1, new st2.i(h1Var, null));
                h1Var.i().removeAllViews();
                h1Var.i().addView(u1Var.d(), -1, -2);
                h1Var.h().setTranslationYChangedListener(new st2.j(h1Var));
                h1Var.f412332J = u1Var;
            }
            xt2.u1 u1Var2 = h1Var.f412332J;
            if (u1Var2 != null) {
                u1Var2.f(s42Var);
            }
            if (this.f412383f) {
                h1Var.getClass();
                for (r45.q42 q42Var : list) {
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.r0 r0Var = (ml2.r0) c17;
                    ml2.f4 f4Var = ml2.f4.Q;
                    java.lang.String u17 = pm0.v.u(q42Var.getLong(1));
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("cur_page_type", 1);
                    jSONObject.put("bubble_type", q42Var.getInteger(2));
                    ml2.r0.Dj(r0Var, f4Var, null, u17, null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
