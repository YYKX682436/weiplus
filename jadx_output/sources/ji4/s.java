package ji4;

/* loaded from: classes11.dex */
public class s implements com.tencent.mm.pluginsdk.ui.j1, com.tencent.mm.pluginsdk.ui.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f299948d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.j1 f299949e;

    public s(com.tencent.mm.pluginsdk.ui.j1 j1Var) {
        this.f299949e = j1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        android.util.Pair b17 = b(str);
        if (((java.lang.Boolean) b17.second).booleanValue()) {
            return Zg(str, 0, 0, 0);
        }
        return this.f299949e.W0((java.lang.String) b17.first);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.pluginsdk.ui.j1
    public void X9(com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        if (n1Var instanceof kv.e0) {
            android.util.Pair b17 = b(n1Var.f190901m);
            boolean booleanValue = ((java.lang.Boolean) b17.second).booleanValue();
            java.lang.String str = (java.lang.String) b17.first;
            if (!booleanValue) {
                n1Var.f190903o = new ji4.r(this, str, n1Var);
                this.f299949e.X9(n1Var);
            } else {
                ((java.util.ArrayList) this.f299948d).add(new java.lang.ref.WeakReference((kv.e0) n1Var));
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        android.util.Pair b17 = b(str);
        java.lang.String str2 = (java.lang.String) b17.first;
        if (!((java.lang.Boolean) b17.second).booleanValue()) {
            return this.f299949e.Zg(str2, i17, i18, i19);
        }
        mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(str);
        if (Ai == null) {
            return null;
        }
        java.lang.String str3 = Ai.field_smallHeadImgUrl;
        mn2.g1 g1Var = mn2.g1.f329975a;
        yo0.i h17 = g1Var.h(mn2.f1.f329961o);
        vo0.d l17 = g1Var.l();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f460502a;
        wo0.c a17 = l17.a(new mn2.n(str3, com.tencent.mm.plugin.finder.storage.y90.W));
        a17.g(h17);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) a17.e();
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        a17.f447873d = new ji4.q(this, str);
        a17.a();
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k1
    public boolean a(java.lang.String str) {
        return !com.tencent.mm.storage.z3.H4(str);
    }

    public final android.util.Pair b(java.lang.String str) {
        return com.tencent.mm.storage.z3.H4(str) ? new android.util.Pair(str, java.lang.Boolean.TRUE) : new android.util.Pair(str, java.lang.Boolean.FALSE);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap loadBitmap(java.lang.String str) {
        android.util.Pair b17 = b(str);
        if (((java.lang.Boolean) b17.second).booleanValue()) {
            return Zg(str, 0, 0, 0);
        }
        return this.f299949e.loadBitmap((java.lang.String) b17.first);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap uc() {
        return this.f299949e.uc();
    }
}
