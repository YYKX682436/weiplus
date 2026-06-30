package com.tencent.mm.plugin.story.ui.view.gallery;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010:\u001a\u000209\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020!¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006@"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryItemView;", "Landroid/widget/RelativeLayout;", "Lsf4/j2;", "videoViewMgr", "Ljz5/f0;", "setVideoViewMgr", "", "isMute", "setMute", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "getThumbView", "()Landroid/widget/ImageView;", "thumbView", "Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "f", "Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "getCommentView", "()Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "commentView", "Lcom/tencent/mm/plugin/story/ui/view/StoryMsgView;", "g", "Lcom/tencent/mm/plugin/story/ui/view/StoryMsgView;", "getMsgView", "()Lcom/tencent/mm/plugin/story/ui/view/StoryMsgView;", "msgView", "", "h", "I", "getPosition", "()I", "setPosition", "(I)V", "position", "Lif4/h;", "i", "Lif4/h;", "getVideoItem", "()Lif4/h;", "setVideoItem", "(Lif4/h;)V", "videoItem", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;", "m", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;", "getPostTipView", "()Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;", "setPostTipView", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;)V", "postTipView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StoryGalleryItemView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final android.widget.ImageView thumbView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.plugin.story.ui.view.StoryCommentView commentView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.plugin.story.ui.view.StoryMsgView msgView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public if4.h videoItem;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryPostTip postTipView;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.ViewGroup f172079n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.FrameLayout.LayoutParams f172080o;

    /* renamed from: p, reason: collision with root package name */
    public sf4.j2 f172081p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryGalleryItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MircoMsg.StoryGalleryItemView";
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        this.f172080o = new android.widget.FrameLayout.LayoutParams(-1, -1);
        setBackgroundColor(-16777216);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f172079n = frameLayout;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.thumbView = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        addView(imageView, layoutParams);
        addView(frameLayout, layoutParams);
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = new com.tencent.mm.plugin.story.ui.view.StoryCommentView(context, null);
        this.commentView = storyCommentView;
        addView(storyCommentView, layoutParams);
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = new com.tencent.mm.plugin.story.ui.view.StoryMsgView(context, null, 0);
        this.msgView = storyMsgView;
        addView(storyMsgView, layoutParams);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.postTipView = new com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryPostTip(context2, null, 0);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, com.tencent.mm.ui.bl.a(getContext()) + com.tencent.mm.ui.bl.j(getContext()));
        layoutParams2.addRule(10);
        addView(this.postTipView, layoutParams2);
        if (bf4.f.f19715b.f()) {
            storyMsgView.setVisibility(0);
            storyCommentView.setVisibility(8);
        } else {
            storyMsgView.setVisibility(8);
            storyCommentView.setVisibility(0);
        }
    }

    public final void a() {
        boolean f17 = bf4.f.f19715b.f();
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.commentView;
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.msgView;
        if (f17) {
            storyMsgView.setVisibility(0);
            storyCommentView.setVisibility(8);
        } else {
            storyMsgView.setVisibility(8);
            storyCommentView.setVisibility(0);
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i(this.TAG, "switchVideoMode");
        if4.h hVar = this.videoItem;
        android.view.ViewGroup viewGroup = this.f172079n;
        if (hVar != null) {
            hVar.a();
            hVar.b();
            sf4.j2 j2Var = this.f172081p;
            if (j2Var != null) {
                j2Var.b(viewGroup, this.f172080o);
            }
            sf4.j2 j2Var2 = this.f172081p;
            if (j2Var2 != null) {
                j2Var2.c(hVar, false);
            }
        }
        viewGroup.setVisibility(0);
        boolean f17 = bf4.f.f19715b.f();
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.commentView;
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.msgView;
        if (f17) {
            storyMsgView.setVisibility(0);
            storyCommentView.setVisibility(8);
            storyMsgView.d();
        } else {
            storyMsgView.setVisibility(8);
            storyCommentView.setVisibility(0);
            storyCommentView.I = true;
            storyCommentView.e();
        }
        if4.h hVar2 = this.videoItem;
        if (hVar2 != null) {
            java.lang.String user = hVar2.f291256d;
            kotlin.jvm.internal.o.g(user, "user");
            long j17 = mf4.c.f326152d;
            long j18 = hVar2.f291254b;
            if (j17 > 0) {
                if (0 != j18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StoryBrowseIDKeyStat", "reset storyId markStoryId: 0 storyId " + j18);
                } else {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    java.lang.System.currentTimeMillis();
                }
            }
            mf4.b bVar = mf4.b.f326142a;
            kotlin.jvm.internal.o.g(user, "user");
            if (bVar.a()) {
                mf4.b bVar2 = mf4.b.f326142a;
                mf4.b.f326143b = j18;
            }
        }
    }

    public final com.tencent.mm.plugin.story.ui.view.StoryCommentView getCommentView() {
        return this.commentView;
    }

    public final com.tencent.mm.plugin.story.ui.view.StoryMsgView getMsgView() {
        return this.msgView;
    }

    public final int getPosition() {
        return this.position;
    }

    public final com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryPostTip getPostTipView() {
        return this.postTipView;
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    public final android.widget.ImageView getThumbView() {
        return this.thumbView;
    }

    public final if4.h getVideoItem() {
        return this.videoItem;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f172081p = null;
    }

    public final void setMute(boolean z17) {
        sf4.j2 j2Var = this.f172081p;
        if (j2Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "setMute " + z17 + " ret ");
            j2Var.f407501c = z17;
        }
    }

    public final void setPosition(int i17) {
        this.position = i17;
    }

    public final void setPostTipView(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryPostTip storyGalleryPostTip) {
        this.postTipView = storyGalleryPostTip;
    }

    public final void setVideoItem(if4.h hVar) {
        this.videoItem = hVar;
    }

    public final void setVideoViewMgr(sf4.j2 j2Var) {
        this.f172081p = j2Var;
    }
}
