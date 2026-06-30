package zo1;

/* loaded from: classes5.dex */
public final class c3 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f474571d = "";

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f474572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474573f;

    public c3(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI) {
        this.f474573f = selectContactUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String searchText) {
        kotlin.jvm.internal.o.g(searchText, "searchText");
        this.f474571d = searchText;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
        this.f474572e = false;
        this.f474571d = "";
        zo1.d3 d3Var = this.f474573f.f92860t;
        if (d3Var != null) {
            d3Var.r();
        }
        zo1.d3 d3Var2 = this.f474573f.f92860t;
        if (d3Var2 != null) {
            d3Var2.notifyDataSetChanged();
        }
        ((ku5.t0) ku5.t0.f312615d).q(new zo1.b3(this, this.f474573f));
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "onQuitSearch");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.T6(this.f474573f);
        this.f474572e = true;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
