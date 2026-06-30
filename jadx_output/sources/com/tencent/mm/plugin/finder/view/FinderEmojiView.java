package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010&R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR6\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderEmojiView;", "Lcom/tencent/mm/emoji/view/EmojiStatusView;", "", "s", "I", "getEmojiMaxSize", "()I", "setEmojiMaxSize", "(I)V", "emojiMaxSize", "t", "getEmojiMinSize", "setEmojiMinSize", "emojiMinSize", "Lkotlin/Function2;", "", "", "Ljz5/f0;", "u", "Lyz5/p;", "getDownloadListener", "()Lyz5/p;", "setDownloadListener", "(Lyz5/p;)V", "downloadListener", "Lsr/a;", org.chromium.base.BaseSwitches.V, "Lsr/a;", "getDelegate", "()Lsr/a;", "delegate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderEmojiView extends com.tencent.mm.emoji.view.EmojiStatusView {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f131010r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int emojiMaxSize;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int emojiMinSize;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public yz5.p downloadListener;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final sr.a delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131010r = "MicroMsg.FinderEmojiView";
        this.emojiMaxSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479662c0);
        this.emojiMinSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        com.tencent.mm.feature.emoji.api.k6 k6Var = (com.tencent.mm.feature.emoji.api.k6) i95.n0.c(com.tencent.mm.feature.emoji.api.k6.class);
        com.tencent.mm.plugin.finder.view.c8 c8Var = new com.tencent.mm.plugin.finder.view.c8(this);
        ((com.tencent.mm.feature.emoji.j2) k6Var).getClass();
        this.delegate = new sr.m(this, c8Var);
    }

    @Override // com.tencent.mm.emoji.view.AbsEmojiView
    public sr.a getDelegate() {
        return this.delegate;
    }

    public final yz5.p getDownloadListener() {
        return this.downloadListener;
    }

    public final int getEmojiMaxSize() {
        return this.emojiMaxSize;
    }

    public final int getEmojiMinSize() {
        return this.emojiMinSize;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getEmojiInfo() == null || getStatus() == 1) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reload onAttachedToWindow ");
        com.tencent.mm.api.IEmojiInfo emojiInfo = getEmojiInfo();
        sb6.append(emojiInfo != null ? emojiInfo.getMd5() : null);
        com.tencent.mars.xlog.Log.i(this.f131010r, sb6.toString());
        getDelegate().reload();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        int intrinsicWidth;
        int intrinsicHeight;
        super.onMeasure(i17, i18);
        if (getStatus() == 1 || getEmojiInfo() == null) {
            intrinsicWidth = getIntrinsicWidth();
            intrinsicHeight = getIntrinsicHeight();
        } else {
            kotlin.jvm.internal.o.d(getEmojiInfo());
            intrinsicWidth = (int) (r3.b0() * getEmojiDensityScale());
            kotlin.jvm.internal.o.d(getEmojiInfo());
            intrinsicHeight = (int) (r4.t1() * getEmojiDensityScale());
            if (intrinsicWidth <= 0) {
                intrinsicWidth = this.emojiMaxSize;
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = this.emojiMaxSize;
            }
            if (intrinsicWidth <= 0) {
                intrinsicWidth = 0;
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = 0;
            }
        }
        if (intrinsicWidth <= 0) {
            intrinsicWidth = this.emojiMaxSize;
        }
        if (intrinsicHeight <= 0) {
            intrinsicHeight = this.emojiMaxSize;
        }
        int i19 = this.emojiMinSize;
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
        int i27 = this.emojiMaxSize;
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

    public final void setDownloadListener(yz5.p pVar) {
        this.downloadListener = pVar;
    }

    public final void setEmojiMaxSize(int i17) {
        this.emojiMaxSize = i17;
    }

    public final void setEmojiMinSize(int i17) {
        this.emojiMinSize = i17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderEmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
