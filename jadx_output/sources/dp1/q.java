package dp1;

/* loaded from: classes14.dex */
public final class q implements dp1.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f242171a = new java.util.HashMap();

    public q(dp1.o oVar) {
    }

    @Override // dp1.m
    public boolean a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        dp1.m mVar = (dp1.m) ((java.util.HashMap) this.f242171a).get(java.lang.Integer.valueOf(ballInfo.f93046d));
        if (mVar == null) {
            return false;
        }
        return mVar.a(ballInfo);
    }

    @Override // dp1.m
    public boolean b(android.content.Context context, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        dp1.m mVar = (dp1.m) ((java.util.HashMap) this.f242171a).get(java.lang.Integer.valueOf(ballInfo.f93046d));
        if (mVar == null) {
            return false;
        }
        return mVar.b(context, ballInfo);
    }

    @Override // dp1.m
    public boolean c(android.widget.TextView textView, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        dp1.m mVar = (dp1.m) ((java.util.HashMap) this.f242171a).get(java.lang.Integer.valueOf(ballInfo.f93046d));
        if (mVar == null) {
            return false;
        }
        return mVar.c(textView, ballInfo);
    }
}
