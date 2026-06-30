package cw2;

/* loaded from: classes10.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f224019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView) {
        super(1);
        this.f224019d = finderLivePlayView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        int i17 = 2;
        java.lang.Integer[] numArr = {2003, java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_MESSAGE)};
        int i18 = 0;
        while (true) {
            if (i18 >= 2) {
                z17 = false;
                break;
            }
            if (kotlin.jvm.internal.o.b(numArr[i18], valueOf)) {
                z17 = true;
                break;
            }
            i18++;
        }
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = this.f224019d;
        if (!z17) {
            i17 = intValue < 0 ? 1 : finderLivePlayView.getPlayStatus();
        }
        finderLivePlayView.setPlayStatus(i17);
        return jz5.f0.f302826a;
    }
}
