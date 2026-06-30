package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes11.dex */
public class y implements com.tencent.mm.pluginsdk.ui.j1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.j1 f192093d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f192094e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelavatar.e f192095f = null;

    public y(com.tencent.mm.pluginsdk.ui.j1 j1Var) {
        this.f192093d = j1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        android.graphics.Bitmap b17 = b(str);
        if (b17 != null && !b17.isRecycled()) {
            return b17;
        }
        com.tencent.mm.pluginsdk.ui.j1 j1Var = this.f192093d;
        if (j1Var != null) {
            return j1Var.W0(str);
        }
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public void X9(com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        com.tencent.mm.pluginsdk.ui.j1 j1Var = this.f192093d;
        if (j1Var != null) {
            j1Var.X9(n1Var);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        u45.f a17;
        android.graphics.Bitmap b17 = b(str);
        if (b17 != null && !b17.isRecycled()) {
            return b17;
        }
        com.tencent.mm.pluginsdk.ui.j1 j1Var = this.f192093d;
        if (j1Var != null) {
            b17 = j1Var.Zg(str, i17, i18, i19);
        }
        android.graphics.Bitmap a18 = a(b17);
        if (a18 != null) {
            com.tencent.mm.modelavatar.e eVar = this.f192095f;
            if ((eVar != null && eVar.f70441b > 0.0f) && (a17 = u45.e.a()) != null) {
                ((va3.m0) a17).Bi(str + "-" + this.f192095f.f70441b, a18);
            }
        }
        return a18;
    }

    public final android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        com.tencent.mm.modelavatar.e eVar = this.f192095f;
        return eVar != null && (eVar.f70441b > 0.0f ? 1 : (eVar.f70441b == 0.0f ? 0 : -1)) > 0 ? com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, eVar.f70441b * bitmap.getWidth()) : bitmap;
    }

    public final android.graphics.Bitmap b(java.lang.String str) {
        u45.f a17;
        com.tencent.mm.modelavatar.e eVar = this.f192095f;
        if (!(eVar != null && eVar.f70441b > 0.0f) || (a17 = u45.e.a()) == null) {
            return null;
        }
        return ((va3.m0) a17).Ai(str + "-" + this.f192095f.f70441b);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap loadBitmap(java.lang.String str) {
        u45.f a17;
        android.graphics.Bitmap b17 = b(str);
        if (b17 != null && !b17.isRecycled()) {
            return b17;
        }
        com.tencent.mm.modelavatar.e eVar = this.f192095f;
        boolean z17 = false;
        if (eVar != null) {
            b17 = com.tencent.mm.modelavatar.g.b(str, false, -1, eVar);
        } else {
            com.tencent.mm.pluginsdk.ui.j1 j1Var = this.f192093d;
            if (j1Var != null) {
                b17 = j1Var.loadBitmap(str);
            }
        }
        android.graphics.Bitmap a18 = a(b17);
        if (a18 != null) {
            com.tencent.mm.modelavatar.e eVar2 = this.f192095f;
            if (eVar2 != null && eVar2.f70441b > 0.0f) {
                z17 = true;
            }
            if (z17 && (a17 = u45.e.a()) != null) {
                ((va3.m0) a17).Bi(str + "-" + this.f192095f.f70441b, a18);
            }
        }
        return a18;
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap uc() {
        android.graphics.Bitmap bitmap = this.f192094e;
        if (bitmap != null && !bitmap.isRecycled()) {
            return this.f192094e;
        }
        com.tencent.mm.pluginsdk.ui.j1 j1Var = this.f192093d;
        if (j1Var != null) {
            return j1Var.uc();
        }
        return null;
    }
}
