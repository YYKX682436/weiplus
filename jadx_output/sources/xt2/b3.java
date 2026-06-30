package xt2;

/* loaded from: classes3.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f456634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(xt2.e3 e3Var, r45.y23 y23Var) {
        super(0);
        this.f456633d = e3Var;
        this.f456634e = y23Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xt2.e3 e3Var = this.f456633d;
        e3Var.f456717u.setTag(this.f456634e.getString(1));
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingBubbleTextView finderLiveShoppingBubbleTextView = e3Var.f456717u;
        finderLiveShoppingBubbleTextView.b();
        finderLiveShoppingBubbleTextView.requestLayout();
        return jz5.f0.f302826a;
    }
}
