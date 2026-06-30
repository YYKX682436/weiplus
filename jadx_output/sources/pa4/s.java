package pa4;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f353072a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.mj4 f353073b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.mj4 f353074c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.l2 f353075d;

    /* renamed from: e, reason: collision with root package name */
    public final pa4.m f353076e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f353077f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f353078g;

    /* renamed from: h, reason: collision with root package name */
    public final pa4.o f353079h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f353080i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f353081j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f353082k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f353083l;

    /* renamed from: m, reason: collision with root package name */
    public int f353084m;

    /* renamed from: n, reason: collision with root package name */
    public final dn.k f353085n;

    public s(int i17, r45.mj4 uploadInfo, r45.mj4 livePhotoVideoUploadInfo, com.tencent.mm.plugin.sns.storage.l2 snsMedia, pa4.m callback, java.lang.String livePhotoUUId, boolean z17, pa4.o workHelper) {
        kotlin.jvm.internal.o.g(uploadInfo, "uploadInfo");
        kotlin.jvm.internal.o.g(livePhotoVideoUploadInfo, "livePhotoVideoUploadInfo");
        kotlin.jvm.internal.o.g(snsMedia, "snsMedia");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(livePhotoUUId, "livePhotoUUId");
        kotlin.jvm.internal.o.g(workHelper, "workHelper");
        this.f353072a = i17;
        this.f353073b = uploadInfo;
        this.f353074c = livePhotoVideoUploadInfo;
        this.f353075d = snsMedia;
        this.f353076e = callback;
        this.f353077f = livePhotoUUId;
        this.f353078g = z17;
        this.f353079h = workHelper;
        this.f353080i = livePhotoVideoUploadInfo.f380576t;
        this.f353081j = livePhotoVideoUploadInfo.f380577u;
        this.f353082k = livePhotoVideoUploadInfo.f380572p;
        this.f353083l = livePhotoVideoUploadInfo.f380579w;
        this.f353085n = new pa4.p(this);
    }

    public static final /* synthetic */ java.lang.String a(pa4.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getClientId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        java.lang.String str = sVar.f353082k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getClientId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        return str;
    }

    public static final /* synthetic */ r45.mj4 b(pa4.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLivePhotoVideoUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        r45.mj4 mj4Var = sVar.f353074c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLivePhotoVideoUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        return mj4Var;
    }

    public static final /* synthetic */ int c(pa4.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLocalId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        int i17 = sVar.f353072a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLocalId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        return i17;
    }
}
