package re2;

/* loaded from: classes3.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI f394475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f394476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI, az2.f fVar) {
        super(4);
        this.f394475d = finderLiveCoLiveInvitationConfirmUI;
        this.f394476e = fVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String str2 = (java.lang.String) obj4;
        com.tencent.mars.xlog.Log.e("Finder.CoLiveInvitationConfirmUI", "acceptInvitation failed: errCode=" + intValue + ", errMsg=" + str + ", userFlag=" + intValue2 + ", spamJumpUrl=" + str2);
        com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI = this.f394475d;
        finderLiveCoLiveInvitationConfirmUI.runOnUiThread(new re2.p0(this.f394476e, finderLiveCoLiveInvitationConfirmUI, intValue, str, intValue2, str2));
        return jz5.f0.f302826a;
    }
}
