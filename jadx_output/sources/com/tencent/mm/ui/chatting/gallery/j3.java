package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class j3 implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f201056d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f201057e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f201059g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.k3 f201060h;

    public j3(com.tencent.mm.ui.chatting.gallery.k3 k3Var, java.lang.String str, int i17) {
        this.f201060h = k3Var;
        this.f201058f = str;
        this.f201059g = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        android.view.View view;
        com.tencent.mm.ui.chatting.gallery.k3 k3Var = this.f201060h;
        if (k3Var.f201129m != null) {
            java.lang.String str = this.f201058f;
            if (!android.text.TextUtils.isEmpty(str)) {
                try {
                    if (k3Var.f201125f.containsKey(str)) {
                        int intValue = ((java.lang.Integer) k3Var.f201125f.get(str)).intValue();
                        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) k3Var.f201124e.get(intValue);
                        if (weakReference != null && (view = (android.view.View) weakReference.get()) != null && (view instanceof com.tencent.mm.ui.base.WxImageView)) {
                            java.lang.String str2 = (java.lang.String) k3Var.f201128i.get(intValue);
                            this.f201057e = true;
                            k3Var.f201139w.post(new com.tencent.mm.ui.chatting.gallery.i3(this, view, str2));
                            return true;
                        }
                    }
                    ((com.tencent.mm.ui.chatting.gallery.t2) k3Var.f201129m).getClass();
                    this.f201056d = com.tencent.mm.ui.chatting.gallery.t2.r(str);
                    return true;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryLazyLoader", "try to load Bmp fail: %s", e17.getMessage());
                    this.f201056d = null;
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        int i17;
        com.tencent.mm.ui.chatting.gallery.k3 k3Var = this.f201060h;
        k3Var.f201140x = false;
        if (!this.f201057e) {
            java.util.HashMap hashMap = k3Var.f201125f;
            java.lang.String str = this.f201058f;
            if (hashMap.containsKey(str)) {
                int intValue = ((java.lang.Integer) hashMap.get(str)).intValue();
                if (k3Var.f201129m != null || k3Var.f201130n == 0) {
                    k3Var.a(intValue, this.f201056d);
                } else {
                    k3Var.f201127h.put(intValue, this.f201056d);
                }
            }
            k3Var.h(str, this.f201056d);
            k3Var.d(this.f201059g, this.f201056d);
            java.lang.Object[] objArr = new java.lang.Object[1];
            android.graphics.Bitmap bitmap = this.f201056d;
            if (bitmap == null || bitmap.isRecycled()) {
                i17 = 0;
            } else {
                i17 = bitmap.getByteCount();
                if (i17 < 0) {
                    throw new java.lang.IllegalStateException("Negative size: " + bitmap);
                }
            }
            objArr[0] = java.lang.Integer.valueOf(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryLazyLoader", "bmp size : %s", objArr);
            this.f201056d = null;
        }
        k3Var.g();
        return false;
    }
}
