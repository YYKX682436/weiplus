package qq0;

/* loaded from: classes7.dex */
public final class k extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qq0.m f365897b;

    public k(qq0.m mVar) {
        this.f365897b = mVar;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mm.vfs.r6[] G;
        com.tencent.mars.xlog.Log.i("MagicSclStartupCoverService", "onEnterBackground");
        qq0.m mVar = this.f365897b;
        mVar.getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = mVar.f365902g;
        long q17 = o4Var.q("lastCheckFileTimeMagicWxGameDynamicCard", 0L);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (java.lang.System.currentTimeMillis() - q17 < 604800000) {
            return;
        }
        o4Var.B("lastCheckFileTimeMagicWxGameDynamicCard", java.lang.System.currentTimeMillis());
        com.tencent.mars.xlog.Log.i("MagicSclStartupCoverService", "deleteOldFile realStart, " + q17);
        com.tencent.mm.vfs.r6[] G2 = new com.tencent.mm.vfs.r6(mVar.f365900e.a("MagicWxGameDynamicCard").concat("/MagicWxGameDynamicCard")).G();
        if (G2 != null) {
            for (com.tencent.mm.vfs.r6 r6Var : G2) {
                if (r6Var.y() && (G = r6Var.G()) != null) {
                    for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                        if (r6Var2.A()) {
                            java.lang.String name = r6Var2.getName();
                            kotlin.jvm.internal.o.f(name, "getName(...)");
                            if (!r26.n0.B(name, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, false)) {
                                com.tencent.mars.xlog.Log.i("MagicSclStartupCoverService", "deleteOldFile, unmatched, path: " + r6Var2.getName() + ", ret: " + r6Var2.l());
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
    }
}
