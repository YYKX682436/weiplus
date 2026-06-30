package p61;

/* loaded from: classes8.dex */
public class q3 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI f352358d;

    public q3(com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI googleFriendUI) {
        this.f352358d = googleFriendUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.t8.n(str);
        com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI googleFriendUI = this.f352358d;
        googleFriendUI.f73071g = str;
        p61.o3 o3Var = googleFriendUI.f73070f;
        if (o3Var != null) {
            java.lang.String str2 = googleFriendUI.f73071g;
            o3Var.getClass();
            com.tencent.mm.sdk.platformtools.t8.n(str2);
            o3Var.f352337r = str2;
            o3Var.c();
            o3Var.q();
        }
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
