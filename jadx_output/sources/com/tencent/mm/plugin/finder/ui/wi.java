package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class wi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f129992d = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f129992d.getIntent().getIntExtra("key_comment_scene", 25));
    }
}
