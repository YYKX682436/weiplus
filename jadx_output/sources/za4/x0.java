package za4;

/* loaded from: classes4.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f471214a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public ab4.j0 f471215b = null;

    /* renamed from: c, reason: collision with root package name */
    public ab4.f f471216c = null;

    /* renamed from: d, reason: collision with root package name */
    public f54.m f471217d = null;

    /* renamed from: e, reason: collision with root package name */
    public s34.x f471218e = null;

    /* renamed from: f, reason: collision with root package name */
    public f54.n f471219f = null;

    /* renamed from: g, reason: collision with root package name */
    public f54.a f471220g = null;

    /* renamed from: h, reason: collision with root package name */
    public ab4.v0 f471221h;

    /* renamed from: i, reason: collision with root package name */
    public ab4.g0 f471222i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f471223j;

    /* renamed from: k, reason: collision with root package name */
    public int f471224k;

    /* renamed from: l, reason: collision with root package name */
    public int f471225l;

    public x0(java.lang.String str, java.lang.String str2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        a(str, str2, null);
        com.tencent.mars.xlog.Log.i("AdLandingPagesParseHelper", "parse adlanding xml, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x041e A[EDGE_INSN: B:134:0x041e->B:135:0x041e BREAK  A[LOOP:4: B:110:0x03eb->B:132:0x04f6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0381 A[EDGE_INSN: B:82:0x0381->B:83:0x0381 BREAK  A[LOOP:1: B:57:0x02f6->B:77:0x058d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r28, java.lang.String r29, android.content.Context r30) {
        /*
            Method dump skipped, instructions count: 1445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: za4.x0.a(java.lang.String, java.lang.String, android.content.Context):void");
    }

    public final void b(ab4.d0 d0Var, int i17) {
        java.util.List a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageIdxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$AdLandingPagesParser");
        d0Var.E = i17;
        if (za4.z0.s(d0Var.f2827q) && (a17 = d0Var.a()) != null) {
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                b((ab4.d0) it.next(), i17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageIdxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$AdLandingPagesParser");
    }

    public x0(java.lang.String str, java.lang.String str2, android.content.Context context) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        a(str, str2, context);
        com.tencent.mars.xlog.Log.i("AdLandingPagesParseHelper", "parse adlanding xml, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
