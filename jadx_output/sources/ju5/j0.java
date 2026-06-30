package ju5;

/* loaded from: classes15.dex */
public class j0 extends com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.security.Signature f302101a;

    /* renamed from: b, reason: collision with root package name */
    public long f302102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju5.k0 f302103c;

    public j0(ju5.k0 k0Var, java.security.Signature signature, ju5.a0 a0Var) {
        this.f302103c = k0Var;
        this.f302101a = null;
        this.f302101a = signature;
    }

    public final void a() {
        ju5.k0 k0Var = this.f302103c;
        k0Var.getClass();
        if (k0Var.f302109f == 2) {
            k0Var.f302111h.a(false);
            k0Var.f302120q = true;
        }
    }

    @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback
    public void onAuthenticationCancelled() {
        zt5.h.c("Soter.TaskBiometricAuthentication", "soter: called onAuthenticationCancelled", new java.lang.Object[0]);
        ju5.k0 k0Var = this.f302103c;
        if (k0Var.f302120q) {
            zt5.h.e("Soter.TaskBiometricAuthentication", "soter: during ignore cancel period", new java.lang.Object[0]);
            return;
        }
        ju5.o.a().b(new ju5.i0(this));
        k0Var.b(new eu5.a(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST, "user cancelled authentication"));
        a();
    }

    @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback
    public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
        zt5.h.b("Soter.TaskBiometricAuthentication", "soter: on authentication fatal error: %d, %s", java.lang.Integer.valueOf(i17), charSequence);
        ju5.o.a().b(new ju5.d0(this, i17, charSequence));
        ju5.k0 k0Var = this.f302103c;
        if (i17 == 10308) {
            k0Var.b(new eu5.a(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, charSequence != null ? charSequence.toString() : "unknown error"));
        } else if (i17 == 10309) {
            k0Var.b(new eu5.a(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, charSequence != null ? charSequence.toString() : "unknown error"));
        } else if (i17 == 10310) {
            k0Var.b(new eu5.a(1029, charSequence != null ? charSequence.toString() : "unknown error"));
        } else {
            k0Var.b(new eu5.a(1017, charSequence != null ? charSequence.toString() : "unknown error"));
        }
        a();
        zt5.i.a(401, "on authentication fatal error: " + i17 + " " + ((java.lang.Object) charSequence));
    }

    @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback
    public void onAuthenticationFailed() {
        zt5.h.f("Soter.TaskBiometricAuthentication", "soter: authentication failed once", new java.lang.Object[0]);
        ju5.o.a().b(new ju5.h0(this));
        ju5.k0 k0Var = this.f302103c;
        k0Var.getClass();
        if (k0Var.f302109f == 2) {
            zt5.h.c("Soter.TaskBiometricAuthentication", "soter: should compat faceid logic.", new java.lang.Object[0]);
            k0Var.b(new eu5.a(1017, "faceid not match"));
        }
    }

    @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback
    public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
        zt5.h.f("Soter.TaskBiometricAuthentication", "soter: on authentication help. you do not need to cancel the authentication: %d, %s", java.lang.Integer.valueOf(i17), charSequence);
        ju5.o.a().b(new ju5.e0(this, i17, charSequence));
    }

    @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback
    public void onAuthenticationSucceeded(com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationResult authenticationResult) {
        zt5.h.c("Soter.TaskBiometricAuthentication", "soter: authentication succeed. start sign and upload upload signature", new java.lang.Object[0]);
        ju5.o.a().b(new ju5.f0(this));
        ju5.o.a().c(new ju5.g0(this));
        a();
    }
}
