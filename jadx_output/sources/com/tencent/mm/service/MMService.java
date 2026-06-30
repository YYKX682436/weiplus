package com.tencent.mm.service;

/* loaded from: classes12.dex */
public abstract class MMService {

    /* renamed from: f, reason: collision with root package name */
    public android.app.Service f193206f;

    /* renamed from: d, reason: collision with root package name */
    public int f193204d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f193205e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Vector f193207g = new java.util.Vector();

    /* renamed from: h, reason: collision with root package name */
    public byte f193208h = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final android.os.IBinder a(android.content.Intent intent, java.lang.String str) {
        char c17;
        com.tencent.mars.xlog.Log.i(b(), "%s callLifeCycle() callType = %s state = %s", "MicroMsg.MMService", str, java.lang.Integer.toBinaryString(this.f193208h));
        str.getClass();
        switch (str.hashCode()) {
            case -840745386:
                if (str.equals("unbind")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case 3023933:
                if (str.equals("bind")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case 3540994:
                if (str.equals("stop")) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        java.util.Vector vector = this.f193207g;
        switch (c17) {
            case 0:
                vector.remove(java.lang.Integer.valueOf(intent.getIntExtra("service_connection", -1)));
                byte b17 = this.f193208h;
                if (b17 != 1) {
                    if (b17 == 4) {
                        h(intent);
                        e();
                        this.f193205e.remove(getClass().getName());
                    } else if (b17 == 5) {
                        this.f193208h = (byte) 13;
                        h(intent);
                    } else if (b17 == 7) {
                        h(intent);
                        e();
                        this.f193205e.remove(getClass().getName());
                    }
                }
                return null;
            case 1:
                java.lang.Integer valueOf = java.lang.Integer.valueOf(intent.getIntExtra("service_connection", -1));
                if (vector.contains(valueOf)) {
                    return null;
                }
                vector.add(valueOf);
                if ((this.f193208h & 5) == 0) {
                    d();
                }
                this.f193208h = (byte) (this.f193208h | 4);
                return c(intent);
            case 2:
                byte b18 = this.f193208h;
                if (b18 == 1) {
                    e();
                    this.f193205e.remove(getClass().getName());
                } else if (b18 != 4) {
                    if (b18 == 5) {
                        this.f193208h = (byte) 7;
                    } else if (b18 == 13) {
                        e();
                        this.f193205e.remove(getClass().getName());
                    }
                }
                return null;
            case 3:
                if ((this.f193208h & 5) == 0) {
                    d();
                }
                int i17 = this.f193204d + 1;
                this.f193204d = i17;
                g(intent, 0, i17);
                this.f193208h = (byte) (this.f193208h | 1);
                return null;
            default:
                return null;
        }
    }

    public java.lang.String b() {
        return "MicroMsg.MMService";
    }

    public android.os.IBinder c(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(b(), "%s onBind()", "MicroMsg.MMService");
        return null;
    }

    public void d() {
        com.tencent.mars.xlog.Log.i(b(), "%s onCreate()", "MicroMsg.MMService");
    }

    public void e() {
        com.tencent.mars.xlog.Log.i(b(), "%s onDestroy()", "MicroMsg.MMService");
    }

    public void f(android.content.Intent intent, int i17) {
        com.tencent.mars.xlog.Log.i(b(), "%s onStart()", "MicroMsg.MMService");
    }

    public int g(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i(b(), "%s onStartCommand()", "MicroMsg.MMService");
        f(intent, i18);
        return 0;
    }

    public boolean h(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(b(), "%s onUnbind()", "MicroMsg.MMService");
        return false;
    }

    public final void stopSelf() {
        com.tencent.mars.xlog.Log.i(b(), "%s stopSelf()", "MicroMsg.MMService");
        a(new android.content.Intent(), "stop");
    }
}
