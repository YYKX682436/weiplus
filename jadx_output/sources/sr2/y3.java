package sr2;

/* loaded from: classes10.dex */
public final class y3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411819d;

    public y3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411819d = postMainUIC;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.b01 b01Var;
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411819d;
        com.tencent.mm.plugin.finder.storage.FinderItem k17 = postMainUIC.k7().k();
        if (k17 == null) {
            return;
        }
        java.lang.String i18 = postMainUIC.k7().i();
        java.lang.String l17 = postMainUIC.k7().l();
        int g17 = postMainUIC.k7().g();
        byte[] byteArray = postMainUIC.k7().f401416c.getByteArray("VIDEO_COVER_INFO_WRAP");
        r45.b01 b01Var2 = null;
        if (byteArray != null) {
            r45.b01 b01Var3 = new r45.b01();
            b01Var3.parseFrom(byteArray);
            b01Var = b01Var3;
        } else {
            b01Var = null;
        }
        java.lang.String n17 = postMainUIC.k7().n();
        int intExtra = postMainUIC.k7().f401412a.getIntExtra("VIDEO_SHARE_COVER_STYLE", 0);
        byte[] byteArrayExtra = postMainUIC.k7().f401412a.getByteArrayExtra("VIDEO_SHARE_COVER_INFO_WRAP");
        if (byteArrayExtra != null) {
            b01Var2 = new r45.b01();
            b01Var2.parseFrom(byteArrayExtra);
        }
        postMainUIC.O7("");
        pf5.e.launch$default(postMainUIC, null, null, new sr2.r3(postMainUIC, k17, i18, l17, b01Var, g17, n17, b01Var2, intExtra, null), 3, null);
    }
}
