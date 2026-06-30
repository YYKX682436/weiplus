package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class t8 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f119875h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f119876i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f119877m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(android.content.Context context, java.lang.String anchorName, boolean z17) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(anchorName, "anchorName");
        this.f119875h = anchorName;
        this.f119876i = z17;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dio;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f119877m = rootView;
        rootView.findViewById(com.tencent.mm.R.id.c9z).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.s8(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        android.view.View view = this.f119877m;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc) : null;
        if (textView != null) {
            textView.setText(this.f118381d.getString(com.tencent.mm.R.string.luh, this.f119875h));
        }
        android.view.View view2 = this.f119877m;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.nrk) : null;
        if (findViewById == null) {
            return;
        }
        int i17 = this.f119876i ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBecomeSuperFansDialog", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBecomeSuperFansDialog", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
