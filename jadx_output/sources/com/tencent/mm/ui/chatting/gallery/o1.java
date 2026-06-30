package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes4.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m11.b0 f201234f;

    public o1(java.lang.String str, com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var) {
        this.f201232d = str;
        this.f201233e = f9Var;
        this.f201234f = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.t0 t0Var;
        java.lang.String str = this.f201232d;
        try {
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
            com.tencent.mm.storage.f9 f9Var = this.f201233e;
            if (n07 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryAdapter", "[-] Fail to get bmp opts. msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()));
                return;
            }
            boolean R4 = com.tencent.mm.storage.z3.R4(f9Var.Q0());
            com.tencent.mm.app.s0 s0Var = com.tencent.mm.app.s0.IMAGE;
            if (R4) {
                t0Var = new com.tencent.mm.app.t0(2, s0Var, null);
                if (f9Var.A0() == 1) {
                    t0Var.f53779b = c01.z1.r();
                    t0Var.f53780c = f9Var.Q0();
                } else {
                    t0Var.f53779b = c01.w9.s(f9Var.j());
                    t0Var.f53780c = f9Var.Q0();
                }
            } else {
                t0Var = new com.tencent.mm.app.t0(1, s0Var, null);
                if (f9Var.A0() == 1) {
                    t0Var.f53779b = c01.z1.r();
                    t0Var.f53780c = f9Var.Q0();
                } else {
                    t0Var.f53779b = f9Var.Q0();
                    t0Var.f53780c = c01.z1.r();
                }
            }
            java.lang.String[] ej6 = fo3.s.INSTANCE.ej(str);
            java.lang.String str2 = "";
            java.lang.String str3 = ej6 != null ? ej6[0] : "";
            m11.b0 b0Var = this.f201234f;
            java.util.Map d17 = b0Var != null ? com.tencent.mm.sdk.platformtools.aa.d(b0Var.f322652t, "msg", null) : java.util.Collections.emptyMap();
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryAdapter", "[-] Fail to parse cdn info. msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()));
                return;
            }
            java.lang.String str4 = b0Var.f322640h == 1 ? (java.lang.String) d17.get(".msg.img.$cdnbigimgurl") : (java.lang.String) d17.get(".msg.img.$cdnmidimgurl");
            t0Var.f53781d = f9Var.I0();
            t0Var.f53783f = str4 == null ? "" : str4;
            t0Var.f53784g = n07.outWidth;
            t0Var.f53785h = n07.outHeight;
            java.lang.String str5 = (java.lang.String) d17.get(".msg.img.$cdnthumburl");
            if (str5 == null) {
                str5 = "";
            }
            t0Var.f53786i = str5;
            if (str4 == null) {
                str4 = "";
            }
            t0Var.f53788k = str4;
            java.lang.String str6 = (java.lang.String) d17.get(".msg.img.$aeskey");
            if (str6 != null) {
                str2 = str6;
            }
            t0Var.f53789l = str2;
            t0Var.f53790m = kk.k.e(str);
            t0Var.f53791n = str3;
            if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(f9Var.Q0());
                t0Var.f53792o = L0 != null ? ((java.util.LinkedList) L0).size() : 0;
            }
            com.tencent.mm.app.u0.a(t0Var);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImageGalleryAdapter", th6, "[-] Exception was thrown when report.", new java.lang.Object[0]);
        }
    }
}
