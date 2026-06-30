package com.tencent.mm.plugin.finder.profile.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/view/FinderFollowMoreView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "os2/a", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFollowMoreView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f124438d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f124439e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f124440f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f124441g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f124442h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f124443i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFollowMoreView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f124442h = new java.util.ArrayList();
        this.f124443i = "";
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b6o, (android.view.ViewGroup) this, true);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gay);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f124438d = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.gaz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f124439e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.gat);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f124440f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        android.widget.TextView textView = this.f124439e;
        if (textView == null) {
            kotlin.jvm.internal.o.o("moreTv");
            throw null;
        }
        textView.setOnClickListener(new os2.b(this));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f124438d;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
        linearLayoutManager.Q(0);
        wxRecyclerView.setLayoutManager(linearLayoutManager);
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.profile.view.FinderFollowMoreView$initView$3
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new os2.a();
            }
        };
        java.util.ArrayList arrayList = this.f124442h;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, arrayList, false);
        this.f124441g = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new os2.c(this);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f124438d;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        wxRecyclerView2.setAdapter(wxRecyclerAdapter);
        for (int i17 = 0; i17 < 11; i17++) {
            arrayList.add(new com.tencent.mm.plugin.finder.viewmodel.component.t(new com.tencent.mm.protocal.protobuf.FinderContact(), "", new java.util.ArrayList()));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f124441g;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFollowMoreView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f124442h = new java.util.ArrayList();
        this.f124443i = "";
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b6o, (android.view.ViewGroup) this, true);
    }
}
