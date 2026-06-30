package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class z2 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f201599h = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f201600a;

    /* renamed from: b, reason: collision with root package name */
    public int f201601b;

    /* renamed from: c, reason: collision with root package name */
    public int f201602c;

    /* renamed from: d, reason: collision with root package name */
    public long f201603d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f201604e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f201605f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f201606g = 0;

    public static void a(java.lang.String str, int i17, int i18, int i19) {
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && i17 != 0 && i18 != 0) {
                java.util.HashMap hashMap = f201599h;
                com.tencent.mm.ui.chatting.gallery.z2 z2Var = (com.tencent.mm.ui.chatting.gallery.z2) hashMap.get(str);
                if (z2Var == null) {
                    z2Var = new com.tencent.mm.ui.chatting.gallery.z2();
                    z2Var.f201603d = java.lang.System.currentTimeMillis();
                    hashMap.put(str, z2Var);
                }
                z2Var.f201602c = i18;
                z2Var.f201601b = i17;
                z2Var.f201605f += "" + i19 + "|";
                if (i19 > 0) {
                    if (z2Var.f201604e == 0) {
                        z2Var.f201604e = i19;
                    }
                } else if (z2Var.f201604e != 0) {
                    z2Var.f201606g++;
                    z2Var.f201604e = 0;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryHolderImage", "dkprog addBit: [%d,%d,%d] succ:%d change:%d str:%s file:%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(z2Var.f201604e), java.lang.Integer.valueOf(z2Var.f201606g), z2Var.f201605f, str);
            }
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryHolderImage", "get useopt  addBit :%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
        }
    }
}
