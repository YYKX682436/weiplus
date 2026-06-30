package u2;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public float f423849d;

    /* renamed from: f, reason: collision with root package name */
    public u2.i f423851f;

    /* renamed from: a, reason: collision with root package name */
    public int f423846a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f423847b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f423848c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f423850e = new float[7];

    /* renamed from: g, reason: collision with root package name */
    public u2.b[] f423852g = new u2.b[8];

    /* renamed from: h, reason: collision with root package name */
    public int f423853h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f423854i = 0;

    public j(u2.i iVar, java.lang.String str) {
        this.f423851f = iVar;
    }

    public final void a(u2.b bVar) {
        int i17 = 0;
        while (true) {
            int i18 = this.f423853h;
            if (i17 >= i18) {
                u2.b[] bVarArr = this.f423852g;
                if (i18 >= bVarArr.length) {
                    this.f423852g = (u2.b[]) java.util.Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                u2.b[] bVarArr2 = this.f423852g;
                int i19 = this.f423853h;
                bVarArr2[i19] = bVar;
                this.f423853h = i19 + 1;
                return;
            }
            if (this.f423852g[i17] == bVar) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void b(u2.b bVar) {
        int i17 = this.f423853h;
        for (int i18 = 0; i18 < i17; i18++) {
            if (this.f423852g[i18] == bVar) {
                for (int i19 = 0; i19 < (i17 - i18) - 1; i19++) {
                    u2.b[] bVarArr = this.f423852g;
                    int i27 = i18 + i19;
                    bVarArr[i27] = bVarArr[i27 + 1];
                }
                this.f423853h--;
                return;
            }
        }
    }

    public void c() {
        this.f423851f = u2.i.UNKNOWN;
        this.f423848c = 0;
        this.f423846a = -1;
        this.f423847b = -1;
        this.f423849d = 0.0f;
        this.f423853h = 0;
        this.f423854i = 0;
    }

    public final void d(u2.b bVar) {
        int i17 = this.f423853h;
        for (int i18 = 0; i18 < i17; i18++) {
            u2.b bVar2 = this.f423852g[i18];
            u2.a aVar = bVar2.f423819c;
            int i19 = aVar.f423814h;
            while (true) {
                for (int i27 = 0; i19 != -1 && i27 < aVar.f423807a; i27++) {
                    int i28 = aVar.f423811e[i19];
                    u2.j jVar = bVar.f423817a;
                    if (i28 == jVar.f423846a) {
                        float f17 = aVar.f423813g[i19];
                        aVar.g(jVar, false);
                        u2.a aVar2 = bVar.f423819c;
                        int i29 = aVar2.f423814h;
                        for (int i37 = 0; i29 != -1 && i37 < aVar2.f423807a; i37++) {
                            aVar.a(aVar.f423809c.f423823c[aVar2.f423811e[i29]], aVar2.f423813g[i29] * f17, false);
                            i29 = aVar2.f423812f[i29];
                        }
                        bVar2.f423818b += bVar.f423818b * f17;
                        i19 = aVar.f423814h;
                    } else {
                        i19 = aVar.f423812f[i19];
                    }
                }
            }
        }
        this.f423853h = 0;
    }

    public java.lang.String toString() {
        return "null";
    }
}
