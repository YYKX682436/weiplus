package gp5;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f274461b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f274462c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f274463d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f274464e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f274465f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f274466g;

    /* renamed from: i, reason: collision with root package name */
    public wu5.c f274468i;

    /* renamed from: j, reason: collision with root package name */
    public final vx3.i f274469j;

    /* renamed from: k, reason: collision with root package name */
    public final yx3.k f274470k;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f274460a = "";

    /* renamed from: h, reason: collision with root package name */
    public final ao4.b f274467h = new ao4.b();

    public e() {
        vx3.c cVar = new vx3.c(vx3.d.f441273d, 0, true);
        vx3.i b17 = vx3.l.E.b();
        dk4.a aVar = b17.f441284a;
        if (aVar != null) {
            aVar.f234475l = true;
        }
        this.f274469j = b17;
        kotlin.jvm.internal.o.d(aVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayer", "create ringtonePlayer, mediaInfo:" + aVar + ", soundInfo:" + cVar + ", isOutCall:false");
        this.f274470k = aVar.f234468e ? new yx3.j(aVar, cVar, false) : new yx3.x(aVar, cVar, false);
    }

    public final void a(java.lang.String username, boolean z17, boolean z18, long j17, boolean z19) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f274460a = username;
        this.f274461b = z17;
        this.f274462c = z18;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("isVideoCall", !z17 ? 1 : 0);
        bundle.putString(dm.i4.COL_USERNAME, username);
        bundle.putBoolean("isOutCall", z18);
        bundle.putBoolean("isSpeakOn", z19);
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "start");
        long currentTimeMillis = j17 > 0 ? java.lang.System.currentTimeMillis() - j17 : 0L;
        bundle.putLong("seekStartMs", currentTimeMillis);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoIPMPRingtoneController", "startRing() called with: username = " + username + ", videoCall = " + z17 + ", outCall = " + z18 + ", channelElapsedTimeMs = " + currentTimeMillis, new java.lang.Object[0]);
        this.f274464e = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.ILINK_VOIP, bundle);
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRingtoneController", "stopRing");
        this.f274463d = false;
        if (this.f274464e && this.f274462c) {
            nx3.a wi6 = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).wi();
            java.lang.String str = this.f274460a;
            java.lang.String str2 = wi6.f341348e;
            java.lang.String str3 = (str2 == null || kotlin.jvm.internal.o.b(str2, "0")) ? wi6.f341347d : wi6.f341348e;
            kotlin.jvm.internal.o.d(str3);
            mx3.b0.g(str, str3);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "close");
        ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.ILINK_VOIP, bundle);
        this.f274464e = false;
    }
}
