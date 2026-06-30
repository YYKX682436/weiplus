package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveCustomBgImageView;", "Landroid/widget/ImageView;", "Lcom/tencent/mm/plugin/finder/live/widget/hd;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnDrawableChangedListener", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveCustomBgImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.hd f117602d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveCustomBgImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f117602d = null;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.plugin.finder.live.widget.hd hdVar;
        super.setImageDrawable(drawable);
        if (drawable == null || (hdVar = this.f117602d) == null) {
            return;
        }
        ((com.tencent.mm.plugin.finder.live.widget.on) hdVar).a(drawable);
    }

    public final void setOnDrawableChangedListener(com.tencent.mm.plugin.finder.live.widget.hd hdVar) {
        com.tencent.mm.plugin.finder.live.widget.hd hdVar2;
        this.f117602d = hdVar;
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null || (hdVar2 = this.f117602d) == null) {
            return;
        }
        ((com.tencent.mm.plugin.finder.live.widget.on) hdVar2).a(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveCustomBgImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
