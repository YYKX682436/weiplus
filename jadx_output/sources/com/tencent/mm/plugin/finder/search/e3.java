package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class e3 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f125672d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f125673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.d1y);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f125672d = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.egb);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f125673e = (android.widget.TextView) findViewById2;
    }
}
