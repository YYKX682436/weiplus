package nb4;

/* loaded from: classes4.dex */
public final class m extends pf5.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f336086d = "MicroMsg.SnsCoverViewModel";

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f336087e = new androidx.lifecycle.j0();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f336088f = new java.util.HashSet();

    public static final /* synthetic */ java.lang.String N6(nb4.m mVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        java.lang.String str = mVar.f336086d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        return str;
    }

    public final void O6(com.tencent.mm.plugin.sns.storage.x1 x1Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearCoverData", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        if (!z17) {
            com.tencent.mm.vfs.w6.h(x1Var.field_localThumb);
            x1Var.field_localThumb = "";
        }
        com.tencent.mm.vfs.w6.h(x1Var.field_localImage);
        com.tencent.mm.vfs.w6.h(x1Var.field_cacheVideo);
        x1Var.field_cacheVideo = x1Var.field_localVideo;
        x1Var.field_localImage = "";
        x1Var.field_localVideo = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCoverData", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
    }

    public final void P6(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateUserCoverFromDetail", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        pf5.e.launch$default(this, null, null, new nb4.l(this, j17, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateUserCoverFromDetail", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
    }
}
