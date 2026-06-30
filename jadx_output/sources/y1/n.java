package y1;

/* loaded from: classes14.dex */
public final class n extends u1.p0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u1.c1 wrapped, y1.o modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.o.g(wrapped, "wrapped");
        kotlin.jvm.internal.o.g(modifier, "modifier");
    }

    @Override // u1.p0
    public void a() {
        this.f423657g = true;
        u1.r1 r1Var = this.f423654d.f423554h.f423689m;
        if (r1Var != null) {
            ((androidx.compose.ui.platform.AndroidComposeView) r1Var).n();
        }
    }

    @Override // u1.p0
    public void b() {
        this.f423657g = false;
        u1.r1 r1Var = this.f423654d.f423554h.f423689m;
        if (r1Var != null) {
            ((androidx.compose.ui.platform.AndroidComposeView) r1Var).n();
        }
    }

    public final y1.l c() {
        y1.n nVar = (y1.n) this.f423656f;
        y1.n nVar2 = null;
        if (nVar == null) {
            u1.c1 j07 = this.f423654d.j0();
            if (j07 != null) {
                while (j07 != null && !u1.p.a(j07.f423568y, 2)) {
                    j07 = j07.j0();
                }
                if (j07 != null && (nVar = (y1.n) j07.f423568y[2]) != null) {
                    u1.c1 c1Var = nVar.f423654d;
                    while (c1Var != null) {
                        if (nVar != null) {
                            nVar2 = nVar;
                            break;
                        }
                        c1Var = c1Var.j0();
                        nVar = c1Var != null ? (y1.n) c1Var.f423568y[2] : null;
                    }
                }
            }
        } else {
            u1.c1 c1Var2 = nVar.f423654d;
            while (c1Var2 != null) {
                if (nVar != null) {
                    nVar2 = nVar;
                    break;
                }
                c1Var2 = c1Var2.j0();
                nVar = c1Var2 != null ? (y1.n) c1Var2.f423568y[2] : null;
            }
        }
        z0.t tVar = this.f423655e;
        if (nVar2 != null) {
            y1.l lVar = ((y1.q) ((y1.o) tVar)).f458787e;
            if (!lVar.f458768f) {
                lVar.getClass();
                y1.l lVar2 = new y1.l();
                lVar2.f458767e = lVar.f458767e;
                lVar2.f458768f = lVar.f458768f;
                lVar2.f458766d.putAll(lVar.f458766d);
                y1.l peer = nVar2.c();
                kotlin.jvm.internal.o.g(peer, "peer");
                if (peer.f458767e) {
                    lVar2.f458767e = true;
                }
                if (peer.f458768f) {
                    lVar2.f458768f = true;
                }
                for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) peer.f458766d).entrySet()) {
                    y1.o0 o0Var = (y1.o0) entry.getKey();
                    java.lang.Object value = entry.getValue();
                    java.util.Map map = lVar2.f458766d;
                    if (!map.containsKey(o0Var)) {
                        map.put(o0Var, value);
                    } else if (value instanceof y1.a) {
                        java.lang.Object obj = ((java.util.LinkedHashMap) map).get(o0Var);
                        if (obj == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                        }
                        y1.a aVar = (y1.a) obj;
                        java.lang.String str = aVar.f458692a;
                        if (str == null) {
                            str = ((y1.a) value).f458692a;
                        }
                        jz5.b bVar = aVar.f458693b;
                        if (bVar == null) {
                            bVar = ((y1.a) value).f458693b;
                        }
                        map.put(o0Var, new y1.a(str, bVar));
                    } else {
                        continue;
                    }
                }
                return lVar2;
            }
        }
        return ((y1.q) ((y1.o) tVar)).f458787e;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.toString());
        sb6.append(" id: ");
        z0.t tVar = this.f423655e;
        sb6.append(((y1.q) ((y1.o) tVar)).f458786d);
        sb6.append(" config: ");
        sb6.append(((y1.q) ((y1.o) tVar)).f458787e);
        return sb6.toString();
    }
}
