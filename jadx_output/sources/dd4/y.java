package dd4;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: f */
    public static final dd4.u f229071f = new dd4.u(null);

    /* renamed from: g */
    public static final java.util.HashMap f229072g = new java.util.HashMap();

    /* renamed from: a */
    public ik4.p f229073a;

    /* renamed from: b */
    public xd4.b f229074b;

    /* renamed from: c */
    public r45.jj4 f229075c;

    /* renamed from: d */
    public kotlinx.coroutines.r2 f229076d;

    /* renamed from: e */
    public com.tencent.mars.cdn.CdnManager.VideoInfo f229077e;

    public static final /* synthetic */ java.util.HashMap a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFlexibleDownloadMap$cp", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
        java.util.HashMap hashMap = f229072g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFlexibleDownloadMap$cp", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
        return hashMap;
    }

    public final void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logE", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
        java.lang.String d17 = d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        r45.jj4 jj4Var = this.f229075c;
        sb6.append(jj4Var != null ? jj4Var.f377855d : null);
        sb6.append(']');
        sb6.append(str);
        com.tencent.mars.xlog.Log.e(d17, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logE", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
    }

    public final void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logI", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
        java.lang.String d17 = d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        r45.jj4 jj4Var = this.f229075c;
        sb6.append(jj4Var != null ? jj4Var.f377855d : null);
        sb6.append(']');
        sb6.append(str);
        com.tencent.mars.xlog.Log.i(d17, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logI", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
    }

    public final java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tag", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
        java.lang.String str = "MicroMsg.FlexibleResourceHelper@" + hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tag", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
        return str;
    }

    public final void e() {
        fk4.k a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerDownload", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
        xd4.b bVar = this.f229074b;
        if (bVar != null && (a17 = bVar.a()) != null) {
            a17.o();
        }
        c("start download");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerDownload", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3 A[Catch: Exception -> 0x003e, CancellationException -> 0x0100, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0100, blocks: (B:12:0x0039, B:13:0x00d5, B:14:0x00da, B:16:0x00e3), top: B:11:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r18, yz5.l r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dd4.y.f(int, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
