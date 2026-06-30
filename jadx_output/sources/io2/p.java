package io2;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final io2.i f293491a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f293492b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f293493c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f293494d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ProgressBar f293495e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f293496f;

    /* renamed from: g, reason: collision with root package name */
    public final ym5.q1 f293497g;

    public p(com.tencent.mm.ui.MMActivity activity, io2.i presenter, android.view.View rootView) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f293491a = presenter;
        this.f293492b = rootView;
        this.f293493c = (com.tencent.mm.view.RefreshLoadMoreLayout) rootView.findViewById(com.tencent.mm.R.id.m6e);
        this.f293494d = (com.tencent.mm.view.recyclerview.WxRecyclerView) rootView.findViewById(com.tencent.mm.R.id.lqa);
        this.f293495e = (android.widget.ProgressBar) rootView.findViewById(com.tencent.mm.R.id.lbi);
        this.f293496f = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.dft);
        this.f293497g = new io2.o(this);
    }

    public final void a(boolean z17) {
        this.f293495e.setVisibility(z17 ? 0 : 8);
    }
}
