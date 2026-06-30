package mt5;

/* loaded from: classes8.dex */
public class i implements lt5.a {

    /* renamed from: d, reason: collision with root package name */
    public static android.app.KeyguardManager f331319d;

    /* renamed from: a, reason: collision with root package name */
    public int f331320a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f331321b = "";

    /* renamed from: c, reason: collision with root package name */
    public lt5.f f331322c;

    /* JADX WARN: Removed duplicated region for block: B:5:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0089 -> B:21:0x0092). Please report as a decompilation issue!!! */
    @Override // lt5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lt5.f a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "TuringMSa"
            java.lang.String r1 = "keyguard"
            r2 = 0
            if (r7 != 0) goto L9
        L7:
            r3 = r2
            goto L3c
        L9:
            android.app.KeyguardManager r3 = mt5.i.f331319d
            if (r3 != 0) goto L15
            java.lang.Object r3 = r7.getSystemService(r1)
            android.app.KeyguardManager r3 = (android.app.KeyguardManager) r3
            mt5.i.f331319d = r3
        L15:
            android.app.KeyguardManager r3 = mt5.i.f331319d     // Catch: java.lang.Throwable -> L35
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "isSupported"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L35
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L35
            android.app.KeyguardManager r4 = mt5.i.f331319d     // Catch: java.lang.Throwable -> L35
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.Throwable -> L35
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L35
            goto L3c
        L35:
            r3 = move-exception
            java.lang.String r4 = "error"
            com.tencent.stubs.logger.Log.e(r0, r3, r4)
            goto L7
        L3c:
            if (r3 != 0) goto L47
            r7 = -200(0xffffffffffffff38, float:NaN)
            r6.f331320a = r7
            lt5.f r7 = lt5.f.a(r7)
            return r7
        L47:
            lt5.f r3 = r6.f331322c
            if (r3 == 0) goto L50
            int r4 = r3.f321304b
            if (r4 != 0) goto L50
            return r3
        L50:
            if (r7 == 0) goto L92
            android.app.KeyguardManager r3 = mt5.i.f331319d
            if (r3 != 0) goto L5e
            java.lang.Object r7 = r7.getSystemService(r1)
            android.app.KeyguardManager r7 = (android.app.KeyguardManager) r7
            mt5.i.f331319d = r7
        L5e:
            android.app.KeyguardManager r7 = mt5.i.f331319d     // Catch: java.lang.Throwable -> L88
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = "obtainOaid"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L88
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L88
            android.app.KeyguardManager r1 = mt5.i.f331319d     // Catch: java.lang.Throwable -> L88
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L88
            java.lang.Object r7 = r7.invoke(r1, r3)     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L88
            r6.f331321b = r7     // Catch: java.lang.Throwable -> L88
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L88
            if (r7 != 0) goto L83
            r6.f331320a = r2     // Catch: java.lang.Throwable -> L88
            goto L92
        L83:
            r7 = -305(0xfffffffffffffecf, float:NaN)
            r6.f331320a = r7     // Catch: java.lang.Throwable -> L88
            goto L92
        L88:
            r7 = move-exception
            r1 = -306(0xfffffffffffffece, float:NaN)
            r6.f331320a = r1
            java.lang.String r1 = "error."
            com.tencent.stubs.logger.Log.e(r0, r7, r1)
        L92:
            lt5.f r7 = new lt5.f
            java.lang.String r0 = r6.f331321b
            int r1 = r6.f331320a
            r7.<init>(r0, r1)
            r6.f331322c = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mt5.i.a(android.content.Context):lt5.f");
    }
}
