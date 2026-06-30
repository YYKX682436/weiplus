package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class xi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f130027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f130027d = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f130027d.getIntent().getIntExtra("key_detail_comment_scene", 0));
    }
}
