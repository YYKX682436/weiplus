package ny4;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ny4.h f341467a = new ny4.h();

    public final oy4.a a(java.lang.String imagePath) {
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        com.tencent.mars.xlog.Log.i("MicroMsg.WeImageUtils", "getBufferImageData >> ".concat(imagePath));
        if (!com.tencent.mm.vfs.w6.j(imagePath)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeImageUtils", "file is no exists");
            return null;
        }
        android.graphics.Bitmap M = com.tencent.mm.sdk.platformtools.x.M(imagePath, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, true, null);
        if (M == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeImageUtils", "bitmap is null");
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
}
