package hp0;

/* loaded from: classes10.dex */
public class d extends hp0.i {

    /* renamed from: b, reason: collision with root package name */
    public final hp0.h f282908b;

    public d(byte[] bArr, java.lang.String str, hp0.h hVar) {
        super(bArr);
        this.f282908b = hVar;
    }

    @Override // hp0.i
    public jp0.f a() {
        return this.f282908b.a(this.f282914a);
    }

    @Override // hp0.i
    public void b(java.io.OutputStream stream) {
        byte[] data = (byte[]) this.f282914a;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(stream, "stream");
        try {
            stream.write(data);
        } catch (android.system.ErrnoException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Loader.DiskFunction", e17, "", new java.lang.Object[0]);
        }
    }
}
