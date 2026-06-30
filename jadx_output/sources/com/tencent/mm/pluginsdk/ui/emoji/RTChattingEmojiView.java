package com.tencent.mm.pluginsdk.ui.emoji;

/* loaded from: classes10.dex */
public class RTChattingEmojiView extends android.widget.FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f190819r = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f190820d;

    /* renamed from: e, reason: collision with root package name */
    public int f190821e;

    /* renamed from: f, reason: collision with root package name */
    public int f190822f;

    /* renamed from: g, reason: collision with root package name */
    public int f190823g;

    /* renamed from: h, reason: collision with root package name */
    public int f190824h;

    /* renamed from: i, reason: collision with root package name */
    public int f190825i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView f190826m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ProgressBar f190827n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f190828o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f190829p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f190830q;

    public RTChattingEmojiView(android.content.Context context) {
        super(context);
        this.f190820d = -1;
        this.f190830q = true;
    }

    public void a() {
        this.f190821e = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480391wm);
        this.f190822f = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480389wk);
        this.f190824h = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480393wo);
        this.f190825i = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480392wn);
        com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView chattingEmojiView = new com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView(getContext(), null);
        this.f190826m = chattingEmojiView;
        chattingEmojiView.setId(com.tencent.mm.R.id.t7g);
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(getContext());
        this.f190827n = progressBar;
        progressBar.setIndeterminateDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.avm));
        android.widget.TextView textView = new android.widget.TextView(getContext());
        this.f190828o = textView;
        textView.setText(com.tencent.mm.R.string.bxr);
        this.f190828o.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478914kn));
        int b17 = i65.a.b(getContext(), 32);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(b17, b17);
        layoutParams.gravity = 17;
        addView(this.f190827n, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        addView(this.f190828o, layoutParams2);
    }

    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo, long j17, boolean z17) {
        c(iEmojiInfo, j17, z17, new com.tencent.mm.storage.y4("").f196355c);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.tencent.mm.api.IEmojiInfo r19, long r20, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView.c(com.tencent.mm.api.IEmojiInfo, long, boolean, boolean):void");
    }

    public final void d(int i17) {
        this.f190820d = i17;
        if (i17 == 0) {
            this.f190827n.setVisibility(0);
            this.f190828o.setVisibility(4);
            this.f190826m.setVisibility(4);
            setBackgroundResource(com.tencent.mm.R.drawable.f482190b84);
            return;
        }
        if (i17 == 1) {
            this.f190827n.setVisibility(0);
            this.f190828o.setVisibility(4);
            this.f190826m.setVisibility(4);
            setBackgroundResource(com.tencent.mm.R.drawable.n_);
            return;
        }
        if (i17 == 2) {
            this.f190826m.setVisibility(0);
            this.f190827n.setVisibility(4);
            this.f190828o.setVisibility(4);
            setBackgroundResource(com.tencent.mm.R.drawable.f482190b84);
            return;
        }
        if (i17 != 3) {
            return;
        }
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.drawable.emoji_download_icon_samll);
        int i18 = this.f190823g;
        drawable.setBounds(0, 0, i18, i18);
        hashCode();
        this.f190828o.setCompoundDrawables(null, drawable, null, null);
        this.f190828o.setText(com.tencent.mm.R.string.bxr);
        this.f190828o.setVisibility(0);
        this.f190827n.setVisibility(4);
        this.f190826m.setVisibility(4);
        setBackgroundResource(com.tencent.mm.R.drawable.n_);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f190820d;
        if (i19 == 0 || i19 == 1 || i19 == 3) {
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f190829p;
            int max = (iEmojiInfo == null || iEmojiInfo.getHeight() == 0) ? this.f190821e : java.lang.Math.max((int) (this.f190829p.getHeight() * this.f190826m.getEmojiDensityScale()), this.f190822f);
            int i27 = this.f190821e;
            if (max > i27) {
                max = i27;
            }
            int i28 = this.f190824h;
            this.f190823g = i28;
            int i29 = this.f190822f;
            if (max >= i29) {
                int i37 = this.f190825i;
                if (max < (i28 - i37) + i29) {
                    this.f190823g = i37 + (max - i29);
                }
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public boolean performClick() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.RTChattingEmojiView", "performClick: %s", java.lang.Integer.valueOf(this.f190820d));
        int i17 = this.f190820d;
        if (i17 == 3) {
            this.f190830q = false;
            this.f190826m.z();
            return true;
        }
        if (i17 == 2) {
            return super.performClick();
        }
        return true;
    }

    public void setChattingEmojiMaxSize(int i17) {
        this.f190821e = i17;
        this.f190826m.setChattingEmojiMaxSize(i17);
    }

    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        d(2);
        if (this.f190826m == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.setDensity(this.f190826m.getEmojiDensity());
        this.f190826m.setImageBitmap(bitmap);
    }

    public RTChattingEmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f190820d = -1;
        this.f190830q = true;
    }

    public RTChattingEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f190820d = -1;
        this.f190830q = true;
    }
}
