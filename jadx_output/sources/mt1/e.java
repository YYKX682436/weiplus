package mt1;

/* loaded from: classes12.dex */
public final class e extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public volatile com.tencent.wcdb.support.CancellationSignal f331209a;

    /* renamed from: b, reason: collision with root package name */
    public volatile wu5.c f331210b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f331211c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f331212d;

    public e() {
        int intExtra;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z17 = false;
        if (registerReceiver != null && ((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
            z17 = true;
        }
        this.f331211c = z17;
        java.lang.Object systemService = context.getSystemService("power");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.f331212d = ((android.os.PowerManager) systemService).isInteractive();
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CalcWxNewService", "mCancellationSignal cancel");
        wu5.c cVar = this.f331210b;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f331210b = null;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f331209a;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        this.f331209a = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.CalcWxNewService", "mCancellationSignal cancel done");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x103a A[Catch: all -> 0x1025, TryCatch #2 {all -> 0x1025, blocks: (B:3:0x0076, B:6:0x007b, B:9:0x0080, B:12:0x00b6, B:15:0x011c, B:18:0x017d, B:21:0x01dc, B:24:0x023a, B:27:0x029a, B:30:0x02da, B:31:0x02de, B:36:0x0302, B:39:0x0365, B:42:0x03c9, B:45:0x0430, B:48:0x0497, B:51:0x04f9, B:54:0x0559, B:57:0x05bb, B:61:0x0623, B:64:0x0687, B:67:0x06e9, B:70:0x074e, B:73:0x07b4, B:76:0x0816, B:79:0x0877, B:81:0x08ba, B:82:0x08c5, B:85:0x08eb, B:88:0x094e, B:91:0x09b0, B:105:0x09fa, B:106:0x0a35, B:109:0x0a37, B:110:0x0a75, B:113:0x0a77, B:114:0x0ab5, B:117:0x0ab7, B:118:0x0af5, B:121:0x0af7, B:122:0x0b35, B:125:0x0b37, B:126:0x0b75, B:129:0x0b77, B:130:0x0bb6, B:133:0x0bb8, B:134:0x0bf6, B:137:0x0bf8, B:138:0x0c36, B:141:0x0c38, B:142:0x0c76, B:145:0x0c78, B:146:0x0cb6, B:149:0x0cb8, B:150:0x0cf6, B:153:0x0cf8, B:154:0x0d34, B:157:0x0d36, B:158:0x0d74, B:161:0x0d76, B:162:0x0db6, B:165:0x0db8, B:166:0x0df6, B:169:0x0df8, B:170:0x0e36, B:181:0x102c, B:183:0x103a, B:185:0x104c, B:187:0x1052, B:188:0x1098, B:190:0x10a5, B:191:0x10aa, B:193:0x10b7, B:194:0x10bc, B:173:0x10d4, B:177:0x10e5, B:197:0x0e4a, B:199:0x0e7d, B:200:0x0e86, B:214:0x0e94, B:215:0x0ed3, B:218:0x0ed5, B:219:0x0f12, B:222:0x0f14, B:223:0x0f51, B:226:0x0f53, B:227:0x0f90, B:230:0x0f92, B:231:0x0fd1, B:234:0x0fd3, B:235:0x1010), top: B:2:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x10f9  */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 4374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mt1.e.b():boolean");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2128145023:
                    if (action.equals("android.intent.action.SCREEN_OFF")) {
                        this.f331212d = false;
                        break;
                    }
                    break;
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        this.f331211c = false;
                        break;
                    }
                    break;
                case -1454123155:
                    if (action.equals("android.intent.action.SCREEN_ON")) {
                        this.f331212d = true;
                        break;
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        this.f331211c = true;
                        break;
                    }
                    break;
            }
        }
        mt1.b0 b0Var = mt1.b0.f331191a;
        if (!mt1.b0.f331201k || !this.f331211c || this.f331212d) {
            a();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CalcWxNewService", "it is charging and screen off, 5 min to calc");
        if (this.f331210b == null) {
            this.f331210b = ((ku5.t0) ku5.t0.f312615d).k(new mt1.d(this), 90000L);
        }
    }
}
