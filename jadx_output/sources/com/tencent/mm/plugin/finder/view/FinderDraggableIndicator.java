package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderDraggableIndicator;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "g", "Lyz5/a;", "getOnBottomSheetDismiss", "()Lyz5/a;", "setOnBottomSheetDismiss", "(Lyz5/a;)V", "onBottomSheetDismiss", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderDraggableIndicator extends android.widget.FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f130979i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f130980d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f130981e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f130982f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.a onBottomSheetDismiss;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f130984h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderDraggableIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e6j, (android.view.ViewGroup) this, true);
        this.f130980d = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.u1r);
        this.f130981e = inflate.findViewById(com.tencent.mm.R.id.u1s);
        this.f130982f = inflate.findViewById(com.tencent.mm.R.id.u1q);
    }

    public final yz5.a getOnBottomSheetDismiss() {
        return this.onBottomSheetDismiss;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f130984h;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.f44453z = null;
        }
        this.f130984h = null;
    }

    public final void setOnBottomSheetDismiss(yz5.a aVar) {
        this.onBottomSheetDismiss = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderDraggableIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e6j, (android.view.ViewGroup) this, true);
        this.f130980d = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.u1r);
        this.f130981e = inflate.findViewById(com.tencent.mm.R.id.u1s);
        this.f130982f = inflate.findViewById(com.tencent.mm.R.id.u1q);
    }
}
