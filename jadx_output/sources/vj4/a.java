package vj4;

/* loaded from: classes11.dex */
public final class a implements com.tencent.wechat.aff.status.StatusCgiManager.GetCustomIconRecommendDataCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vj4.d f437680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f437681b;

    public a(vj4.d dVar, kotlinx.coroutines.q qVar) {
        this.f437680a = dVar;
        this.f437681b = qVar;
    }

    @Override // com.tencent.wechat.aff.status.StatusCgiManager.GetCustomIconRecommendDataCallback
    public final void complete(bw5.ll0 ll0Var, bw5.yn0 yn0Var) {
        java.lang.String str = this.f437680a.f437689d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestRecommendIconData complete: ");
        sb6.append(ll0Var != null ? java.lang.Integer.valueOf(ll0Var.f29849f) : null);
        sb6.append(", ");
        sb6.append(ll0Var != null ? java.lang.Integer.valueOf(ll0Var.f29848e) : null);
        sb6.append(", ");
        sb6.append(yn0Var.getText());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        boolean z17 = false;
        if (ll0Var != null && ll0Var.f29849f == 0) {
            z17 = true;
        }
        kotlinx.coroutines.q qVar = this.f437681b;
        if (z17 && ll0Var.f29848e == 0) {
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(yn0Var));
        } else {
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
        }
    }
}
