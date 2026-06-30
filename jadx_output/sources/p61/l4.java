package p61;

/* loaded from: classes5.dex */
public class l4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.MobileFriendUI f352310d;

    public l4(com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI) {
        this.f352310d = mobileFriendUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11438, 6);
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileFriendUI", "[cpan] kv report logid:%d scene:%d", 11438, 6);
        r61.q0.k(true);
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        x51.i1.g(true, true);
        int i18 = com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.f73082o;
        this.f352310d.U6();
    }
}
