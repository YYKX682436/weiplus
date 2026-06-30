package z71;

@j95.b
/* loaded from: classes8.dex */
public class f extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public int f470519d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f470520e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f470521f = new java.util.HashMap();

    public static z71.f Bi() {
        return (z71.f) i95.n0.c(z71.f.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        if ((c01.z1.h() & r9) != r9) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r7 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r2 = r2 | (1 << r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        r6 = r6 + 1;
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long Ai() {
        /*
            r13 = this;
            wd0.r1[] r0 = wd0.r1.values()
            int r1 = r0.length
            r2 = 0
            r4 = 0
            r5 = r4
            r6 = r5
        La:
            if (r5 >= r1) goto L62
            r7 = r0[r5]
            java.lang.Class<wd0.s1> r8 = wd0.s1.class
            i95.m r8 = i95.n0.c(r8)
            wd0.s1 r8 = (wd0.s1) r8
            vd0.o2 r8 = (vd0.o2) r8
            r8.getClass()
            if (r7 != 0) goto L1f
            r7 = -1
            goto L27
        L1f:
            int[] r8 = vd0.n2.f435475a
            int r7 = r7.ordinal()
            r7 = r8[r7]
        L27:
            r8 = 1
            switch(r7) {
                case 1: goto L49;
                case 2: goto L46;
                case 3: goto L43;
                case 4: goto L40;
                case 5: goto L3d;
                case 6: goto L3a;
                case 7: goto L37;
                case 8: goto L34;
                case 9: goto L30;
                case 10: goto L2c;
                case 11: goto L54;
                default: goto L2b;
            }
        L2b:
            goto L56
        L2c:
            r9 = 2097152(0x200000, double:1.036131E-317)
            goto L4b
        L30:
            r9 = 131072(0x20000, double:6.4758E-319)
            goto L4b
        L34:
            r9 = 2048(0x800, double:1.012E-320)
            goto L4b
        L37:
            r9 = 512(0x200, double:2.53E-321)
            goto L4b
        L3a:
            r9 = 8224(0x2020, double:4.063E-320)
            goto L4b
        L3d:
            r9 = 8192(0x2000, double:4.0474E-320)
            goto L4b
        L40:
            r9 = 128(0x80, double:6.3E-322)
            goto L4b
        L43:
            r9 = 32
            goto L4b
        L46:
            r9 = 8
            goto L4b
        L49:
            r9 = 2
        L4b:
            long r11 = c01.z1.h()
            long r11 = r11 & r9
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 == 0) goto L56
        L54:
            r7 = r8
            goto L57
        L56:
            r7 = r4
        L57:
            if (r7 == 0) goto L5d
            int r7 = r8 << r6
            long r7 = (long) r7
            long r2 = r2 | r7
        L5d:
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto La
        L62:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z71.f.Ai():long");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AiRedDotData", "AiRedDot Data oncreate");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r4 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] wi() {
        /*
            r6 = this;
            r0 = 14
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto Ld
            r1[r3] = r2
            int r3 = r3 + 1
            goto L6
        Ld:
            java.util.HashMap r0 = r6.f470520e
            monitor-enter(r0)
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L35
            java.util.HashMap r3 = r6.f470520e     // Catch: java.lang.Throwable -> L35
            java.util.Set r3 = r3.keySet()     // Catch: java.lang.Throwable -> L35
            r2.addAll(r3)     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L35
        L22:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L35
            z71.e r4 = z71.e.valueOf(r3)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalArgumentException -> L37
            if (r4 == 0) goto L37
            goto L38
        L35:
            r1 = move-exception
            goto L50
        L37:
            r4 = 0
        L38:
            if (r4 == 0) goto L22
            int r4 = r4.f470518d     // Catch: java.lang.Throwable -> L35
            java.util.HashMap r5 = r6.f470520e     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r5.get(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L35
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L35
            r1[r4] = r3     // Catch: java.lang.Throwable -> L35
            goto L22
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            java.util.Arrays.toString(r1)
            return r1
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z71.f.wi():int[]");
    }
}
