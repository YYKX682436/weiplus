package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ba extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f117855d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f117856e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f117857f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f117855d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f117856e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        this.f117857f = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.f485288h62);
    }
}
