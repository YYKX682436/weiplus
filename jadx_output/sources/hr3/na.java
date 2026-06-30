package hr3;

/* loaded from: classes11.dex */
public class na implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.oa f283831d;

    public na(hr3.oa oaVar) {
        this.f283831d = oaVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        hr3.oa oaVar = this.f283831d;
        if (!oaVar.f283857d) {
            if (com.tencent.mm.storage.z3.m4(oaVar.f283859f.f284109e.L.d1())) {
                g4Var.b(1, com.tencent.mm.R.string.bkj, com.tencent.mm.R.raw.bottomsheet_icon_remarks);
            } else {
                g4Var.b(1, com.tencent.mm.R.string.bf9, com.tencent.mm.R.raw.bottomsheet_icon_remarks);
            }
        }
        if (oaVar.f283858e) {
            return;
        }
        if (oaVar.f283859f.f284109e.L.o2()) {
            g4Var.b(8, com.tencent.mm.R.string.bfh, com.tencent.mm.R.raw.bottomsheet_icon_blacklist);
        } else {
            if (com.tencent.mm.storage.z3.E4(oaVar.f283859f.f284109e.L.d1())) {
                return;
            }
            g4Var.b(5, com.tencent.mm.R.string.bfc, com.tencent.mm.R.raw.bottomsheet_icon_blacklist);
        }
    }
}
