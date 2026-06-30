package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public class x {

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f215683e = "LXOP";

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f215684a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.v f215685b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.ServiceConnection f215686c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.x.b f215687d;

    /* loaded from: classes15.dex */
    public interface b {
        void a(com.tencent.tmsqmsp.oaid2.x xVar);
    }

    public x(android.content.Context context, com.tencent.tmsqmsp.oaid2.x.b bVar) {
        this.f215684a = null;
        this.f215687d = null;
        if (context == null) {
            throw new java.lang.NullPointerException("Context can not be null.");
        }
        this.f215684a = context;
        this.f215687d = bVar;
        this.f215686c = new com.tencent.tmsqmsp.oaid2.x1(this);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.f215684a.bindService(intent, this.f215686c, (this.f215684a.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513)) {
            b("bindService Successful!");
            return;
        }
        com.tencent.tmsqmsp.oaid2.x.b bVar2 = this.f215687d;
        if (bVar2 != null) {
            bVar2.a(this);
        }
        b("bindService Failed!!!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(java.lang.String str) {
        com.tencent.tmsqmsp.oaid2.t0.c(f215683e + " " + str);
    }

    public java.lang.String c() {
        android.content.Context context = this.f215684a;
        if (context == null) {
            b("Context is null.");
            throw new java.lang.IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        java.lang.String packageName = context.getPackageName();
        b("liufeng, getAAID package：".concat(java.lang.String.valueOf(packageName)));
        if (packageName == null || packageName.equals("")) {
            b("input package is null!");
            return null;
        }
        try {
            com.tencent.tmsqmsp.oaid2.v vVar = this.f215685b;
            if (vVar != null) {
                return vVar.c(packageName);
            }
            return null;
        } catch (java.lang.Exception unused) {
            a("getAAID error, RemoteException!");
            return null;
        }
    }

    public void d() {
        try {
            this.f215684a.unbindService(this.f215686c);
            b("unBind Service successful");
        } catch (java.lang.IllegalArgumentException unused) {
            a("unBind Service exception");
        }
        this.f215685b = null;
    }

    private void a(java.lang.String str) {
        com.tencent.tmsqmsp.oaid2.t0.a(f215683e + " " + str);
    }

    public boolean b() {
        try {
            if (this.f215685b == null) {
                return false;
            }
            b("Device support opendeviceid");
            return this.f215685b.c();
        } catch (java.lang.Exception unused) {
            a("isSupport error, RemoteException!");
            return false;
        }
    }

    public java.lang.String a() {
        if (this.f215684a != null) {
            try {
                com.tencent.tmsqmsp.oaid2.v vVar = this.f215685b;
                if (vVar != null) {
                    return vVar.b();
                }
                return null;
            } catch (java.lang.Exception unused) {
                a("getOAID error, RemoteException!");
                return null;
            }
        }
        a("Context is null.");
        throw new java.lang.IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }
}
