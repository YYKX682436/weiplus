package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class dk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f129079d = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f129079d.getIntent().getBooleanExtra("allow_pull_top", false));
    }
}
