package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class yi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f130068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f130068d = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f130068d.getIntent().getStringExtra("displayTitle");
        return stringExtra == null ? "" : stringExtra;
    }
}
