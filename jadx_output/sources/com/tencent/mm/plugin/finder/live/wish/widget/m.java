package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes10.dex */
public final class m implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f120731d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f120732e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f120733f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.wish.widget.i f120734g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f120735h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f120736i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f120737m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f120738n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f120739o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f120740p;

    public m(com.tencent.mm.ui.MMActivity activity, android.view.View rootView, android.view.View view, com.tencent.mm.plugin.finder.live.wish.widget.i presenter) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f120731d = activity;
        this.f120732e = rootView;
        this.f120733f = view;
        this.f120734g = presenter;
    }

    public static final void a(com.tencent.mm.plugin.finder.live.wish.widget.m mVar) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = mVar.f120735h;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("wishCountEditText");
            throw null;
        }
        mMEditText.setText("");
        android.widget.TextView textView = mVar.f120739o;
        if (textView != null) {
            textView.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("wishInvalidDesc");
            throw null;
        }
    }

    public final void g(long j17, java.lang.String performanceName, boolean z17) {
        kotlin.jvm.internal.o.g(performanceName, "performanceName");
        com.tencent.mars.xlog.Log.i("InteractionWishContract.ViewCallback", "onWishCountChanged wishCount:" + j17 + " performanceName:" + performanceName + " disablePerformance:" + z17);
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f120735h;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("wishCountEditText");
            throw null;
        }
        mMEditText.setText(j17 > 0 ? java.lang.String.valueOf(j17) : "");
        if (z17) {
            android.view.ViewGroup viewGroup = this.f120737m;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("performanceLayout");
                throw null;
            }
        }
        android.view.ViewGroup viewGroup2 = this.f120737m;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("performanceLayout");
            throw null;
        }
        viewGroup2.setVisibility(0);
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f120736i;
        if (mMEditText2 != null) {
            mMEditText2.setText(performanceName);
        } else {
            kotlin.jvm.internal.o.o("performanceNameEditText");
            throw null;
        }
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f120731d;
    }
}
