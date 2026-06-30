package ek4;

/* loaded from: classes12.dex */
public final class e implements dn.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253640d;

    public e(ek4.s sVar) {
        this.f253640d = sVar;
    }

    @Override // dn.f
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.f
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        ek4.s sVar = this.f253640d;
        ek4.s.a(sVar);
        if (str == null || !sVar.f253686b.containsKey(str)) {
            return 0;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.c(sVar, str, gVar, str, hVar));
        return 1;
    }

    @Override // dn.f
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }

    @Override // dn.f
    public int x(java.lang.String str, dn.h hVar) {
        ek4.s sVar = this.f253640d;
        ek4.s.a(sVar);
        if (str == null || !sVar.f253686b.containsKey(str)) {
            return 0;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.d(sVar, str, hVar, str));
        return 1;
    }
}
