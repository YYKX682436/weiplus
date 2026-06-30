package hz3;

/* loaded from: classes12.dex */
public abstract class v {
    public static final hz3.t a(hz3.s checkRequest, int i17) {
        kotlin.jvm.internal.o.g(checkRequest, "checkRequest");
        hz3.t tVar = new hz3.t();
        boolean j17 = com.tencent.mm.vfs.w6.j(checkRequest.f286355b);
        android.graphics.Point point = checkRequest.f286356c;
        jz5.g gVar = hz3.i.f286332a;
        boolean z17 = false;
        if (point != null && point.x * point.y > i17) {
            z17 = true;
        }
        if (j17 && z17) {
            tVar.f286361a = 1;
        } else if (j17) {
            tVar.f286361a = 2;
        } else {
            tVar.f286361a = 3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageCDNCheckHelper", "checkImageValid imageSrc: %s, compressType: %d, imageSize: %s, imagePath: %s, fileExist: %s, checkResult: %s", java.lang.Integer.valueOf(checkRequest.f286354a), java.lang.Integer.valueOf(checkRequest.f286359f), checkRequest.f286356c, checkRequest.f286355b, java.lang.Boolean.valueOf(j17), java.lang.Integer.valueOf(tVar.f286361a));
        return tVar;
    }
}
