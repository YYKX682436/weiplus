package pa4;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa4.l f353044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pa4.l lVar) {
        super(0);
        this.f353044d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$imgUploader$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$imgUploader$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsMedia$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        pa4.l lVar = this.f353044d;
        com.tencent.mm.plugin.sns.storage.l2 l2Var = lVar.f353051b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsMedia$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        r45.mj4 d17 = lVar.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        pa4.i iVar = lVar.f353056g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getObjType$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        int i17 = lVar.f353053d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getObjType$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        int b17 = pa4.l.b(lVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isMulti$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        boolean z17 = lVar.f353052c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isMulti$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        java.lang.String a17 = pa4.l.a(lVar);
        kotlin.jvm.internal.o.f(a17, "access$getLivePhotoUUId(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWorkHelper$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        pa4.o oVar = lVar.f353055f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWorkHelper$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        pa4.e eVar = new pa4.e(l2Var, d17, iVar, i17, b17, z17, a17, oVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$imgUploader$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$imgUploader$2");
        return eVar;
    }
}
