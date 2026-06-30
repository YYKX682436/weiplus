package dk5;

/* loaded from: classes9.dex */
public class x4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f234992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a f234994g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234995h;

    public x4(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, java.lang.String str, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.util.List list, com.tencent.mm.pluginsdk.model.app.a aVar) {
        this.f234995h = sendAppMessageWrapperUI;
        this.f234991d = str;
        this.f234992e = wXMediaMessage;
        this.f234993f = list;
        this.f234994g = aVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2 = this.f234991d;
        if (i17 == 0 && hVar != null && hVar.field_retCode == 0) {
            android.graphics.Bitmap bitmap = null;
            try {
                if (com.tencent.mm.vfs.w6.j(str2)) {
                    java.io.InputStream E = com.tencent.mm.vfs.w6.E(str2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(E);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/transmit/SendAppMessageWrapperUI$17", "callback", "(Ljava/lang/String;ILcom/tencent/mm/cdn/keep_ProgressInfo;Lcom/tencent/mm/cdn/keep_SceneResult;Z)I", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
                    yj0.a.e(obj, decodeStream, "com/tencent/mm/ui/transmit/SendAppMessageWrapperUI$17", "callback", "(Ljava/lang/String;ILcom/tencent/mm/cdn/keep_ProgressInfo;Lcom/tencent/mm/cdn/keep_SceneResult;Z)I", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                    bitmap = decodeStream;
                }
            } catch (java.io.FileNotFoundException unused) {
            }
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f234992e;
            if (bitmap != null) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
            }
            int i18 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
            this.f234995h.h7(this.f234993f, wXMediaMessage, this.f234994g);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
