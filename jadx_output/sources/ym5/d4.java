package ym5;

/* loaded from: classes2.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f463250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f463251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.e0 e0Var2) {
        super(0);
        this.f463249d = refreshLoadMoreLayout;
        this.f463250e = e0Var;
        this.f463251f = e0Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f463249d.getRecyclerView().scrollBy(0, a06.d.b(this.f463250e.f310115d - this.f463251f.f310115d));
        return jz5.f0.f302826a;
    }
}
