package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes11.dex */
public class w implements com.tencent.mm.pluginsdk.ui.j1, com.tencent.mm.pluginsdk.ui.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.j1 f192033d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f192034e = new java.util.HashMap();

    public w(com.tencent.mm.pluginsdk.ui.j1 j1Var) {
        this.f192033d = j1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        return b(str).W0(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public void X9(com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        b(n1Var.f190901m).X9(n1Var);
        this.f192033d.X9(n1Var);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        return b(str).Zg(str, i17, i18, i19);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k1
    public boolean a(java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.j1 b17 = b(str);
        if (b17 instanceof com.tencent.mm.pluginsdk.ui.k1) {
            return ((com.tencent.mm.pluginsdk.ui.k1) b17).a(str);
        }
        return true;
    }

    public final com.tencent.mm.pluginsdk.ui.j1 b(java.lang.String str) {
        if (str == null) {
            return this.f192033d;
        }
        synchronized (this.f192034e) {
            for (java.util.Map.Entry entry : this.f192034e.entrySet()) {
                if (str.endsWith((java.lang.String) entry.getKey())) {
                    return (com.tencent.mm.pluginsdk.ui.j1) entry.getValue();
                }
            }
            java.util.Iterator it = ((fs.c) fs.g.f(com.tencent.mm.pluginsdk.ui.m1.class)).all().iterator();
            while (it.hasNext()) {
                com.tencent.mm.pluginsdk.ui.j1 j1Var = ((com.tencent.mm.pluginsdk.ui.m1) ((fs.q) it.next()).get()).get(str);
                if (j1Var != null) {
                    return j1Var;
                }
            }
            return this.f192033d;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap loadBitmap(java.lang.String str) {
        return b(str).loadBitmap(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap uc() {
        return this.f192033d.uc();
    }
}
