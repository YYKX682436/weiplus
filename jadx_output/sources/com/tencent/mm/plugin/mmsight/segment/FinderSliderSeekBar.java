package com.tencent.mm.plugin.mmsight.segment;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/mmsight/segment/FinderSliderSeekBar;", "Lcom/tencent/mm/plugin/mmsight/segment/SliderSeekBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderSliderSeekBar extends com.tencent.mm.plugin.mmsight.segment.SliderSeekBar {
    public FinderSliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.SliderSeekBar
    public void e() {
        if (!this.D) {
            android.graphics.drawable.Drawable drawable = this.f148946n;
            int i17 = this.f148958z;
            drawable.setBounds(i17 - this.f148948p, 0, i17, getHeight());
            android.graphics.drawable.Drawable drawable2 = this.f148947o;
            int i18 = this.f148958z;
            int i19 = this.f148942g;
            drawable2.setBounds(i18 + i19, 0, i19 + i18 + this.f148948p, getHeight());
            return;
        }
        android.graphics.drawable.Drawable drawable3 = this.f148946n;
        int i27 = this.f148958z;
        drawable3.setBounds(i27, 0, this.f148948p + i27, getHeight());
        android.graphics.drawable.Drawable drawable4 = this.f148947o;
        int i28 = this.f148958z;
        int i29 = this.f148942g;
        int i37 = this.f148948p;
        drawable4.setBounds(i28 + i29 + i37, 0, i28 + i29 + (i37 * 2), getHeight());
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.SliderSeekBar
    public boolean f(boolean z17, float f17) {
        android.graphics.drawable.Drawable drawable;
        float f18;
        float f19;
        if (!this.f148940e || (drawable = this.f148946n) == null || this.f148947o == null || drawable.getBounds().width() <= 0 || this.f148947o.getBounds().width() <= 0) {
            return false;
        }
        if (z17) {
            f19 = this.f148947o.getBounds().left - this.f148943h;
            int i17 = this.f148958z + this.f148948p;
            int i18 = this.f148947o.getBounds().left - this.f148942g;
            if (i17 < i18) {
                i17 = i18;
            }
            f18 = i17;
        } else {
            f18 = this.f148946n.getBounds().right + this.f148943h;
            int width = (getWidth() - this.f148958z) - this.f148948p;
            int i19 = this.f148946n.getBounds().right + this.f148942g;
            if (width > i19) {
                width = i19;
            }
            f19 = width;
        }
        if (f17 > f19) {
            f17 = f19;
        }
        if (f18 >= f17) {
            f17 = f18;
        }
        boolean z18 = true;
        if (!(f17 == f18)) {
            if (!(f17 == f19)) {
                z18 = false;
            }
        }
        if (z17) {
            android.graphics.Rect bounds = this.f148946n.getBounds();
            kotlin.jvm.internal.o.f(bounds, "getBounds(...)");
            bounds.offsetTo((int) (f17 - this.f148948p), 0);
            this.f148946n.setBounds(bounds);
        } else {
            android.graphics.Rect bounds2 = this.f148947o.getBounds();
            kotlin.jvm.internal.o.f(bounds2, "getBounds(...)");
            bounds2.offsetTo((int) f17, 0);
            this.f148947o.setBounds(bounds2);
        }
        postInvalidate();
        return z18;
    }

    public FinderSliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    public FinderSliderSeekBar(android.content.Context context) {
        super(context, null);
    }
}
