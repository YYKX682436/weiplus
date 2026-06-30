package com.tencent.mm.pluginsdk.ui.emoji;

/* loaded from: classes10.dex */
public class MMEmojiView extends com.tencent.mm.plugin.gif.MMAnimateView {

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiInfo f190812n;

    /* renamed from: o, reason: collision with root package name */
    public int f190813o;

    /* renamed from: p, reason: collision with root package name */
    public int f190814p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f190815q;

    public MMEmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        z(context);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        float f17;
        super.setImageDrawable(drawable);
        if (drawable == null || this.f190812n == null) {
            return;
        }
        if (drawable instanceof com.tencent.mm.plugin.gif.k) {
            f17 = ((com.tencent.mm.plugin.gif.k) drawable).e();
        } else if (drawable instanceof com.tencent.mm.plugin.gif.u) {
            f17 = ((com.tencent.mm.plugin.gif.u) drawable).e();
        } else if (!(drawable instanceof android.graphics.drawable.BitmapDrawable)) {
            return;
        } else {
            f17 = 1.0f;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth() / f17;
        float intrinsicHeight = drawable.getIntrinsicHeight() / f17;
        if (this.f190815q) {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f190812n;
            if (emojiInfo.field_width == 0 || emojiInfo.field_height == 0) {
                emojiInfo.field_width = (int) intrinsicWidth;
                emojiInfo.field_height = (int) intrinsicHeight;
                ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(this.f190812n);
            }
        }
    }

    public void setIsMaxSizeLimit(boolean z17) {
        if (!z17) {
            setMaxHeight(Integer.MAX_VALUE);
            setMaxHeight(Integer.MAX_VALUE);
        } else {
            setAdjustViewBounds(true);
            setMaxWidth(this.f190813o);
            setMaxHeight(this.f190813o);
        }
    }

    public void setMaxSize(int i17) {
        this.f190813o = i17;
    }

    public void setUpdateEmojiSize(boolean z17) {
        this.f190815q = z17;
    }

    public final void z(android.content.Context context) {
        this.f190813o = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480391wm);
        this.f190814p = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480390wl);
        i65.a.B(context);
        setAdjustViewBounds(true);
        setMaxWidth(this.f190813o);
        setMaxHeight(this.f190813o);
        setMinimumWidth(this.f190814p);
        setMinimumHeight(this.f190814p);
    }

    public MMEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f190815q = false;
        z(context);
    }
}
