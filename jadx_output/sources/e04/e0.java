package e04;

/* loaded from: classes15.dex */
public class e0 implements bi4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e04.p f245891b;

    public e0(e04.p pVar, android.app.Activity activity) {
        this.f245891b = pVar;
        this.f245890a = activity;
    }

    @Override // bi4.l1
    public void onFinishAction(int i17, java.lang.String str, pj4.r0 r0Var) {
        e04.p pVar = this.f245891b;
        if (i17 != 1) {
            pVar.e();
            pVar.t(true, null);
            return;
        }
        android.app.Activity activity = this.f245890a;
        if (activity != null && !activity.isFinishing()) {
            db5.e1.t(activity, activity.getString(com.tencent.mm.R.string.k2u), "", new e04.d0(this));
        }
        pVar.e();
    }
}
