package g9;

/* loaded from: classes7.dex */
public final class a implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final r9.k f269557a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f269558b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f269559c;

    /* renamed from: d, reason: collision with root package name */
    public javax.crypto.CipherInputStream f269560d;

    public a(r9.k kVar, byte[] bArr, byte[] bArr2) {
        this.f269557a = kVar;
        this.f269558b = bArr;
        this.f269559c = bArr2;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        t9.a.d(this.f269560d != null);
        int read = this.f269560d.read(bArr, i17, i18);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new javax.crypto.spec.SecretKeySpec(this.f269558b, "AES"), new javax.crypto.spec.IvParameterSpec(this.f269559c));
                this.f269560d = new javax.crypto.CipherInputStream(new r9.m(this.f269557a, nVar), cipher);
                return -1L;
            } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }

    @Override // r9.k
    public void close() {
        this.f269560d = null;
        this.f269557a.close();
    }

    @Override // r9.k
    public android.net.Uri getUri() {
        return this.f269557a.getUri();
    }
}
