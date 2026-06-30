package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class r2 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f125834d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f125835e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f125836f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f125837g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(android.view.View itemView, java.lang.String headerTips) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(headerTips, "headerTips");
        this.f125834d = headerTips;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.jrw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f125835e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.jqn);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f125836f = findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.cut);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f125837g = (android.widget.TextView) findViewById3;
    }
}
