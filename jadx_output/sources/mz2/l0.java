package mz2;

/* loaded from: classes9.dex */
public class l0 extends mz2.a {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f333150e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f333151f;

    @Override // pz2.a
    public java.util.Map C() {
        return null;
    }

    @Override // mz2.a, pz2.a
    public java.util.Map F8() {
        return null;
    }

    @Override // pz2.a
    public boolean Ge(boolean z17, boolean z18, android.os.Bundle bundle) {
        return false;
    }

    @Override // pz2.a
    public boolean Ic() {
        return this.f333085d.Lf(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // pz2.a
    public boolean L2() {
        return true;
    }

    @Override // pz2.a
    public boolean Nh() {
        return true;
    }

    @Override // pz2.a
    public void O(com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent, int i17) {
        if (android.text.TextUtils.isEmpty(this.f333150e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintMgrImpl", "fail gen encrypted_pay_info!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintMgrImpl", "success gen encrypted_pay_info!");
        }
        if (android.text.TextUtils.isEmpty(this.f333151f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintMgrImpl", "fail gen encrypted_pay_sign!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintMgrImpl", "success gen encrypted_pay_sign!");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintMgrImpl", "callback FingerPrintAuthEvent onSuccess()");
        if (openFingerPrintAuthEvent != null) {
            am.on onVar = openFingerPrintAuthEvent.f54595g;
            if (onVar.f7565c != null) {
                am.pn pnVar = new am.pn();
                pnVar.f7640f = type();
                pnVar.f7635a = 0;
                pnVar.f7636b = this.f333150e;
                pnVar.f7637c = this.f333151f;
                pnVar.f7638d = i17;
                openFingerPrintAuthEvent.f54596h = pnVar;
                onVar.f7565c.run();
            }
        }
        this.f333150e = "";
        this.f333151f = "";
    }

    @Override // pz2.a
    public int Q7(pz2.c cVar, int i17, int i18) {
        return 0;
    }

    @Override // pz2.a
    public boolean Rb() {
        return false;
    }

    @Override // pz2.a
    public boolean a1() {
        return false;
    }

    @Override // pz2.a
    public void af() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintMgrImpl", "initFP");
        this.f333085d.prepare();
    }

    @Override // pz2.a
    public void dc(android.content.Context context) {
        if (context == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.android.settings.fingerprint.FingerprintSettings");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/huawei/securitymgr/HwFingerprintAuth", "startRigesterFinger", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/huawei/securitymgr/HwFingerprintAuth", "startRigesterFinger", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // pz2.a
    public int dg(pz2.c cVar, int i17, boolean z17) {
        this.f333085d.g9(com.tencent.mm.sdk.platformtools.x2.f193071a, new nz2.f(mz2.d2.IML.f333112e), new mz2.k0(this, cVar));
        return 0;
    }

    @Override // pz2.a
    public boolean isRoot() {
        return false;
    }

    @Override // pz2.a
    public int type() {
        return this.f333085d.of();
    }

    @Override // pz2.a
    public void userCancel() {
        this.f333085d.cancel();
    }

    @Override // pz2.a
    public boolean wc() {
        return mz2.n0.c();
    }

    @Override // pz2.a
    public boolean yh() {
        boolean ja6 = this.f333085d.ja();
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintMgrImpl", "isDeviceHasFingerPrint:%s", java.lang.Boolean.valueOf(ja6));
        return ja6;
    }
}
