package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ll extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f132606d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f132607e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(com.tencent.mm.plugin.finder.view.nl nlVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.tvf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f132606d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.tvh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f132607e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
    }
}
