package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class hk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f129334d = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] byteArrayExtra = this.f129334d.getIntent().getByteArrayExtra("key_share_byp_data");
        if (byteArrayExtra != null) {
            return new com.tencent.mm.protobuf.g(byteArrayExtra, 0, byteArrayExtra.length);
        }
        return null;
    }
}
