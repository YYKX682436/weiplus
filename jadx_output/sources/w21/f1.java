package w21;

/* loaded from: classes12.dex */
public class f1 implements tl.d {

    /* renamed from: e, reason: collision with root package name */
    public static int f442364e = 100;

    /* renamed from: a, reason: collision with root package name */
    public final tl.t f442365a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f442366b = "";

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.modelbase.e1 f442367c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f442368d = 0;

    public f1(to.c cVar) {
        this.f442365a = new tl.t(cVar);
    }

    @Override // tl.d
    public int a() {
        tl.w wVar;
        to.c cVar = to.c.PCM;
        tl.t tVar = this.f442365a;
        to.c cVar2 = tVar.f420137q;
        if ((cVar2 == cVar || cVar2 == to.c.SILK) && (wVar = tVar.f420136p) != null) {
            return wVar.D;
        }
        return 1;
    }

    @Override // tl.d
    public void b(com.tencent.mm.modelbase.e1 e1Var) {
        this.f442367c = e1Var;
    }

    @Override // tl.d
    public int d() {
        if (this.f442368d != 1) {
            return 0;
        }
        int a17 = this.f442365a.a();
        if (a17 > f442364e) {
            f442364e = a17;
        }
        return (a17 * 100) / f442364e;
    }

    @Override // tl.d
    public int getStatus() {
        return this.f442368d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r6 = r0.f420135o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r6.setOutputFormat(3);
     */
    @Override // tl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean startRecord(java.lang.String r9) {
        /*
            r8 = this;
            tl.t r0 = r8.f442365a
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r9
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r9)
            if (r3 == 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r9.length()
        L14:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "[startRecord] fileName:%s size:%s"
            java.lang.String r5 = "VoiceRecorder"
            com.tencent.mars.xlog.Log.i(r5, r3, r1)
            fp.j r1 = new fp.j
            r1.<init>()
            java.lang.String r3 = r8.f442366b
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r3 != 0) goto L3d
            java.lang.String r3 = r8.f442366b
            int r3 = r3.length()
            if (r3 <= 0) goto L3d
            java.lang.String r9 = "Duplicate Call startRecord , maybe Stop Fail Before"
            com.tencent.mars.xlog.Log.e(r5, r9)
            return r2
        L3d:
            r8.f442366b = r9
            w21.e1 r9 = new w21.e1     // Catch: java.lang.Exception -> L8a
            r9.<init>(r8)     // Catch: java.lang.Exception -> L8a
            r0.e(r9)     // Catch: java.lang.Exception -> L8a
            to.c r9 = to.c.AMR     // Catch: java.lang.Exception -> L8a
            to.c r3 = r0.f420137q
            if (r3 != r9) goto L55
            android.media.MediaRecorder r6 = r0.f420135o     // Catch: java.lang.Exception -> L8a
            if (r6 != 0) goto L52
            goto L55
        L52:
            r6.setAudioSource(r4)     // Catch: java.lang.Exception -> L8a
        L55:
            if (r3 != r9) goto L60
            android.media.MediaRecorder r6 = r0.f420135o     // Catch: java.lang.Exception -> L8a
            if (r6 != 0) goto L5c
            goto L60
        L5c:
            r7 = 3
            r6.setOutputFormat(r7)     // Catch: java.lang.Exception -> L8a
        L60:
            if (r3 != r9) goto L69
            android.media.MediaRecorder r6 = r0.f420135o     // Catch: java.lang.Exception -> L8a
            if (r6 == 0) goto L69
            r6.setAudioEncoder(r4)     // Catch: java.lang.Exception -> L8a
        L69:
            java.lang.String r6 = r8.f442366b     // Catch: java.lang.Exception -> L8a
            r0.f(r6)     // Catch: java.lang.Exception -> L8a
            r6 = 70000(0x11170, float:9.8091E-41)
            if (r3 != r9) goto L7b
            android.media.MediaRecorder r9 = r0.f420135o     // Catch: java.lang.Exception -> L8a
            if (r9 == 0) goto L7e
            r9.setMaxDuration(r6)     // Catch: java.lang.Exception -> L8a
            goto L7e
        L7b:
            long r6 = (long) r6     // Catch: java.lang.Exception -> L8a
            r0.f420128h = r6     // Catch: java.lang.Exception -> L8a
        L7e:
            r0.c()     // Catch: java.lang.Exception -> L8a
            r0.g()     // Catch: java.lang.Exception -> L8a
            r1.a()     // Catch: java.lang.Exception -> L8a
            r8.f442368d = r4
            return r4
        L8a:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StartRecord File["
            r0.<init>(r1)
            java.lang.String r1 = r8.f442366b
            r0.append(r1)
            java.lang.String r1 = "] ErrMsg["
            r0.append(r1)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = "]"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.tencent.mars.xlog.Log.e(r5, r9)
            r9 = -1
            r8.f442368d = r9
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.f1.startRecord(java.lang.String):boolean");
    }

    @Override // tl.d
    public boolean stopRecord() {
        tl.t tVar = this.f442365a;
        if (tVar == null) {
            return true;
        }
        try {
            tVar.h();
            tVar.d();
            this.f442366b = "";
            this.f442368d = 0;
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("VoiceRecorder", "StopRecord File[" + this.f442366b + "] ErrMsg[" + e17.getMessage() + "]");
            this.f442368d = -1;
            return false;
        }
    }
}
