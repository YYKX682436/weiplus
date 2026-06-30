package dn;

/* loaded from: classes10.dex */
public final class d implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public dn.k f241763d;

    public d(dn.k kVar) {
        this.f241763d = kVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        dn.k kVar = this.f241763d;
        if (kVar != null) {
            kVar.O(str, byteArrayOutputStream);
        }
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        dn.k kVar = this.f241763d;
        if (kVar != null) {
            return kVar.r4(str, i17, gVar, hVar, z17);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        dn.k kVar = this.f241763d;
        byte[] w17 = kVar != null ? kVar.w(str, bArr) : null;
        return w17 == null ? new byte[0] : w17;
    }
}
