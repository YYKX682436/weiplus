package g9;

/* loaded from: classes15.dex */
public final class l implements d9.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f269623a;

    /* renamed from: b, reason: collision with root package name */
    public final g9.o f269624b;

    public l(g9.o oVar, int i17) {
        this.f269624b = oVar;
        this.f269623a = i17;
    }

    @Override // d9.g0
    public int a(m8.s sVar, o8.g gVar, boolean z17) {
        g9.o oVar = this.f269624b;
        if (oVar.u()) {
            return -3;
        }
        java.util.LinkedList linkedList = oVar.f269635p;
        if (!linkedList.isEmpty()) {
            while (true) {
                boolean z18 = true;
                if (linkedList.size() <= 1) {
                    break;
                }
                int i17 = ((g9.i) linkedList.getFirst()).f269585j;
                int i18 = 0;
                while (true) {
                    d9.f0[] f0VarArr = oVar.f269638s;
                    if (i18 >= f0VarArr.length) {
                        break;
                    }
                    if (oVar.C[i18]) {
                        d9.c0 c0Var = f0VarArr[i18].f227339c;
                        if ((c0Var.f() ? c0Var.f227294b[c0Var.e(c0Var.f227304l)] : c0Var.f227310r) == i17) {
                            z18 = false;
                            break;
                        }
                    }
                    i18++;
                }
                if (!z18) {
                    break;
                }
                linkedList.removeFirst();
            }
            g9.i iVar = (g9.i) linkedList.getFirst();
            com.google.android.exoplayer2.Format format = iVar.f250322c;
            if (!format.equals(oVar.f269643x)) {
                int i19 = oVar.f269626d;
                int i27 = iVar.f250323d;
                java.lang.Object obj = iVar.f250324e;
                long j17 = iVar.f250325f;
                d9.g gVar2 = oVar.f269633n;
                if (gVar2.f227350b != null) {
                    gVar2.f227349a.post(new d9.e(gVar2, i19, format, i27, obj, j17));
                }
            }
            oVar.f269643x = format;
        }
        return oVar.f269638s[this.f269623a].k(sVar, gVar, z17, oVar.I, oVar.E);
    }

    @Override // d9.g0
    public void b() {
        g9.o oVar = this.f269624b;
        oVar.f269632m.b();
        g9.f fVar = oVar.f269628f;
        java.io.IOException iOException = fVar.f269577j;
        if (iOException != null) {
            throw iOException;
        }
        h9.a aVar = fVar.f269578k;
        if (aVar != null) {
            h9.i iVar = (h9.i) fVar.f269572e.f279661g.get(aVar);
            iVar.f279648e.b();
            java.io.IOException iOException2 = iVar.f279656p;
            if (iOException2 != null) {
                throw iOException2;
            }
        }
    }

    @Override // d9.g0
    public void c(long j17) {
        long j18;
        g9.o oVar = this.f269624b;
        d9.f0 f0Var = oVar.f269638s[this.f269623a];
        if (oVar.I) {
            d9.c0 c0Var = f0Var.f227339c;
            synchronized (c0Var) {
                j18 = c0Var.f227306n;
            }
            if (j17 > j18) {
                d9.c0 c0Var2 = f0Var.f227339c;
                synchronized (c0Var2) {
                    if (c0Var2.f()) {
                        c0Var2.f227304l = c0Var2.f227301i;
                        return;
                    }
                    return;
                }
            }
        }
        f0Var.e(j17, true, true);
    }

    @Override // d9.g0
    public boolean isReady() {
        g9.o oVar = this.f269624b;
        return oVar.I || (!oVar.u() && oVar.f269638s[this.f269623a].f227339c.f());
    }
}
