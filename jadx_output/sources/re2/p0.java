package re2;

/* loaded from: classes3.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f394466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI f394467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f394470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394471i;

    public p0(az2.f fVar, com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI, int i17, java.lang.String str, int i18, java.lang.String str2) {
        this.f394466d = fVar;
        this.f394467e = finderLiveCoLiveInvitationConfirmUI;
        this.f394468f = i17;
        this.f394469g = str;
        this.f394470h = i18;
        this.f394471i = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f394466d.b();
        com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI = this.f394467e;
        finderLiveCoLiveInvitationConfirmUI.f111543s = false;
        com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI.U6(finderLiveCoLiveInvitationConfirmUI, this.f394468f, this.f394469g, this.f394470h, this.f394471i);
    }
}
