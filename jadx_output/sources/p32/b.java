package p32;

/* loaded from: classes12.dex */
public class b implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f351458d = null;

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (hVar == null || !str.equals(this.f351458d)) {
            return 0;
        }
        if (i17 != 0 || hVar.field_retCode != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExdevicePictureUploader", "hy: transfer done, fail");
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdevicePictureUploader", "transfer done, mediaid=%s, completeInfo=%s", str, hVar.toString());
        r32.a aVar = new r32.a();
        aVar.field_championUrl = hVar.field_fileUrl;
        aVar.field_username = c01.z1.r();
        java.lang.String str2 = aVar.field_championUrl;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !"#".equals(str2)) {
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes());
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(p32.c.f351459a);
            if (!r6Var.m() || !r6Var.y()) {
                r6Var.J();
            }
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, b17);
            if (r6Var2.m()) {
                r6Var2.o();
            } else {
                try {
                    r6Var2.k();
                } catch (java.io.IOException e17) {
                    e17.toString();
                }
                gm0.j1.e().j(new p32.a(str2, r6Var2));
            }
        }
        com.tencent.mm.plugin.exdevice.model.l3.wi().z0(aVar, true);
        q32.c cj6 = com.tencent.mm.plugin.exdevice.model.l3.cj();
        java.lang.String str3 = aVar.field_championUrl;
        java.lang.String str4 = aVar.field_championMotto;
        cj6.getClass();
        gm0.j1.n().f273288b.g(new p32.p(str3, str4));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
