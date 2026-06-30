package kv5;

/* loaded from: classes16.dex */
public abstract class f {
    public abstract int a(int i17);

    public abstract int b(int i17);

    public abstract int c(int i17);

    public final av5.g[] d(av5.g[] gVarArr) {
        av5.g[] gVarArr2 = new av5.g[gVarArr.length];
        for (int i17 = 0; i17 < gVarArr.length; i17++) {
            av5.g gVar = gVarArr[i17];
            int c17 = c(gVar.f14372d);
            kv5.i iVar = (kv5.i) this;
            fv5.b bVar = iVar.f312775p;
            int i18 = gVar.f14374f;
            int d17 = bVar.d(i18);
            if (d17 >= 0) {
                i18 = bVar.f267022e[d17];
            } else if (i18 >= 0 && iVar.F.a(i18)) {
                i18 = -1;
            }
            gVarArr2[i17] = new av5.g(c17, gVar.f14373e, i18);
        }
        return gVarArr2;
    }

    public abstract int e(int i17);

    public abstract int f(int i17);

    public abstract int g(int i17);
}
