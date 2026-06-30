package oy4;

@j95.b
/* loaded from: classes5.dex */
public final class x extends i95.w implements ek0.e {

    /* renamed from: d, reason: collision with root package name */
    public static ny4.e f350085d;

    public final oy4.a Ai(java.lang.String imagePath) {
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        com.tencent.mars.xlog.Log.i("MicroMsg.OcrApiImpl", "getBufferImageData >> ".concat(imagePath));
        if (!com.tencent.mm.vfs.w6.j(imagePath)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OcrApiImpl", "file is no exists");
            return null;
        }
        android.graphics.Bitmap M = com.tencent.mm.sdk.platformtools.x.M(imagePath, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, true, null);
        if (M == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OcrApiImpl", "bitmap is null");
            return null;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(M.getByteCount());
        M.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int length = array.length / 4;
        int i17 = length * 3;
        byte[] bArr = new byte[i17];
        java.util.Iterator it = e06.p.m(0, length).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            int i18 = b17 * 3;
            int i19 = b17 * 4;
            bArr[i18] = array[i19];
            bArr[i18 + 1] = array[i19 + 1];
            bArr[i18 + 2] = array[i19 + 2];
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        allocateDirect.put(bArr);
        return new oy4.a(M, allocateDirect);
    }

    public java.util.ArrayList Bi(java.util.ArrayList imagePathList) {
        kotlin.jvm.internal.o.g(imagePathList, "imagePathList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (f350085d == null) {
            f350085d = new ny4.e();
        }
        java.util.Iterator it = imagePathList.iterator();
        while (true) {
            if (!it.hasNext()) {
                f350085d = null;
                return arrayList;
            }
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.OcrApiImpl", "getImageHash >> " + str);
            oy4.a Ai = Ai(str);
            java.nio.Buffer buffer = Ai != null ? Ai.f350052b : null;
            android.graphics.Bitmap bitmap = Ai != null ? Ai.f350051a : null;
            java.lang.String str2 = "";
            if (buffer == null || bitmap == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OcrApiImpl", "getImageHash >> buffer get error");
                arrayList.add("");
            } else {
                if (f350085d != null) {
                    str2 = com.tencent.wevision2.modules.hash.PHash.makeFromImage(new com.tencent.wevision2.base.PixelBuffer(bitmap.getWidth(), bitmap.getHeight(), 3, (java.nio.ByteBuffer) buffer)).value;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager", "getImageOcrHash >> result: " + str2);
                    kotlin.jvm.internal.o.d(str2);
                }
                arrayList.add(str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.OcrApiImpl", "getImageHash >> ".concat(str2));
            }
        }
    }

    public java.util.ArrayList Di(java.util.ArrayList imagePathList) {
        java.lang.String a17;
        kotlin.jvm.internal.o.g(imagePathList, "imagePathList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!Ni()) {
            return arrayList;
        }
        java.util.Iterator it = imagePathList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.OcrApiImpl", "getImageOcrResult >> " + str);
            oy4.a Ai = Ai(str);
            java.nio.Buffer buffer = Ai != null ? Ai.f350052b : null;
            android.graphics.Bitmap bitmap = Ai != null ? Ai.f350051a : null;
            java.lang.String str2 = "";
            if (buffer == null || bitmap == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OcrApiImpl", "getImageOcrResult >> buffer get error");
                arrayList.add("");
            } else {
                ny4.e eVar = f350085d;
                if (eVar != null && (a17 = eVar.a(buffer, bitmap.getWidth(), bitmap.getHeight())) != null) {
                    str2 = a17;
                }
                arrayList.add(str2);
            }
        }
        wi();
        return arrayList;
    }

    public final boolean Ni() {
        if (f350085d != null) {
            return true;
        }
        ny4.e eVar = new ny4.e();
        f350085d = eVar;
        boolean e17 = eVar.e(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.OcrApiImpl", "initEnv >> " + e17);
        return e17;
    }

    public final void wi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OcrApiImpl", "destroyEnv");
        ny4.e eVar = f350085d;
        if (eVar != null) {
            eVar.c();
        }
        f350085d = null;
    }
}
