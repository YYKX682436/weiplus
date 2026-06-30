package com.tencent.mm.util;

/* loaded from: classes13.dex */
public abstract class HotpotService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public static final android.os.HandlerThread[] f212640d = {null};

    /* renamed from: e, reason: collision with root package name */
    public static bm5.o0 f212641e;

    public HotpotService() {
        android.os.HandlerThread[] handlerThreadArr = f212640d;
        synchronized (handlerThreadArr) {
            if (handlerThreadArr[0] == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("HPS_CheckExec");
                handlerThreadArr[0] = handlerThread;
                handlerThread.start();
                f212641e = new bm5.o0(handlerThreadArr[0].getLooper());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        r9.writeInt(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r9.writeParcelable(r20, 0);
        r13 = r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        r13.transact(1, r9, r10, 0);
        r0 = r10.readInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r0 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.HotpotService", "Request with op %s in %s execute successfully.", java.lang.Integer.valueOf(r19), r18.getName());
        r0 = (android.os.Bundle) r10.readParcelable(r17.getClassLoader());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        r10.recycle();
        r9.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        r17.unbindService(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        if (r0 == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.HotpotService", "Remote side of %s return unknown ret type.", r18.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        r10.recycle();
        r9.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        r17.unbindService(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.HotpotService", "Request with op %s in %s trigger exception on remote side.", java.lang.Integer.valueOf(r19), r18.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00df, code lost:
    
        throw ((bm5.q0) r10.readSerializable());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0111, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0112, code lost:
    
        r3[0] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011f, code lost:
    
        throw new bm5.p0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00eb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:56:0x010b, B:58:0x0111, B:66:0x0119, B:68:0x011a, B:69:0x011f, B:60:0x0112, B:61:0x0114), top: B:55:0x010b, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle a(android.content.Context r17, java.lang.Class r18, int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.util.HotpotService.a(android.content.Context, java.lang.Class, int, android.os.Bundle):android.os.Bundle");
    }

    public abstract void b(int i17, android.os.Bundle bundle, android.os.Bundle bundle2);

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        android.os.Parcel parcel;
        f212641e.f22716a.removeMessages(1);
        intent.setExtrasClassLoader(getClassLoader());
        android.os.IBinder binder = intent.getExtras().getBinder("h0tpotSrv_bind_notifier");
        if (binder == null) {
            return null;
        }
        try {
            parcel = android.os.Parcel.obtain();
            try {
                parcel.writeStrongBinder(new bm5.m0(this));
                binder.transact(1, parcel, null, 0);
            } catch (java.lang.Throwable unused) {
            }
        } catch (java.lang.Throwable unused2) {
            parcel = null;
        }
        parcel.recycle();
        f212641e.a();
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return super.onStartCommand(intent, i17, i18);
    }
}
