package yf;

/* loaded from: classes7.dex */
public class b1 implements zf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461310a;

    public b1(yf.i0 i0Var) {
        this.f461310a = i0Var;
    }

    @Override // zf.b
    public void b(java.lang.String str, java.lang.String str2) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
        yf.i0 i0Var = this.f461310a;
        if (!K0) {
            final java.lang.String a17 = kk.w.a(str2, false);
            com.tencent.mars.xlog.Log.i(i0Var.x(), "convertBackgroundImageToLocalPath, targetPath:%s", a17);
            i0Var.G(new java.lang.Runnable() { // from class: yf.b1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yf.i0 i0Var2 = yf.b1.this.f461310a;
                    if (i0Var2.f461362i != null) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE, a17);
                        i0Var2.f461362i.g(bundle);
                    }
                }
            });
            return;
        }
        com.tencent.mars.xlog.Log.i(i0Var.x(), "convertBackgroundImageToLocalPath, url: %s, localPath: %s", str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (str == null) {
                return;
            }
            i0Var.G(new java.lang.Runnable() { // from class: yf.b1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    yf.b1 b1Var = yf.b1.this;
                    b1Var.getClass();
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE, "");
                    b1Var.f461310a.f461362i.g(bundle);
                }
            });
        } else if (i0Var.f461364n != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", str);
            ((bg1.q) i0Var.f461364n).b(i0Var.f252497d, jc1.g.f298941m, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "load background image fail", hashMap);
        }
    }
}
