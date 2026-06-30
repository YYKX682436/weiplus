package xn2;

/* loaded from: classes2.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f455477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(xn2.f1 f1Var) {
        super(0);
        this.f455477d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar;
        android.view.View view2;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2;
        xn2.f1 f1Var = this.f455477d;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) f1Var.h().findViewById(com.tencent.mm.R.id.qqj);
        finderRefreshLayout.setOnSimpleAction(new xn2.a1(f1Var));
        on5.d refreshHeader = finderRefreshLayout.getRefreshHeader();
        if (refreshHeader != null && (view2 = refreshHeader.getView()) != null && (mMProcessBar2 = (com.tencent.mm.ui.widget.MMProcessBar) view2.findViewById(com.tencent.mm.R.id.f486588lr5)) != null) {
            mMProcessBar2.setBackgroundResource(com.tencent.mm.R.drawable.akq);
        }
        on5.c loadMoreFooter = finderRefreshLayout.getLoadMoreFooter();
        if (loadMoreFooter != null && (view = loadMoreFooter.getView()) != null && (mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) view.findViewById(com.tencent.mm.R.id.ilh)) != null) {
            mMProcessBar.setBackgroundResource(com.tencent.mm.R.drawable.akq);
        }
        return finderRefreshLayout;
    }
}
