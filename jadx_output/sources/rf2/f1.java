package rf2;

/* loaded from: classes10.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f394733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394734f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(r45.dm4 dm4Var, rf2.o1 o1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394733e = dm4Var;
        this.f394734f = o1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.f1(this.f394733e, this.f394734f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object Q6;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394732d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        rf2.o1 o1Var = this.f394734f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.dm4 dm4Var = this.f394733e;
            if (dm4Var == null || (str = dm4Var.f372575m) == null) {
                str = "";
            }
            mm2.v4 v4Var = (mm2.v4) o1Var.f394837b.business(mm2.v4.class);
            android.content.Context context = o1Var.f394836a.getContext();
            this.f394732d = 1;
            Q6 = v4Var.Q6(str, context, true, this);
            if (Q6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            Q6 = obj;
        }
        r45.f02 f02Var = (r45.f02) Q6;
        if (f02Var == null) {
            return f0Var;
        }
        android.view.View view = o1Var.f394836a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        df2.ln lnVar = (df2.ln) o1Var.f394837b.controller(df2.ln.class);
        if (lnVar != null) {
            df2.dn dnVar = df2.dn.f229991e;
            rf2.e1 e1Var = new rf2.e1(o1Var);
            this.f394732d = 2;
            if (lnVar.b7(dnVar, f02Var, false, false, e1Var, this) == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
