package mu3;

/* loaded from: classes10.dex */
public class b extends ms0.e {

    /* renamed from: t, reason: collision with root package name */
    public os0.a f331396t;

    /* renamed from: u, reason: collision with root package name */
    public os0.a f331397u;

    /* renamed from: v, reason: collision with root package name */
    public p05.l4 f331398v;

    /* renamed from: w, reason: collision with root package name */
    public is0.c f331399w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.xlabeffect.XEffectConfig f331400x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.p f331401y;

    public b(int i17) {
        super(1, i17);
        this.f331400x = new com.tencent.mm.plugin.xlabeffect.XEffectConfig();
    }

    @Override // ms0.c
    public os0.a f() {
        os0.c cVar = new os0.c(this.f330945a, this.f330946b, this.f330947c, this.f330948d, 2, this.f330950f);
        this.f331396t = cVar;
        cVar.f348006o = true;
        os0.a aVar = this.f331397u;
        if (aVar != null) {
            aVar.n();
        }
        int i17 = this.f330947c;
        int i18 = this.f330948d;
        this.f331397u = new os0.e(i17, i18, i17, i18, this.f330949e, 1);
        p05.l4 l4Var = this.f331398v;
        if (l4Var != null) {
            l4Var.o();
        }
        p05.l4 l4Var2 = new p05.l4(0, false, false, false, false, false, rh0.z.f395616m, null, false, 447, null);
        this.f331398v = l4Var2;
        l4Var2.F(this.f331400x);
        p05.l4 l4Var3 = this.f331398v;
        if (l4Var3 != null) {
            l4Var3.g(null, 0.0f);
        }
        p05.l4 l4Var4 = this.f331398v;
        if (l4Var4 != null) {
            l4Var4.H(false);
        }
        p05.l4 l4Var5 = this.f331398v;
        if (l4Var5 != null) {
            l4Var5.J(this.f330947c, this.f330948d);
        }
        is0.c cVar2 = this.f331399w;
        if (cVar2 != null) {
            cVar2.close();
        }
        this.f331399w = is0.b.b(true, 16L);
        return cVar;
    }

    @Override // ms0.c
    public is0.c g() {
        return this.f331399w;
    }

    @Override // ms0.c
    public int h() {
        os0.a aVar = this.f331397u;
        if (aVar != null) {
            return aVar.f348016y;
        }
        return 0;
    }

    @Override // ms0.c
    public int i() {
        os0.a aVar = this.f331397u;
        if (aVar != null) {
            return aVar.f348015x;
        }
        return 0;
    }

    @Override // ms0.c
    public void n(boolean z17) {
        super.n(z17);
        os0.a aVar = this.f331397u;
        if (aVar != null) {
            aVar.n();
        }
        this.f331397u = null;
        p05.l4 l4Var = this.f331398v;
        if (l4Var != null) {
            l4Var.o();
        }
        this.f331398v = null;
        is0.c cVar = this.f331399w;
        if (cVar != null) {
            cVar.close();
        }
        this.f331399w = null;
    }

    @Override // ms0.c
    public void p() {
        is0.c cVar;
        super.p();
        os0.a aVar = this.f331396t;
        if (aVar == null || (cVar = aVar.f348000i) == null) {
            return;
        }
        p05.l4 l4Var = this.f331398v;
        if (l4Var != null) {
            p05.z3 z3Var = p05.l4.R;
            rh0.d0.b(l4Var, cVar.f294395e, false, 0, false, 8, null);
        }
        is0.c cVar2 = this.f331399w;
        if (cVar2 != null) {
            is0.c.b(cVar2, this.f330947c, this.f330948d, 0, null, 0, 0, 60, null);
        }
        is0.c cVar3 = this.f331399w;
        if (cVar3 != null) {
            p05.l4 l4Var2 = this.f331398v;
            java.lang.Integer valueOf = l4Var2 != null ? java.lang.Integer.valueOf(p05.l4.y(l4Var2, cVar, cVar3, 0L, 0, false, false, 60, null)) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                cVar = cVar3;
            }
        }
        os0.a aVar2 = this.f331397u;
        if (aVar2 != null) {
            ((os0.e) aVar2).H = cVar.f294395e;
        }
        if (aVar2 != null) {
            aVar2.o();
        }
    }

    @Override // ms0.c
    public void q(yz5.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        os0.a aVar = this.f331397u;
        if (aVar == null) {
            return;
        }
        aVar.f348009r = listener;
    }

    @Override // ms0.c
    public void s() {
        os0.a aVar = this.f331397u;
        if (aVar != null) {
            aVar.f348013v = true;
        }
    }

    @Override // ms0.c
    public void t(int i17, int i18) {
        super.t(i17, i18);
        os0.a aVar = this.f331397u;
        if (aVar != null) {
            aVar.w(this.f330947c, this.f330948d);
        }
        os0.a aVar2 = this.f331397u;
        if (aVar2 != null) {
            aVar2.u(this.f330947c, this.f330948d);
        }
        p05.l4 l4Var = this.f331398v;
        if (l4Var != null) {
            l4Var.J(this.f330947c, this.f330948d);
        }
        yz5.p pVar = this.f331401y;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }
}
