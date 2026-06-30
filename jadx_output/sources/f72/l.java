package f72;

/* loaded from: classes12.dex */
public class l extends f72.j {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f260051h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f260052i;

    public l(com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService faceUploadVideoService, android.content.Intent intent) {
        super(faceUploadVideoService, intent, null);
        this.f260051h = intent.getStringExtra("k_ticket");
        this.f260052i = intent.getStringExtra("request_verify_pre_info");
    }

    @Override // f72.j
    public com.tencent.mm.modelbase.m1 a(dn.h hVar) {
        return gm0.j1.b().n() ? new c72.c0(this.f260049f, this.f260047d, this.f260048e, hVar.field_fileId, hVar.field_aesKey, this.f260051h, this.f260052i) : new c72.d0(this.f260049f, this.f260047d, this.f260048e, hVar.field_fileId, hVar.field_aesKey, this.f260051h, this.f260052i);
    }
}
