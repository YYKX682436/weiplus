package sp2;

/* loaded from: classes2.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f411021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411022e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(boolean z17, sp2.o2 o2Var) {
        super(0);
        this.f411021d = z17;
        this.f411022e = o2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f411021d;
        sp2.o2 o2Var = this.f411022e;
        if (z17) {
            android.view.ViewGroup viewGroup = o2Var.f411157s;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("fakeLoadingLayout");
                throw null;
            }
            viewGroup.setVisibility(0);
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = o2Var.f411155r;
            if (wxRefreshLayout == null) {
                kotlin.jvm.internal.o.o("refreshLayout");
                throw null;
            }
            wxRefreshLayout.setVisibility(8);
        } else {
            android.view.ViewGroup viewGroup2 = o2Var.f411157s;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("fakeLoadingLayout");
                throw null;
            }
            viewGroup2.setVisibility(8);
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = o2Var.f411155r;
            if (wxRefreshLayout2 == null) {
                kotlin.jvm.internal.o.o("refreshLayout");
                throw null;
            }
            wxRefreshLayout2.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}
