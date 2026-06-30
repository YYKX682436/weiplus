package ta1;

/* loaded from: classes7.dex */
public class a0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.s0 f416600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.l0 f416601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f416602g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416603h;

    public a0(ta1.q0 q0Var, ta1.t0 t0Var, ta1.s0 s0Var, ta1.l0 l0Var, com.tencent.magicbrush.ui.MagicBrushView magicBrushView) {
        this.f416603h = q0Var;
        this.f416599d = t0Var;
        this.f416600e = s0Var;
        this.f416601f = l0Var;
        this.f416602g = magicBrushView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.f416603h.f416665a.postToWorker(new ta1.y(this));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecorderMgr", "hy: switch failed!");
            this.f416599d.a(1, -1, "view switch failed", null);
            this.f416602g.e(true, 0, new ta1.z(this));
        }
        return null;
    }
}
