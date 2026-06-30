package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class h0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f149029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend, android.view.View itemView, int i17) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        if (i17 == recyclerThumbSeekBarExtend.A) {
            android.view.View childAt = ((android.widget.LinearLayout) itemView).getChildAt(0);
            kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.widget.ImageView");
            this.f149029d = (android.widget.ImageView) childAt;
        }
    }
}
