package ju5;

/* loaded from: classes15.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.j0 f302091d;

    public g0(ju5.j0 j0Var) {
        this.f302091d = j0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] a17;
        ju5.j0 j0Var = this.f302091d;
        ju5.k0 k0Var = j0Var.f302103c;
        java.security.Signature signature = j0Var.f302101a;
        if (zt5.l.b(k0Var.f302108e)) {
            zt5.h.b("Soter.TaskBiometricAuthentication", "soter: challenge is null. should not happen here", new java.lang.Object[0]);
            j0Var.onAuthenticationError(-1000, "challenge is null");
            return;
        }
        int g17 = wt5.a.g();
        ju5.k0 k0Var2 = j0Var.f302103c;
        if (g17 != 1) {
            try {
                signature.update(k0Var2.f302108e.getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)));
            } catch (java.lang.Exception e17) {
                zt5.h.b("Soter.TaskBiometricAuthentication", "soter: exception in update", new java.lang.Object[0]);
                zt5.h.d("Soter.TaskBiometricAuthentication", e17, "soter: exception in update");
                zt5.i.b(200, "TaskBiometric, update signature failed: onAuthenticationSucceeded().", e17);
                zt5.h.b("Soter.TaskBiometricAuthentication", "soter: remove the auth key: %s", k0Var2.f302107d);
                wt5.a.s(k0Var2.f302107d, false);
                k0Var2.b(new eu5.a(1027, "update signature failed. authkey removed after this failure, please check"));
            }
            try {
                ju5.k0.h(k0Var2, signature);
                return;
            } catch (java.lang.Exception e18) {
                zt5.h.b("Soter.TaskBiometricAuthentication", "soter: exception in executeWhenAuthenticated method", new java.lang.Object[0]);
                zt5.h.d("Soter.TaskBiometricAuthentication", e18, "soter: exception when execute");
                j0Var.onAuthenticationError(-1000, "execute failed");
                return;
            }
        }
        long j17 = j0Var.f302102b;
        k0Var2.getClass();
        try {
            au5.b bVar = wt5.a.f449537c;
            if (bVar == null) {
                zt5.h.b("Soter.SoterCore", "soter: finishSign IMPL is null, not support soter", new java.lang.Object[0]);
                a17 = new byte[0];
            } else {
                a17 = bVar.a(j17);
            }
            k0Var2.f302118o = wt5.a.a(a17);
            zt5.h.c("Soter.TaskBiometricAuthentication", "soter: no upload wrapper, return directly", new java.lang.Object[0]);
            k0Var2.b(new eu5.a(0, k0Var2.f302118o));
        } catch (java.lang.Exception e19) {
            zt5.h.b("Soter.TaskBiometricAuthentication", "soter: finish sign failed due to exception: %s", e19.getMessage());
            zt5.h.d("Soter.TaskBiometricAuthentication", e19, "soter: sign failed due to exception");
            zt5.i.b(200, "TaskBiometric, sign failed: executeWhenAuthenticatedWithSession().", e19);
            k0Var2.b(new eu5.a(1018, "sign failed even after user authenticated the key."));
        }
    }
}
