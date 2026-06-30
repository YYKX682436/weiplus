package hr3;

/* loaded from: classes11.dex */
public class aa implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.ja f283394d;

    public aa(hr3.ja jaVar) {
        this.f283394d = jaVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        hr3.ja jaVar = this.f283394d;
        com.tencent.mm.plugin.profile.p2.Bi(jaVar.f283696d.f284109e.K1.getIntent(), 7, 1, jaVar.f283696d.f284109e.L.d1());
        if (com.tencent.mm.storage.z3.m4(jaVar.f283696d.f284109e.L.d1())) {
            g4Var.b(1, com.tencent.mm.R.string.bkj, com.tencent.mm.R.raw.bottomsheet_icon_remarks);
        } else {
            g4Var.b(1, com.tencent.mm.R.string.bf9, com.tencent.mm.R.raw.bottomsheet_icon_remarks);
        }
        g4Var.g(2, jaVar.f283696d.f284109e.L.t2() ? jaVar.f283696d.f284109e.K1.getResources().getString(com.tencent.mm.R.string.f491006bj4) : jaVar.f283696d.f284109e.K1.getResources().getString(com.tencent.mm.R.string.bdj), com.tencent.mm.R.raw.bottomsheet_icon_star);
        if (!com.tencent.mm.storage.z3.m4(jaVar.f283696d.f284109e.L.d1())) {
            g4Var.b(3, com.tencent.mm.R.string.bfn, com.tencent.mm.R.raw.bottomsheet_icon_moment);
        }
        g4Var.b(4, com.tencent.mm.R.string.bgz, com.tencent.mm.R.raw.bottomsheet_icon_transmit);
        g4Var.b(9, com.tencent.mm.R.string.ak6, com.tencent.mm.R.raw.bottomsheet_icon_complain);
        g4Var.g(5, jaVar.f283696d.f284109e.L.o2() ? jaVar.f283696d.f284109e.K1.getString(com.tencent.mm.R.string.bfh) : jaVar.f283696d.f284109e.K1.getString(com.tencent.mm.R.string.bfc), com.tencent.mm.R.raw.bottomsheet_icon_blacklist);
        if (!jaVar.f283696d.f284109e.Z) {
            g4Var.b(6, com.tencent.mm.R.string.f490711ag2, com.tencent.mm.R.raw.bottomsheet_icon_del);
        }
        g4Var.b(7, com.tencent.mm.R.string.bbi, com.tencent.mm.R.raw.bottomsheet_icon_desktop);
    }
}
