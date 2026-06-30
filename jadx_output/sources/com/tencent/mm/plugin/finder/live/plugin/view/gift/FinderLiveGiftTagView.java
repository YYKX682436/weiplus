package com.tencent.mm.plugin.finder.live.plugin.view.gift;

@kotlin.Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0015\u0018\u00002\u00020\u0001:\u0001#B\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B#\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\"J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftTagView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "touchBlock", "setTouchBlock", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "f", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRv", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRv", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "rv", "", "value", "m", "I", "setSelectedTabIndex", "(I)V", "selectedTabIndex", "dl2/i0", "p", "Ljz5/g;", "getAdapter", "()Ldl2/i0;", "adapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dl2/g0", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveGiftTagView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f114753d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f114754e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.view.recyclerview.WxRecyclerView rv;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f114756g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f114757h;

    /* renamed from: i, reason: collision with root package name */
    public int f114758i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int selectedTabIndex;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f114760n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f114761o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final jz5.g adapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftTagView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f114758i = -1;
        this.adapter = jz5.h.b(new dl2.j0(this));
        d(context);
    }

    private final dl2.i0 getAdapter() {
        return (dl2.i0) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedTabIndex(int i17) {
        if (this.selectedTabIndex == getRv().getChildCount() - 1) {
            kotlin.jvm.internal.o.f(dk2.u7.f234189i, "<get-pkgGiftCache>(...)");
            if (!r0.isEmpty()) {
                zl2.r4.f473950a.T2(6);
            }
        }
        this.selectedTabIndex = i17;
    }

    public final void b(int i17) {
        setSelectedTabIndex(c(i17));
        getAdapter().notifyDataSetChanged();
    }

    public final int c(int i17) {
        int i18;
        java.util.List list = this.f114757h;
        jz5.f0 f0Var = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = 0;
                    break;
                }
                java.lang.Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (i17 < ((java.lang.Number) next).intValue()) {
                    break;
                }
                i18 = i19;
            }
            f0Var = jz5.f0.f302826a;
        } else {
            i18 = 0;
        }
        if (f0Var == null) {
            return 0;
        }
        return i18;
    }

    public final void d(android.content.Context context) {
        this.f114753d = context;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.asa, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f114754e = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f3c);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setRv((com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById);
        getRv().setAdapter(getAdapter());
        getRv().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
    }

    public final void e(java.util.LinkedHashMap giftTabMap, java.util.LinkedList eachTabEndIndexList, boolean z17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(giftTabMap, "giftTabMap");
        kotlin.jvm.internal.o.g(eachTabEndIndexList, "eachTabEndIndexList");
        java.util.Set keySet = giftTabMap.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        this.f114756g = kz5.n0.S0(keySet);
        this.f114757h = eachTabEndIndexList;
        this.f114760n = lVar;
        this.f114761o = z17;
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

    public final void setRv(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        kotlin.jvm.internal.o.g(wxRecyclerView, "<set-?>");
        this.rv = wxRecyclerView;
    }

    public final void setTouchBlock(yz5.a touchBlock) {
        kotlin.jvm.internal.o.g(touchBlock, "touchBlock");
        getRv().setOnTouchListener(new dl2.k0(touchBlock));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftTagView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f114758i = -1;
        this.adapter = jz5.h.b(new dl2.j0(this));
        d(context);
    }
}
