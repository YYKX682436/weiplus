package n34;

/* loaded from: classes4.dex */
public class f implements s85.b, java.lang.Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final n34.f f334593e = new n34.f();

    /* renamed from: f, reason: collision with root package name */
    public static final s85.c f334594f = new s85.e(gm0.j1.t().a(0, java.lang.Boolean.class), new s85.h(gm0.j1.t().a(1, java.lang.Boolean.class)));

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f334595d = null;

    public static void b() {
        java.util.HashSet hashSet;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.CleanSnsDB");
        s85.a aVar = (s85.a) f334594f;
        synchronized (aVar.f404905g) {
            hashSet = aVar.f404904f;
            aVar.f404904f = new java.util.HashSet();
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            aVar.d((s85.b) it.next());
        }
        n34.f fVar = f334593e;
        wu5.c cVar = fVar.f334595d;
        if (cVar != null) {
            cVar.cancel(false);
            fVar.f334595d = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.CleanSnsDB");
    }

    @Override // s85.b
    public void a(s85.c cVar, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
        if (!((java.lang.Boolean) obj).booleanValue()) {
            wu5.c cVar2 = this.f334595d;
            if (cVar2 != null) {
                cVar2.cancel(false);
                this.f334595d = null;
            }
        } else if (this.f334595d == null) {
            this.f334595d = ((ku5.t0) ku5.t0.f312615d).k(this, 360000L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[Catch: RuntimeException -> 0x01c1, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x01c1, blocks: (B:3:0x000d, B:7:0x0025, B:10:0x0047, B:12:0x0051, B:13:0x0060, B:17:0x007d, B:19:0x009f, B:22:0x00d1, B:24:0x00db, B:25:0x00f5, B:29:0x0113, B:30:0x0102, B:32:0x010f, B:33:0x0179, B:34:0x006e, B:36:0x007b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0179 A[Catch: RuntimeException -> 0x01c1, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x01c1, blocks: (B:3:0x000d, B:7:0x0025, B:10:0x0047, B:12:0x0051, B:13:0x0060, B:17:0x007d, B:19:0x009f, B:22:0x00d1, B:24:0x00db, B:25:0x00f5, B:29:0x0113, B:30:0x0102, B:32:0x010f, B:33:0x0179, B:34:0x006e, B:36:0x007b), top: B:2:0x000d }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n34.f.run():void");
    }
}
