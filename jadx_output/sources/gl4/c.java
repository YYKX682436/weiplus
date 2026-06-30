package gl4;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f272847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f272848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl4.z f272849f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f272850g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f272851h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, boolean z18, gl4.z zVar, android.content.Context context, yz5.l lVar) {
        super(1);
        this.f272847d = z17;
        this.f272848e = z18;
        this.f272849f = zVar;
        this.f272850g = context;
        this.f272851h = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.p80 p80Var = (bw5.p80) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkMembershipStatus fetchMembershipAsync callback membershipInfo: ");
        sb6.append(p80Var != null ? java.lang.Integer.valueOf(p80Var.f31493d) : null);
        sb6.append(", needRetry: ");
        sb6.append(this.f272847d);
        sb6.append(", isRetry: ");
        sb6.append(this.f272848e);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", sb6.toString());
        if (!this.f272848e) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f272849f.f272900b;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            gl4.z zVar = this.f272849f;
            android.content.Context context = this.f272850g;
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.f490468vx), true, 0, null);
            f17.show();
            zVar.f272900b = f17;
        }
        if (p80Var != null && p80Var.f31493d == 1) {
            yz5.l lVar = this.f272851h;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f272849f.f272900b;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        } else if (this.f272847d) {
            ((ku5.t0) ku5.t0.f312615d).k(new gl4.b(this.f272849f, this.f272850g, this.f272851h), 2000L);
        } else {
            yz5.l lVar2 = this.f272851h;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f272849f.f272900b;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
        }
        return jz5.f0.f302826a;
    }
}
