package re2;

/* loaded from: classes3.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI f394459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f394460e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI, az2.f fVar) {
        super(1);
        this.f394459d = finderLiveCoLiveInvitationConfirmUI;
        this.f394460e = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.nx0 it = (r45.nx0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationConfirmUI", "acceptInvitation success, start prepare cgi");
        com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI = this.f394459d;
        finderLiveCoLiveInvitationConfirmUI.runOnUiThread(new re2.n0(finderLiveCoLiveInvitationConfirmUI, this.f394460e));
        return jz5.f0.f302826a;
    }
}
