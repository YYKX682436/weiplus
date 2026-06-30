package hu4;

/* loaded from: classes9.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public long f285234a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f285235b = 0;

    public hu4.l a(byte[] bArr) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(bArr));
        try {
            this.f285234a = dataInputStream.readLong();
            this.f285235b = dataInputStream.readLong();
            dataInputStream.close();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TimeInfo", e17, "", new java.lang.Object[0]);
        }
        return this;
    }
}
