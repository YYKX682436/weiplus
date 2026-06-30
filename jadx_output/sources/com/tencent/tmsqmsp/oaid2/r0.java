package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class r0 {

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f215650e = "SDI";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f215651f = "SI";

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.r0.b f215652a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.ServiceConnection f215653b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f215654c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.q0 f215655d;

    /* loaded from: classes8.dex */
    public interface b {
        void a(com.tencent.tmsqmsp.oaid2.r0 r0Var);
    }

    public r0(android.content.Context context, com.tencent.tmsqmsp.oaid2.r0.b bVar) {
        this.f215652a = null;
        this.f215654c = null;
        if (context == null) {
            throw new java.lang.NullPointerException("Context can not be null.");
        }
        this.f215654c = context;
        this.f215652a = bVar;
        this.f215653b = new com.tencent.tmsqmsp.oaid2.t1(this);
    }

    public java.lang.String a() {
        android.content.Context context = this.f215654c;
        if (context == null) {
            com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " Context is null.");
            throw new java.lang.IllegalArgumentException("Context is null, must be new SxCore first");
        }
        java.lang.String packageName = context.getPackageName();
        com.tencent.tmsqmsp.oaid2.t0.c(f215651f + "apackage：" + packageName);
        if (packageName == null || packageName.equals("")) {
            com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " input package is null!");
            return null;
        }
        try {
            com.tencent.tmsqmsp.oaid2.q0 q0Var = this.f215655d;
            if (q0Var == null) {
                return null;
            }
            java.lang.String a17 = q0Var.a(packageName);
            com.tencent.tmsqmsp.oaid2.t0.c(f215651f + " getAAID Package: " + packageName);
            return a17;
        } catch (java.lang.Exception unused) {
            com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " geta error, RemoteException!");
            return null;
        }
    }

    public java.lang.String b() {
        if (this.f215654c == null) {
            com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " Context is null.");
            throw new java.lang.IllegalArgumentException("Context is null, must be new SxCore first");
        }
        try {
            com.tencent.tmsqmsp.oaid2.q0 q0Var = this.f215655d;
            if (q0Var == null) {
                return null;
            }
            java.lang.String a17 = q0Var.a();
            com.tencent.tmsqmsp.oaid2.t0.b(f215650e + " geto call");
            return a17;
        } catch (java.lang.Exception unused) {
            com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " geto error, RemoteException!");
            return null;
        }
    }

    public void c() {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (this.f215654c.bindService(intent, this.f215653b, (this.f215654c.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513)) {
            com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " bindService Successful!");
            return;
        }
        this.f215652a.a(this);
        com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " bindService Failed!");
    }

    public boolean d() {
        try {
            if (this.f215655d == null) {
                com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " Device not support opendeviceid");
                return false;
            }
            com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " Device support opendeviceid");
            return true;
        } catch (java.lang.Exception unused) {
            com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " isSupport error, RemoteException!");
            return false;
        }
    }

    public void e() {
        try {
            this.f215654c.unbindService(this.f215653b);
            com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " unBind Service successful");
        } catch (java.lang.IllegalArgumentException unused) {
            com.tencent.tmsqmsp.oaid2.t0.b(f215651f + " unBind Service exception");
        }
        this.f215655d = null;
    }
}
