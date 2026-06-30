package tl;

/* loaded from: classes12.dex */
public class y0 implements cv.b1 {

    /* renamed from: f, reason: collision with root package name */
    public static int f420187f = 100;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f420190c = "";

    /* renamed from: d, reason: collision with root package name */
    public cv.a1 f420191d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f420192e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final tl.t f420189b = new tl.t(to.c.AMR);

    /* renamed from: a, reason: collision with root package name */
    public final fp.e f420188a = new fp.e(com.tencent.mm.sdk.platformtools.x2.f193071a);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r7 = r1.f420135o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r7 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        r7.setOutputFormat(3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r10, int r11) {
        /*
            r9 = this;
            fp.e r0 = r9.f420188a
            tl.t r1 = r9.f420189b
            fp.j r2 = new fp.j
            r2.<init>()
            java.lang.String r3 = r9.f420190c
            int r3 = r3.length()
            r4 = 0
            java.lang.String r5 = "MicroMsg.SimpleVoiceRecorder"
            if (r3 <= 0) goto L1a
            java.lang.String r10 = "Duplicate Call startRecord , maybe Stop Fail Before"
            com.tencent.mars.xlog.Log.e(r5, r10)
            return r4
        L1a:
            r9.f420190c = r10
            r0.b()     // Catch: java.lang.Exception -> L68
            tl.x0 r10 = new tl.x0     // Catch: java.lang.Exception -> L68
            r10.<init>(r9)     // Catch: java.lang.Exception -> L68
            r1.e(r10)     // Catch: java.lang.Exception -> L68
            to.c r10 = to.c.AMR     // Catch: java.lang.Exception -> L68
            to.c r3 = r1.f420137q
            r6 = 1
            if (r3 != r10) goto L36
            android.media.MediaRecorder r7 = r1.f420135o     // Catch: java.lang.Exception -> L68
            if (r7 != 0) goto L33
            goto L36
        L33:
            r7.setAudioSource(r6)     // Catch: java.lang.Exception -> L68
        L36:
            if (r3 != r10) goto L41
            android.media.MediaRecorder r7 = r1.f420135o     // Catch: java.lang.Exception -> L68
            if (r7 != 0) goto L3d
            goto L41
        L3d:
            r8 = 3
            r7.setOutputFormat(r8)     // Catch: java.lang.Exception -> L68
        L41:
            if (r3 != r10) goto L4a
            android.media.MediaRecorder r7 = r1.f420135o     // Catch: java.lang.Exception -> L68
            if (r7 == 0) goto L4a
            r7.setAudioEncoder(r6)     // Catch: java.lang.Exception -> L68
        L4a:
            java.lang.String r7 = r9.f420190c     // Catch: java.lang.Exception -> L68
            r1.f(r7)     // Catch: java.lang.Exception -> L68
            if (r3 != r10) goto L59
            android.media.MediaRecorder r10 = r1.f420135o     // Catch: java.lang.Exception -> L68
            if (r10 == 0) goto L5c
            r10.setMaxDuration(r11)     // Catch: java.lang.Exception -> L68
            goto L5c
        L59:
            long r10 = (long) r11     // Catch: java.lang.Exception -> L68
            r1.f420128h = r10     // Catch: java.lang.Exception -> L68
        L5c:
            r1.c()     // Catch: java.lang.Exception -> L68
            r1.g()     // Catch: java.lang.Exception -> L68
            r2.a()     // Catch: java.lang.Exception -> L68
            r9.f420192e = r6
            return r6
        L68:
            r10 = move-exception
            r0.a()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "StartRecord File["
            r11.<init>(r0)
            java.lang.String r0 = r9.f420190c
            r11.append(r0)
            java.lang.String r0 = "] ErrMsg["
            r11.append(r0)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = "]"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.mars.xlog.Log.e(r5, r10)
            r10 = -1
            r9.f420192e = r10
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.y0.a(java.lang.String, int):boolean");
    }

    public boolean b() {
        this.f420188a.a();
        tl.t tVar = this.f420189b;
        if (tVar == null) {
            return true;
        }
        try {
            tVar.h();
            tVar.d();
            this.f420190c = "";
            this.f420192e = 0;
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SimpleVoiceRecorder", "StopRecord File[" + this.f420190c + "] ErrMsg[" + e17.getMessage() + "]");
            this.f420192e = -1;
            return false;
        }
    }
}
