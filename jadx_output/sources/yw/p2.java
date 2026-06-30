package yw;

/* loaded from: classes.dex */
public final class p2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f466424b;

    public p2(java.lang.String str, yz5.l lVar) {
        this.f466423a = str;
        this.f466424b = lVar;
    }

    @Override // k70.u
    public final void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        java.lang.String str = this.f466423a;
        yz5.l lVar = this.f466424b;
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizFlutterShareMsgHelper", "downloadImage result is null");
            if (lVar != null) {
                lVar.invoke(null);
                return;
            }
            return;
        }
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
            if (lVar != null) {
                lVar.invoke(str);
            }
        } catch (java.io.IOException e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadImage save image cause io exception:");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(com.tencent.mm.sdk.platformtools.z3.c(e17));
            com.tencent.mars.xlog.Log.e("MicroMsg.BizFlutterShareMsgHelper", sb6.toString());
            if (lVar != null) {
                lVar.invoke(null);
            }
        } catch (java.lang.Exception e18) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("downloadImage save image cause exception:");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb7.append(com.tencent.mm.sdk.platformtools.z3.c(e18));
            com.tencent.mars.xlog.Log.e("MicroMsg.BizFlutterShareMsgHelper", sb7.toString());
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }
}
