package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public class z {

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f215690e = "com.mdid.msa";

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.a0 f215691a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.ServiceConnection f215692b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f215693c;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.y f215694d;

    public z(android.content.Context context, com.tencent.tmsqmsp.oaid2.a0 a0Var) {
        if (context == null) {
            throw new java.lang.NullPointerException("Context can not be null.");
        }
        this.f215693c = context;
        this.f215691a = a0Var;
        this.f215692b = new com.tencent.tmsqmsp.oaid2.z1(this, a0Var);
    }

    public java.lang.String b() {
        try {
            com.tencent.tmsqmsp.oaid2.y yVar = this.f215694d;
            return yVar == null ? "" : yVar.a();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public boolean c() {
        try {
            com.tencent.tmsqmsp.oaid2.y yVar = this.f215694d;
            if (yVar == null) {
                return false;
            }
            return yVar.g();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public void d() {
        com.tencent.tmsqmsp.oaid2.y yVar = this.f215694d;
        if (yVar != null) {
            try {
                yVar.f();
                android.content.ServiceConnection serviceConnection = this.f215692b;
                if (serviceConnection != null) {
                    this.f215693c.unbindService(serviceConnection);
                }
            } catch (java.lang.Exception unused) {
            }
            this.f215692b = null;
            this.f215694d = null;
        }
    }

    public void a(java.lang.String str) {
        com.tencent.tmsqmsp.oaid2.a0 a0Var;
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        if (this.f215693c.bindService(intent, this.f215692b, (this.f215693c.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513) || (a0Var = this.f215691a) == null) {
            return;
        }
        a0Var.b();
    }

    public static boolean a(android.content.Context context) {
        try {
            context.getPackageManager().getPackageInfo(f215690e, 0);
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(f215690e, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            context.startService(intent);
        } catch (java.lang.Exception unused) {
        }
    }

    public java.lang.String a() {
        try {
            com.tencent.tmsqmsp.oaid2.y yVar = this.f215694d;
            return yVar == null ? "" : yVar.d();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
