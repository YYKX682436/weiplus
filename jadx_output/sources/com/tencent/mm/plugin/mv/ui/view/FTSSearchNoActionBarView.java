package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R(\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/FTSSearchNoActionBarView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/plugin/mv/ui/view/j;", "searchViewListener", "Ljz5/f0;", "setSearchViewListener", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "<set-?>", "e", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "getFtsEditText", "()Lcom/tencent/mm/ui/search/FTSEditTextView;", "ftsEditText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FTSSearchNoActionBarView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f151594d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.ui.search.FTSEditTextView ftsEditText;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.j f151596f;

    public FTSSearchNoActionBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        java.lang.Object systemService = getContext().getSystemService("layout_inflater");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((android.view.LayoutInflater) systemService).inflate(com.tencent.mm.R.layout.f489122bd1, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.b5i);
        this.f151594d = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.mv.ui.view.k(this));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.meb);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.gfl);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type com.tencent.mm.ui.search.FTSEditTextView");
        this.ftsEditText = (com.tencent.mm.ui.search.FTSEditTextView) findViewById2;
    }

    public final com.tencent.mm.ui.search.FTSEditTextView getFtsEditText() {
        return this.ftsEditText;
    }

    public final void setSearchViewListener(com.tencent.mm.plugin.mv.ui.view.j jVar) {
        this.f151596f = jVar;
    }

    public FTSSearchNoActionBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
