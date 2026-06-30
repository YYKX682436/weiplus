package com.tencent.mm.plugin.finder.view.interactioneasteregg;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R*\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggDarkPreview;", "Lcom/tencent/mm/ui/widget/RoundCornerLinearLayout;", "Landroid/animation/Animator;", "getDislikeOptionAnimation", "", "value", "p", "Z", "isThumbLike", "()Z", "setThumbLike", "(Z)V", "Lcom/tencent/mm/api/IEmojiInfo;", "getEmoji", "()Lcom/tencent/mm/api/IEmojiInfo;", "setEmoji", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "emoji", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class CenterInteractionEasterEggDarkPreview extends com.tencent.mm.ui.widget.RoundCornerLinearLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f132388r = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg f132389f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f132390g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f132391h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f132392i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f132393m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f132394n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f132395o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean isThumbLike;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f132397q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterInteractionEasterEggDarkPreview(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132397q = new int[2];
    }

    private final android.animation.Animator getDislikeOptionAnimation() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(10L);
        if (this.isThumbLike) {
            weImageView = this.f132391h;
            weImageView2 = this.f132392i;
        } else {
            weImageView = this.f132393m;
            weImageView2 = this.f132394n;
        }
        ofFloat.addUpdateListener(new ox2.t(weImageView2, weImageView));
        ox2.u uVar = new ox2.u(weImageView2, weImageView);
        ofFloat.addListener(new ox2.v(uVar, uVar));
        return ofFloat;
    }

    public final void d() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2;
        if (this.f132395o) {
            if (this.isThumbLike) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f132394n;
                if (weImageView3 != null) {
                    weImageView3.setAlpha(0.0f);
                }
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f132392i;
                if (weImageView4 != null) {
                    weImageView4.setAlpha(0.0f);
                }
            }
            com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = this.f132389f;
            com.tencent.mm.view.MMPAGView mMPAGView = this.f132390g;
            if (centerInteractionEasterEgg == null || mMPAGView == null) {
                return;
            }
            android.animation.AnimatorSet b17 = centerInteractionEasterEgg.b(400L, mMPAGView, null);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(mMPAGView, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ox2.y yVar = new ox2.y(mMPAGView);
            ofFloat.addListener(new ox2.z(yVar, yVar));
            ofFloat.addListener(new ox2.b0(this));
            android.animation.Animator dislikeOptionAnimation = getDislikeOptionAnimation();
            if (this.isThumbLike) {
                weImageView = this.f132391h;
                weImageView2 = this.f132392i;
            } else {
                weImageView = this.f132393m;
                weImageView2 = this.f132394n;
            }
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 1.2f, 1.0f, 0.8f, 1.0f);
            ofFloat2.setStartDelay(0L);
            int i17 = s26.a.f402368f;
            ofFloat2.setDuration(s26.a.e(s26.c.d(0.5d, s26.d.f402372g)));
            ofFloat2.addUpdateListener(new ox2.w(weImageView2));
            ofFloat2.addListener(new ox2.x(weImageView, weImageView2));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            java.util.List b18 = kz5.b0.b();
            lz5.e eVar = (lz5.e) b18;
            eVar.add(dislikeOptionAnimation);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.setStartDelay(500L);
            animatorSet2.playTogether(ofFloat2, ofFloat);
            eVar.add(animatorSet2);
            if (b17 != null) {
                eVar.add(b17);
            }
            animatorSet.playSequentially(kz5.b0.a(b18));
            animatorSet.addListener(new ox2.c0(mMPAGView, this));
            animatorSet.start();
        }
    }

    public final com.tencent.mm.api.IEmojiInfo getEmoji() {
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = this.f132389f;
        if (centerInteractionEasterEgg != null) {
            return centerInteractionEasterEgg.getEmoji();
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = (com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg) findViewById(com.tencent.mm.R.id.f483595sp0);
        this.f132389f = centerInteractionEasterEgg;
        if (centerInteractionEasterEgg != null) {
            centerInteractionEasterEgg.setPreview(true);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.uoe);
        this.f132390g = mMPAGView;
        if (mMPAGView != null) {
            mMPAGView.setAlpha(0.0f);
        }
        this.f132391h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.u7q);
        this.f132392i = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.u7r);
        this.f132393m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.u7_);
        this.f132394n = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.u7a);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f132392i;
        if (weImageView != null) {
            weImageView.setAlpha(0.0f);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f132394n;
        if (weImageView2 == null) {
            return;
        }
        weImageView2.setAlpha(0.0f);
    }

    public final void setEmoji(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = this.f132389f;
        if (centerInteractionEasterEgg != null) {
            centerInteractionEasterEgg.e(0L, null, iEmojiInfo);
        }
    }

    public final void setThumbLike(boolean z17) {
        this.isThumbLike = z17;
        if (z17) {
            com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = this.f132389f;
            if (centerInteractionEasterEgg != null) {
                centerInteractionEasterEgg.g();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg2 = this.f132389f;
        if (centerInteractionEasterEgg2 != null) {
            centerInteractionEasterEgg2.f();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterInteractionEasterEggDarkPreview(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132397q = new int[2];
    }
}
