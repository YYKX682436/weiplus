package yt5;

/* loaded from: classes7.dex */
public class b extends yt5.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.security.keystore.KeyGenParameterSpec.Builder f465752a;

    public b(java.lang.String str, int i17) {
        super(str, i17);
        this.f465752a = null;
        this.f465752a = new android.security.keystore.KeyGenParameterSpec.Builder(str, i17);
    }

    @Override // yt5.c
    public java.security.spec.AlgorithmParameterSpec a() {
        return this.f465752a.build();
    }

    @Override // yt5.c
    public yt5.c c(java.lang.String... strArr) {
        this.f465752a.setDigests(strArr);
        return this;
    }

    @Override // yt5.c
    public yt5.c d(java.lang.String... strArr) {
        this.f465752a.setSignaturePaddings(strArr);
        return this;
    }

    @Override // yt5.c
    public yt5.c e(boolean z17) {
        this.f465752a.setUserAuthenticationRequired(z17);
        return this;
    }
}
