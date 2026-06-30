package r61;

/* loaded from: classes9.dex */
public class d2 extends wu5.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f392839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter f392840f;

    public d2(com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter recoverFriendPresenter, java.lang.String str, java.util.List list) {
        this.f392840f = recoverFriendPresenter;
        this.f392838d = str;
        this.f392839e = list;
    }

    @Override // wu5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "after running insert task");
        com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter recoverFriendPresenter = this.f392840f;
        if (recoverFriendPresenter.f73115o.decrementAndGet() != 0 || recoverFriendPresenter.f73114n) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "all insert tasks are finished!");
        com.tencent.mm.sdk.platformtools.u3.h(new r61.c2(this));
    }

    @Override // wu5.e
    public void b(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "before running insert task");
    }

    @Override // wu5.i
    public void c() {
        boolean z17;
        char c17;
        java.util.List<r45.ky4> list = this.f392839e;
        int i17 = 0;
        for (r45.ky4 ky4Var : list) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(ky4Var.f379040h)) {
                z17 = false;
            } else {
                java.lang.String str = ky4Var.f379040h;
                java.lang.String str2 = this.f392838d;
                r61.x0 a17 = r61.z1.a(str2, str);
                if (a17 == null) {
                    a17 = new r61.x0();
                }
                a17.field_encryptUsername = ky4Var.f379040h;
                java.lang.String str3 = ky4Var.f379039g;
                a17.field_nickname = str3;
                java.lang.String a18 = x51.k.a(str3);
                if (a18 == null) {
                    a18 = "";
                }
                java.lang.String upperCase = a18.toUpperCase();
                a17.field_pinyinName = upperCase;
                if (com.tencent.mm.sdk.platformtools.t8.K0(upperCase) || (c17 = upperCase.charAt(0)) < 'A' || c17 > 'Z') {
                    c17 = '[';
                }
                a17.field_showHead = c17;
                a17.field_ticket = ky4Var.f379037e;
                a17.field_username = ky4Var.f379036d;
                a17.field_oldUsername = str2;
                a17.field_seq = ky4Var.f379038f;
                if (a17.systemRowid == -1) {
                    z17 = ((r61.u1) ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi()).insert(a17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendLogic", "insert local old friend (%s,%s), success %s", ky4Var.f379040h, ky4Var.f379039g, java.lang.Boolean.valueOf(z17));
                } else {
                    z17 = ((r61.u1) ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi()).replace(a17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendLogic", "replace local old friend (%s,%s), success %s", ky4Var.f379040h, ky4Var.f379039g, java.lang.Boolean.valueOf(z17));
                }
            }
            if (z17) {
                i17++;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendLogic", "insert local old %d, success %d", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendPresenter", "insert old account friend %d, success %d", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(i17));
    }
}
