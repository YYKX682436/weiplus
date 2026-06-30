package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u00103\u001a\u00020+\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107B!\b\u0016\u0012\u0006\u00103\u001a\u00020+\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b6\u0010:J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0014\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006;"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView;", "Data", "Landroidx/recyclerview/widget/k3;", "ViewHolder", "Landroid/widget/FrameLayout;", "Lym5/m3;", "", "getLoopDuration", "Ljava/util/LinkedList;", "taskInfo", "Ljz5/f0;", "setBannerDataList", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "d", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "getPagerView", "()Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "setPagerView", "(Lcom/tencent/mm/view/RecyclerHorizontalViewPager;)V", "pagerView", "Landroid/view/View;", "e", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "root", "Landroidx/recyclerview/widget/f2;", "f", "Landroidx/recyclerview/widget/f2;", "getAdapter", "()Landroidx/recyclerview/widget/f2;", "setAdapter", "(Landroidx/recyclerview/widget/f2;)V", "adapter", "g", "Ljava/util/LinkedList;", "getDataList", "()Ljava/util/LinkedList;", "setDataList", "(Ljava/util/LinkedList;)V", "dataList", "Landroid/content/Context;", "h", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class FinderLiveLoopBannerView<Data, ViewHolder extends androidx.recyclerview.widget.k3> extends android.widget.FrameLayout implements ym5.m3 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.view.RecyclerHorizontalViewPager pagerView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.view.View root;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public androidx.recyclerview.widget.f2 adapter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public java.util.LinkedList dataList;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public android.content.Context mContext;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f117664i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f117665m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f117666n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLoopBannerView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.dataList = new java.util.LinkedList();
        this.f117665m = true;
        this.f117666n = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.finder.live.widget.Cdo(this));
        c(context);
    }

    public static final void b(com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView finderLiveLoopBannerView) {
        if (finderLiveLoopBannerView.getVisibility() != 0) {
            return;
        }
        if (finderLiveLoopBannerView.dataList.size() == 0) {
            finderLiveLoopBannerView.f117666n.removeMessages(1);
            finderLiveLoopBannerView.setVisibility(8);
            return;
        }
        if (finderLiveLoopBannerView.dataList.size() == 1) {
            finderLiveLoopBannerView.f117666n.removeMessages(1);
            return;
        }
        finderLiveLoopBannerView.f117666n.removeMessages(1);
        int i17 = finderLiveLoopBannerView.f117664i + 1;
        if (i17 >= finderLiveLoopBannerView.dataList.size()) {
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveTaskBannerView", "[startLoop] targetPosition:" + i17);
        finderLiveLoopBannerView.getPagerView().post(new com.tencent.mm.plugin.finder.live.widget.fo(finderLiveLoopBannerView, finderLiveLoopBannerView.f117666n.obtainMessage(1, i17, 0)));
    }

    @Override // ym5.m3
    public void a(int i17, boolean z17, boolean z18) {
    }

    public final void c(android.content.Context context) {
        setMContext(context);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489001b06, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        setRoot(inflate);
        android.view.View findViewById = getRoot().findViewById(com.tencent.mm.R.id.fn6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setPagerView((com.tencent.mm.view.RecyclerHorizontalViewPager) findViewById);
        getPagerView().setPageChangeListener(this);
        getPagerView().setFrozeTouch(true);
        getPagerView().setHasFixedSize(false);
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context);
        finderLinearLayoutManager.f132639x = 80.0f;
        finderLinearLayoutManager.f11881u = 3;
        finderLinearLayoutManager.setItemPrefetchEnabled(true);
        finderLinearLayoutManager.Q(0);
        getPagerView().setLayoutManager(finderLinearLayoutManager);
        setAdapter(new com.tencent.mm.plugin.finder.live.widget.eo(this));
        getPagerView().setAdapter(getAdapter());
    }

    public abstract void d(androidx.recyclerview.widget.k3 k3Var, int i17);

    public abstract androidx.recyclerview.widget.k3 e(android.view.ViewGroup viewGroup, int i17);

    public final androidx.recyclerview.widget.f2 getAdapter() {
        androidx.recyclerview.widget.f2 f2Var = this.adapter;
        if (f2Var != null) {
            return f2Var;
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    public final java.util.LinkedList<Data> getDataList() {
        return this.dataList;
    }

    public long getLoopDuration() {
        return 5000L;
    }

    public final android.content.Context getMContext() {
        android.content.Context context = this.mContext;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("mContext");
        throw null;
    }

    public final com.tencent.mm.view.RecyclerHorizontalViewPager getPagerView() {
        com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.pagerView;
        if (recyclerHorizontalViewPager != null) {
            return recyclerHorizontalViewPager;
        }
        kotlin.jvm.internal.o.o("pagerView");
        throw null;
    }

    public final android.view.View getRoot() {
        android.view.View view = this.root;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f117666n.removeMessages(1);
    }

    public final void setAdapter(androidx.recyclerview.widget.f2 f2Var) {
        kotlin.jvm.internal.o.g(f2Var, "<set-?>");
        this.adapter = f2Var;
    }

    public final void setBannerDataList(java.util.LinkedList<Data> taskInfo) {
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        this.dataList.clear();
        this.dataList.addAll(taskInfo);
        if (this.dataList.size() > 1) {
            java.util.LinkedList linkedList = this.dataList;
            linkedList.add(linkedList.size(), this.dataList.get(0));
        }
        getAdapter().notifyDataSetChanged();
    }

    public final void setDataList(java.util.LinkedList<Data> linkedList) {
        kotlin.jvm.internal.o.g(linkedList, "<set-?>");
        this.dataList = linkedList;
    }

    public final void setMContext(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<set-?>");
        this.mContext = context;
    }

    public final void setPagerView(com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager) {
        kotlin.jvm.internal.o.g(recyclerHorizontalViewPager, "<set-?>");
        this.pagerView = recyclerHorizontalViewPager;
    }

    public final void setRoot(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.root = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLoopBannerView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.dataList = new java.util.LinkedList();
        this.f117665m = true;
        this.f117666n = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.finder.live.widget.Cdo(this));
        c(context);
    }
}
