package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class t2 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f116689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.er8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116689d = (android.widget.TextView) findViewById;
    }
}
