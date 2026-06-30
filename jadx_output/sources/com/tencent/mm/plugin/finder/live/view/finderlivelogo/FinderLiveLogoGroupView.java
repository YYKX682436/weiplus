package com.tencent.mm.plugin.finder.live.view.finderlivelogo;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/finderlivelogo/FinderLiveLogoGroupView;", "Landroid/widget/RelativeLayout;", "Lr45/rd4;", "getShowingTask", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveLogoGroupView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f116308d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f116309e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.RelativeLayout f116310f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f116311g;

    /* renamed from: h, reason: collision with root package name */
    public r45.rd4 f116312h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView f116313i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLogoGroupView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f116308d = kotlinx.coroutines.z0.b();
        android.view.View findViewById = android.view.View.inflate(context, com.tencent.mm.R.layout.atk, this).findViewById(com.tencent.mm.R.id.nyt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116310f = (android.widget.RelativeLayout) findViewById;
        this.f116311g = new java.util.ArrayList();
    }

    /* renamed from: getShowingTask, reason: from getter */
    public final r45.rd4 getF116312h() {
        return this.f116312h;
    }
}
