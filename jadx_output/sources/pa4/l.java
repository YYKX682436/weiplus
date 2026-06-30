package pa4;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f353050a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.l2 f353051b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f353052c;

    /* renamed from: d, reason: collision with root package name */
    public final int f353053d;

    /* renamed from: e, reason: collision with root package name */
    public volatile r45.mj4 f353054e;

    /* renamed from: f, reason: collision with root package name */
    public final pa4.o f353055f;

    /* renamed from: g, reason: collision with root package name */
    public final pa4.i f353056g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f353057h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f353058i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f353059j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f353060k;

    public l(int i17, com.tencent.mm.plugin.sns.storage.l2 snsMedia, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(snsMedia, "snsMedia");
        this.f353050a = i17;
        this.f353051b = snsMedia;
        this.f353052c = z17;
        this.f353053d = i18;
        this.f353055f = new pa4.o();
        this.f353056g = new pa4.i(this);
        this.f353057h = jz5.h.b(pa4.h.f353046d);
        this.f353058i = jz5.h.b(new pa4.g(this));
        this.f353059j = jz5.h.b(new pa4.k(this));
        this.f353060k = jz5.h.b(new pa4.f(this));
    }

    public static final java.lang.String a(pa4.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLivePhotoUUId", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        lVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoUUId", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        java.lang.String str = (java.lang.String) ((jz5.n) lVar.f353057h).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoUUId", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLivePhotoUUId", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        return str;
    }

    public static final /* synthetic */ int b(pa4.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLocalId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        int i17 = lVar.f353050a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLocalId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        return i17;
    }

    public static final void c(pa4.l lVar, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateSnsMedia", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        lVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsMedia", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoUpload", "updateSnsMedia >> needResetOffset: " + z17 + " needUnSetUpload: " + z18);
        com.tencent.mm.plugin.sns.storage.m2 Hj = com.tencent.mm.plugin.sns.model.l4.Hj();
        int i17 = lVar.f353050a;
        com.tencent.mm.plugin.sns.storage.l2 n17 = Hj.n1((long) i17);
        try {
            n17.m(lVar.d().toByteArray());
            if (z17) {
                n17.j(0);
            }
            if (z18) {
                n17.n();
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LivePhotoUpload", "upload callback is update snsMedia error");
        }
        com.tencent.mm.plugin.sns.model.l4.xj().A(i17);
        com.tencent.mm.plugin.sns.model.l4.Hj().Y2(i17, n17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsMedia", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateSnsMedia", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
    }

    public final r45.mj4 d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUploadInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        r45.mj4 mj4Var = this.f353054e;
        if (mj4Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUploadInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            return mj4Var;
        }
        kotlin.jvm.internal.o.o("uploadInfo");
        throw null;
    }
}
