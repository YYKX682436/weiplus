package g90;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g90.s f269730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f269731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269733g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f269734h;

    public o(g90.s sVar, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19) {
        this.f269730d = sVar;
        this.f269731e = f9Var;
        this.f269732f = i17;
        this.f269733g = i18;
        this.f269734h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.s sVar = this.f269730d;
        com.tencent.mm.storage.f9 f9Var = this.f269731e;
        jz5.l wi6 = g90.s.wi(sVar, f9Var);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) wi6.f302834e).booleanValue() ? 1 : 2));
        lVarArr[1] = new jz5.l("view_type", java.lang.Integer.valueOf(this.f269732f));
        lVarArr[2] = new jz5.l("start_drag_progress", java.lang.Integer.valueOf(this.f269733g));
        lVarArr[3] = new jz5.l("end_drag_progress", java.lang.Integer.valueOf(this.f269734h));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(f9Var));
        ((cy1.a) rVar).Ej("video_drag_process_v2", i17, 32337);
    }
}
