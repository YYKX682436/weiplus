package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z50 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f120527d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f120528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b60 f120529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(com.tencent.mm.plugin.finder.live.widget.b60 b60Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f120529f = b60Var;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.vc8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f120527d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f487204vc2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f120528e = findViewById2;
    }
}
