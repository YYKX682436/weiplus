package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveOnlineStateViewHotCardView;", "Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "d", "Ljz5/g;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "Landroid/view/View;", "e", "getIconView", "()Landroid/view/View;", "iconView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveOnlineStateViewHotCardView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g titleView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g iconView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveOnlineStateViewHotCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        getTitleView().setText(info.getWording());
        com.tencent.mm.plugin.finder.live.util.a3.f115443a.d(getIconView(), info.getIcon_url());
    }

    public final android.view.View getIconView() {
        java.lang.Object value = ((jz5.n) this.iconView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.widget.TextView getTitleView() {
        java.lang.Object value = ((jz5.n) this.titleView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveOnlineStateViewHotCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.titleView = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.z7(this));
        this.iconView = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.y7(this));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488948eb0, (android.view.ViewGroup) this, true);
    }
}
