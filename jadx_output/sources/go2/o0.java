package go2;

/* loaded from: classes5.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f274034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f274035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f274036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274037g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f274038h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f274039i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f274040m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f274041n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274042o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274043p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f274044q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(boolean z17, go2.a1 a1Var, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i17, android.widget.Button button, android.view.View view, android.view.View view2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f274035e = z17;
        this.f274036f = a1Var;
        this.f274037g = str;
        this.f274038h = num;
        this.f274039i = num2;
        this.f274040m = i17;
        this.f274041n = button;
        this.f274042o = view;
        this.f274043p = view2;
        this.f274044q = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new go2.o0(this.f274035e, this.f274036f, this.f274037g, this.f274038h, this.f274039i, this.f274040m, this.f274041n, this.f274042o, this.f274043p, this.f274044q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((go2.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f274034d;
        java.lang.String str = this.f274037g;
        boolean z17 = this.f274035e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("Finder.FinderMemberPayUIC", "doPay subscribe: " + z17);
            go2.a1 a1Var = this.f274036f;
            a1Var.f273948e = false;
            a1Var.f273949f = str;
            android.app.Activity context = a1Var.getContext();
            java.lang.String str2 = this.f274037g;
            int intValue = this.f274038h.intValue();
            java.lang.Integer num = this.f274039i;
            boolean z18 = this.f274035e;
            int i18 = this.f274040m;
            this.f274034d = 1;
            obj = a1Var.Q6(context, str2, intValue, num, z18, i18, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        go2.d0 d0Var = (go2.d0) obj;
        go2.a1 a1Var2 = this.f274036f;
        a1Var2.f273950g = false;
        this.f274041n.setClickable(true);
        this.f274042o.setClickable(true);
        this.f274043p.setClickable(true);
        if (z17) {
            a1Var2.f273948e = d0Var.f273960a;
        } else {
            go2.a1.O6(a1Var2, a1Var2.getContext());
            if (d0Var.f273960a) {
                a1Var2.P6(a1Var2.getContext(), str, false, false);
            }
        }
        yz5.l lVar = this.f274044q;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(d0Var.f273960a));
        }
        return jz5.f0.f302826a;
    }
}
