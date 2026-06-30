package ym5;

/* loaded from: classes10.dex */
public final class r4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f463497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463498e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(ym5.s3 s3Var, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        super(0);
        this.f463497d = s3Var;
        this.f463498e = refreshLoadMoreLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPreFinishLoadMoreSmooth] reason=");
        ym5.s3 s3Var = this.f463497d;
        sb6.append(s3Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", sb6.toString());
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463498e;
        refreshLoadMoreLayout.setLoadingMore(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f463498e;
        ym5.q4 q4Var = new ym5.q4(refreshLoadMoreLayout2, s3Var);
        if (!s3Var.f463521f) {
            refreshLoadMoreLayout2.H(s3Var);
            if (s3Var.f463523h <= 0) {
                ym5.q3 actionCallback = refreshLoadMoreLayout.getActionCallback();
                if (actionCallback != null) {
                    actionCallback.c(s3Var);
                }
            } else if (s3Var.f463522g) {
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f463498e;
                com.tencent.mm.view.RefreshLoadMoreLayout.r(refreshLoadMoreLayout3, false, null, new ym5.o4(q4Var, refreshLoadMoreLayout3, s3Var), 3, null);
            } else {
                q4Var.invoke();
                ym5.q3 actionCallback2 = refreshLoadMoreLayout.getActionCallback();
                if (actionCallback2 != null) {
                    actionCallback2.c(s3Var);
                }
            }
        } else if (s3Var.f463522g) {
            com.tencent.mm.view.RefreshLoadMoreLayout.r(refreshLoadMoreLayout2, false, null, new ym5.p4(q4Var, refreshLoadMoreLayout2, s3Var), 3, null);
        } else {
            q4Var.invoke();
            ym5.q3 actionCallback3 = refreshLoadMoreLayout.getActionCallback();
            if (actionCallback3 != null) {
                actionCallback3.c(s3Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
