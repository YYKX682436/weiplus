package jh;

/* loaded from: classes13.dex */
public final class j implements jh.n {

    /* renamed from: a, reason: collision with root package name */
    public final jh.y f299713a = new jh.y();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f299714b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f299715c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Bundle f299716d;

    public j(java.lang.String str) {
        this.f299714b = str;
    }

    @Override // jh.n
    public boolean a(java.lang.String str, int i17) {
        android.os.Bundle bundle;
        if (!this.f299713a.f299767f[0] && !b(this.f299715c, this.f299716d)) {
            return false;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("saving-path", this.f299714b);
        bundle2.putString("path-of-elf", str);
        bundle2.putInt("elf-start-offset", i17);
        jh.y yVar = this.f299713a;
        yVar.getClass();
        android.os.Bundle bundle3 = null;
        try {
            android.os.Messenger messenger = yVar.f299763b;
            if (messenger != null) {
                android.os.Bundle bundle4 = new android.os.Bundle();
                bundle4.putBundle("invoke-args", bundle2);
                bundle4.putBinder("invoke-resp", yVar.f299762a.getBinder());
                messenger.send(android.os.Message.obtain(null, 100, bundle4));
                synchronized (yVar.f299764c) {
                    android.os.Bundle[] bundleArr = yVar.f299764c;
                    bundleArr[0] = null;
                    bundleArr.wait(300000L);
                    bundle = yVar.f299764c[0];
                }
                bundle3 = bundle;
            }
        } catch (android.os.RemoteException | java.lang.InterruptedException e17) {
            oj.j.d("Matrix.WarmUpInvoker", e17, "", new java.lang.Object[0]);
        }
        int i18 = bundle3 != null ? bundle3.getInt("warm-up-result") : -100;
        boolean z17 = i18 == 0;
        if (z17) {
            com.tencent.matrix.backtrace.WeChatBacktraceNative.notifyWarmedUp(str, i17);
        }
        oj.j.c("Matrix.WarmUpDelegate", "Warm-up %s:%s - retCode %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return z17;
    }

    public boolean b(android.content.Context context, android.os.Bundle bundle) {
        this.f299715c = context;
        this.f299716d = bundle;
        jh.y yVar = this.f299713a;
        yVar.getClass();
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.lang.RuntimeException("Should not call this from main thread!");
        }
        if (yVar.f299767f[0]) {
            return true;
        }
        oj.j.c("Matrix.WarmUpInvoker", "Start connecting to remote. (%s)", java.lang.Integer.valueOf(yVar.hashCode()));
        synchronized (yVar.f299765d) {
            android.os.HandlerThread handlerThread = yVar.f299765d[0];
            if (handlerThread != null) {
                handlerThread.quitSafely();
                yVar.f299765d[0] = null;
            }
            yVar.f299765d[0] = new android.os.HandlerThread("warm-up-remote-invoker-" + yVar.hashCode());
            yVar.f299765d[0].start();
            yVar.f299762a = new android.os.Messenger(new jh.x(yVar, yVar.f299765d[0].getLooper()));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(context, (java.lang.Class<?>) com.tencent.matrix.backtrace.WarmUpService.class));
        intent.putExtra("enable-logger", bundle.getBoolean("enable-logger", false));
        intent.putExtra("path-of-xlog-so", bundle.getString("path-of-xlog-so", null));
        context.bindService(intent, yVar.f299766e, 1);
        try {
            synchronized (yVar.f299767f) {
                boolean[] zArr = yVar.f299767f;
                if (!zArr[0]) {
                    zArr.wait(60000L);
                }
            }
        } catch (java.lang.InterruptedException e17) {
            oj.j.d("Matrix.WarmUpInvoker", e17, "", new java.lang.Object[0]);
        }
        if (!yVar.f299767f[0]) {
            yVar.a(context);
        }
        return yVar.f299767f[0];
    }
}
