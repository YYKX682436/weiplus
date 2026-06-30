package v2;

/* loaded from: classes15.dex */
public class o extends v2.q {

    /* renamed from: c, reason: collision with root package name */
    public final v2.g f432717c;

    /* renamed from: d, reason: collision with root package name */
    public v2.o f432718d;

    /* renamed from: e, reason: collision with root package name */
    public float f432719e;

    /* renamed from: f, reason: collision with root package name */
    public v2.o f432720f;

    /* renamed from: g, reason: collision with root package name */
    public float f432721g;

    /* renamed from: i, reason: collision with root package name */
    public v2.o f432723i;

    /* renamed from: h, reason: collision with root package name */
    public int f432722h = 0;

    /* renamed from: j, reason: collision with root package name */
    public v2.p f432724j = null;

    /* renamed from: k, reason: collision with root package name */
    public int f432725k = 1;

    /* renamed from: l, reason: collision with root package name */
    public v2.p f432726l = null;

    public o(v2.g gVar) {
        this.f432717c = gVar;
    }

    @Override // v2.q
    public void e() {
        int i17;
        v2.o oVar;
        v2.o oVar2;
        v2.o oVar3;
        v2.o oVar4;
        v2.o oVar5;
        v2.o oVar6;
        float l17;
        float f17;
        v2.o oVar7;
        boolean z17 = true;
        if (this.f432729b == 1 || (i17 = this.f432722h) == 4) {
            return;
        }
        v2.p pVar = this.f432724j;
        if (pVar != null) {
            if (pVar.f432729b != 1) {
                return;
            } else {
                this.f432719e = this.f432725k * pVar.f432727c;
            }
        }
        v2.p pVar2 = this.f432726l;
        if (pVar2 != null) {
            if (pVar2.f432729b != 1) {
                return;
            } else {
                float f18 = pVar2.f432727c;
            }
        }
        if (i17 == 1 && ((oVar7 = this.f432718d) == null || oVar7.f432729b == 1)) {
            if (oVar7 == null) {
                this.f432720f = this;
                this.f432721g = this.f432719e;
            } else {
                this.f432720f = oVar7.f432720f;
                this.f432721g = oVar7.f432721g + this.f432719e;
            }
            b();
            return;
        }
        v2.g gVar = this.f432717c;
        if (i17 != 2 || (oVar4 = this.f432718d) == null || oVar4.f432729b != 1 || (oVar5 = this.f432723i) == null || (oVar6 = oVar5.f432718d) == null || oVar6.f432729b != 1) {
            if (i17 != 3 || (oVar = this.f432718d) == null || oVar.f432729b != 1 || (oVar2 = this.f432723i) == null || (oVar3 = oVar2.f432718d) == null || oVar3.f432729b != 1) {
                if (i17 == 5) {
                    gVar.f432635b.s();
                    return;
                }
                return;
            } else {
                this.f432720f = oVar.f432720f;
                oVar2.f432720f = oVar3.f432720f;
                this.f432721g = oVar.f432721g + this.f432719e;
                oVar2.f432721g = oVar3.f432721g + oVar2.f432719e;
                b();
                this.f432723i.b();
                return;
            }
        }
        this.f432720f = oVar4.f432720f;
        oVar5.f432720f = oVar6.f432720f;
        v2.f fVar = gVar.f432636c;
        v2.f fVar2 = v2.f.RIGHT;
        int i18 = 0;
        if (fVar != fVar2 && fVar != v2.f.BOTTOM) {
            z17 = false;
        }
        float f19 = z17 ? oVar4.f432721g - oVar6.f432721g : oVar6.f432721g - oVar4.f432721g;
        if (fVar == v2.f.LEFT || fVar == fVar2) {
            l17 = f19 - gVar.f432635b.l();
            f17 = gVar.f432635b.V;
        } else {
            l17 = f19 - gVar.f432635b.h();
            f17 = gVar.f432635b.W;
        }
        int b17 = gVar.b();
        int b18 = this.f432723i.f432717c.b();
        v2.g gVar2 = gVar.f432637d;
        v2.o oVar8 = this.f432723i;
        if (gVar2 == oVar8.f432717c.f432637d) {
            f17 = 0.5f;
            b18 = 0;
        } else {
            i18 = b17;
        }
        float f27 = i18;
        float f28 = b18;
        float f29 = (l17 - f27) - f28;
        if (z17) {
            oVar8.f432721g = oVar8.f432718d.f432721g + f28 + (f29 * f17);
            this.f432721g = (this.f432718d.f432721g - f27) - (f29 * (1.0f - f17));
        } else {
            this.f432721g = this.f432718d.f432721g + f27 + (f29 * f17);
            oVar8.f432721g = (oVar8.f432718d.f432721g - f28) - (f29 * (1.0f - f17));
        }
        b();
        this.f432723i.b();
    }

    public void f(u2.f fVar) {
        u2.j jVar = this.f432717c.f432642i;
        v2.o oVar = this.f432720f;
        if (oVar == null) {
            fVar.e(jVar, (int) (this.f432721g + 0.5f));
        } else {
            fVar.d(jVar, fVar.j(oVar.f432717c), (int) (this.f432721g + 0.5f), 6);
        }
    }

    public void g(int i17, v2.o oVar, int i18) {
        this.f432722h = i17;
        this.f432718d = oVar;
        this.f432719e = i18;
        oVar.a(this);
    }

    public void h(v2.o oVar, int i17) {
        this.f432718d = oVar;
        this.f432719e = i17;
        oVar.a(this);
    }

    public void i(v2.o oVar, int i17, v2.p pVar) {
        this.f432718d = oVar;
        oVar.a(this);
        this.f432724j = pVar;
        this.f432725k = i17;
        pVar.a(this);
    }

    public void j() {
        this.f432729b = 0;
        this.f432728a.clear();
        this.f432718d = null;
        this.f432719e = 0.0f;
        this.f432724j = null;
        this.f432725k = 1;
        this.f432726l = null;
        this.f432720f = null;
        this.f432721g = 0.0f;
        this.f432723i = null;
        this.f432722h = 0;
    }

    public void k(v2.o oVar, float f17) {
        int i17 = this.f432729b;
        if (i17 == 0 || !(this.f432720f == oVar || this.f432721g == f17)) {
            this.f432720f = oVar;
            this.f432721g = f17;
            if (i17 == 1) {
                c();
            }
            b();
        }
    }

    public java.lang.String l(int i17) {
        return i17 == 1 ? "DIRECT" : i17 == 2 ? "CENTER" : i17 == 3 ? "MATCH" : i17 == 4 ? "CHAIN" : i17 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public java.lang.String toString() {
        int i17 = this.f432729b;
        v2.g gVar = this.f432717c;
        if (i17 != 1) {
            return "{ " + gVar + " UNRESOLVED} type: " + l(this.f432722h);
        }
        if (this.f432720f == this) {
            return "[" + gVar + ", RESOLVED: " + this.f432721g + "]  type: " + l(this.f432722h);
        }
        return "[" + gVar + ", RESOLVED: " + this.f432720f + ":" + this.f432721g + "] type: " + l(this.f432722h);
    }
}
