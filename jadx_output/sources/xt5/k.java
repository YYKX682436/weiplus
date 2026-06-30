package xt5;

/* loaded from: classes15.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.security.Signature f457169a;

    /* renamed from: b, reason: collision with root package name */
    public final javax.crypto.Cipher f457170b;

    /* renamed from: c, reason: collision with root package name */
    public final javax.crypto.Mac f457171c;

    public k(java.security.Signature signature) {
        this.f457169a = signature;
        this.f457170b = null;
        this.f457171c = null;
    }

    public k(javax.crypto.Cipher cipher) {
        this.f457170b = cipher;
        this.f457169a = null;
        this.f457171c = null;
    }

    public k(javax.crypto.Mac mac) {
        this.f457171c = mac;
        this.f457170b = null;
        this.f457169a = null;
    }
}
