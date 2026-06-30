package xt5;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.security.Signature f457164a;

    /* renamed from: b, reason: collision with root package name */
    public final javax.crypto.Cipher f457165b;

    /* renamed from: c, reason: collision with root package name */
    public final javax.crypto.Mac f457166c;

    public e(java.security.Signature signature) {
        this.f457164a = signature;
        this.f457165b = null;
        this.f457166c = null;
    }

    public e(javax.crypto.Cipher cipher) {
        this.f457165b = cipher;
        this.f457164a = null;
        this.f457166c = null;
    }

    public e(javax.crypto.Mac mac) {
        this.f457166c = mac;
        this.f457165b = null;
        this.f457164a = null;
    }
}
