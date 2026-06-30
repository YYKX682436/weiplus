package com.tencent.mm.plugin.finder.live.convert.danmaku;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\b\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/convert/danmaku/FinderLiveFeedDanmakuTextureView;", "Landroid/view/TextureView;", "Lcg2/k;", "Landroid/view/View;", "getView", "", "d", "Z", "isReuse", "()Z", "setReuse", "(Z)V", "Lso2/h1;", "e", "Lso2/h1;", "getFeed", "()Lso2/h1;", "setFeed", "(Lso2/h1;)V", "feed", "Lcg2/p;", "f", "Lcg2/p;", "getBulletManager", "()Lcg2/p;", "bulletManager", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveFeedDanmakuTextureView extends android.view.TextureView implements cg2.k {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isReuse;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public so2.h1 feed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final cg2.p bulletManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedDanmakuTextureView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.bulletManager = new cg2.p(this);
    }

    @Override // cg2.k
    public void e(so2.h1 feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        setFeed(feed);
    }

    @Override // cg2.k
    public cg2.p getBulletManager() {
        return this.bulletManager;
    }

    public final so2.h1 getFeed() {
        so2.h1 h1Var = this.feed;
        if (h1Var != null) {
            return h1Var;
        }
        kotlin.jvm.internal.o.o("feed");
        throw null;
    }

    @Override // cg2.k
    public android.view.View getView() {
        return this;
    }

    @Override // cg2.k
    public void onAttach() {
        if (getBulletManager().f41116d || this.feed == null) {
            return;
        }
        getBulletManager().b(getFeed());
    }

    @Override // cg2.k
    public void onDetach() {
        getBulletManager().c();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.isReuse) {
            return;
        }
        onDetach();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        boolean z17 = false;
        if (event.getAction() == 0 && getBulletManager().a().y5(new android.graphics.Point((int) event.getX(), ((int) event.getY()) + ((int) getY())), 0)) {
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void setFeed(so2.h1 h1Var) {
        kotlin.jvm.internal.o.g(h1Var, "<set-?>");
        this.feed = h1Var;
    }

    @Override // cg2.k
    public void setReuse(boolean z17) {
        this.isReuse = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedDanmakuTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.bulletManager = new cg2.p(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedDanmakuTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.bulletManager = new cg2.p(this);
    }
}
