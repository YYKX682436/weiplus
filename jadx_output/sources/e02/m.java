package e02;

/* loaded from: classes8.dex */
public abstract class m {
    public static byte[] a(com.tencent.mm.vfs.r6 r6Var) {
        java.lang.String o17 = r6Var.o();
        byte[] bArr = null;
        if (o17 != null && o17.length() > 0) {
            java.io.RandomAccessFile A = com.tencent.mm.vfs.w6.A(com.tencent.mm.vfs.z7.a(o17), false);
            if (A.length() == 0) {
                A.close();
                com.tencent.mars.xlog.Log.i("MicroMsg.Channel.ZipEocdCommentTool", "apk file length is zero");
            } else {
                try {
                    bArr = e02.o.a(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(o17)));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Channel.ZipEocdCommentTool", "readComment, error: %s", e17.getMessage());
                }
                A.close();
            }
        }
        return bArr;
    }
}
