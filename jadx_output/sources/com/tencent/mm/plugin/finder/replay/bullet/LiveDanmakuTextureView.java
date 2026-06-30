package com.tencent.mm.plugin.finder.replay.bullet;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuTextureView;", "Landroid/view/TextureView;", "Lxs2/p;", "Landroid/view/View;", "getView", "anchor", "Ljz5/f0;", "setAnchorView", "getAnchorView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class LiveDanmakuTextureView extends android.view.TextureView implements xs2.p {

    /* renamed from: d, reason: collision with root package name */
    public xs2.o f124913d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f124914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDanmakuTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // xs2.p
    public void b(xs2.o manager, java.util.List list) {
        kotlin.jvm.internal.o.g(manager, "manager");
        this.f124913d = manager;
        if (((xs2.e) manager).f456319f) {
            return;
        }
        manager.d(list);
    }

    @Override // xs2.p
    /* renamed from: getAnchorView, reason: from getter */
    public android.view.View getF124914e() {
        return this.f124914e;
    }

    @Override // xs2.p
    public android.view.View getView() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("LiveDanmakuTextureView", "onAttachedToWindow");
    }

    @Override // xs2.p
    public void onDetach() {
        xs2.o oVar = this.f124913d;
        if (oVar != null) {
            oVar.onDetach();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onDetach();
        com.tencent.mars.xlog.Log.i("LiveDanmakuTextureView", "onDetachedFromWindow");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        vp.x b17;
        kotlin.jvm.internal.o.g(event, "event");
        boolean z17 = false;
        if (event.getAction() == 0) {
            xs2.o oVar = this.f124913d;
            if ((oVar == null || (b17 = oVar.b()) == null || !b17.y5(new android.graphics.Point((int) event.getX(), ((int) event.getY()) + ((int) getY())), 0)) ? false : true) {
                z17 = true;
            }
        }
        if (z17) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // xs2.p
    public void setAnchorView(android.view.View anchor) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        this.f124914e = anchor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDanmakuTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
