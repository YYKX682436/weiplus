package ht2;

/* loaded from: classes2.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f284883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tl2 f284884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f284886g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284887h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f284888i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f284889m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f284890n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f284891o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r45.tl2 tl2Var, ht2.y0 y0Var, android.widget.LinearLayout linearLayout, java.lang.String str, android.view.ViewGroup viewGroup, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, zy2.r6 r6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284884e = tl2Var;
        this.f284885f = y0Var;
        this.f284886g = linearLayout;
        this.f284887h = str;
        this.f284888i = viewGroup;
        this.f284889m = c0Var;
        this.f284890n = c0Var2;
        this.f284891o = r6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ht2.p0(this.f284884e, this.f284885f, this.f284886g, this.f284887h, this.f284888i, this.f284889m, this.f284890n, this.f284891o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ht2.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Lc;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f284883d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(zy.u.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy.w p37 = zy.u.p3((zy.u) c17, null, 1, null);
            r45.tl2 tl2Var = this.f284884e;
            java.lang.String string = tl2Var.getString(1);
            java.lang.String string2 = tl2Var.getString(2);
            this.f284883d = 1;
            Lc = zy.w.Lc(p37, string, false, string2, 0, 0, null, null, this, 120, null);
            if (Lc == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            Lc = obj;
        }
        jz5.o oVar = (jz5.o) Lc;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        ht2.o0 o0Var = new ht2.o0(oVar, this.f284885f, this.f284886g, this.f284887h, this.f284888i, this.f284889m, this.f284890n, this.f284891o, null);
        this.f284883d = 2;
        if (kotlinx.coroutines.l.g(g3Var, o0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
