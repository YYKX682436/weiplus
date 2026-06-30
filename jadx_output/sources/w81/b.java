package w81;

/* loaded from: classes4.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f443807e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f443808d;

    static {
        l75.e0 e0Var = w81.c.f443809p;
        f443807e = w81.c.f443810q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, w81.c.f443809p, "WxaSecurityStorageInfo", dm.bd.f235963g);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = w81.c.f443809p;
        this.f443808d = db6;
    }

    public final byte[] y0(int i17) {
        try {
            java.io.InputStream E = com.tencent.mm.vfs.w6.E("/dev/urandom");
            try {
                byte[] bArr = new byte[i17];
                int i18 = 0;
                do {
                    int read = E.read(bArr, i18, i17 - i18);
                    if (read < 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SecretMMKVStorage.AppBrandStorageSecurityInfoDB", "EOF of /dev/urandom ?!");
                        vz5.b.a(E, null);
                        return null;
                    }
                    i18 += read;
                } while (i18 < i17);
                vz5.b.a(E, null);
                return bArr;
            } finally {
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SecretMMKVStorage.AppBrandStorageSecurityInfoDB", e17, " generate salt by [/dev/urandom] faild,  use Random#nextBytes instead", new java.lang.Object[0]);
            byte[] bArr2 = new byte[i17];
            c06.e.f37716d.getClass();
            c06.a aVar = (c06.a) c06.e.f37717e;
            aVar.getClass();
            aVar.i().nextBytes(bArr2);
            return bArr2;
        }
    }
}
