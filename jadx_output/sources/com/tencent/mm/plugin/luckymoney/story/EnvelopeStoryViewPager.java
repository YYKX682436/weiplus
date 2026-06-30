package com.tencent.mm.plugin.luckymoney.story;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'¨\u00063"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeStoryViewPager;", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "Lin5/c;", "storyAdapter", "Ljz5/f0;", "setEnvelopeStoryAdapter", "Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeStoryVideoManager;", com.tencent.shadow.core.common.HostConstants.MANAGER_APPID, "setEnvelopeStoryVideoManager", "", "i2", "I", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "currentPosition", "Lcom/tencent/mm/view/MediaBannerIndicator;", "j2", "Lcom/tencent/mm/view/MediaBannerIndicator;", "getIndicator", "()Lcom/tencent/mm/view/MediaBannerIndicator;", "setIndicator", "(Lcom/tencent/mm/view/MediaBannerIndicator;)V", "indicator", "k2", "Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeStoryVideoManager;", "getStoryVideoManager", "()Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeStoryVideoManager;", "setStoryVideoManager", "(Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeStoryVideoManager;)V", "storyVideoManager", "", "m2", "Z", "getFirstLoopPlay", "()Z", "setFirstLoopPlay", "(Z)V", "firstLoopPlay", "n2", "getNeedLoopPlay", "setNeedLoopPlay", "needLoopPlay", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EnvelopeStoryViewPager extends com.tencent.mm.view.RecyclerHorizontalViewPager {

    /* renamed from: i2, reason: collision with root package name and from kotlin metadata */
    public int currentPosition;

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.view.MediaBannerIndicator indicator;

    /* renamed from: k2, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager storyVideoManager;

    /* renamed from: l2, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f145813l2;

    /* renamed from: m2, reason: collision with root package name and from kotlin metadata */
    public boolean firstLoopPlay;

    /* renamed from: n2, reason: collision with root package name and from kotlin metadata */
    public boolean needLoopPlay;

    /* renamed from: o2, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f145816o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnvelopeStoryViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.firstLoopPlay = true;
        this.f145816o2 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.luckymoney.story.d1(this));
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    public final boolean getFirstLoopPlay() {
        return this.firstLoopPlay;
    }

    public final com.tencent.mm.view.MediaBannerIndicator getIndicator() {
        return this.indicator;
    }

    public final boolean getNeedLoopPlay() {
        return this.needLoopPlay;
    }

    public final com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager getStoryVideoManager() {
        return this.storyVideoManager;
    }

    public final boolean h1(int i17) {
        androidx.recyclerview.widget.k3 p07 = p0(i17);
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        java.util.Objects.toString(s0Var);
        if (s0Var == null) {
            return false;
        }
        java.lang.Object obj = s0Var.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        return ((com.tencent.mm.plugin.luckymoney.story.h0) obj).f145875d.f384774d == 2;
    }

    public final void i1(int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f145813l2;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("storyDataAdapter");
            throw null;
        }
        wxRecyclerAdapter.getItemCount();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f145813l2;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("storyDataAdapter");
            throw null;
        }
        if (wxRecyclerAdapter2.getItemCount() <= 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeStoryViewPager", "[startLoopPlay] storyDataAdapter.itemCount <= 1)");
            return;
        }
        this.needLoopPlay = true;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f145816o2;
        n3Var.removeMessages(1);
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = this.storyVideoManager;
        if (envelopeStoryVideoManager != null) {
            envelopeStoryVideoManager.f145809n = null;
        }
        if (i17 == 1) {
            if (this.currentPosition == 0 && this.firstLoopPlay) {
                n3Var.sendEmptyMessageDelayed(1, 1300L);
                return;
            } else {
                n3Var.sendEmptyMessageDelayed(1, 2000L);
                return;
            }
        }
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeStoryViewPager", "[startLoopPlay] unknown type)");
        } else if (envelopeStoryVideoManager != null) {
            envelopeStoryVideoManager.f145809n = new com.tencent.mm.plugin.luckymoney.story.e1(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.needLoopPlay = false;
        this.f145816o2.removeMessages(1);
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = this.storyVideoManager;
        if (envelopeStoryVideoManager != null) {
            envelopeStoryVideoManager.f145809n = null;
        }
    }

    public final void setCurrentPosition(int i17) {
        this.currentPosition = i17;
    }

    public final void setEnvelopeStoryAdapter(com.tencent.mm.view.recyclerview.WxRecyclerAdapter<in5.c> storyAdapter) {
        kotlin.jvm.internal.o.g(storyAdapter, "storyAdapter");
        this.f145813l2 = storyAdapter;
        super.setAdapter(storyAdapter);
    }

    public final void setEnvelopeStoryVideoManager(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager manager) {
        kotlin.jvm.internal.o.g(manager, "manager");
        this.storyVideoManager = manager;
    }

    public final void setFirstLoopPlay(boolean z17) {
        this.firstLoopPlay = z17;
    }

    public final void setIndicator(com.tencent.mm.view.MediaBannerIndicator mediaBannerIndicator) {
        this.indicator = mediaBannerIndicator;
    }

    public final void setNeedLoopPlay(boolean z17) {
        this.needLoopPlay = z17;
    }

    public final void setStoryVideoManager(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager) {
        this.storyVideoManager = envelopeStoryVideoManager;
    }
}
