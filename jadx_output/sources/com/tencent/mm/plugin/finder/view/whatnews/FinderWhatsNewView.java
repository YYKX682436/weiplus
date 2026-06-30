package com.tencent.mm.plugin.finder.view.whatnews;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/whatnews/FinderWhatsNewView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "d", "Lyz5/a;", "getDetachFinish", "()Lyz5/a;", "setDetachFinish", "(Lyz5/a;)V", "detachFinish", "", "e", "Z", "getWithEnterAnim", "()Z", "setWithEnterAnim", "(Z)V", "withEnterAnim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderWhatsNewView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.a detachFinish;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean withEnterAnim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderWhatsNewView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.d(context);
        setId(com.tencent.mm.R.id.g57);
        int i17 = cy2.b.f224741a;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489100ba3, (android.view.ViewGroup) this, true);
        this.detachFinish = cy2.c.f224742d;
    }

    public final yz5.a getDetachFinish() {
        return this.detachFinish;
    }

    public final boolean getWithEnterAnim() {
        return this.withEnterAnim;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.dgt);
        int i17 = cy2.b.f224741a;
        button.setText(getContext().getResources().getString(com.tencent.mm.R.string.f9z));
        button.setOnClickListener(new cy2.e(this));
        post(new cy2.f(this));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        requestLayout();
    }

    public final void setDetachFinish(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.detachFinish = aVar;
    }

    public final void setWithEnterAnim(boolean z17) {
        this.withEnterAnim = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderWhatsNewView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.d(context);
        setId(com.tencent.mm.R.id.g57);
        int i18 = cy2.b.f224741a;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489100ba3, (android.view.ViewGroup) this, true);
        this.detachFinish = cy2.c.f224742d;
    }
}
