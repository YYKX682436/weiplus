package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes13.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f162443d = new java.lang.ref.WeakReference(null);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.model.s f162444e;

    public r(com.tencent.mm.plugin.sight.decode.model.s sVar, com.tencent.mm.plugin.sight.decode.model.b bVar) {
        this.f162444e = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.f162444e;
        try {
            sVar.getClass();
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Integer.valueOf(sVar.hashCode());
            objArr[1] = java.lang.Integer.valueOf(hashCode());
            sVar.getClass();
            objArr[2] = true;
            objArr[3] = java.lang.Boolean.valueOf(sVar.f162453i == null);
            objArr[4] = java.lang.Boolean.valueOf(this.f162443d.get() == null);
            sVar.getClass();
            objArr[5] = true;
            com.tencent.mars.xlog.Log.w("MicroMsg.SightPlayController", "#0x%x-#0x%x want draw thumb, but surface status error, surface null ? %B, thumb bgView null ? %B, thumb null ? %B, mask null ? %B", objArr);
            sVar.getClass();
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f162443d.get();
            java.lang.ref.WeakReference weakReference = sVar.f162453i;
            android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
            if (view != null && bitmap != null && !bitmap.isRecycled()) {
                view.post(new com.tencent.mm.plugin.sight.decode.model.q(this, view, bitmap));
                return;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = java.lang.Boolean.valueOf(view == null);
            objArr2[1] = java.lang.Boolean.valueOf(bitmap == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayController", "bgView:%B, thumb:%B", objArr2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e17, "", new java.lang.Object[0]);
        }
    }
}
