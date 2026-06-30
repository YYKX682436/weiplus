package ni3;

/* loaded from: classes8.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f337679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f337680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f337681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f337682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f337683h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f337684i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ni3.g2 f337685m;

    public p1(ni3.g2 g2Var, long j17, long j18, long j19, long j27, long j28, long j29) {
        this.f337685m = g2Var;
        this.f337679d = j17;
        this.f337680e = j18;
        this.f337681f = j19;
        this.f337682g = j27;
        this.f337683h = j28;
        this.f337684i = j29;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085 A[Catch: Exception -> 0x038a, TRY_ENTER, TryCatch #0 {Exception -> 0x038a, blocks: (B:3:0x0007, B:6:0x0029, B:8:0x0033, B:9:0x0042, B:13:0x005f, B:16:0x0085, B:18:0x008f, B:19:0x00aa, B:23:0x00c6, B:26:0x00ec, B:28:0x00f6, B:29:0x0111, B:32:0x0130, B:34:0x0176, B:37:0x017e, B:39:0x018d, B:41:0x0193, B:43:0x0199, B:44:0x019c, B:46:0x01c0, B:47:0x01c6, B:49:0x01cc, B:51:0x01d4, B:52:0x01d7, B:53:0x0200, B:55:0x0206, B:57:0x022d, B:59:0x0233, B:60:0x023b, B:61:0x0243, B:63:0x0272, B:66:0x0284, B:68:0x028e, B:70:0x029e, B:72:0x02a6, B:74:0x02b6, B:76:0x02be, B:82:0x02d8, B:83:0x030f, B:87:0x0301, B:88:0x0120, B:92:0x012d, B:93:0x00b7, B:95:0x00c4, B:96:0x0050, B:98:0x005d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec A[Catch: Exception -> 0x038a, TRY_ENTER, TryCatch #0 {Exception -> 0x038a, blocks: (B:3:0x0007, B:6:0x0029, B:8:0x0033, B:9:0x0042, B:13:0x005f, B:16:0x0085, B:18:0x008f, B:19:0x00aa, B:23:0x00c6, B:26:0x00ec, B:28:0x00f6, B:29:0x0111, B:32:0x0130, B:34:0x0176, B:37:0x017e, B:39:0x018d, B:41:0x0193, B:43:0x0199, B:44:0x019c, B:46:0x01c0, B:47:0x01c6, B:49:0x01cc, B:51:0x01d4, B:52:0x01d7, B:53:0x0200, B:55:0x0206, B:57:0x022d, B:59:0x0233, B:60:0x023b, B:61:0x0243, B:63:0x0272, B:66:0x0284, B:68:0x028e, B:70:0x029e, B:72:0x02a6, B:74:0x02b6, B:76:0x02be, B:82:0x02d8, B:83:0x030f, B:87:0x0301, B:88:0x0120, B:92:0x012d, B:93:0x00b7, B:95:0x00c4, B:96:0x0050, B:98:0x005d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0176 A[Catch: Exception -> 0x038a, TryCatch #0 {Exception -> 0x038a, blocks: (B:3:0x0007, B:6:0x0029, B:8:0x0033, B:9:0x0042, B:13:0x005f, B:16:0x0085, B:18:0x008f, B:19:0x00aa, B:23:0x00c6, B:26:0x00ec, B:28:0x00f6, B:29:0x0111, B:32:0x0130, B:34:0x0176, B:37:0x017e, B:39:0x018d, B:41:0x0193, B:43:0x0199, B:44:0x019c, B:46:0x01c0, B:47:0x01c6, B:49:0x01cc, B:51:0x01d4, B:52:0x01d7, B:53:0x0200, B:55:0x0206, B:57:0x022d, B:59:0x0233, B:60:0x023b, B:61:0x0243, B:63:0x0272, B:66:0x0284, B:68:0x028e, B:70:0x029e, B:72:0x02a6, B:74:0x02b6, B:76:0x02be, B:82:0x02d8, B:83:0x030f, B:87:0x0301, B:88:0x0120, B:92:0x012d, B:93:0x00b7, B:95:0x00c4, B:96:0x0050, B:98:0x005d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018d A[Catch: Exception -> 0x038a, LOOP:0: B:39:0x018d->B:41:0x0193, LOOP_START, PHI: r14
  0x018d: PHI (r14v13 long) = (r14v5 long), (r14v14 long) binds: [B:38:0x018b, B:41:0x0193] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x038a, blocks: (B:3:0x0007, B:6:0x0029, B:8:0x0033, B:9:0x0042, B:13:0x005f, B:16:0x0085, B:18:0x008f, B:19:0x00aa, B:23:0x00c6, B:26:0x00ec, B:28:0x00f6, B:29:0x0111, B:32:0x0130, B:34:0x0176, B:37:0x017e, B:39:0x018d, B:41:0x0193, B:43:0x0199, B:44:0x019c, B:46:0x01c0, B:47:0x01c6, B:49:0x01cc, B:51:0x01d4, B:52:0x01d7, B:53:0x0200, B:55:0x0206, B:57:0x022d, B:59:0x0233, B:60:0x023b, B:61:0x0243, B:63:0x0272, B:66:0x0284, B:68:0x028e, B:70:0x029e, B:72:0x02a6, B:74:0x02b6, B:76:0x02be, B:82:0x02d8, B:83:0x030f, B:87:0x0301, B:88:0x0120, B:92:0x012d, B:93:0x00b7, B:95:0x00c4, B:96:0x0050, B:98:0x005d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c0 A[Catch: Exception -> 0x038a, TryCatch #0 {Exception -> 0x038a, blocks: (B:3:0x0007, B:6:0x0029, B:8:0x0033, B:9:0x0042, B:13:0x005f, B:16:0x0085, B:18:0x008f, B:19:0x00aa, B:23:0x00c6, B:26:0x00ec, B:28:0x00f6, B:29:0x0111, B:32:0x0130, B:34:0x0176, B:37:0x017e, B:39:0x018d, B:41:0x0193, B:43:0x0199, B:44:0x019c, B:46:0x01c0, B:47:0x01c6, B:49:0x01cc, B:51:0x01d4, B:52:0x01d7, B:53:0x0200, B:55:0x0206, B:57:0x022d, B:59:0x0233, B:60:0x023b, B:61:0x0243, B:63:0x0272, B:66:0x0284, B:68:0x028e, B:70:0x029e, B:72:0x02a6, B:74:0x02b6, B:76:0x02be, B:82:0x02d8, B:83:0x030f, B:87:0x0301, B:88:0x0120, B:92:0x012d, B:93:0x00b7, B:95:0x00c4, B:96:0x0050, B:98:0x005d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0206 A[Catch: Exception -> 0x038a, TryCatch #0 {Exception -> 0x038a, blocks: (B:3:0x0007, B:6:0x0029, B:8:0x0033, B:9:0x0042, B:13:0x005f, B:16:0x0085, B:18:0x008f, B:19:0x00aa, B:23:0x00c6, B:26:0x00ec, B:28:0x00f6, B:29:0x0111, B:32:0x0130, B:34:0x0176, B:37:0x017e, B:39:0x018d, B:41:0x0193, B:43:0x0199, B:44:0x019c, B:46:0x01c0, B:47:0x01c6, B:49:0x01cc, B:51:0x01d4, B:52:0x01d7, B:53:0x0200, B:55:0x0206, B:57:0x022d, B:59:0x0233, B:60:0x023b, B:61:0x0243, B:63:0x0272, B:66:0x0284, B:68:0x028e, B:70:0x029e, B:72:0x02a6, B:74:0x02b6, B:76:0x02be, B:82:0x02d8, B:83:0x030f, B:87:0x0301, B:88:0x0120, B:92:0x012d, B:93:0x00b7, B:95:0x00c4, B:96:0x0050, B:98:0x005d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120 A[Catch: Exception -> 0x038a, TryCatch #0 {Exception -> 0x038a, blocks: (B:3:0x0007, B:6:0x0029, B:8:0x0033, B:9:0x0042, B:13:0x005f, B:16:0x0085, B:18:0x008f, B:19:0x00aa, B:23:0x00c6, B:26:0x00ec, B:28:0x00f6, B:29:0x0111, B:32:0x0130, B:34:0x0176, B:37:0x017e, B:39:0x018d, B:41:0x0193, B:43:0x0199, B:44:0x019c, B:46:0x01c0, B:47:0x01c6, B:49:0x01cc, B:51:0x01d4, B:52:0x01d7, B:53:0x0200, B:55:0x0206, B:57:0x022d, B:59:0x0233, B:60:0x023b, B:61:0x0243, B:63:0x0272, B:66:0x0284, B:68:0x028e, B:70:0x029e, B:72:0x02a6, B:74:0x02b6, B:76:0x02be, B:82:0x02d8, B:83:0x030f, B:87:0x0301, B:88:0x0120, B:92:0x012d, B:93:0x00b7, B:95:0x00c4, B:96:0x0050, B:98:0x005d), top: B:2:0x0007 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ni3.p1.run():void");
    }
}
