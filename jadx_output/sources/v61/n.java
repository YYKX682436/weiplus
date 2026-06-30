package v61;

/* loaded from: classes12.dex */
public final class n implements com.tencent.mm.modelbase.u0, com.tencent.mm.modelbase.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f433461d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f433462e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f433463f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f433464g;

    /* renamed from: h, reason: collision with root package name */
    public final v61.m f433465h;

    public n(android.content.Context context, v61.m mVar) {
        this.f433462e = context;
        this.f433465h = mVar;
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        this.f433461d.post(new v61.l(this, j18 != 0 ? (int) ((j17 * 100) / j18) : 0));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 139) {
            gm0.j1.d().q(139, this);
        } else if (m1Var.getType() == 138) {
            gm0.j1.d().q(138, this);
        }
        v61.m mVar = this.f433465h;
        if (i18 == 0 && i17 == 0) {
            ((com.tencent.mm.plugin.account.ui.mi) mVar).a(true);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.DoInit", "do init failed, err=" + i17 + "," + i18);
            ((com.tencent.mm.plugin.account.ui.mi) mVar).a(false);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f433463f;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
