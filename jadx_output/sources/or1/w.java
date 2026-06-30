package or1;

/* loaded from: classes.dex */
public class w implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI f347591d;

    public w(com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI) {
        this.f347591d = brandServiceIndexUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        boolean l17 = su4.r2.l();
        com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI = this.f347591d;
        if (!l17) {
            int i17 = brandServiceIndexUI.f93996f;
            if (i17 == 251658241 || i17 == 0) {
                g4Var.f(1, brandServiceIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.ami));
            } else if (i17 == 1) {
                g4Var.f(1, brandServiceIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.f490751n61));
            }
        }
        g4Var.f(2, brandServiceIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.amj));
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).n()) {
            return;
        }
        g4Var.f(3, brandServiceIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.amk));
    }
}
