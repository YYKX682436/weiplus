package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes4.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f201571f;

    public y1(com.tencent.mm.storage.f9 f9Var, java.lang.String str, t21.v2 v2Var) {
        this.f201569d = f9Var;
        this.f201570e = str;
        this.f201571f = v2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.t0 t0Var;
        com.tencent.mm.storage.f9 f9Var = this.f201569d;
        try {
            boolean R4 = com.tencent.mm.storage.z3.R4(f9Var.Q0());
            com.tencent.mm.app.s0 s0Var = com.tencent.mm.app.s0.VIDEO;
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
            qc0.d1 b17 = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a.b(this.f201570e);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryAdapter", "[-] Fail to get video data info, skip reporting. msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()));
                return;
            }
            t21.v2 v2Var = this.f201571f;
            java.util.Map d17 = v2Var != null ? com.tencent.mm.sdk.platformtools.aa.d(v2Var.g(), "msg", null) : java.util.Collections.emptyMap();
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryAdapter", "[-] Fail to parse recv xml. msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()));
                return;
            }
            t0Var.f53781d = f9Var.I0();
            java.lang.String str = (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            t0Var.f53783f = str;
            t0Var.f53784g = b17.f361363a;
            t0Var.f53785h = b17.f361364b;
            java.lang.String str3 = (java.lang.String) d17.get(".msg.videomsg.$cdnthumburl");
            if (str3 == null) {
                str3 = "";
            }
            t0Var.f53786i = str3;
            t0Var.f53787j = (int) b17.f361366d;
            java.lang.String str4 = (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl");
            if (str4 == null) {
                str4 = "";
            }
            t0Var.f53788k = str4;
            java.lang.String str5 = (java.lang.String) d17.get(".msg.videomsg.$aeskey");
            if (str5 == null) {
                str5 = "";
            }
            t0Var.f53789l = str5;
            java.lang.String str6 = (java.lang.String) d17.get(".msg.videomsg.$md5");
            if (str6 != null) {
                str2 = str6;
            }
            t0Var.f53790m = str2;
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
