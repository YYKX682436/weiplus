package on2;

/* loaded from: classes.dex */
public final class j3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f346950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f346951c;

    public j3(java.lang.String str, kotlin.coroutines.Continuation continuation, android.content.Context context) {
        this.f346949a = str;
        this.f346950b = continuation;
        this.f346951c = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean e17 = xg2.g.e(fVar);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        java.lang.String str = this.f346949a;
        boolean z17 = true;
        kotlin.coroutines.Continuation continuation = this.f346950b;
        if (e17) {
            r45.yy1 yy1Var = (r45.yy1) ((r45.bz1) fVar.f70618d).getCustom(1);
            if (yy1Var != null) {
                com.tencent.mars.xlog.Log.i("LotteryUtil", str + " success!");
                continuation.resumeWith(kotlin.Result.m521constructorimpl(yy1Var));
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("LotteryUtil", "postClaim suc but after_status is null!");
                continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
            }
        } else {
            java.lang.String str2 = fVar.f70617c;
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                pm0.v.X(new on2.i3(this.f346951c, str2));
            }
            com.tencent.mars.xlog.Log.i("LotteryUtil", str + " fail,errMsg:" + str2 + '!');
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        return f0Var2;
    }
}
