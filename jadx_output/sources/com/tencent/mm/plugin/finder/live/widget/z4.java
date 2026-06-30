package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z4 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f120522d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f120523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.crx);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f120522d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.crt);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f120523e = (android.widget.ImageView) findViewById2;
    }
}
