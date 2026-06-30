package pa4;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final pa4.h f353046d = new pa4.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$livePhotoUUId$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$livePhotoUUId$2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        byte[] bytes = sb6.toString().getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$livePhotoUUId$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$livePhotoUUId$2");
        return g17;
    }
}
