package xt5;

/* loaded from: classes15.dex */
public class i extends android.hardware.fingerprint.FingerprintManager.AuthenticationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xt5.j f457168a;

    public i(xt5.j jVar) {
        this.f457168a = jVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
        zt5.h.a("Soter.FingerprintManagerCompatApi23", "hy: lowest level return onAuthenticationError", new java.lang.Object[0]);
        this.f457168a.a(i17, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationFailed() {
        zt5.h.a("Soter.FingerprintManagerCompatApi23", "hy: lowest level return onAuthenticationFailed", new java.lang.Object[0]);
        xt5.a aVar = (xt5.a) this.f457168a;
        aVar.getClass();
        zt5.h.a("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationFailed", new java.lang.Object[0]);
        if (aVar.f457161a) {
            return;
        }
        zt5.h.e("Soter.FingerprintManagerCompat", "soter: using system anti brute force strategy", new java.lang.Object[0]);
        aVar.f457162b.c();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
        zt5.h.a("Soter.FingerprintManagerCompatApi23", "hy: lowest level return onAuthenticationHelp", new java.lang.Object[0]);
        xt5.a aVar = (xt5.a) this.f457168a;
        aVar.getClass();
        zt5.h.a("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationHelp", new java.lang.Object[0]);
        if (aVar.f457161a) {
            return;
        }
        zt5.h.e("Soter.FingerprintManagerCompat", "soter: using system anti brute force strategy", new java.lang.Object[0]);
        aVar.f457162b.d(i17, charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Soter.FingerprintManagerCompatApi23"
            java.lang.String r3 = "hy: lowest level return onAuthenticationSucceeded"
            zt5.h.a(r2, r3, r1)
            android.hardware.fingerprint.FingerprintManager$CryptoObject r7 = r7.getCryptoObject()
            r1 = 0
            if (r7 != 0) goto L12
            goto L42
        L12:
            javax.crypto.Cipher r2 = r7.getCipher()
            if (r2 == 0) goto L22
            xt5.k r2 = new xt5.k
            javax.crypto.Cipher r7 = r7.getCipher()
            r2.<init>(r7)
            goto L43
        L22:
            java.security.Signature r2 = r7.getSignature()
            if (r2 == 0) goto L32
            xt5.k r2 = new xt5.k
            java.security.Signature r7 = r7.getSignature()
            r2.<init>(r7)
            goto L43
        L32:
            javax.crypto.Mac r2 = r7.getMac()
            if (r2 == 0) goto L42
            xt5.k r2 = new xt5.k
            javax.crypto.Mac r7 = r7.getMac()
            r2.<init>(r7)
            goto L43
        L42:
            r2 = r1
        L43:
            xt5.j r7 = r6.f457168a
            xt5.a r7 = (xt5.a) r7
            r7.getClass()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r4 = "soter: basic onAuthenticationSucceeded"
            java.lang.String r5 = "Soter.FingerprintManagerCompat"
            zt5.h.a(r5, r4, r3)
            boolean r3 = r7.f457161a
            if (r3 == 0) goto L58
            goto L8c
        L58:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "soter: using system anti brute force strategy"
            zt5.h.e(r5, r3, r0)
            r0 = 1
            r7.f457161a = r0
            xt5.d r0 = new xt5.d
            if (r2 != 0) goto L67
            goto L84
        L67:
            javax.crypto.Cipher r3 = r2.f457170b
            if (r3 == 0) goto L71
            xt5.e r1 = new xt5.e
            r1.<init>(r3)
            goto L84
        L71:
            java.security.Signature r3 = r2.f457169a
            if (r3 == 0) goto L7b
            xt5.e r1 = new xt5.e
            r1.<init>(r3)
            goto L84
        L7b:
            javax.crypto.Mac r2 = r2.f457171c
            if (r2 == 0) goto L84
            xt5.e r1 = new xt5.e
            r1.<init>(r2)
        L84:
            r0.<init>(r1)
            xt5.c r7 = r7.f457162b
            r7.e(r0)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xt5.i.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
