package da3;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da3.c f227761a;

    public b(da3.c cVar) {
        this.f227761a = cVar;
    }

    @Override // com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface
    public java.lang.String getFilePath(java.lang.String str) {
        boolean Kj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(str);
        da3.c cVar = this.f227761a;
        if (Kj) {
            java.lang.String zj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(cVar.f227765b, cVar.f227767d, str);
            if (com.tencent.mm.vfs.w6.j(zj6)) {
                return zj6;
            }
        } else {
            if (com.tencent.mm.vfs.w6.j(str)) {
                return str;
            }
            if (com.tencent.mm.vfs.w6.j(cVar.f227766c + str)) {
                return cVar.f227766c + str;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppAudioBinding", "LiteApp audio file not exist in %s", str);
        return "";
    }

    @Override // com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface
    public void onCallBack(long j17, java.lang.String str) {
    }
}
