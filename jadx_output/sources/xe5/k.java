package xe5;

/* loaded from: classes3.dex */
public final class k implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f454059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f454060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f454061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454062g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454063h;

    public k(boolean z17, boolean z18, xe5.g0 g0Var, java.lang.String str, java.lang.String str2) {
        this.f454059d = z17;
        this.f454060e = z18;
        this.f454061f = g0Var;
        this.f454062g = str;
        this.f454063h = str2;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        if (this.f454059d) {
            boolean z17 = this.f454060e;
            xe5.g0 g0Var = this.f454061f;
            if (z17) {
                g0Var.getClass();
                java.lang.String str = this.f454062g;
                if (str.length() == 0) {
                    str = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.axd);
                }
                g4Var.add(0, 3, 0, str);
                ((ml2.r0) ((c50.c1) i95.n0.c(c50.c1.class))).wk(false, false);
                return;
            }
            g0Var.getClass();
            int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478532ac);
            java.lang.String str2 = this.f454063h;
            if (str2.length() == 0) {
                str2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.axb);
            }
            g4Var.d(2, color, str2);
            ((ml2.r0) ((c50.c1) i95.n0.c(c50.c1.class))).wk(false, true);
        }
    }
}
