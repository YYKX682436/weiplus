package zm5;

/* loaded from: classes3.dex */
public final class c0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f474189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zm5.f0 f474190e;

    public c0(boolean z17, zm5.f0 f0Var) {
        this.f474189d = z17;
        this.f474190e = f0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        boolean z17 = this.f474189d;
        boolean z18 = false;
        zm5.f0 f0Var = this.f474190e;
        if (z17) {
            g4Var.h(0, f0Var.getString(com.tencent.mm.R.string.i29), com.tencent.mm.R.raw.icons_filled_share, f0Var.getColor(com.tencent.mm.R.color.f478502m));
        }
        g4Var.h(2, f0Var.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0);
        if (aq.p.f12930b != null) {
            ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            z18 = !su4.r2.l();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryComposeOp", "getWebSearchIsToShow: " + z18);
        }
        if (z18) {
            g4Var.h(9, f0Var.getString(com.tencent.mm.R.string.fz9), com.tencent.mm.R.raw.icons_filled_search_logo, f0Var.getColor(com.tencent.mm.R.color.f478532ac));
        }
    }
}
