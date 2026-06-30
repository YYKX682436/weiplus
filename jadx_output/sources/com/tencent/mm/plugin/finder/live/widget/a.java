package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a extends xt2.m6 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.e30 f117709d;

    public a(com.tencent.mm.plugin.finder.live.widget.e30 likeWidget) {
        kotlin.jvm.internal.o.g(likeWidget, "likeWidget");
        this.f117709d = likeWidget;
    }

    @Override // xt2.m6
    public android.view.View f() {
        android.widget.RelativeLayout likeClickArea = this.f117709d.f118216u;
        kotlin.jvm.internal.o.f(likeClickArea, "likeClickArea");
        return likeClickArea;
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f117709d.f365323d;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView likeIcon = this.f117709d.f118217v;
        kotlin.jvm.internal.o.f(likeIcon, "likeIcon");
        return likeIcon;
    }
}
