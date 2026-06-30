package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class x2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200198b;

    public x2(com.tencent.mm.ui.chatting.component.y2 y2Var, java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        this.f200197a = str;
        this.f200198b = f9Var;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        com.tencent.mm.storage.f9 f9Var = this.f200198b;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.f200197a;
        java.lang.Object obj = "null";
        objArr[1] = bitmap == null ? "null" : java.lang.Integer.valueOf(bitmap.getByteCount());
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg callBack cover:%s, result:%s", objArr);
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg result is not null");
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            if (byteArray != null) {
                obj = java.lang.Integer.valueOf(byteArray.length);
            }
            objArr2[0] = obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg bytes：%s", objArr2);
            if (byteArray == null || byteArray.length <= 0) {
                return;
            }
            java.lang.String B = com.tencent.mm.pluginsdk.model.app.k0.B(f9Var, byteArray, false, android.graphics.Bitmap.CompressFormat.PNG, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "downloadCoverImg thumbData path:" + B);
            if (com.tencent.mm.sdk.platformtools.t8.K0(B)) {
                return;
            }
            ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).Ai(java.lang.String.valueOf(f9Var.I0()), B);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e17, "", new java.lang.Object[0]);
        }
    }
}
