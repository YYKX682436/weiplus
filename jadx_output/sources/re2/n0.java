package re2;

/* loaded from: classes3.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI f394454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f394455e;

    public n0(com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI, az2.f fVar) {
        this.f394454d = finderLiveCoLiveInvitationConfirmUI;
        this.f394455e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI.f111530t;
        com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI = this.f394454d;
        android.content.Context applicationContext = finderLiveCoLiveInvitationConfirmUI.getApplicationContext();
        kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
        java.lang.String e17 = xy2.c.e(applicationContext);
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationConfirmUI", "doPrepareAndGotoLive: selfFinderUsername=" + e17);
        new ek2.c2(db2.t4.f228171a.a(5874), e17, null, 0L, 0L, 0, 0L, 0, new re2.i0(finderLiveCoLiveInvitationConfirmUI, this.f394455e), 248, null).l();
    }
}
