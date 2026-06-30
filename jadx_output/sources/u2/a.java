package u2;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public final u2.b f423808b;

    /* renamed from: c, reason: collision with root package name */
    public final u2.c f423809c;

    /* renamed from: a, reason: collision with root package name */
    public int f423807a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f423810d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f423811e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f423812f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f423813g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f423814h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f423815i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f423816j = false;

    public a(u2.b bVar, u2.c cVar) {
        this.f423808b = bVar;
        this.f423809c = cVar;
    }

    public final void a(u2.j jVar, float f17, boolean z17) {
        if (f17 == 0.0f) {
            return;
        }
        int i17 = this.f423814h;
        u2.b bVar = this.f423808b;
        if (i17 == -1) {
            this.f423814h = 0;
            this.f423813g[0] = f17;
            this.f423811e[0] = jVar.f423846a;
            this.f423812f[0] = -1;
            jVar.f423854i++;
            jVar.a(bVar);
            this.f423807a++;
            if (this.f423816j) {
                return;
            }
            int i18 = this.f423815i + 1;
            this.f423815i = i18;
            int[] iArr = this.f423811e;
            if (i18 >= iArr.length) {
                this.f423816j = true;
                this.f423815i = iArr.length - 1;
                return;
            }
            return;
        }
        int i19 = -1;
        for (int i27 = 0; i17 != -1 && i27 < this.f423807a; i27++) {
            int i28 = this.f423811e[i17];
            int i29 = jVar.f423846a;
            if (i28 == i29) {
                float[] fArr = this.f423813g;
                float f18 = fArr[i17] + f17;
                fArr[i17] = f18;
                if (f18 == 0.0f) {
                    if (i17 == this.f423814h) {
                        this.f423814h = this.f423812f[i17];
                    } else {
                        int[] iArr2 = this.f423812f;
                        iArr2[i19] = iArr2[i17];
                    }
                    if (z17) {
                        jVar.b(bVar);
                    }
                    if (this.f423816j) {
                        this.f423815i = i17;
                    }
                    jVar.f423854i--;
                    this.f423807a--;
                    return;
                }
                return;
            }
            if (i28 < i29) {
                i19 = i17;
            }
            i17 = this.f423812f[i17];
        }
        int i37 = this.f423815i;
        int i38 = i37 + 1;
        if (this.f423816j) {
            int[] iArr3 = this.f423811e;
            if (iArr3[i37] != -1) {
                i37 = iArr3.length;
            }
        } else {
            i37 = i38;
        }
        int[] iArr4 = this.f423811e;
        if (i37 >= iArr4.length && this.f423807a < iArr4.length) {
            int i39 = 0;
            while (true) {
                int[] iArr5 = this.f423811e;
                if (i39 >= iArr5.length) {
                    break;
                }
                if (iArr5[i39] == -1) {
                    i37 = i39;
                    break;
                }
                i39++;
            }
        }
        int[] iArr6 = this.f423811e;
        if (i37 >= iArr6.length) {
            i37 = iArr6.length;
            int i47 = this.f423810d * 2;
            this.f423810d = i47;
            this.f423816j = false;
            this.f423815i = i37 - 1;
            this.f423813g = java.util.Arrays.copyOf(this.f423813g, i47);
            this.f423811e = java.util.Arrays.copyOf(this.f423811e, this.f423810d);
            this.f423812f = java.util.Arrays.copyOf(this.f423812f, this.f423810d);
        }
        this.f423811e[i37] = jVar.f423846a;
        this.f423813g[i37] = f17;
        if (i19 != -1) {
            int[] iArr7 = this.f423812f;
            iArr7[i37] = iArr7[i19];
            iArr7[i19] = i37;
        } else {
            this.f423812f[i37] = this.f423814h;
            this.f423814h = i37;
        }
        jVar.f423854i++;
        jVar.a(bVar);
        this.f423807a++;
        if (!this.f423816j) {
            this.f423815i++;
        }
        int i48 = this.f423815i;
        int[] iArr8 = this.f423811e;
        if (i48 >= iArr8.length) {
            this.f423816j = true;
            this.f423815i = iArr8.length - 1;
        }
    }

    public final void b() {
        int i17 = this.f423814h;
        for (int i18 = 0; i17 != -1 && i18 < this.f423807a; i18++) {
            u2.j jVar = this.f423809c.f423823c[this.f423811e[i17]];
            if (jVar != null) {
                jVar.b(this.f423808b);
            }
            i17 = this.f423812f[i17];
        }
        this.f423814h = -1;
        this.f423815i = -1;
        this.f423816j = false;
        this.f423807a = 0;
    }

    public final float c(u2.j jVar) {
        int i17 = this.f423814h;
        for (int i18 = 0; i17 != -1 && i18 < this.f423807a; i18++) {
            if (this.f423811e[i17] == jVar.f423846a) {
                return this.f423813g[i17];
            }
            i17 = this.f423812f[i17];
        }
        return 0.0f;
    }

    public u2.j d(boolean[] zArr, u2.j jVar) {
        u2.i iVar;
        int i17 = this.f423814h;
        u2.j jVar2 = null;
        float f17 = 0.0f;
        for (int i18 = 0; i17 != -1 && i18 < this.f423807a; i18++) {
            float f18 = this.f423813g[i17];
            if (f18 < 0.0f) {
                u2.j jVar3 = this.f423809c.f423823c[this.f423811e[i17]];
                if ((zArr == null || !zArr[jVar3.f423846a]) && jVar3 != jVar && (((iVar = jVar3.f423851f) == u2.i.SLACK || iVar == u2.i.ERROR) && f18 < f17)) {
                    f17 = f18;
                    jVar2 = jVar3;
                }
            }
            i17 = this.f423812f[i17];
        }
        return jVar2;
    }

    public final u2.j e(int i17) {
        int i18 = this.f423814h;
        for (int i19 = 0; i18 != -1 && i19 < this.f423807a; i19++) {
            if (i19 == i17) {
                return this.f423809c.f423823c[this.f423811e[i18]];
            }
            i18 = this.f423812f[i18];
        }
        return null;
    }

    public final void f(u2.j jVar, float f17) {
        if (f17 == 0.0f) {
            g(jVar, true);
            return;
        }
        int i17 = this.f423814h;
        u2.b bVar = this.f423808b;
        if (i17 == -1) {
            this.f423814h = 0;
            this.f423813g[0] = f17;
            this.f423811e[0] = jVar.f423846a;
            this.f423812f[0] = -1;
            jVar.f423854i++;
            jVar.a(bVar);
            this.f423807a++;
            if (this.f423816j) {
                return;
            }
            int i18 = this.f423815i + 1;
            this.f423815i = i18;
            int[] iArr = this.f423811e;
            if (i18 >= iArr.length) {
                this.f423816j = true;
                this.f423815i = iArr.length - 1;
                return;
            }
            return;
        }
        int i19 = -1;
        for (int i27 = 0; i17 != -1 && i27 < this.f423807a; i27++) {
            int i28 = this.f423811e[i17];
            int i29 = jVar.f423846a;
            if (i28 == i29) {
                this.f423813g[i17] = f17;
                return;
            }
            if (i28 < i29) {
                i19 = i17;
            }
            i17 = this.f423812f[i17];
        }
        int i37 = this.f423815i;
        int i38 = i37 + 1;
        if (this.f423816j) {
            int[] iArr2 = this.f423811e;
            if (iArr2[i37] != -1) {
                i37 = iArr2.length;
            }
        } else {
            i37 = i38;
        }
        int[] iArr3 = this.f423811e;
        if (i37 >= iArr3.length && this.f423807a < iArr3.length) {
            int i39 = 0;
            while (true) {
                int[] iArr4 = this.f423811e;
                if (i39 >= iArr4.length) {
                    break;
                }
                if (iArr4[i39] == -1) {
                    i37 = i39;
                    break;
                }
                i39++;
            }
        }
        int[] iArr5 = this.f423811e;
        if (i37 >= iArr5.length) {
            i37 = iArr5.length;
            int i47 = this.f423810d * 2;
            this.f423810d = i47;
            this.f423816j = false;
            this.f423815i = i37 - 1;
            this.f423813g = java.util.Arrays.copyOf(this.f423813g, i47);
            this.f423811e = java.util.Arrays.copyOf(this.f423811e, this.f423810d);
            this.f423812f = java.util.Arrays.copyOf(this.f423812f, this.f423810d);
        }
        this.f423811e[i37] = jVar.f423846a;
        this.f423813g[i37] = f17;
        if (i19 != -1) {
            int[] iArr6 = this.f423812f;
            iArr6[i37] = iArr6[i19];
            iArr6[i19] = i37;
        } else {
            this.f423812f[i37] = this.f423814h;
            this.f423814h = i37;
        }
        jVar.f423854i++;
        jVar.a(bVar);
        int i48 = this.f423807a + 1;
        this.f423807a = i48;
        if (!this.f423816j) {
            this.f423815i++;
        }
        int[] iArr7 = this.f423811e;
        if (i48 >= iArr7.length) {
            this.f423816j = true;
        }
        if (this.f423815i >= iArr7.length) {
            this.f423816j = true;
            this.f423815i = iArr7.length - 1;
        }
    }

    public final float g(u2.j jVar, boolean z17) {
        int i17 = this.f423814h;
        if (i17 == -1) {
            return 0.0f;
        }
        int i18 = 0;
        int i19 = -1;
        while (i17 != -1 && i18 < this.f423807a) {
            if (this.f423811e[i17] == jVar.f423846a) {
                if (i17 == this.f423814h) {
                    this.f423814h = this.f423812f[i17];
                } else {
                    int[] iArr = this.f423812f;
                    iArr[i19] = iArr[i17];
                }
                if (z17) {
                    jVar.b(this.f423808b);
                }
                jVar.f423854i--;
                this.f423807a--;
                this.f423811e[i17] = -1;
                if (this.f423816j) {
                    this.f423815i = i17;
                }
                return this.f423813g[i17];
            }
            i18++;
            i19 = i17;
            i17 = this.f423812f[i17];
        }
        return 0.0f;
    }

    public java.lang.String toString() {
        int i17 = this.f423814h;
        java.lang.String str = "";
        for (int i18 = 0; i17 != -1 && i18 < this.f423807a; i18++) {
            str = ((str + " -> ") + this.f423813g[i17] + " : ") + this.f423809c.f423823c[this.f423811e[i17]];
            i17 = this.f423812f[i17];
        }
        return str;
    }
}
