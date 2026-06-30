package rt1;

/* loaded from: classes7.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f399440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f399441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f399443g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(android.app.Activity activity, java.lang.String str, rt1.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399441e = activity;
        this.f399442f = str;
        this.f399443g = p1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rt1.k1(this.f399441e, this.f399442f, this.f399443g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt1.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f399440d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = true;
        java.lang.String str = this.f399442f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.app.Activity activity = this.f399441e;
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI.class);
            intent.putExtra("INTENT_KEY_DEFAULT_PLATE_TEXT", str);
            this.f399440d = 1;
            obj = st1.g.c(activity, intent, this);
            if (obj == aVar) {
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
        }
        android.app.Instrumentation.ActivityResult activityResult = (android.app.Instrumentation.ActivityResult) obj;
        kotlin.jvm.internal.o.g(activityResult, "<this>");
        int resultCode = activityResult.getResultCode();
        android.content.Intent resultData = activityResult.getResultData();
        com.tencent.mars.xlog.Log.i("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForUpdate(plateNo:" + str + "), get code:" + resultCode + ", data:" + resultData);
        rt1.p1 p1Var = this.f399443g;
        if (-2 == resultCode) {
            p1Var.e();
            return f0Var;
        }
        java.lang.String stringExtra = (-1 != resultCode || resultData == null) ? null : resultData.getStringExtra("RESULT_KEY_SUBMITTED_PLATE_TEXT");
        if (stringExtra != null && stringExtra.length() != 0) {
            z17 = false;
        }
        if (!z17 && !kotlin.jvm.internal.o.b(stringExtra, str)) {
            rt1.j1 j1Var = new rt1.j1(p1Var, str, stringExtra);
            this.f399440d = 2;
            if (st1.g.d(j1Var, this) == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
