package it3;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI, java.lang.String str) {
        super(1);
        this.f294574d = finderRedPacketCoverEditUI;
        this.f294575e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294574d;
        finderRedPacketCoverEditUI.f155621p = 0L;
        long j17 = finderRedPacketCoverEditUI.f155615g;
        if (longValue <= j17) {
            j17 = longValue;
        }
        finderRedPacketCoverEditUI.f155622q = j17;
        pm0.v.X(new it3.o(finderRedPacketCoverEditUI, this.f294575e, longValue));
        return jz5.f0.f302826a;
    }
}
