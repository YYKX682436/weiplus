package ym5;

/* loaded from: classes10.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f463430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f463432f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(yz5.a aVar, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, ym5.s3 s3Var) {
        super(0);
        this.f463430d = aVar;
        this.f463431e = refreshLoadMoreLayout;
        this.f463432f = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f463430d.invoke();
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463431e;
        ym5.q3 actionCallback = refreshLoadMoreLayout.getActionCallback();
        ym5.s3 s3Var = this.f463432f;
        if (actionCallback != null) {
            actionCallback.e(s3Var);
        }
        ym5.q3 reportCallback = refreshLoadMoreLayout.getReportCallback();
        if (reportCallback != null) {
            reportCallback.e(s3Var);
        }
        return jz5.f0.f302826a;
    }
}
