package df2;

/* loaded from: classes3.dex */
public final class jj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.oj f230481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f230482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f230483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f230484g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230485h;

    public jj(df2.oj ojVar, r45.fr1 fr1Var, kotlin.jvm.internal.f0 f0Var, r45.xq1 xq1Var, java.lang.String str) {
        this.f230481d = ojVar;
        this.f230482e = fr1Var;
        this.f230483f = f0Var;
        this.f230484g = xq1Var;
        this.f230485h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var;
        df2.oj ojVar = this.f230481d;
        mm2.c1 c1Var = (mm2.c1) ojVar.business(mm2.c1.class);
        r45.fr1 fr1Var = this.f230482e;
        r45.i73 i73Var = (r45.i73) fr1Var.getCustom(24);
        c1Var.H2 = i73Var != null ? i73Var.getInteger(1) : 0;
        com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var = (com.tencent.mm.plugin.finder.live.plugin.ai0) ojVar.R6(com.tencent.mm.plugin.finder.live.plugin.ai0.class);
        if (ai0Var == null || (m10Var = ai0Var.f111891s) == null) {
            return;
        }
        m10Var.b(new com.tencent.mm.plugin.finder.live.widget.u00(m10Var, this.f230483f.f310116d, fr1Var, this.f230484g, this.f230485h));
    }
}
