package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class v4 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f125946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f125946d = (android.widget.TextView) findViewById;
    }
}
