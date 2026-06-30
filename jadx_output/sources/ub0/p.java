package ub0;

@j95.b
/* loaded from: classes7.dex */
public final class p extends i95.w implements ub0.o {
    public boolean Ai(java.lang.String filePath) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(com.tencent.mm.vfs.w6.i(filePath, false));
        if (n07 == null || (str = n07.outMimeType) == null) {
            return false;
        }
        return r26.i0.n(str, "jpeg", false) || r26.i0.n(str, "jpg", false) || r26.i0.n(str, "png", false) || r26.i0.n(str, "heic", false);
    }

    public int wi(java.lang.String scrFile, java.lang.String dstFile) {
        kotlin.jvm.internal.o.g(scrFile, "scrFile");
        kotlin.jvm.internal.o.g(dstFile, "dstFile");
        if (com.tencent.mm.vfs.w6.j(dstFile)) {
            com.tencent.mm.vfs.w6.h(dstFile);
        }
        int DelPrivateExifInPicFile = com.tencent.mm.plugin.voip.model.PhotoSdkJni.DelPrivateExifInPicFile(com.tencent.mm.vfs.w6.i(scrFile, false), dstFile);
        ub0.n[] nVarArr = ub0.n.f426002d;
        if (DelPrivateExifInPicFile != 0 || com.tencent.mm.vfs.w6.j(dstFile)) {
            return DelPrivateExifInPicFile;
        }
        ub0.n[] nVarArr2 = ub0.n.f426002d;
        return 10001;
    }
}
