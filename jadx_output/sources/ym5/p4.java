package ym5;

/* loaded from: classes10.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f463464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f463466f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(yz5.a aVar, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, ym5.s3 s3Var) {
        super(0);
        this.f463464d = aVar;
        this.f463465e = refreshLoadMoreLayout;
        this.f463466f = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f463464d.invoke();
        ym5.q3 actionCallback = this.f463465e.getActionCallback();
        if (actionCallback != null) {
            actionCallback.c(this.f463466f);
        }
        return jz5.f0.f302826a;
    }
}
