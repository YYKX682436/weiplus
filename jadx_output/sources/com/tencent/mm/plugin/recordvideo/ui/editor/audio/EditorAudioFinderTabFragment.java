package com.tencent.mm.plugin.recordvideo.ui.editor.audio;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'B#\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010(\u001a\u00020\u0018¢\u0006\u0004\b&\u0010)R#\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR#\u0010\u000e\u001a\n \u0004*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR#\u0010\u0013\u001a\n \u0004*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0016\u001a\n \u0004*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0012R<\u0010!\u001a\u001c\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/modelbase/u0;", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "kotlin.jvm.PlatformType", "g", "Ljz5/g;", "getLoadMoreLayout", "()Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "loadMoreLayout", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "h", "getFinderRecycler", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "finderRecycler", "Landroid/view/View;", "i", "getLoadingState", "()Landroid/view/View;", "loadingState", "m", "getEmptyState", "emptyState", "Lkotlin/Function3;", "", "Lcom/tencent/mm/protocal/protobuf/FinderObject;", "Ljz5/f0;", "o", "Lyz5/q;", "getOnFinderVideoSelectListener", "()Lyz5/q;", "setOnFinderVideoSelectListener", "(Lyz5/q;)V", "onFinderVideoSelectListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class EditorAudioFinderTabFragment extends android.widget.FrameLayout implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f156101d;

    /* renamed from: e, reason: collision with root package name */
    public int f156102e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f156103f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g loadMoreLayout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g finderRecycler;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g loadingState;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g emptyState;

    /* renamed from: n, reason: collision with root package name */
    public boolean f156108n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public yz5.q onFinderVideoSelectListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorAudioFinderTabFragment(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f156101d = arrayList;
        this.f156102e = -1;
        this.loadMoreLayout = jz5.h.b(new xu3.g(this));
        this.finderRecycler = jz5.h.b(new xu3.f(this));
        this.loadingState = jz5.h.b(new xu3.h(this));
        this.emptyState = jz5.h.b(new xu3.e(this));
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d3g, (android.view.ViewGroup) this, true);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment.1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new xu3.a();
            }
        }, arrayList, true);
        this.f156103f = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new xu3.c(this);
        getLoadMoreLayout().setEnablePullDownHeader(false);
        getLoadMoreLayout().setEnableRefresh(false);
        getLoadMoreLayout().setActionCallback(new xu3.d(this));
        getFinderRecycler().setAdapter(wxRecyclerAdapter);
        getFinderRecycler().setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(getContext(), 3));
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        android.content.res.Resources resources = context2.getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        xu3.z zVar = new xu3.z(resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480318uf), resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480318uf), b3.l.getColor(context2, com.tencent.mm.R.color.BW_0), false, null);
        com.tencent.mm.view.recyclerview.WxRecyclerView finderRecycler = getFinderRecycler();
        if (finderRecycler != null) {
            finderRecycler.N(zVar);
        }
        f();
    }

    private final android.view.View getEmptyState() {
        return (android.view.View) this.emptyState.getValue();
    }

    private final com.tencent.mm.view.recyclerview.WxRecyclerView getFinderRecycler() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) this.finderRecycler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.view.RefreshLoadMoreLayout getLoadMoreLayout() {
        return (com.tencent.mm.view.RefreshLoadMoreLayout) this.loadMoreLayout.getValue();
    }

    private final android.view.View getLoadingState() {
        return (android.view.View) this.loadingState.getValue();
    }

    public final void b() {
        xu3.b bVar = (xu3.b) kz5.n0.a0(this.f156101d, this.f156102e);
        if (bVar != null) {
            bVar.f457252e = false;
        }
        this.f156103f.notifyItemChanged(this.f156102e, 1);
        this.f156102e = -1;
    }

    public abstract void c();

    public final void d(java.util.List newData, boolean z17) {
        kotlin.jvm.internal.o.g(newData, "newData");
        java.util.ArrayList arrayList = this.f156101d;
        int size = arrayList.size();
        int size2 = newData.size();
        int size3 = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(newData, 10));
        java.util.Iterator it = newData.iterator();
        while (it.hasNext()) {
            arrayList2.add(new xu3.b((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), false, false, 6, null));
        }
        arrayList.addAll(arrayList2);
        this.f156103f.notifyItemRangeInserted(size, size2);
        if (size3 == 0 && size2 == 0) {
            android.view.View loadingState = getLoadingState();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(loadingState, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingState.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(loadingState, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View emptyState = getEmptyState();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(emptyState, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            emptyState.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(emptyState, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getLoadMoreLayout().setVisibility(8);
            return;
        }
        if (size3 != 0 || size2 <= 0) {
            ym5.s3 s3Var = new ym5.s3(1);
            s3Var.f463521f = z17;
            getLoadMoreLayout().O(s3Var);
            return;
        }
        android.view.View loadingState2 = getLoadingState();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(loadingState2, arrayList5.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loadingState2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(loadingState2, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View emptyState2 = getEmptyState();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(emptyState2, arrayList6.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        emptyState2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(emptyState2, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getLoadMoreLayout().setVisibility(0);
    }

    public void e() {
        b();
        com.tencent.mm.view.recyclerview.WxRecyclerView finderRecycler = getFinderRecycler();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(finderRecycler, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
        finderRecycler.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(finderRecycler, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
        if (this.f156108n) {
            return;
        }
        this.f156108n = true;
        c();
    }

    public final void f() {
        android.view.View loadingState = getLoadingState();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loadingState, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loadingState.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(loadingState, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View emptyState = getEmptyState();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(emptyState, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        emptyState.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(emptyState, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getLoadMoreLayout().setVisibility(8);
    }

    public final yz5.q getOnFinderVideoSelectListener() {
        return this.onFinderVideoSelectListener;
    }

    public final void setOnFinderVideoSelectListener(yz5.q qVar) {
        this.onFinderVideoSelectListener = qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorAudioFinderTabFragment(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f156101d = arrayList;
        this.f156102e = -1;
        this.loadMoreLayout = jz5.h.b(new xu3.g(this));
        this.finderRecycler = jz5.h.b(new xu3.f(this));
        this.loadingState = jz5.h.b(new xu3.h(this));
        this.emptyState = jz5.h.b(new xu3.e(this));
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d3g, (android.view.ViewGroup) this, true);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment.1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new xu3.a();
            }
        }, arrayList, true);
        this.f156103f = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new xu3.c(this);
        getLoadMoreLayout().setEnablePullDownHeader(false);
        getLoadMoreLayout().setEnableRefresh(false);
        getLoadMoreLayout().setActionCallback(new xu3.d(this));
        getFinderRecycler().setAdapter(wxRecyclerAdapter);
        getFinderRecycler().setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(getContext(), 3));
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        android.content.res.Resources resources = context2.getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        xu3.z zVar = new xu3.z(resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480318uf), resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480318uf), b3.l.getColor(context2, com.tencent.mm.R.color.BW_0), false, null);
        com.tencent.mm.view.recyclerview.WxRecyclerView finderRecycler = getFinderRecycler();
        if (finderRecycler != null) {
            finderRecycler.N(zVar);
        }
        f();
    }
}
