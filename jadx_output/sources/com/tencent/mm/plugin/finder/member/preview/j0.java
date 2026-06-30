package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class j0 extends com.tencent.mm.plugin.finder.feed.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final int f121236u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f121237v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f121238w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.ui.MMActivity context, int i17, int i18, boolean z17, int i19, java.lang.String authorFinderUsername) {
        super(context, i17, i18, z17, 0, false, 48, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        this.f121236u = i19;
        this.f121238w = new com.tencent.mm.plugin.finder.storage.ha0(i18, null, false, authorFinderUsername, 6, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f107156e.getSize()) {
            return;
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
        int i18 = this.f121236u;
        if (i18 == 0) {
            db5.t7.m(mMActivity, getResources().getString(com.tencent.mm.R.string.emv));
            return;
        }
        if (i18 == 1) {
            db5.t7.m(mMActivity, getResources().getString(com.tencent.mm.R.string.emu));
        } else if (i18 == 6) {
            db5.t7.m(mMActivity, getResources().getString(com.tencent.mm.R.string.lrb));
        } else {
            if (i18 != 7) {
                return;
            }
            db5.t7.m(mMActivity, getResources().getString(com.tencent.mm.R.string.emv));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public boolean V() {
        return true;
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public com.tencent.mm.plugin.finder.storage.vj0 q() {
        return this.f121238w;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        android.view.View view = this.f121237v;
        return view == null ? this.f106174d.findViewById(com.tencent.mm.R.id.f484229dg3) : view;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        if (this.f121236u == 6) {
            return new com.tencent.mm.plugin.finder.member.preview.a(this.f106174d, this.f106183p, (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn), false, 8, null);
        }
        ((com.tencent.mm.plugin.finder.storage.jj0) this.f121238w).getClass();
        return new com.tencent.mm.plugin.finder.storage.ij0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f121236u == 6 ? new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context) : this.f121238w.d(context);
    }
}
