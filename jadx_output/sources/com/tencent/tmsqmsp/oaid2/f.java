package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f215582a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.tmsqmsp.oaid2.f.b f215583b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.ServiceConnection f215584c;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.tmsqmsp.oaid2.g f215585d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f215586e = false;

    /* loaded from: classes15.dex */
    public interface b {
        void b();
    }

    public f(android.content.Context context, com.tencent.tmsqmsp.oaid2.f.b bVar) {
        if (context == null) {
            throw new java.lang.NullPointerException("context can not be null");
        }
        this.f215582a = context;
        this.f215583b = bVar;
        this.f215584c = new com.tencent.tmsqmsp.oaid2.k1(this, bVar);
    }

    public java.lang.String b() {
        android.content.Context context = this.f215582a;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context is null, must be new SxCore first");
        }
        java.lang.String packageName = context.getPackageName();
        if (android.text.TextUtils.isEmpty(packageName)) {
            return null;
        }
        try {
            com.tencent.tmsqmsp.oaid2.g gVar = this.f215585d;
            if (gVar != null) {
                return gVar.b(packageName);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public void c() {
        com.tencent.tmsqmsp.oaid2.f.b bVar;
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService"));
        this.f215586e = this.f215582a.bindService(intent, this.f215584c, (this.f215582a.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513);
        if (this.f215586e || (bVar = this.f215583b) == null) {
            return;
        }
        bVar.b();
    }

    public boolean d() {
        return this.f215585d != null;
    }

    public void e() {
        if (this.f215582a == null || !this.f215586e) {
            return;
        }
        try {
            this.f215582a.unbindService(this.f215584c);
        } catch (java.lang.Exception unused) {
        } finally {
            this.f215586e = false;
            this.f215585d = null;
        }
    }

    public java.lang.String a() {
        android.content.Context context = this.f215582a;
        if (context != null) {
            java.lang.String packageName = context.getPackageName();
            if (android.text.TextUtils.isEmpty(packageName)) {
                return null;
            }
            try {
                com.tencent.tmsqmsp.oaid2.g gVar = this.f215585d;
                if (gVar != null) {
                    return gVar.a(packageName);
                }
                return null;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        throw new java.lang.IllegalArgumentException("Context is null, must be new SxCore first");
    }
}
