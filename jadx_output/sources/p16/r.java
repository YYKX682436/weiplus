package p16;

/* loaded from: classes16.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Iterator f351340a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map.Entry f351341b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f351342c;

    public r(p16.s sVar, boolean z17, p16.o oVar) {
        p16.n nVar = sVar.f351343d;
        boolean z18 = nVar.f351326c;
        p16.w0 w0Var = nVar.f351324a;
        java.util.Iterator a0Var = z18 ? new p16.a0(((p16.v0) w0Var.entrySet()).iterator()) : ((p16.v0) w0Var.entrySet()).iterator();
        this.f351340a = a0Var;
        if (a0Var.hasNext()) {
            this.f351341b = (java.util.Map.Entry) a0Var.next();
        }
        this.f351342c = z17;
    }

    public void a(int i17, p16.j jVar) {
        while (true) {
            java.util.Map.Entry entry = this.f351341b;
            if (entry == null || ((p16.t) entry.getKey()).f351346d >= i17) {
                return;
            }
            p16.t tVar = (p16.t) this.f351341b.getKey();
            int i18 = 0;
            if (this.f351342c && tVar.f351347e.f351290d == p16.h1.MESSAGE && !tVar.f351348f) {
                p16.h0 h0Var = (p16.h0) this.f351341b.getValue();
                jVar.x(1, 3);
                jVar.x(2, 0);
                jVar.v(tVar.f351346d);
                jVar.o(3, h0Var);
                jVar.x(1, 4);
            } else {
                java.lang.Object value = this.f351341b.getValue();
                p16.n nVar = p16.n.f351323d;
                p16.g1 g1Var = tVar.f351347e;
                int i19 = tVar.f351346d;
                if (tVar.f351348f) {
                    java.util.List list = (java.util.List) value;
                    if (tVar.f351349g) {
                        jVar.x(i19, 2);
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            i18 += p16.n.c(g1Var, it.next());
                        }
                        jVar.v(i18);
                        java.util.Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            p16.n.m(jVar, g1Var, it6.next());
                        }
                    } else {
                        java.util.Iterator it7 = list.iterator();
                        while (it7.hasNext()) {
                            p16.n.l(jVar, g1Var, i19, it7.next());
                        }
                    }
                } else {
                    p16.n.l(jVar, g1Var, i19, value);
                }
            }
            java.util.Iterator it8 = this.f351340a;
            if (it8.hasNext()) {
                this.f351341b = (java.util.Map.Entry) it8.next();
            } else {
                this.f351341b = null;
            }
        }
    }
}
