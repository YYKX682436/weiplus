package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v70 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f120049d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f120050e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f120051f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f120052g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(android.view.View mItemView) {
        super(mItemView);
        kotlin.jvm.internal.o.g(mItemView, "mItemView");
        this.f120049d = mItemView;
        this.f120050e = (android.widget.TextView) mItemView.findViewById(com.tencent.mm.R.id.r6p);
        this.f120051f = (android.widget.TextView) mItemView.findViewById(com.tencent.mm.R.id.r6n);
        this.f120052g = mItemView.findViewById(com.tencent.mm.R.id.r6o);
    }
}
