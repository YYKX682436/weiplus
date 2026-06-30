package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f215643b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.n f215644c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.o f215645d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f215642a = false;

    /* renamed from: e, reason: collision with root package name */
    public android.content.ServiceConnection f215646e = new com.tencent.tmsqmsp.oaid2.r1(this);

    public q(android.content.Context context) {
        this.f215643b = context;
    }

    public void a() {
        try {
            if (!this.f215642a || this.f215646e == null || this.f215643b == null) {
                return;
            }
            com.tencent.tmsqmsp.oaid2.t0.c("HSDID start to unbind did service");
            this.f215642a = false;
            this.f215643b.unbindService(this.f215646e);
        } catch (java.lang.Exception e17) {
            com.tencent.tmsqmsp.oaid2.t0.a("HSDID error:" + e17.getMessage());
        }
    }

    public void a(com.tencent.tmsqmsp.oaid2.o oVar) {
        try {
            this.f215645d = oVar;
            android.content.Intent intent = new android.content.Intent("com.asus.msa.action.ACCESS_DID");
            android.content.ComponentName componentName = new android.content.ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService");
            android.content.Intent intent2 = new android.content.Intent(intent);
            intent2.setComponent(componentName);
            com.tencent.tmsqmsp.oaid2.t0.c("HSDID start to bind did service");
            boolean bindService = this.f215643b.bindService(intent2, this.f215646e, (this.f215643b.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513);
            this.f215642a = bindService;
            if (bindService) {
                return;
            }
            this.f215645d.b();
        } catch (java.lang.Exception unused) {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z17) {
        if (z17) {
            try {
                this.f215645d.a(this.f215644c);
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.tmsqmsp.oaid2.t0.a("HSDID notify did bind status error :" + e17.getMessage());
                return;
            }
        }
        this.f215645d.b();
    }
}
