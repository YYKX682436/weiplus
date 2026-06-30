package ll3;

/* loaded from: classes10.dex */
public final class y1 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f319259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b21.r f319260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.hf2 f319261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f319262d;

    public y1(android.content.Context context, b21.r rVar, r45.hf2 hf2Var, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        this.f319259a = context;
        this.f319260b = rVar;
        this.f319261c = hf2Var;
        this.f319262d = a5Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.a5 a5Var = this.f319262d;
        try {
            ll3.h2.f319180a.c(this.f319259a, this.f319260b, this.f319261c);
            if (a5Var != null) {
                a5Var.a(true, false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MusicUIUtil", e17, "launchQQMusic exception", new java.lang.Object[0]);
            if (a5Var != null) {
                a5Var.a(false, false);
            }
        }
    }
}
