package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public class AddressView extends android.view.View implements com.tencent.mm.pluginsdk.ui.a0 {
    private static final java.lang.String TAG = "MicroMsg.AddressView";
    public final int AVATAR_LAYOUT_WIDTH;
    public final int AVATAR_PADDING;
    public final int AVATAR_START_POS;
    public final int AVATAR_WIDTH;
    public final int COMMON_PADDING;
    public final int DESCRIPTION_PADDING;
    public final float DESCRIPTION_TEXT_SIZE;
    private int NAME_RIGHT_PADDING;
    public final float NAME_TEXT_SIZE;
    public final int TEXT_TOP_PADDING;
    public final int WEIBO_ICON_SIZE;
    android.graphics.drawable.Drawable avatarDrawable;
    android.content.Context context;
    float density;
    java.lang.String description;
    private android.graphics.Paint.FontMetrics descriptionFontMetrics;
    private android.text.TextPaint descriptionPaint;
    java.lang.CharSequence destNickName;
    private android.text.TextPaint displayNamePaint;
    android.graphics.drawable.Drawable drawable;

    /* renamed from: fm, reason: collision with root package name */
    private android.graphics.Paint.FontMetrics f196550fm;
    android.text.StaticLayout layout;
    com.tencent.mm.ui.l mergeCallback;
    boolean nameIsSpanned;
    boolean needInvaildate;
    android.graphics.drawable.BitmapDrawable needMask;
    boolean needUpdatePostion;
    java.lang.CharSequence nickName;
    private int nickNameCurrentTextColor;
    int nickNameHeight;
    private android.content.res.ColorStateList nickNameTextColor;
    int nickNameWidth;
    android.text.StaticLayout nickNamelayout;

    public AddressView(android.content.Context context) {
        this(context, null, 0);
    }

    private android.text.TextPaint generateDescriptionPaint() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.DESCRIPTION_TEXT_SIZE);
        textPaint.setColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
        return textPaint;
    }

    private android.text.TextPaint generateOnePaint() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.NAME_TEXT_SIZE);
        textPaint.setColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        return textPaint;
    }

    private android.graphics.Paint.FontMetrics getFontMetrics() {
        if (this.displayNamePaint == null) {
            this.displayNamePaint = generateOnePaint();
        }
        if (this.f196550fm == null) {
            this.f196550fm = this.displayNamePaint.getFontMetrics();
        }
        return this.f196550fm;
    }

    private int getShowAreaWidth() {
        return (getTextAreaWidth() - getPaddingLeft()) - this.NAME_RIGHT_PADDING;
    }

    private void installAccessibilityDelegate() {
        n3.l1.l(this, new com.tencent.mm.ui.k(this));
    }

    public void doInvalidate() {
        invalidate();
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        updateTextColors();
        super.drawableStateChanged();
    }

    public int fromDPToPix(android.content.Context context, int i17) {
        return java.lang.Math.round(getDensity(context) * i17);
    }

    public float getDensity(android.content.Context context) {
        if (context == null) {
            context = getContext();
        }
        if (this.density < 0.0f) {
            this.density = context.getResources().getDisplayMetrics().density;
        }
        return this.density;
    }

    public float getDesiredWidth(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        if (charSequence instanceof android.text.Spanned) {
            return android.text.Layout.getDesiredWidth(charSequence, textPaint);
        }
        if (charSequence == null) {
            com.tencent.mars.xlog.Log.w(TAG, "source is null, set it empty.");
            charSequence = "";
        }
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public android.graphics.drawable.Drawable getDrawable() {
        return this.avatarDrawable;
    }

    public java.lang.CharSequence getNickName() {
        return this.nickName;
    }

    public float getNickNameSize() {
        return this.NAME_TEXT_SIZE;
    }

    public int getTextAreaWidth() {
        return (getMeasuredWidth() - this.AVATAR_LAYOUT_WIDTH) - this.AVATAR_PADDING;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.lang.String str;
        super.onDraw(canvas);
        updatePosition();
        android.graphics.drawable.Drawable drawable = this.avatarDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.needMask;
        if (bitmapDrawable != null) {
            bitmapDrawable.draw(canvas);
        }
        if (this.nameIsSpanned) {
            canvas.save();
            canvas.translate(this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING, (getHeight() - this.nickNameHeight) / 2);
            this.nickNamelayout.draw(canvas);
            canvas.restore();
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.description)) {
            java.lang.CharSequence charSequence = this.destNickName;
            if (charSequence != null) {
                int length = charSequence.length();
                float f17 = this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING;
                float height = getHeight();
                android.graphics.Paint.FontMetrics fontMetrics = this.f196550fm;
                float f18 = fontMetrics.bottom;
                float f19 = fontMetrics.top;
                canvas.drawText(charSequence, 0, length, f17, ((height - (f18 - f19)) / 2.0f) - f19, this.displayNamePaint);
                return;
            }
            return;
        }
        java.lang.CharSequence charSequence2 = this.destNickName;
        if (charSequence2 != null) {
            int length2 = charSequence2.length();
            float f27 = this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING;
            float height2 = getHeight();
            android.graphics.Paint.FontMetrics fontMetrics2 = this.f196550fm;
            float f28 = fontMetrics2.bottom;
            float f29 = fontMetrics2.top;
            canvas.drawText(charSequence2, 0, length2, f27, this.TEXT_TOP_PADDING + (((height2 - (f28 - f29)) / 2.0f) - (f29 / 3.0f)), this.displayNamePaint);
            int width = getWidth();
            float measureText = this.descriptionPaint.measureText(this.description);
            java.lang.String str2 = this.description;
            if (measureText > width - this.DESCRIPTION_PADDING) {
                int i17 = 1;
                while (i17 < this.description.length()) {
                    java.lang.String substring = this.description.substring(0, i17);
                    if (this.descriptionPaint.measureText(substring) >= width - this.DESCRIPTION_PADDING) {
                        str = str2 + "...";
                        break;
                    }
                    i17++;
                    str2 = substring;
                }
            }
            str = str2;
            int length3 = str.length();
            float f37 = this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING;
            float height3 = getHeight();
            android.graphics.Paint.FontMetrics fontMetrics3 = this.descriptionFontMetrics;
            canvas.drawText(str, 0, length3, f37, this.TEXT_TOP_PADDING + (((height3 - (fontMetrics3.bottom - fontMetrics3.top)) / 2.0f) - ((int) (r5 * 1.7d))), (android.graphics.Paint) this.descriptionPaint);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        java.lang.CharSequence contentDescription = getContentDescription();
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) contentDescription)) {
            contentDescription = this.nickName;
        }
        accessibilityNodeInfo.setText(contentDescription);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        java.lang.CharSequence contentDescription = getContentDescription();
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) contentDescription)) {
            contentDescription = this.nickName;
        }
        accessibilityEvent.getText().add(contentDescription);
    }

    @Override // com.tencent.mm.pluginsdk.ui.a0
    public void onScrollStateChanged(boolean z17) {
        if (z17) {
            stopAvatarLoad();
        } else {
            resumeAvatarLoad();
        }
    }

    public void resumeAvatarLoad() {
        android.graphics.drawable.Drawable drawable = this.avatarDrawable;
        if (drawable != null) {
            com.tencent.mm.pluginsdk.ui.x xVar = (com.tencent.mm.pluginsdk.ui.x) drawable;
            if (xVar.f190898g) {
                xVar.f190898g = false;
                if (xVar.f190899h) {
                    xVar.f190899h = false;
                    xVar.invalidateSelf();
                }
            }
        }
    }

    public void setDescription(java.lang.String str) {
        this.description = str;
        if (this.descriptionPaint == null) {
            android.text.TextPaint generateDescriptionPaint = generateDescriptionPaint();
            this.descriptionPaint = generateDescriptionPaint;
            this.descriptionFontMetrics = generateDescriptionPaint.getFontMetrics();
        }
    }

    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.avatarDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void setMaskBitmap(android.graphics.Bitmap bitmap) {
        this.needMask = new android.graphics.drawable.BitmapDrawable(getResources(), bitmap);
    }

    public void setMergeCallback(com.tencent.mm.ui.l lVar) {
        if (lVar != null) {
            this.needInvaildate = true;
        }
    }

    public void setName(java.lang.CharSequence charSequence) {
        java.lang.CharSequence charSequence2 = this.nickName;
        if (charSequence2 == null || !charSequence2.equals(charSequence)) {
            this.needInvaildate = true;
        }
        this.nickName = charSequence;
        this.nameIsSpanned = charSequence instanceof android.text.Spanned;
        getFontMetrics();
    }

    public void setNickNameTextColor(android.content.res.ColorStateList colorStateList) {
        this.nickNameTextColor = colorStateList;
    }

    public void stopAvatarLoad() {
        android.graphics.drawable.Drawable drawable = this.avatarDrawable;
        if (drawable != null) {
            ((com.tencent.mm.pluginsdk.ui.x) drawable).f190898g = true;
        }
    }

    public void updatePosition() {
        if (this.needUpdatePostion) {
            this.nickNameWidth = (getTextAreaWidth() - getPaddingLeft()) - this.NAME_RIGHT_PADDING;
            int desiredWidth = (int) getDesiredWidth(this.nickName, this.displayNamePaint);
            int i17 = this.nickNameWidth;
            if (desiredWidth > i17) {
                this.destNickName = android.text.TextUtils.ellipsize(this.nickName, this.displayNamePaint, i17, android.text.TextUtils.TruncateAt.END);
            } else {
                java.lang.CharSequence charSequence = this.nickName;
                this.destNickName = charSequence;
                this.nickNameWidth = (int) getDesiredWidth(charSequence, this.displayNamePaint);
            }
            if (this.nickName instanceof android.text.Spanned) {
                android.text.StaticLayout staticLayout = new android.text.StaticLayout(this.destNickName, this.displayNamePaint, getWidth(), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                this.nickNamelayout = staticLayout;
                this.nickNameHeight = staticLayout.getHeight();
            } else {
                this.nickNamelayout = null;
                android.graphics.Paint.FontMetrics fontMetrics = getFontMetrics();
                this.nickNameHeight = ((int) java.lang.Math.ceil(fontMetrics.descent - fontMetrics.top)) + 2;
            }
            this.needUpdatePostion = false;
        }
    }

    public void updatePositionFlag() {
        this.needUpdatePostion = true;
        if (this.needInvaildate) {
            invalidate();
            this.needInvaildate = false;
        }
    }

    public void updateTextColors() {
        int colorForState;
        android.content.res.ColorStateList colorStateList = this.nickNameTextColor;
        if (colorStateList == null || (colorForState = colorStateList.getColorForState(getDrawableState(), 0)) == this.nickNameCurrentTextColor) {
            return;
        }
        this.nickNameCurrentTextColor = colorForState;
        if (this.displayNamePaint == null) {
            this.displayNamePaint = generateOnePaint();
        }
        this.displayNamePaint.setColor(this.nickNameCurrentTextColor);
    }

    public AddressView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddressView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.drawable = getResources().getDrawable(com.tencent.mm.R.drawable.f482101bn4);
        this.needUpdatePostion = true;
        this.AVATAR_LAYOUT_WIDTH = 0;
        this.AVATAR_WIDTH = 0;
        this.NAME_TEXT_SIZE = i65.a.h(context, com.tencent.mm.R.dimen.f479897ia);
        this.DESCRIPTION_TEXT_SIZE = i65.a.h(context, com.tencent.mm.R.dimen.f479930ja);
        this.WEIBO_ICON_SIZE = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479922j1);
        this.AVATAR_START_POS = 0;
        this.AVATAR_PADDING = 0;
        this.COMMON_PADDING = 0;
        this.DESCRIPTION_PADDING = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479870hj) * 2;
        this.TEXT_TOP_PADDING = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_);
        this.NAME_RIGHT_PADDING = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479561d);
        if (this.displayNamePaint == null) {
            this.displayNamePaint = generateOnePaint();
        }
    }
}
