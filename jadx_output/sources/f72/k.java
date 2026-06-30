package f72;

/* loaded from: classes12.dex */
public class k extends f72.j {
    public k(com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService faceUploadVideoService, android.content.Intent intent) {
        super(faceUploadVideoService, intent, null);
    }

    @Override // f72.j
    public com.tencent.mm.modelbase.m1 a(dn.h hVar) {
        return new c72.x(this.f260049f, this.f260047d, this.f260048e, hVar.field_fileId, hVar.field_aesKey);
    }
}
