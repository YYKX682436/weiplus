package d32;

/* loaded from: classes10.dex */
public final class t extends ms0.c {
    public int A;
    public final android.graphics.Rect B;

    /* renamed from: t, reason: collision with root package name */
    public int f226192t;

    /* renamed from: u, reason: collision with root package name */
    public os0.a f226193u;

    /* renamed from: v, reason: collision with root package name */
    public d32.s f226194v;

    /* renamed from: w, reason: collision with root package name */
    public p05.l4 f226195w;

    /* renamed from: x, reason: collision with root package name */
    public t85.j f226196x;

    /* renamed from: y, reason: collision with root package name */
    public is0.c f226197y;

    /* renamed from: z, reason: collision with root package name */
    public int f226198z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(0, 0, 0, 0, 1, 2, 15, null);
        i17 = (i18 & 1) != 0 ? 0 : i17;
        this.f226192t = i17;
        this.B = new android.graphics.Rect();
    }

    @Override // ms0.c
    public os0.a f() {
        this.f226197y = is0.b.b(true, 8L);
        os0.a aVar = this.f226193u;
        if (aVar != null) {
            aVar.n();
        }
        os0.c cVar = new os0.c(this.f330945a, this.f330946b, this.f226198z, this.A, 2, 2);
        this.f226193u = cVar;
        cVar.f348006o = true;
        d32.s sVar = this.f226194v;
        if (sVar != null) {
            sVar.n();
        }
        d32.s sVar2 = new d32.s(this.f226198z, this.A, this.f330947c, this.f330948d, 1, 0, 32, null);
        this.f226194v = sVar2;
        is0.c cVar2 = this.f226197y;
        kotlin.jvm.internal.o.d(cVar2);
        sVar2.K = cVar2.f294395e;
        p05.l4 l4Var = this.f226195w;
        if (l4Var != null) {
            l4Var.o();
        }
        p05.l4 l4Var2 = new p05.l4(0, false, false, false, false, false, rh0.z.f395612f, null, false, 445, null);
        this.f226195w = l4Var2;
        l4Var2.C(true);
        p05.l4 l4Var3 = this.f226195w;
        if (l4Var3 != null) {
            l4Var3.H(false);
        }
        p05.l4 l4Var4 = this.f226195w;
        if (l4Var4 != null) {
            l4Var4.i(this.f226196x);
        }
        p05.l4 l4Var5 = this.f226195w;
        if (l4Var5 != null) {
            l4Var5.J(this.f226198z, this.A);
        }
        return cVar;
    }

    @Override // ms0.c
    public void n(boolean z17) {
        super.n(z17);
        d32.s sVar = this.f226194v;
        if (sVar != null) {
            sVar.n();
        }
        p05.l4 l4Var = this.f226195w;
        if (l4Var != null) {
            l4Var.o();
        }
        this.f226195w = null;
        is0.c cVar = this.f226197y;
        if (cVar != null) {
            cVar.close();
        }
    }

    @Override // ms0.c
    public void p() {
        is0.c cVar;
        super.p();
        os0.a aVar = this.f226193u;
        int i17 = (aVar == null || (cVar = aVar.f348000i) == null) ? -1 : cVar.f294395e;
        p05.l4 l4Var = this.f226195w;
        if (l4Var != null) {
            rh0.d0.b(l4Var, i17, false, 0, false, 14, null);
        }
        is0.c cVar2 = this.f226197y;
        kotlin.jvm.internal.o.d(cVar2);
        int i18 = cVar2.f294395e;
        int i19 = this.f226198z;
        int i27 = this.A;
        android.opengl.GLES20.glBindTexture(3553, i18);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, i19, i27, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        android.opengl.GLES20.glBindTexture(3553, 0);
        p05.l4 l4Var2 = this.f226195w;
        if (l4Var2 != null) {
            is0.c cVar3 = this.f226197y;
            kotlin.jvm.internal.o.d(cVar3);
            rh0.d0.c(l4Var2, i17, cVar3.f294395e, 0L, 0, false, false, false, 124, null);
        }
        d32.s sVar = this.f226194v;
        if (sVar != null) {
            sVar.o();
        }
    }

    @Override // ms0.c
    public void t(int i17, int i18) {
        super.t(i17, i18);
        w();
        os0.a aVar = this.f226193u;
        if (aVar != null) {
            aVar.u(this.f226198z, this.A);
        }
        d32.s sVar = this.f226194v;
        if (sVar != null) {
            sVar.w(this.f226198z, this.A);
        }
        d32.s sVar2 = this.f226194v;
        if (sVar2 != null) {
            sVar2.u(this.f330947c, this.f330948d);
        }
        v();
    }

    public final void v() {
        d32.s sVar;
        int i17 = this.f226192t;
        if (i17 == 0) {
            d32.s sVar2 = this.f226194v;
            if (sVar2 != null) {
                sVar2.L = true;
                sVar2.M = this.f226198z * 0.06666667f;
            }
        } else if (i17 == 2 && (sVar = this.f226194v) != null) {
            sVar.L = false;
            sVar.M = 0.0f;
        }
        android.graphics.Rect rect = this.B;
        if (rect.isEmpty()) {
            d32.s sVar3 = this.f226194v;
            if (sVar3 != null) {
                sVar3.O.set(0, 0, this.f330947c, this.f330948d);
                return;
            }
            return;
        }
        d32.s sVar4 = this.f226194v;
        if (sVar4 != null) {
            sVar4.O.set(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public final void w() {
        int i17 = this.f226192t;
        if (i17 == 0) {
            this.f226198z = 640;
            this.A = 640;
        } else if (i17 == 1) {
            this.f226198z = 640;
            this.A = 1137;
        } else if (i17 == 2) {
            int i18 = this.f330947c;
            if (i18 > 640) {
                this.f226198z = 640;
                this.A = (this.f330948d * 640) / i18;
            } else {
                this.f226198z = i18;
                this.A = this.f330948d;
            }
        }
        int i19 = (this.A * 160) / this.f226198z;
    }
}
