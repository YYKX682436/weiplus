package na3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final na3.a f335980f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ na3.b[] f335981g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f335982h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f335983d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f335984e;

    static {
        na3.b[] bVarArr = {new na3.b("RSA_ECB_PKCS1", 0, "RSA/None/PKCS1Padding", "RSAES-PKCS1-v1_5"), new na3.b("RSA_ECB_OAEP_SHA256", 1, "RSA/ECB/OAEPWithSHA-256AndMGF1Padding", "RSA-OAEP"), new na3.b("SHA256_WITH_RSA", 2, "SHA256withRSA", "RSASSA-PKCS1-v1_5"), new na3.b("SHA256_WITH_RSA_PSS", 3, "SHA256withRSA/PSS", "RSA-PSS"), new na3.b("AES_GCM", 4, "AES/GCM/NoPadding", "AES-GCM")};
        f335981g = bVarArr;
        f335982h = rz5.b.a(bVarArr);
        f335980f = new na3.a(null);
    }

    public b(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f335983d = str2;
        this.f335984e = str3;
    }

    public static na3.b valueOf(java.lang.String str) {
        return (na3.b) java.lang.Enum.valueOf(na3.b.class, str);
    }

    public static na3.b[] values() {
        return (na3.b[]) f335981g.clone();
    }
}
