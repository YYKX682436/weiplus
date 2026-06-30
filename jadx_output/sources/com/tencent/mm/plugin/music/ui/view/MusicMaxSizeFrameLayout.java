package com.tencent.mm.plugin.music.ui.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/music/ui/view/MusicMaxSizeFrameLayout;", "Landroid/widget/FrameLayout;", "", "maxHeight", "Ljz5/f0;", "setMaxHeight", "maxWidth", "setMaxWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-music_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MusicMaxSizeFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f150827d;

    /* renamed from: e, reason: collision with root package name */
    public int f150828e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMaxSizeFrameLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        a(attrs, 0);
    }

    public final void a(android.util.AttributeSet attributeSet, int i17) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bl3.i.f21731b, i17, 0);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f150827d = (int) obtainStyledAttributes.getDimension(0, 0.0f);
            this.f150828e = (int) obtainStyledAttributes.getDimension(0, 0.0f);
            obtainStyledAttributes.recycle();
            com.tencent.mars.xlog.Log.i("Music.MusicMaxSizeFrameLayout", "[initAttribute],maxHeight:" + this.f150827d + ", maxWidth:" + this.f150828e);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f150827d >= 0 || this.f150828e >= 0) {
            int measuredHeight = getMeasuredHeight();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int i19 = this.f150827d;
            if (measuredHeight2 > i19) {
                measuredHeight = i19;
            }
            int measuredWidth2 = getMeasuredWidth();
            int i27 = this.f150828e;
            if (measuredWidth2 > i27) {
                measuredWidth = i27;
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }

    public final void setMaxHeight(int i17) {
        this.f150827d = i17;
    }

    public final void setMaxWidth(int i17) {
        this.f150828e = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMaxSizeFrameLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        a(attrs, i17);
    }
}
