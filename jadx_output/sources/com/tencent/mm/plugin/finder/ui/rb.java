package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class rb extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f129774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f129774d = (android.widget.TextView) findViewById;
    }
}
