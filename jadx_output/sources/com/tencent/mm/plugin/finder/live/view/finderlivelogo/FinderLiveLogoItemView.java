package com.tencent.mm.plugin.finder.live.view.finderlivelogo;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/finderlivelogo/FinderLiveLogoItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveLogoItemView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f116314d;

    public /* synthetic */ FinderLiveLogoItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, kotlin.jvm.internal.i iVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet);
    }

    public final void a(r45.rd4 task) {
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.String string = task.getString(1);
        boolean z17 = string == null || string.length() == 0;
        android.widget.ImageView imageView = this.f116314d;
        if (z17) {
            imageView.setVisibility(8);
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.e().c(new mn2.q3(task.getString(1), com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329965s));
        imageView.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLogoItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View findViewById = android.view.View.inflate(context, com.tencent.mm.R.layout.atl, this).findViewById(com.tencent.mm.R.id.h6y);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116314d = (android.widget.ImageView) findViewById;
    }
}
