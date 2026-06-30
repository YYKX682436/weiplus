package dk2;

/* loaded from: classes3.dex */
public final class ua {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.ua f234209a = new dk2.ua();

    public final void a(boolean z17, int i17, int i18, long j17) {
        com.tencent.mars.xlog.Log.i("FinderLiveMicWatcher", "onCloseMicFail isAnchor: " + z17 + " errCode: " + i17 + " errType: " + i18 + " liveId: " + j17);
        if (z17) {
            com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 64L);
        } else {
            com.tencent.mm.plugin.finder.assist.y8 y8Var = com.tencent.mm.plugin.finder.assist.y8.f102732a;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.y8.f102739h, 73L);
        }
        pm0.z.b(xy2.b.f458155b, "mic_closeMicFail", false, null, null, false, false, new dk2.qa(z17, i17, i18, j17), 60, null);
    }
}
