package com.tencent.mm.plugin.finder.live.plugin.view.gift;

@kotlin.Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u001b\u0018\u00002\u00020\u0001:\u0001)B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&B#\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010'\u001a\u00020\u0014¢\u0006\u0004\b%\u0010(J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveCustomGiftTagView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "touchBlock", "setTouchBlock", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "g", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRv", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRv", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "rv", "", "value", "i", "I", "setSelectedTabIndex", "(I)V", "selectedTabIndex", "dl2/c", "n", "Ljz5/g;", "getAdapter", "()Ldl2/c;", "adapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dl2/a", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveCustomGiftTagView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f114746e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f114747f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.view.recyclerview.WxRecyclerView rv;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f114749h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int selectedTabIndex;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f114751m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g adapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveCustomGiftTagView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "FinderLiveCustomGiftTagView";
        this.adapter = jz5.h.b(new dl2.d(this));
        c(context);
    }

    private final dl2.c getAdapter() {
        return (dl2.c) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedTabIndex(int i17) {
        if (this.selectedTabIndex == getRv().getChildCount() - 1) {
            dk2.u7 u7Var = dk2.u7.f234181a;
            kotlin.jvm.internal.o.f(dk2.u7.f234189i, "<get-pkgGiftCache>(...)");
            if (!r0.isEmpty()) {
                zl2.r4.f473950a.T2(6);
            }
        }
        this.selectedTabIndex = i17;
    }

    public final void b(int i17) {
        setSelectedTabIndex(i17);
        getAdapter().notifyDataSetChanged();
    }

    public final void c(android.content.Context context) {
        this.f114746e = context;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.asa, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f114747f = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f3c);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setRv((com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById);
        getRv().setAdapter(getAdapter());
        getRv().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
    }

    public final void d(java.util.List giftTabList, yz5.l lVar) {
        kotlin.jvm.internal.o.g(giftTabList, "giftTabList");
        com.tencent.mars.xlog.Log.i(this.TAG, this + ", giftTabList:" + giftTabList);
        this.f114749h = giftTabList;
        this.f114751m = lVar;
        getAdapter().notifyDataSetChanged();
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getRv() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.rv;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("rv");
        throw null;
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    public final void setRv(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        kotlin.jvm.internal.o.g(wxRecyclerView, "<set-?>");
        this.rv = wxRecyclerView;
    }

    public final void setTouchBlock(yz5.a touchBlock) {
        kotlin.jvm.internal.o.g(touchBlock, "touchBlock");
        getRv().setOnTouchListener(new dl2.e(touchBlock));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveCustomGiftTagView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "FinderLiveCustomGiftTagView";
        this.adapter = jz5.h.b(new dl2.d(this));
        c(context);
    }
}
