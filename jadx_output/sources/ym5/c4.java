package ym5;

/* loaded from: classes2.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f463232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f463234f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(kotlin.jvm.internal.e0 e0Var, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, kotlin.jvm.internal.e0 e0Var2) {
        super(1);
        this.f463232d = e0Var;
        this.f463233e = refreshLoadMoreLayout;
        this.f463234f = e0Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f463232d;
        int b17 = a06.d.b(floatValue - e0Var.f310115d);
        if (b17 < 0) {
            b17 = 0;
        }
        this.f463233e.getRecyclerView().scrollBy(0, b17);
        this.f463234f.f310115d += b17;
        e0Var.f310115d = floatValue;
        return jz5.f0.f302826a;
    }
}
