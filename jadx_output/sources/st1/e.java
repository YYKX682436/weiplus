package st1;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f412202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f412203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f412204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f412205g;

    public e(android.app.Activity activity, android.content.Intent intent, int i17, kotlinx.coroutines.q qVar) {
        this.f412202d = activity;
        this.f412203e = intent;
        this.f412204f = i17;
        this.f412205g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f412202d;
        boolean z17 = activity instanceof com.tencent.mm.ui.MMActivity;
        int i17 = this.f412204f;
        android.content.Intent intent = this.f412203e;
        kotlinx.coroutines.q qVar = this.f412205g;
        if (z17) {
            ((com.tencent.mm.ui.MMActivity) activity).mmStartActivityForResult((com.tencent.mm.ui.da) new st1.b(qVar), intent, i17);
            return;
        }
        if (activity instanceof com.tencent.mm.ui.MMFragmentActivity) {
            ((com.tencent.mm.ui.MMFragmentActivity) activity).mmStartActivityForResult(new st1.c(qVar), intent, i17);
            return;
        }
        if (activity instanceof nf.m) {
            nf.g.a(activity).j(intent, new st1.d(qVar));
            return;
        }
        com.tencent.mars.xlog.Log.e("CarLicensePlateViewUtils", "startForResultSuspended with invalid activity(" + activity + "), return CANCELED");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(new android.app.Instrumentation.ActivityResult(0, null)));
    }
}
