package q6;

/* loaded from: classes16.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public long f360220a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f360221b;

    /* renamed from: c, reason: collision with root package name */
    public final q6.b f360222c;

    /* renamed from: d, reason: collision with root package name */
    public long f360223d;

    public d(android.os.Handler handler, java.lang.String str, p6.a aVar) {
        this.f360221b = handler;
        this.f360222c = new q6.b(str, aVar);
    }

    public void a(long j17, long j18) {
        synchronized (this) {
            c(j17, j18);
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: Exception -> 0x00c9, TryCatch #0 {Exception -> 0x00c9, blocks: (B:3:0x0002, B:6:0x000f, B:9:0x0025, B:11:0x0032, B:13:0x0038, B:15:0x003e, B:18:0x004b, B:20:0x0053, B:22:0x005d, B:24:0x00c6, B:29:0x0067, B:31:0x006d, B:32:0x0072, B:33:0x007d, B:54:0x0079), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r11 = this;
            q6.b r0 = r11.f360222c
            long r1 = r0.b()     // Catch: java.lang.Exception -> Lc9
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            android.os.Handler r7 = r11.f360221b
            if (r5 == 0) goto L25
            long r3 = r11.f360220a     // Catch: java.lang.Exception -> Lc9
            long r3 = r1 - r3
            r8 = 20
            long r3 = r3 - r8
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> Lc9
            r1 = 100
            android.os.Message r0 = r7.obtainMessage(r1, r6, r6, r0)     // Catch: java.lang.Exception -> Lc9
            r7.sendMessageDelayed(r0, r3)     // Catch: java.lang.Exception -> Lc9
            goto Lc9
        L25:
            long r1 = r11.f360223d     // Catch: java.lang.Exception -> Lc9
            long r8 = r0.b()     // Catch: java.lang.Exception -> Lc9
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            o6.a r4 = r0.f360219f     // Catch: java.lang.Exception -> Lc9
            r5 = 1
            if (r3 != 0) goto L4a
            boolean r3 = p6.a.a(r4)     // Catch: java.lang.Exception -> Lc9
            if (r3 == 0) goto L4a
            boolean r3 = p6.a.a(r4)     // Catch: java.lang.Exception -> Lc9
            if (r3 == 0) goto L45
            java.util.ArrayList r3 = r4.f343174b     // Catch: java.lang.Exception -> Lc9
            int r3 = r3.size()     // Catch: java.lang.Exception -> Lc9
            goto L46
        L45:
            r3 = -1
        L46:
            if (r5 != r3) goto L4a
            r3 = r5
            goto L4b
        L4a:
            r3 = r6
        L4b:
            java.lang.String r8 = r0.f360217d     // Catch: java.lang.Exception -> Lc9
            int r9 = l6.m.i(r8)     // Catch: java.lang.Exception -> Lc9
            if (r5 != r9) goto L62
            n6.a r0 = l6.m.e(r8)     // Catch: java.lang.Exception -> Lc9
            boolean r3 = p6.a.a(r0)     // Catch: java.lang.Exception -> Lc9
            if (r3 == 0) goto Lc2
            int r6 = r0.getDuration()     // Catch: java.lang.Exception -> Lc9
            goto Lc2
        L62:
            r10 = 2
            if (r10 != r9) goto Lc2
            if (r3 == 0) goto L79
            boolean r3 = p6.a.a(r4)     // Catch: java.lang.Exception -> Lc9
            if (r3 == 0) goto L72
            java.util.ArrayList r3 = r4.f343174b     // Catch: java.lang.Exception -> Lc9
            r3.size()     // Catch: java.lang.Exception -> Lc9
        L72:
            r0.b()     // Catch: java.lang.Exception -> Lc9
            l6.m.b(r4)     // Catch: java.lang.Exception -> Lc9
            goto L7d
        L79:
            o6.a r4 = l6.m.f(r8)     // Catch: java.lang.Exception -> Lc9
        L7d:
            boolean r0 = p6.a.a(r4)     // Catch: java.lang.Exception -> Lc9
            if (r0 == 0) goto Lc2
            java.util.ArrayList r0 = r4.f343174b     // Catch: java.lang.Exception -> Lc2
            int r3 = r0.size()     // Catch: java.lang.Exception -> Lc2
            int r3 = r3 - r5
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> Lc2
            o6.c r0 = (o6.c) r0     // Catch: java.lang.Exception -> Lc2
            java.util.ArrayList r0 = r0.f343176b     // Catch: java.lang.Exception -> Lc2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lc2
            r3 = r6
        L97:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Exception -> Lc2
            if (r4 == 0) goto Lc1
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Exception -> Lc2
            m6.e r4 = (m6.e) r4     // Catch: java.lang.Exception -> Lc2
            m6.b r5 = r4.f324349a     // Catch: java.lang.Exception -> Lc2
            java.lang.String r5 = r5.f324341a     // Catch: java.lang.Exception -> Lc2
            java.lang.String r8 = "continuous"
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Exception -> Lc2
            if (r5 == 0) goto Lb7
            m6.b r4 = r4.f324349a     // Catch: java.lang.Exception -> Lc2
            int r5 = r4.f324342b     // Catch: java.lang.Exception -> Lc2
            int r4 = r4.f324343c     // Catch: java.lang.Exception -> Lc2
            int r5 = r5 + r4
            goto Lbd
        Lb7:
            m6.b r4 = r4.f324349a     // Catch: java.lang.Exception -> Lc2
            int r4 = r4.f324342b     // Catch: java.lang.Exception -> Lc2
            int r5 = r4 + 22
        Lbd:
            if (r5 <= r3) goto L97
            r3 = r5
            goto L97
        Lc1:
            r6 = r3
        Lc2:
            long r3 = (long) r6
            long r1 = r1 + r3
            r0 = 102(0x66, float:1.43E-43)
            r7.sendEmptyMessageDelayed(r0, r1)     // Catch: java.lang.Exception -> Lc9
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.d.b():void");
    }

    public void c(long j17, long j18) {
        android.os.Handler handler = this.f360221b;
        try {
            com.appaac.haptic.sync.VibrationPattern a17 = this.f360222c.a(j18);
            if (a17 == null || a17.f43917d.isEmpty()) {
                return;
            }
            android.os.Parcel obtain = android.os.Parcel.obtain();
            a17.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            android.os.Message obtainMessage = handler.obtainMessage(101, 0, 0, obtain);
            if (j18 <= j17) {
                handler.sendMessage(obtainMessage);
                this.f360223d = 0L;
            } else {
                long j19 = j18 - j17;
                long j27 = j19 > 20 ? j19 - 20 : 0L;
                this.f360223d = j27;
                handler.sendMessageDelayed(obtainMessage, j27);
            }
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }
}
