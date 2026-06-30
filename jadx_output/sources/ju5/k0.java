package ju5;

/* loaded from: classes15.dex */
public class k0 extends ju5.f implements ju5.a {

    /* renamed from: c, reason: collision with root package name */
    public final int f302106c;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f302108e;

    /* renamed from: f, reason: collision with root package name */
    public final int f302109f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f302110g;

    /* renamed from: h, reason: collision with root package name */
    public du5.c f302111h;

    /* renamed from: i, reason: collision with root package name */
    public final du5.d f302112i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f302113j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f302114k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f302115l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f302116m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f302117n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f302107d = null;

    /* renamed from: o, reason: collision with root package name */
    public zt5.s f302118o = null;

    /* renamed from: p, reason: collision with root package name */
    public ju5.j0 f302119p = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f302120q = false;

    public k0(ju5.c cVar) {
        this.f302106c = -1;
        this.f302108e = null;
        this.f302110g = null;
        this.f302111h = null;
        this.f302112i = null;
        if (cVar == null) {
            throw new java.lang.IllegalArgumentException("param is null!");
        }
        this.f302106c = cVar.f302066a;
        this.f302110g = new java.lang.ref.WeakReference(cVar.f302068c);
        this.f302112i = cVar.f302078m;
        this.f302111h = cVar.f302077l;
        this.f302109f = cVar.f302069d;
        this.f302108e = cVar.f302067b;
        this.f302113j = cVar.f302070e;
        this.f302114k = cVar.f302071f;
        this.f302115l = cVar.f302072g;
        this.f302116m = cVar.f302073h;
        this.f302117n = cVar.f302074i;
    }

    public static void h(ju5.k0 k0Var, java.security.Signature signature) {
        k0Var.getClass();
        try {
            k0Var.f302118o = wt5.a.a(signature.sign());
            zt5.h.c("Soter.TaskBiometricAuthentication", "soter: no upload wrapper, return directly", new java.lang.Object[0]);
            k0Var.b(new eu5.a(0, k0Var.f302118o));
        } catch (java.security.SignatureException e17) {
            zt5.h.b("Soter.TaskBiometricAuthentication", "soter: sign failed due to exception: %s", e17.getMessage());
            zt5.h.d("Soter.TaskBiometricAuthentication", e17, "soter: sign failed due to exception");
            zt5.i.b(200, "TaskBiometric, sign failed: executeWhenAuthenticated().", e17);
            k0Var.b(new eu5.a(1018, "sign failed even after user authenticated the key."));
        }
    }

    @Override // ju5.a
    public void a() {
        zt5.h.c("Soter.TaskBiometricAuthentication", "soter: called from cancellation signal", new java.lang.Object[0]);
        ju5.j0 j0Var = this.f302119p;
        if (j0Var != null) {
            j0Var.onAuthenticationCancelled();
        }
    }

    @Override // ju5.f
    public void c() {
        com.tencent.soter.soterserver.SoterSessionResult i17;
        if (zt5.l.b(this.f302108e)) {
            zt5.h.c("Soter.TaskBiometricAuthentication", "soter: not provide the challenge. we will do the job", new java.lang.Object[0]);
            throw null;
        }
        zt5.h.c("Soter.TaskBiometricAuthentication", "soter: already provided the challenge. directly authenticate", new java.lang.Object[0]);
        if (wt5.a.g() != 1) {
            java.security.Signature d17 = wt5.a.d(this.f302107d);
            if (d17 == null) {
                zt5.h.f("Soter.TaskBiometricAuthentication", "soter: error occurred when init sign", new java.lang.Object[0]);
                b(new eu5.a(1007));
                return;
            } else {
                this.f302119p = new ju5.j0(this, d17, null);
                i(d17);
                ju5.o.a().b(new ju5.c0(this));
                return;
            }
        }
        java.lang.String str = this.f302107d;
        java.lang.String str2 = this.f302108e;
        au5.b bVar = wt5.a.f449537c;
        if (bVar == null) {
            zt5.h.b("Soter.SoterCore", "soter: initSigh IMPL is null, not support soter", new java.lang.Object[0]);
            i17 = null;
        } else {
            i17 = bVar.i(str, str2);
        }
        if (i17 == null) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: error occurred when init sign soterSessionResult is null", new java.lang.Object[0]);
            b(new eu5.a(1007));
            return;
        }
        if (i17.f215330e != 0) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: error occurred when init sign resultCode error", new java.lang.Object[0]);
            b(new eu5.a(1007));
            return;
        }
        long j17 = i17.f215329d;
        zt5.h.a("Soter.TaskBiometricAuthentication", "soter: session is %d", java.lang.Long.valueOf(j17));
        ju5.j0 j0Var = new ju5.j0(this, null, null);
        this.f302119p = j0Var;
        j0Var.f302102b = j17;
        i(null);
        ju5.o.a().b(new ju5.b0(this));
    }

    @Override // ju5.f
    public boolean d() {
        return true;
    }

    @Override // ju5.f
    public void e(eu5.e eVar) {
        int i17 = eVar.f475605a;
        if ((i17 == 1018 || i17 == 1007 || i17 == 1015) && fu5.c.a(ju5.k0.class, eVar)) {
            zt5.h.c("Soter.TaskBiometricAuthentication", "soter: same error happen too much, delete ask", new java.lang.Object[0]);
            cu5.b.a();
        }
    }

    @Override // ju5.f
    public void f() {
        du5.c cVar = this.f302111h;
        if (cVar != null) {
            cVar.a(true);
        }
    }

    @Override // ju5.f
    public boolean g() {
        if (!fu5.d.b().d()) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: not initialized yet", new java.lang.Object[0]);
            b(new eu5.a(1008));
            return true;
        }
        if (!fu5.d.b().e()) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: not support soter", new java.lang.Object[0]);
            b(new eu5.a(2));
            return true;
        }
        android.util.SparseArray a17 = fu5.d.b().a();
        int i17 = this.f302106c;
        java.lang.String str = (java.lang.String) a17.get(i17, "");
        this.f302107d = str;
        if (zt5.l.b(str)) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new java.lang.Object[0]);
            b(new eu5.a(1009, java.lang.String.format("auth scene %d not initialized in map", java.lang.Integer.valueOf(i17))));
            return true;
        }
        if (!wt5.a.i(this.f302107d)) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: auth key %s not exists. need re-generate", this.f302107d);
            b(new eu5.a(1006, java.lang.String.format("the auth key to scene %d not exists. it may because you haven't prepare it, or user removed them already in system settings. please prepare the key again", java.lang.Integer.valueOf(i17))));
            return true;
        }
        if (zt5.l.b(this.f302108e)) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: challenge wrapper is null!", new java.lang.Object[0]);
            b(new eu5.a(1010, "neither get challenge wrapper nor challenge str is found in request parameter"));
            return true;
        }
        android.content.Context context = (android.content.Context) this.f302110g.get();
        if (context == null) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: context instance released in preExecute", new java.lang.Object[0]);
            b(new eu5.a(1011));
            return true;
        }
        int i18 = this.f302109f;
        if (!com.tencent.soter.core.biometric.BiometricManagerCompat.from(context, java.lang.Integer.valueOf(i18)).hasEnrolledBiometric()) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: user has not enrolled any biometric in system.", new java.lang.Object[0]);
            b(new eu5.a(1013));
            return true;
        }
        if (wt5.a.k(context, i18)) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: biometric sensor frozen", new java.lang.Object[0]);
            b(new eu5.a(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_NEED_REENTER, "Too many failed times"));
            return true;
        }
        if (this.f302111h != null) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "hy: we strongly recommend you to check the final authentication data in server! Please make sure you upload and check later", new java.lang.Object[0]);
            return false;
        }
        zt5.h.f("Soter.TaskBiometricAuthentication", "soter: did not pass cancellation obj. We suggest you pass one", new java.lang.Object[0]);
        this.f302111h = new du5.c();
        return false;
    }

    public final void i(java.security.Signature signature) {
        android.os.CancellationSignal cancellationSignal;
        if (this.f302089b) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: already finished. can not authenticate", new java.lang.Object[0]);
            return;
        }
        android.content.Context context = (android.content.Context) this.f302110g.get();
        if (context == null) {
            zt5.h.f("Soter.TaskBiometricAuthentication", "soter: context instance released in startAuthenticate", new java.lang.Object[0]);
            b(new eu5.a(1011));
            return;
        }
        try {
            zt5.h.e("Soter.TaskBiometricAuthentication", "soter: performing start", new java.lang.Object[0]);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("prompt_title", this.f302113j);
            bundle.putString("prompt_subtitle", this.f302114k);
            bundle.putString("prompt_description", this.f302115l);
            bundle.putString("prompt_button", this.f302116m);
            bundle.putBoolean("use_biometric_prompt", this.f302117n);
            com.tencent.soter.core.biometric.BiometricManagerCompat from = com.tencent.soter.core.biometric.BiometricManagerCompat.from(context, java.lang.Integer.valueOf(this.f302109f));
            com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject cryptoObject = new com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject(signature);
            du5.c cVar = this.f302111h;
            if (cVar != null) {
                android.os.CancellationSignal cancellationSignal2 = cVar.f243790a;
                if (cancellationSignal2 != null) {
                    zt5.h.c("Soter.SoterBiometricCanceller", "qc: %s getSignalObj isCanceled:%s", cVar, java.lang.Boolean.valueOf(cancellationSignal2.isCanceled()));
                } else {
                    zt5.h.c("Soter.SoterBiometricCanceller", "qc: %s getSignalObj:null", cVar);
                }
                cancellationSignal = cVar.f243790a;
            } else {
                cancellationSignal = null;
            }
            from.authenticate(cryptoObject, 0, cancellationSignal, this.f302119p, null, bundle);
        } catch (java.lang.Exception e17) {
            java.lang.String message = e17.getMessage();
            zt5.h.b("Soter.TaskBiometricAuthentication", "soter: caused exception when authenticating: %s", message);
            zt5.h.d("Soter.TaskBiometricAuthentication", e17, "soter: caused exception when authenticating");
            zt5.i.b(200, "TaskBiometric, start authentication failed: performStartBiometricLogic().", e17);
            b(new eu5.a(1015, java.lang.String.format("start authentication failed due to %s", message)));
        }
    }

    @Override // ju5.a
    public boolean isCancelled() {
        return this.f302120q;
    }
}
