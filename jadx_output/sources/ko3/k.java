package ko3;

/* loaded from: classes13.dex */
public final class k implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f309977d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler.Callback f309978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ko3.u f309979f;

    public k(ko3.u uVar, java.lang.Object obj, android.os.Handler.Callback callback) {
        this.f309979f = uVar;
        this.f309977d = new java.lang.ref.WeakReference(obj);
        this.f309978e = callback;
    }

    public final boolean a(android.os.Message message) {
        android.os.Handler.Callback callback = this.f309978e;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }

    public final int b(android.os.Message message) {
        int i17 = message.what;
        switch (i17) {
            case 1:
            case 2:
            case 4:
            case 6:
                break;
            case 3:
            case 5:
                return ((java.lang.Integer) ko3.k0.e(message.obj, "argi1")).intValue();
            default:
                switch (i17) {
                    case com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST /* 1020 */:
                        break;
                    case com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_NEED_REENTER /* 1021 */:
                    case com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED /* 1022 */:
                        return message.arg2;
                    case 1023:
                        return ((java.lang.Integer) ko3.k0.e(message.obj, "argi2")).intValue();
                    default:
                        return 0;
                }
        }
        return ((java.lang.Integer) ko3.k0.e(message.obj, "argi3")).intValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x0112. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119 A[Catch: all -> 0x017f, TryCatch #0 {all -> 0x017f, blocks: (B:7:0x0016, B:9:0x0024, B:11:0x002e, B:18:0x0055, B:20:0x0069, B:22:0x0073, B:24:0x007b, B:26:0x0085, B:32:0x0096, B:33:0x009a, B:35:0x00e6, B:37:0x00fa, B:39:0x0110, B:40:0x0112, B:41:0x0115, B:45:0x0119, B:46:0x0130, B:47:0x0133, B:49:0x013d, B:50:0x0137, B:51:0x0140, B:55:0x0158, B:57:0x0162, B:59:0x014c, B:65:0x00a9, B:67:0x00cf, B:68:0x00ae, B:69:0x00bb, B:70:0x00be, B:71:0x00c1, B:72:0x0045, B:73:0x003c, B:74:0x004a), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137 A[Catch: all -> 0x017f, TryCatch #0 {all -> 0x017f, blocks: (B:7:0x0016, B:9:0x0024, B:11:0x002e, B:18:0x0055, B:20:0x0069, B:22:0x0073, B:24:0x007b, B:26:0x0085, B:32:0x0096, B:33:0x009a, B:35:0x00e6, B:37:0x00fa, B:39:0x0110, B:40:0x0112, B:41:0x0115, B:45:0x0119, B:46:0x0130, B:47:0x0133, B:49:0x013d, B:50:0x0137, B:51:0x0140, B:55:0x0158, B:57:0x0162, B:59:0x014c, B:65:0x00a9, B:67:0x00cf, B:68:0x00ae, B:69:0x00bb, B:70:0x00be, B:71:0x00c1, B:72:0x0045, B:73:0x003c, B:74:0x004a), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140 A[Catch: all -> 0x017f, TryCatch #0 {all -> 0x017f, blocks: (B:7:0x0016, B:9:0x0024, B:11:0x002e, B:18:0x0055, B:20:0x0069, B:22:0x0073, B:24:0x007b, B:26:0x0085, B:32:0x0096, B:33:0x009a, B:35:0x00e6, B:37:0x00fa, B:39:0x0110, B:40:0x0112, B:41:0x0115, B:45:0x0119, B:46:0x0130, B:47:0x0133, B:49:0x013d, B:50:0x0137, B:51:0x0140, B:55:0x0158, B:57:0x0162, B:59:0x014c, B:65:0x00a9, B:67:0x00cf, B:68:0x00ae, B:69:0x00bb, B:70:0x00be, B:71:0x00c1, B:72:0x0045, B:73:0x003c, B:74:0x004a), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x003c A[Catch: all -> 0x017f, TRY_ENTER, TryCatch #0 {all -> 0x017f, blocks: (B:7:0x0016, B:9:0x0024, B:11:0x002e, B:18:0x0055, B:20:0x0069, B:22:0x0073, B:24:0x007b, B:26:0x0085, B:32:0x0096, B:33:0x009a, B:35:0x00e6, B:37:0x00fa, B:39:0x0110, B:40:0x0112, B:41:0x0115, B:45:0x0119, B:46:0x0130, B:47:0x0133, B:49:0x013d, B:50:0x0137, B:51:0x0140, B:55:0x0158, B:57:0x0162, B:59:0x014c, B:65:0x00a9, B:67:0x00cf, B:68:0x00ae, B:69:0x00bb, B:70:0x00be, B:71:0x00c1, B:72:0x0045, B:73:0x003c, B:74:0x004a), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004a A[Catch: all -> 0x017f, TryCatch #0 {all -> 0x017f, blocks: (B:7:0x0016, B:9:0x0024, B:11:0x002e, B:18:0x0055, B:20:0x0069, B:22:0x0073, B:24:0x007b, B:26:0x0085, B:32:0x0096, B:33:0x009a, B:35:0x00e6, B:37:0x00fa, B:39:0x0110, B:40:0x0112, B:41:0x0115, B:45:0x0119, B:46:0x0130, B:47:0x0133, B:49:0x013d, B:50:0x0137, B:51:0x0140, B:55:0x0158, B:57:0x0162, B:59:0x014c, B:65:0x00a9, B:67:0x00cf, B:68:0x00ae, B:69:0x00bb, B:70:0x00be, B:71:0x00c1, B:72:0x0045, B:73:0x003c, B:74:0x004a), top: B:6:0x0016 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko3.k.handleMessage(android.os.Message):boolean");
    }
}
