package ju5;

/* loaded from: classes15.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.y f302155d;

    public u(ju5.y yVar) {
        this.f302155d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] a17;
        ju5.y yVar = this.f302155d;
        ju5.z zVar = yVar.f302167c;
        java.security.Signature signature = yVar.f302165a;
        if (zt5.l.b(zVar.f302170e)) {
            zt5.h.b("Soter.TaskAuthentication", "soter: challenge is null. should not happen here", new java.lang.Object[0]);
            yVar.b(-1000, "challenge is null");
            return;
        }
        int g17 = wt5.a.g();
        ju5.z zVar2 = yVar.f302167c;
        if (g17 != 1) {
            try {
                signature.update(zVar2.f302170e.getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)));
            } catch (java.security.SignatureException e17) {
                zt5.h.b("Soter.TaskAuthentication", "soter: exception in update", new java.lang.Object[0]);
                zt5.h.d("Soter.TaskAuthentication", e17, "soter: exception in update");
                zt5.i.b(200, "TaskAuthentication, update signature fail: onAuthenticationSucceeded().", e17);
                zt5.h.b("Soter.TaskAuthentication", "soter: remove the auth key: %s", zVar2.f302169d);
                wt5.a.s(zVar2.f302169d, false);
                zVar2.b(new eu5.a(1027, "update signature failed. authkey removed after this failure, please check"));
            }
            try {
                ju5.z.h(zVar2, signature);
                return;
            } catch (java.lang.Exception e18) {
                zt5.h.b("Soter.TaskAuthentication", "soter: exception in executeWhenAuthenticated method", new java.lang.Object[0]);
                zt5.h.d("Soter.TaskAuthentication", e18, "soter: exception when execute");
                yVar.b(-1000, "execute failed");
                return;
            }
        }
        long j17 = yVar.f302166b;
        zVar2.getClass();
        try {
            au5.b bVar = wt5.a.f449537c;
            if (bVar == null) {
                zt5.h.b("Soter.SoterCore", "soter: finishSign IMPL is null, not support soter", new java.lang.Object[0]);
                a17 = new byte[0];
            } else {
                a17 = bVar.a(j17);
            }
            zVar2.f302174i = wt5.a.a(a17);
            zt5.h.c("Soter.TaskAuthentication", "soter: no upload wrapper, return directly", new java.lang.Object[0]);
            zVar2.b(new eu5.a(0, zVar2.f302174i));
        } catch (java.lang.Exception e19) {
            zt5.h.b("Soter.TaskAuthentication", "soter: finish sign failed due to exception: %s", e19.getMessage());
            zt5.h.d("Soter.TaskAuthentication", e19, "soter: sign failed due to exception");
            zt5.i.b(200, "TaskAuthentication, sign fail: executeWhenAuthenticatedWithSession().", e19);
            zVar2.b(new eu5.a(1018, "sign failed even after user authenticated the key."));
        }
    }
}
