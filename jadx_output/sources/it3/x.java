package it3;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI) {
        super(0);
        this.f294585d = finderRedPacketCoverEditUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294585d;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(finderRedPacketCoverEditUI);
        return java.lang.Integer.valueOf(a17.f197135a - (finderRedPacketCoverEditUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479649bo) * 2));
    }
}
