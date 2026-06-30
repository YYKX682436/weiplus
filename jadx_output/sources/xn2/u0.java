package xn2;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f455580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(xn2.f1 f1Var) {
        super(0);
        this.f455580d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        android.view.View view2;
        xn2.f1 f1Var = this.f455580d;
        f1Var.g().setVisibility(8);
        f1Var.f455495g = false;
        on5.c loadMoreFooter = f1Var.j().getLoadMoreFooter();
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = null;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2 = (loadMoreFooter == null || (view2 = loadMoreFooter.getView()) == null) ? null : (com.tencent.mm.ui.widget.MMProcessBar) view2.findViewById(com.tencent.mm.R.id.ilh);
        if (mMProcessBar2 != null) {
            mMProcessBar2.setVisibility(8);
        }
        on5.c loadMoreFooter2 = f1Var.j().getLoadMoreFooter();
        if (loadMoreFooter2 != null && (view = loadMoreFooter2.getView()) != null) {
            mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) view.findViewById(com.tencent.mm.R.id.ilh);
        }
        if (mMProcessBar != null) {
            mMProcessBar.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
