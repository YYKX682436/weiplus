package ym5;

/* loaded from: classes10.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f463453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f463455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(yz5.a aVar, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, ym5.s3 s3Var) {
        super(0);
        this.f463453d = aVar;
        this.f463454e = refreshLoadMoreLayout;
        this.f463455f = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f463453d.invoke();
        ym5.q3 actionCallback = this.f463454e.getActionCallback();
        if (actionCallback != null) {
            actionCallback.c(this.f463455f);
        }
        return jz5.f0.f302826a;
    }
}
