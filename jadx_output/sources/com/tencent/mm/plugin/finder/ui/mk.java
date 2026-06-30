package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class mk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f129527d = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] byteArrayExtra = this.f129527d.getIntent().getByteArrayExtra("streamtabtipsinfo");
        if (byteArrayExtra != null) {
            if (!(byteArrayExtra.length == 0)) {
                r45.sf6 sf6Var = new r45.sf6();
                sf6Var.parseFrom(byteArrayExtra);
                return sf6Var;
            }
        }
        return null;
    }
}
