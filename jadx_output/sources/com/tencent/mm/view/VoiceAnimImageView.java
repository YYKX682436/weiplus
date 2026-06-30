package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB'\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/view/VoiceAnimImageView;", "Landroid/widget/RelativeLayout;", "", "iconColor", "Ljz5/f0;", "setIconColor", "", "d", "J", "getDuration", "()J", "setDuration", "(J)V", "duration", "", "e", "Z", "isPlaying", "()Z", "setPlaying", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class VoiceAnimImageView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long duration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isPlaying;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f213516f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.AnimationDrawable f213517g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoiceAnimImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final long getDuration() {
        return this.duration;
    }

    public final void setDuration(long j17) {
        this.duration = j17;
    }

    public final void setIconColor(int i17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f213516f;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("animShape");
            throw null;
        }
        weImageView.setIconColor(i17);
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("animShape");
            throw null;
        }
        weImageView.setColorFilter(i17);
        if (weImageView != null) {
            weImageView.invalidate();
        } else {
            kotlin.jvm.internal.o.o("animShape");
            throw null;
        }
    }

    public final void setPlaying(boolean z17) {
        this.isPlaying = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAnimImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.duration = 300L;
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.eqh, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.u7u);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        this.f213516f = weImageView;
        android.graphics.drawable.Drawable drawable = weImageView.getDrawable();
        kotlin.jvm.internal.o.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        this.f213517g = (android.graphics.drawable.AnimationDrawable) drawable;
    }
}
