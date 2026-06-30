package hy4;

/* loaded from: classes5.dex */
public class k implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy4.m f286121d;

    public k(hy4.m mVar, hy4.j jVar) {
        this.f286121d = mVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        synchronized (this.f286121d) {
            if (hVar != null) {
                if (hVar.field_retCode == 0 && i17 == 0) {
                    java.lang.String str2 = (java.lang.String) ((java.util.HashMap) this.f286121d.f286168b).get(str);
                    if (!this.f286121d.f286171e.equals(str2)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.VestImgUploadEngine", "currentPath=%s,callbackPath=%s, path updated after CDNTaskCallback", this.f286121d.f286171e, str2);
                        return 0;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.VestImgUploadEngine", "CDN upload success, file url = %s", hVar.field_fileUrl);
                    gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.a1(hVar.field_fileUrl, this.f286121d.f286170d, str2));
                    return 0;
                }
            }
            return 0;
        }
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
