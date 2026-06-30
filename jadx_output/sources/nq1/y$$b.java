package nq1;

/* loaded from: classes13.dex */
public final /* synthetic */ class y$$b implements b83.h {
    @Override // b83.h
    public final void a() {
        java.io.File file;
        ak0.a aVar = ak0.o.f5542a;
        boolean z17 = ak0.x.f5548k;
        android.content.Context a17 = ak0.o.a();
        tv5.b b17 = tv5.b.b(a17);
        boolean z18 = false;
        if (b17.f422375h && (file = b17.f422378k.f422386g) != null && uv5.c.b(a17).c(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getMD5(file))) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.DefaultLoadReporter", "try to repair oat file on patch process", new java.lang.Object[0]);
            tv5.b.b(a17).f422370c.a(file.getAbsolutePath());
            z18 = true;
        }
        if (z18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 9L, 1L, false);
        }
    }
}
