package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class w2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f213223a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f213224b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.CancellationSignal f213225c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.b3 f213226d;

    public w2(com.tencent.mm.vfs.b3 b3Var, com.tencent.mm.vfs.r2 r2Var) {
        this.f213226d = b3Var;
    }

    public final void a() {
        com.tencent.stubs.logger.Log.i("VFS.FileSystemManager", "Idle status changed: charging = " + this.f213223a + ", interactive = " + this.f213224b);
        boolean z17 = this.f213223a;
        if (!z17 || this.f213224b || this.f213225c != null) {
            if ((!z17 || this.f213224b) && this.f213225c != null) {
                this.f213226d.f212826t.removeMessages(2);
                this.f213225c.cancel();
                this.f213225c = null;
                com.tencent.stubs.logger.Log.i("VFS.FileSystemManager", "Exit idle state, maintenance cancelled.");
                return;
            }
            return;
        }
        long j17 = this.f213226d.f212828v;
        if (j17 < 0) {
            return;
        }
        android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
        this.f213225c = cancellationSignal;
        android.os.Handler handler = this.f213226d.f212826t;
        handler.sendMessageDelayed(android.os.Message.obtain(handler, 2, cancellationSignal), j17);
        com.tencent.stubs.logger.Log.i("VFS.FileSystemManager", "System idle, trigger maintenance timer for " + (j17 / 1000) + " seconds.");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        char c17 = 65535;
        switch (action.hashCode()) {
            case -2128145023:
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1454123155:
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                this.f213224b = false;
                break;
            case 1:
                this.f213223a = false;
                break;
            case 2:
                this.f213224b = true;
                break;
            case 3:
                this.f213223a = true;
                break;
        }
        a();
    }
}
