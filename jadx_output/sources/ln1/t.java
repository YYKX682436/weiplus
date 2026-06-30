package ln1;

/* loaded from: classes12.dex */
public class t implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f319827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f319828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f319829f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ln1.s f319830g;

    public t(ln1.s sVar, java.util.LinkedList linkedList, boolean z17, long j17) {
        this.f319830g = sVar;
        this.f319827d = linkedList;
        this.f319828e = z17;
        this.f319829f = j17;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "backupPackThread";
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0325, code lost:
    
        r15.f319810k.f447384g.add(r50);
        r0 = r15.f319810k;
        r0.f447386i += r50.f447404f;
        r0.f447385h += r50.f447403e;
        r39 = r39 - java.lang.System.currentTimeMillis();
        r15.c(new ln1.s$$b(r48, r49));
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPackAndSend", "backupPackSessionMsg finish Cursor Session[%d], convName[%s], msgCnt[%d], time[%d], [%d,%d,%d]", java.lang.Integer.valueOf(r43), r49.f309621a, java.lang.Integer.valueOf(r1), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r20), java.lang.Long.valueOf(r22), java.lang.Long.valueOf(r37), java.lang.Long.valueOf(r39 + java.lang.System.currentTimeMillis()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02fa, code lost:
    
        if (((java.util.ArrayList) r4).size() > 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0311, code lost:
    
        r15 = r25;
        r7 = r44;
        r8 = true;
        r0.close();
        r22 = r22 + java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0323, code lost:
    
        if (r7.size() != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0382, code lost:
    
        r4 = r48;
        r5 = r49;
        r6 = r50;
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03a4 A[LOOP:1: B:21:0x00c4->B:61:0x03a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x039e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0311 A[EDGE_INSN: B:71:0x0311->B:72:0x0311 BREAK  A[LOOP:3: B:34:0x027e->B:52:0x030b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0439  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ln1.t.run():void");
    }
}
