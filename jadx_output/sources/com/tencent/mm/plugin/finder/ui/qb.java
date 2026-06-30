package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class qb extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f129728d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f129729e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f129730f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f129731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f129728d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.kbq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f129729e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f483299a85);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f129730f = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.a89);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f129731g = (android.widget.TextView) findViewById4;
    }
}
