package rt1;

/* loaded from: classes7.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f399422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f399423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f399424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.app.Activity activity, rt1.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399423e = activity;
        this.f399424f = p1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rt1.i1(this.f399423e, this.f399424f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt1.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f399422d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.app.Activity activity = this.f399423e;
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI.class);
            this.f399422d = 1;
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
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.app.Instrumentation.ActivityResult activityResult = (android.app.Instrumentation.ActivityResult) obj;
        kotlin.jvm.internal.o.g(activityResult, "<this>");
        int resultCode = activityResult.getResultCode();
        android.content.Intent resultData = activityResult.getResultData();
        com.tencent.mars.xlog.Log.i("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForCreate, get code:" + resultCode + ", data:" + resultData);
        java.lang.String stringExtra = (-1 != resultCode || resultData == null) ? null : resultData.getStringExtra("RESULT_KEY_SUBMITTED_PLATE_TEXT");
        if (stringExtra != null && stringExtra.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            rt1.h1 h1Var = new rt1.h1(this.f399424f, stringExtra);
            this.f399422d = 2;
            if (st1.g.d(h1Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
