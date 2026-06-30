package com.tencent.mm.pluginsdk.ui.emoji;

/* loaded from: classes10.dex */
public class ChattingEmojiView extends com.tencent.mm.emoji.view.EmojiStatusView {

    /* renamed from: r, reason: collision with root package name */
    public int f190808r;

    /* renamed from: s, reason: collision with root package name */
    public int f190809s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f190810t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f190811u;

    public ChattingEmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        int intrinsicWidth;
        int intrinsicHeight;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo;
        super.onMeasure(i17, i18);
        if (getStatus() == 1 || (iEmojiInfo = this.f190810t) == null) {
            intrinsicWidth = getIntrinsicWidth();
            intrinsicHeight = getIntrinsicHeight();
        } else {
            int width = (int) (iEmojiInfo.getWidth() * getEmojiDensityScale());
            int height = (int) (this.f190810t.getHeight() * getEmojiDensityScale());
            if (width <= 0) {
                width = this.f190808r;
            }
            if (height <= 0) {
                height = this.f190808r;
            }
            intrinsicWidth = java.lang.Math.max(0, width);
            intrinsicHeight = java.lang.Math.max(0, height);
        }
        if (intrinsicWidth <= 0) {
            intrinsicWidth = this.f190808r;
        }
        if (intrinsicHeight <= 0) {
            intrinsicHeight = this.f190808r;
        }
        int i19 = this.f190809s;
        if (intrinsicHeight < i19 || intrinsicWidth < i19) {
            if (intrinsicWidth < intrinsicHeight) {
                intrinsicHeight = (int) (intrinsicHeight * (i19 / intrinsicWidth));
                intrinsicWidth = i19;
            } else if (intrinsicHeight < intrinsicWidth) {
                intrinsicWidth = (int) (intrinsicWidth * (i19 / intrinsicHeight));
                intrinsicHeight = i19;
            } else {
                intrinsicWidth = i19;
                intrinsicHeight = intrinsicWidth;
            }
        }
        int i27 = this.f190808r;
        if (intrinsicWidth > i27 || intrinsicHeight > i27) {
            if (intrinsicWidth > intrinsicHeight) {
                intrinsicHeight = (int) (intrinsicHeight * (i27 / intrinsicWidth));
                intrinsicWidth = i27;
            } else if (intrinsicHeight > intrinsicWidth) {
                intrinsicWidth = (int) (intrinsicWidth * (i27 / intrinsicHeight));
                intrinsicHeight = i27;
            } else {
                intrinsicWidth = i27;
                intrinsicHeight = intrinsicWidth;
            }
        }
        setMeasuredDimension(intrinsicWidth, intrinsicHeight);
    }

    public void setChattingEmojiMaxSize(int i17) {
        this.f190808r = i17;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    public void z() {
        if (this.f190810t == null) {
            ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).getClass();
            zq.h.f474972a.b(this);
            return;
        }
        setStatusNotify(0);
        com.tencent.mm.feature.emoji.api.w5 w5Var = (com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class);
        com.tencent.mm.api.IEmojiInfo emojiInfo = this.f190810t;
        java.lang.String cacheKey = this.f190811u;
        ((com.tencent.mm.feature.emoji.m0) w5Var).getClass();
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(cacheKey, "cacheKey");
        zq.h hVar = zq.h.f474972a;
        dr.s.g(new dr.d((com.tencent.mm.storage.emotion.EmojiInfo) emojiInfo, this, cacheKey), false, 1, null);
    }

    public ChattingEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f190808r = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480391wm);
        this.f190809s = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480390wl);
        setDefaultImageResource(0);
        setGameUseCover(false);
    }
}
