package vb2;

/* loaded from: classes10.dex */
public final class g implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.TouchableLayout f434605a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f434606b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f434607c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMProcessBar f434608d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f434609e;

    public g(com.tencent.mm.view.TouchableLayout touchableLayout, androidx.recyclerview.widget.RecyclerView recyclerView, android.widget.TextView textView, com.tencent.mm.view.TouchableLayout touchableLayout2, com.tencent.mm.ui.widget.MMProcessBar mMProcessBar, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f434605a = touchableLayout;
        this.f434606b = recyclerView;
        this.f434607c = textView;
        this.f434608d = mMProcessBar;
        this.f434609e = refreshLoadMoreLayout;
    }

    public static vb2.g a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.ciw;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(view, com.tencent.mm.R.id.ciw);
        if (recyclerView != null) {
            i17 = com.tencent.mm.R.id.dft;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.dft);
            if (textView != null) {
                com.tencent.mm.view.TouchableLayout touchableLayout = (com.tencent.mm.view.TouchableLayout) view;
                i17 = com.tencent.mm.R.id.ilq;
                com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) x4.b.a(view, com.tencent.mm.R.id.ilq);
                if (mMProcessBar != null) {
                    i17 = com.tencent.mm.R.id.m6e;
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) x4.b.a(view, com.tencent.mm.R.id.m6e);
                    if (refreshLoadMoreLayout != null) {
                        return new vb2.g(touchableLayout, recyclerView, textView, touchableLayout, mMProcessBar, refreshLoadMoreLayout);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f434605a;
    }
}
