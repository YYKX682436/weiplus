package it3;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI) {
        super(2);
        this.f294570d = finderRedPacketCoverEditUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        if (longValue % 1000 == 0) {
            com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "loadVideo onProgressChange " + longValue + '/' + longValue2);
        }
        int i17 = com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI.f155611t;
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend V6 = this.f294570d.V6();
        if (V6 != null) {
            V6.setCurrentCursorPosition(((float) longValue) / ((float) longValue2));
        }
        return jz5.f0.f302826a;
    }
}
