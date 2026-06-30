package l21;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public long f315202a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f315203b;

    public a(long j17) {
        this.f315203b = 0L;
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.EncEngine", "init  key  enckey " + valueOf + "  hashcode " + hashCode());
        this.f315203b = com.tencent.mm.plugin.imgenc.MMIMAGEENCJNI.open(valueOf);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.EncEngine", "mNativePtr " + this.f315203b + " " + hashCode());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EncEngine", "exception " + e17.getMessage());
        }
    }
}
