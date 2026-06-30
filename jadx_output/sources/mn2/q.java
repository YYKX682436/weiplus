package mn2;

/* loaded from: classes11.dex */
public class q implements com.tencent.mm.pluginsdk.ui.j1, com.tencent.mm.pluginsdk.ui.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f330090d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.j1 f330091e;

    public q(com.tencent.mm.pluginsdk.ui.j1 j1Var) {
        this.f330091e = j1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        android.util.Pair b17 = b(str);
        if (((java.lang.Boolean) b17.second).booleanValue()) {
            return Zg(str, 0, 0, 0);
        }
        return this.f330091e.W0((java.lang.String) b17.first);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.pluginsdk.ui.j1
    public void X9(com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        if (n1Var instanceof kv.e0) {
            java.lang.String str = n1Var.f190901m;
            boolean z17 = true;
            if (!(str == null || str.length() == 0)) {
                java.lang.String[] strArr = mn2.s.f330107f;
                for (int i17 = 0; i17 < 4; i17++) {
                    if (r26.i0.n(str, strArr[i17], false)) {
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                ((java.util.ArrayList) this.f330090d).add(new java.lang.ref.WeakReference((kv.e0) n1Var));
            } else {
                n1Var.f190903o = new mn2.p(this, str, n1Var);
                this.f330091e.X9(n1Var);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        java.lang.String h17;
        boolean z17 = false;
        if ((str == null || str.length() == 0) || !(com.tencent.mm.storage.z3.S3(str) || com.tencent.mm.storage.z3.U3(str) || com.tencent.mm.storage.z3.T3(str))) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            h17 = com.tencent.mm.plugin.finder.service.m4.f126148a.h(str);
        } else {
            h17 = str;
        }
        if (!(str == null || str.length() == 0)) {
            java.lang.String[] strArr = mn2.s.f330107f;
            int i27 = 0;
            while (true) {
                if (i27 >= 4) {
                    break;
                }
                if (r26.i0.n(str, strArr[i27], false)) {
                    z17 = true;
                    break;
                }
                i27++;
            }
        }
        if (!z17) {
            return this.f330091e.Zg(h17, i17, i18, i19);
        }
        zy2.dc hj6 = com.tencent.mm.storage.z3.S3(h17) ? ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).hj(h17) : com.tencent.mm.storage.z3.T3(h17) ? ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).ij(h17) : ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).mj(h17);
        if (hj6 == null) {
            return null;
        }
        java.lang.String y07 = ((ya2.b2) hj6).y0();
        boolean S3 = com.tencent.mm.storage.z3.S3(h17);
        mn2.g1 g1Var = mn2.g1.f329975a;
        yo0.i h18 = g1Var.h(S3 ? mn2.f1.f329957h : mn2.f1.f329961o);
        wo0.c a17 = (S3 ? g1Var.a() : g1Var.l()).a(new mn2.n(y07, com.tencent.mm.plugin.finder.storage.y90.W));
        a17.g(h18);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) a17.e();
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        a17.f447873d = new mn2.o(this, str);
        a17.a();
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k1
    public boolean a(java.lang.String str) {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        return !com.tencent.mm.storage.z3.S3(com.tencent.mm.plugin.finder.service.m4.f126148a.h(str));
    }

    public final android.util.Pair b(java.lang.String str) {
        if (!com.tencent.mm.storage.z3.S3(str) && !com.tencent.mm.storage.z3.U3(str) && !com.tencent.mm.storage.z3.T3(str)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String h17 = com.tencent.mm.plugin.finder.service.m4.f126148a.h(str);
            return new android.util.Pair(h17, java.lang.Boolean.valueOf(com.tencent.mm.storage.z3.S3(h17) || com.tencent.mm.storage.z3.U3(h17)));
        }
        return new android.util.Pair(str, java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap loadBitmap(java.lang.String str) {
        android.util.Pair b17 = b(str);
        if (((java.lang.Boolean) b17.second).booleanValue()) {
            return Zg(str, 0, 0, 0);
        }
        return this.f330091e.loadBitmap((java.lang.String) b17.first);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap uc() {
        return this.f330091e.uc();
    }
}
