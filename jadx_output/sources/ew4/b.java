package ew4;

/* loaded from: classes.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f257065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f257067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257069h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257070i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257071m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257072n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ew4.c f257073o;

    public b(ew4.c cVar, long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f257073o = cVar;
        this.f257065d = j17;
        this.f257066e = str;
        this.f257067f = j18;
        this.f257068g = str2;
        this.f257069h = str3;
        this.f257070i = str4;
        this.f257071m = str5;
        this.f257072n = str6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e3, code lost:
    
        if (r2.moveToFirst() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e5, code lost:
    
        r6 = new ew4.a();
        r6.convertFrom(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f5, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r6.field_localFile) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f7, code lost:
    
        r7 = com.tencent.mm.vfs.z7.a(ew4.d.P0() + r6.field_localFile);
        r9 = r7.f213279f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0112, code lost:
    
        if (r9 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0114, code lost:
    
        r13 = com.tencent.mm.vfs.e8.l(r9, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011c, code lost:
    
        if (r9.equals(r13) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x011e, code lost:
    
        r7 = new com.tencent.mm.vfs.z7(r7.f213277d, r7.f213278e, r13, r7.f213280g, r7.f213281h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x012d, code lost:
    
        r7 = com.tencent.mm.vfs.a3.f212781a.m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0138, code lost:
    
        if (r7.a() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0142, code lost:
    
        if (r7.f213266a.d(r7.f213267b) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0144, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0147, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDataStorage", "clearExpireTimeData(), delete data file:%s, ret:%b", r6.field_localFile, java.lang.Boolean.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0146, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0156, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDataStorage", "clearExpireTimeData(), delete data appIdKey:%s, ret:%b", r6.field_appIdKey, java.lang.Boolean.valueOf(r1.delete(r6, new java.lang.String[0])));
        r7 = r6.field_appId;
        r9 = r1.L0(r7) - r6.field_size;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDataStorage", "clearExpireTimeData(), currSize:%d", java.lang.Long.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0183, code lost:
    
        if (r9 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0185, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0186, code lost:
    
        r1.W0(r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018d, code lost:
    
        if (r2.moveToNext() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018f, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0192, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ew4.b.run():void");
    }
}
