package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class cq extends in5.s0 {

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f118019n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f118020o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f118021p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f118022q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(com.tencent.mm.plugin.finder.live.widget.fq fqVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gln);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f118019n = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.gpb);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f118020o = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f485103qt4);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f118021p = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.f485124qt5);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f118022q = findViewById4;
    }
}
