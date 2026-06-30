package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes16.dex */
public final class p80 extends androidx.recyclerview.widget.k3 {

    /* renamed from: p1, reason: collision with root package name */
    public final android.widget.TextView f119371p1;

    /* renamed from: x1, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f119372x1;

    /* renamed from: y1, reason: collision with root package name */
    public final android.widget.ImageView f119373y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119371p1 = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f119372x1 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        this.f119373y1 = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.f485288h62);
    }
}
