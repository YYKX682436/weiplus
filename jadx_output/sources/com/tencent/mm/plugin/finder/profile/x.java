package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class x extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f124860d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f124861e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f124862f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f124863g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.kys);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f124860d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.kyi);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f124861e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.d0v);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f124862f = findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.kyg);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f124863g = (android.widget.TextView) findViewById4;
    }
}
