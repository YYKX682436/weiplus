package zm5;

/* loaded from: classes3.dex */
public final class d0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f474193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zm5.f0 f474194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f474195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474196g;

    public d0(boolean z17, zm5.f0 f0Var, long j17, java.lang.String str) {
        this.f474193d = z17;
        this.f474194e = f0Var;
        this.f474195f = j17;
        this.f474196g = str;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        boolean z17 = this.f474193d;
        zm5.f0 f0Var = this.f474194e;
        if (z17) {
            g4Var.h(1, f0Var.getString(com.tencent.mm.R.string.i89), com.tencent.mm.R.raw.icons_outlined_download, f0Var.getColor(com.tencent.mm.R.color.FG_0));
        }
        g4Var.h(6, f0Var.getString(com.tencent.mm.R.string.fz7), com.tencent.mm.R.raw.icons_outlined_pencil, f0Var.getColor(com.tencent.mm.R.color.FG_0));
        boolean z18 = false;
        if (aq.p.f12930b != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getGoToChatToShow: ");
            long j17 = this.f474195f;
            sb6.append(j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryComposeOp", sb6.toString());
            com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(this.f474196g, j17);
            boolean z19 = n17.t0() == -1 && !com.tencent.mm.storage.z3.K3(n17.Q0());
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryComposeOp", "getGoToChatToShow: " + z19);
            z18 = z19;
        }
        if (z18) {
            g4Var.h(5, f0Var.getString(com.tencent.mm.R.string.f492303fz5), com.tencent.mm.R.raw.icons_outlined_chats, f0Var.getColor(com.tencent.mm.R.color.FG_0));
        }
        g4Var.h(7, f0Var.getString(com.tencent.mm.R.string.fz8), com.tencent.mm.R.raw.icons_outlined_translate, f0Var.getColor(com.tencent.mm.R.color.FG_0));
        g4Var.h(10, f0Var.getString(com.tencent.mm.R.string.fz6), com.tencent.mm.R.raw.icons_outlined_ocr, f0Var.getColor(com.tencent.mm.R.color.FG_0));
    }
}
