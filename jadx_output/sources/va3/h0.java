package va3;

/* loaded from: classes12.dex */
public class h0 implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f434300d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f434301e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f434302f;

    /* renamed from: g, reason: collision with root package name */
    public final int f434303g;

    /* renamed from: h, reason: collision with root package name */
    public final int f434304h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f434305i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ va3.i0 f434306m;

    public h0(va3.i0 i0Var, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f434306m = i0Var;
        this.f434301e = "";
        this.f434302f = true;
        this.f434302f = z17;
        this.f434303g = i0Var.f434312h;
        this.f434304h = i0Var.f434313i;
        this.f434301e = str;
        while (true) {
            int i17 = this.f434303g;
            int i18 = this.f434304h;
            if (i17 * i18 <= 270000) {
                break;
            }
            this.f434303g = (int) (i17 / 1.2d);
            this.f434304h = (int) (i18 / 1.2d);
        }
        this.f434305i = str2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[1] = str2 == null ? "" : str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.StaticMapServer", "get url %s %s", objArr);
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        byte[] u07 = com.tencent.mm.sdk.platformtools.t8.u0(this.f434301e);
        this.f434300d = u07;
        if (u07 == null) {
            return true;
        }
        com.tencent.mm.vfs.w6.S(this.f434305i, u07, 0, u07.length);
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("http onPostExecute ");
        sb6.append(this.f434300d == null);
        sb6.append(" isGoole: ");
        boolean z17 = this.f434302f;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.StaticMapServer", sb6.toString());
        byte[] bArr = this.f434300d;
        va3.i0 i0Var = this.f434306m;
        if (bArr != null) {
            java.lang.String str = va3.i0.f434307m;
            i0Var.b(true, 0);
            return false;
        }
        if (!z17) {
            java.lang.String str2 = va3.i0.f434307m;
            i0Var.b(false, 0);
            return false;
        }
        if (i0Var.f434310f == null) {
            i0Var.b(false, 0);
            return false;
        }
        java.lang.String format = java.lang.String.format(va3.i0.f434307m, java.lang.Integer.valueOf(this.f434303g), java.lang.Integer.valueOf(this.f434304h), java.lang.Float.valueOf(i0Var.f434310f.f442654b), java.lang.Float.valueOf(i0Var.f434310f.f442653a), java.lang.Integer.valueOf(i0Var.f434310f.f442655c));
        this.f434301e = format;
        i0Var.f434308d.a(new va3.h0(i0Var, false, format, va3.i0.a(i0Var.f434310f)));
        return false;
    }
}
