package com.tencent.mm.plugin.location.ui.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/location/ui/impl/LocationCrossHairView;", "Landroid/widget/FrameLayout;", "", "selected", "Ljz5/f0;", "setSelected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-map_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LocationCrossHairView extends android.widget.FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationCrossHairView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        super.setSelected(z17);
        android.view.View childAt = getChildAt(0);
        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) childAt).setIconColor(getResources().getColor(z17 ? com.tencent.mm.R.color.Blue_80 : com.tencent.mm.R.color.f478714f5));
    }
}
