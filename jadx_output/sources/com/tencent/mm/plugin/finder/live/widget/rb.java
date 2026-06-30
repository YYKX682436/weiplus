package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rb extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f119614d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f119615e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f119616f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f119617g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.sb f119618h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(com.tencent.mm.plugin.finder.live.widget.sb sbVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f119618h = sbVar;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.su_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119614d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.suc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f119615e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.sue);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f119616f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.sud);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f119617g = (android.widget.TextView) findViewById4;
    }
}
