package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class i1 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.m1 f201014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f201016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f201017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f201018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f201019f;

    public i1(ot0.m1 m1Var, com.tencent.mm.storage.f9 f9Var, java.lang.ref.WeakReference weakReference, int i17, t21.v2 v2Var, boolean z17) {
        this.f201014a = m1Var;
        this.f201015b = f9Var;
        this.f201016c = weakReference;
        this.f201017d = i17;
        this.f201018e = v2Var;
        this.f201019f = z17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Imagegallery.handler.video", "MP_VIDEO_ERROR  end do exchange video link fail %d/%d %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "MP_VIDEO  end do exchange video link success");
        r45.gl3 resp = (r45.gl3) oVar.f70711b.f70700a;
        com.tencent.mm.ui.chatting.gallery.eb ebVar = com.tencent.mm.ui.chatting.gallery.eb.f200902a;
        ot0.m1 m1Var = this.f201014a;
        com.tencent.mm.storage.f9 f9Var = this.f201015b;
        java.lang.String key = m1Var.c(f9Var.z0());
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("MpShareVideoPlayInfo");
        R.A(key.concat("VideoSize"), resp.f375332g);
        R.A(key.concat("block"), resp.f375330e);
        R.D(key.concat("errMsg"), resp.f375331f);
        c01.l2 c17 = c01.n2.d().c(key, true);
        c17.k("PlayUrl", resp.f375329d);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!android.text.TextUtils.isEmpty("SaveTime")) {
            ((c01.k2) c17.f37305a).put("SaveTime", java.lang.Long.valueOf(currentTimeMillis));
        }
        java.lang.ref.WeakReference weakReference = this.f201016c;
        if (weakReference.get() != null) {
            com.tencent.mm.ui.chatting.gallery.k1 k1Var = ((com.tencent.mm.ui.chatting.gallery.j1) weakReference.get()).f200886d;
            if ((k1Var == null || (imageGalleryUI = k1Var.f201092g) == null) ? true : imageGalleryUI.isFinishing()) {
                return;
            }
            com.tencent.mm.ui.chatting.gallery.j1 j1Var = (com.tencent.mm.ui.chatting.gallery.j1) weakReference.get();
            int i19 = this.f201017d;
            com.tencent.mm.ui.chatting.gallery.ta k17 = j1Var.k(i19);
            int i27 = resp.f375330e;
            t21.v2 v2Var = this.f201018e;
            if (i27 == 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Imagegallery.handler.video", "doGetPlayUrl block %s", resp.f375331f);
                j1Var.y(j1Var.k(i19));
                com.tencent.mm.vfs.w6.h(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false));
                v2Var.f415011i = 111;
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().C(v2Var);
                if (j1Var.f200886d.v() == k17) {
                    j1Var.x(k17, resp.f375331f);
                    return;
                }
                return;
            }
            boolean z17 = this.f201019f;
            if (!z17) {
                v2Var.f415015m = resp.f375332g;
                v2Var.E.f387333d = resp.f375329d;
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().C(v2Var);
            }
            if (z17 || j1Var.f200886d.v() != k17 || j1Var.f200886d.f201092g.z8()) {
                return;
            }
            j1Var.A(f9Var, i19);
        }
    }
}
