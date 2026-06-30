package p61;

/* loaded from: classes11.dex */
public class s4 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.MobileFriendUI f352374d;

    public s4(com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI) {
        this.f352374d = mobileFriendUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.t8.n(str);
        com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI = this.f352374d;
        mobileFriendUI.f73088i = str;
        p61.z3 z3Var = mobileFriendUI.f73084e;
        if (z3Var != null) {
            p61.h4 h4Var = (p61.h4) z3Var;
            java.lang.String trim = mobileFriendUI.f73088i.trim();
            com.tencent.mm.sdk.platformtools.t8.n(trim);
            h4Var.f352282o = trim;
            h4Var.c();
            h4Var.q();
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
