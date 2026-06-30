package f72;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult f260036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f72.b f260037e;

    public a(f72.b bVar, com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult faceResult) {
        this.f260037e = bVar;
        this.f260036d = faceResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult faceResult = this.f260036d;
        if (faceResult != null && faceResult.result == 0) {
            try {
                str = com.tencent.mm.plugin.facedetect.model.s0.h().concat("/release_out.fd");
                r45.mi miVar = new r45.mi();
                miVar.f380532d = com.tencent.mm.protobuf.g.b(faceResult.sidedata);
                miVar.f380533e = com.tencent.mm.protobuf.g.b(faceResult.data);
                com.tencent.mm.plugin.facedetect.model.s0.l(miVar.toByteArray(), str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceUtils", e17, "", new java.lang.Object[0]);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_face_result_code", 0);
            bundle.putString("key_face_result_file_path", str);
            com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService faceDetectProcessService = this.f260037e.f260038a;
            faceDetectProcessService.getClass();
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            obtain.setData(bundle);
            faceDetectProcessService.j(obtain);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceUtils", "face result is null or result code not 0");
        str = null;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("key_face_result_code", 0);
        bundle2.putString("key_face_result_file_path", str);
        com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService faceDetectProcessService2 = this.f260037e.f260038a;
        faceDetectProcessService2.getClass();
        android.os.Message obtain2 = android.os.Message.obtain();
        obtain2.what = 1;
        obtain2.setData(bundle2);
        faceDetectProcessService2.j(obtain2);
    }
}
