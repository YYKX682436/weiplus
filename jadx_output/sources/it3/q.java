package it3;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f294576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294578f;

    public q(boolean z17, com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI, java.lang.String str) {
        this.f294576d = z17;
        this.f294577e = finderRedPacketCoverEditUI;
        this.f294578f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f294576d;
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294577e;
        if (z17) {
            com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI.U6(finderRedPacketCoverEditUI, this.f294578f);
        } else {
            com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI.U6(finderRedPacketCoverEditUI, "");
        }
    }
}
