package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderLiveFansClubAnnouncementView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f115852d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f115853e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f115854f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFansClubAnnouncementView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.aq8, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f115852d = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.exl);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f115853e = findViewById;
        android.view.View view = this.f115852d;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.exh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f115854f = findViewById2;
        android.view.View view2 = this.f115852d;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.exn);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.View view3 = this.f115852d;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.tencent.mm.R.id.exm);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View view4 = this.f115852d;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById5 = view4.findViewById(com.tencent.mm.R.id.exj);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFansClubAnnouncementView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        a(context);
    }
}
