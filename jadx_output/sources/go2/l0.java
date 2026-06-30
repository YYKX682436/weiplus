package go2;

/* loaded from: classes5.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f274001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f274002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f274004g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f274005h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f274006i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274007m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f274008n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(go2.a1 a1Var, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i17, android.view.View view, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f274002e = a1Var;
        this.f274003f = str;
        this.f274004g = num;
        this.f274005h = num2;
        this.f274006i = i17;
        this.f274007m = view;
        this.f274008n = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new go2.l0(this.f274002e, this.f274003f, this.f274004g, this.f274005h, this.f274006i, this.f274007m, this.f274008n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((go2.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f274001d;
        java.lang.String str = this.f274003f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("Finder.FinderMemberPayUIC", "doPay disableSubscribe");
            go2.a1 a1Var = this.f274002e;
            a1Var.f273948e = false;
            a1Var.f273949f = str;
            android.app.Activity context = a1Var.getContext();
            java.lang.String str2 = this.f274003f;
            int intValue = this.f274004g.intValue();
            java.lang.Integer num = this.f274005h;
            int i18 = this.f274006i;
            this.f274001d = 1;
            obj = a1Var.Q6(context, str2, intValue, num, false, i18, this);
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
        android.view.View view = this.f274007m;
        if (view != null) {
            view.setClickable(true);
        }
        go2.a1 a1Var2 = this.f274002e;
        go2.a1.O6(a1Var2, a1Var2.getContext());
        if (d0Var.f273960a) {
            yz5.l lVar = this.f274008n;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
            a1Var2.P6(a1Var2.getContext(), str, false, false);
        }
        return jz5.f0.f302826a;
    }
}
