package com.tencent.mm.plugin.finder.view.indictor;

/* loaded from: classes10.dex */
public final class a extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator.SliderLayoutManager f132368n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator.SliderLayoutManager sliderLayoutManager, android.content.Context context) {
        super(context);
        this.f132368n = sliderLayoutManager;
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        return this.f132368n.f132357v / displayMetrics.densityDpi;
    }
}
