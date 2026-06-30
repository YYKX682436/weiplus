package g80;

/* loaded from: classes12.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s70.g f269467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p25.e f269468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s70.g gVar, p25.e eVar) {
        super(1);
        this.f269467d = gVar;
        this.f269468e = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", "parallelUploadImg[" + this.f269467d.f403944a + "] onUploadCancel");
        ((z25.d) this.f269468e).f();
        return jz5.f0.f302826a;
    }
}
