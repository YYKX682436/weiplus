package com.tencent.mm.plugin.finder.profile;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0016J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfilePoiDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$a;", "", "size", "Ljz5/f0;", "setTopPadding", "Lcom/tencent/mm/plugin/finder/profile/b0;", "y", "Lcom/tencent/mm/plugin/finder/profile/b0;", "getPoiListView", "()Lcom/tencent/mm/plugin/finder/profile/b0;", "setPoiListView", "(Lcom/tencent/mm/plugin/finder/profile/b0;)V", "poiListView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfilePoiDrawer extends com.tencent.mm.view.drawer.RecyclerViewDrawer {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f123290z = 0;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.profile.b0 poiListView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfilePoiDrawer(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawer, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mm.plugin.finder.profile.b0 b0Var;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        android.widget.EditText editText;
        android.text.Editable text;
        super.c(z17, z18, i17);
        if (z17 || (b0Var = this.poiListView) == null || (fTSSearchView = b0Var.f123322p) == null || (ftsEditText = fTSSearchView.getFtsEditText()) == null || (editText = ftsEditText.getEditText()) == null || (text = editText.getText()) == null) {
            return;
        }
        text.clear();
    }

    public final com.tencent.mm.plugin.finder.profile.b0 getPoiListView() {
        return this.poiListView;
    }

    public final void setPoiListView(com.tencent.mm.plugin.finder.profile.b0 b0Var) {
        this.poiListView = b0Var;
    }

    public final void setTopPadding(int i17) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int dimensionPixelSize = (i17 >= 20 ? context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.by) : context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn)) + (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479649bo) * i17);
        int i18 = com.tencent.mm.ui.bh.a(context).f197136b;
        int i19 = (int) (i18 * 0.75f);
        if (dimensionPixelSize >= i19) {
            dimensionPixelSize = i19;
        }
        setTopOffset(i18 - dimensionPixelSize);
        setPadding(0, getTopOffset(), 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfilePoiDrawer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfilePoiDrawer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
