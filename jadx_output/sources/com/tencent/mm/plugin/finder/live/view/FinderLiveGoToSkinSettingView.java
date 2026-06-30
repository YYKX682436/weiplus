package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGoToSkinSettingView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderLiveGoToSkinSettingView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f115960d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f115961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveGoToSkinSettingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.asg, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f115960d = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lqe);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f115961e = findViewById;
        setVisibility(8);
    }
}
