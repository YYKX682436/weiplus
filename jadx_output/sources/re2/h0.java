package re2;

/* loaded from: classes3.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f394420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI f394421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f394423g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.j01 f394424h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394425i;

    public h0(az2.f fVar, com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI, int i17, int i18, r45.j01 j01Var, java.lang.String str) {
        this.f394420d = fVar;
        this.f394421e = finderLiveCoLiveInvitationConfirmUI;
        this.f394422f = i17;
        this.f394423g = i18;
        this.f394424h = j01Var;
        this.f394425i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f394420d.b();
        com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI = this.f394421e;
        finderLiveCoLiveInvitationConfirmUI.f111543s = false;
        int i17 = this.f394422f;
        int i18 = this.f394423g;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI.U6(finderLiveCoLiveInvitationConfirmUI, i18, this.f394425i, 0, null);
            return;
        }
        finderLiveCoLiveInvitationConfirmUI.getClass();
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationConfirmUI", "gotoLivePrepare");
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Kj(finderLiveCoLiveInvitationConfirmUI, this.f394424h, new android.content.Intent(), true);
        finderLiveCoLiveInvitationConfirmUI.finish();
    }
}
