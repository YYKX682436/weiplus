package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.u0.class)
/* loaded from: classes12.dex */
public class oc extends com.tencent.mm.ui.chatting.component.a implements sb5.u0, k70.w, y60.e {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f199635h;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199636e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f199637f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.k4 f199638g;

    public oc() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f199636e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.GetImageComponent$1
            {
                this.__eventId = -1102125916;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent chattingUIPhotoInfoEvent) {
                am.j2 j2Var;
                boolean z17;
                boolean z18;
                com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView;
                android.view.View D;
                com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent chattingUIPhotoInfoEvent2 = chattingUIPhotoInfoEvent;
                if (chattingUIPhotoInfoEvent2 instanceof com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent) {
                    com.tencent.mm.storage.f9 f9Var = chattingUIPhotoInfoEvent2.f54044g.f6895a;
                    com.tencent.mm.ui.chatting.component.oc ocVar = com.tencent.mm.ui.chatting.component.oc.this;
                    if (f9Var == null) {
                        ocVar.getClass();
                    } else {
                        int firstVisiblePosition = ocVar.f198580d.p().getFirstVisiblePosition();
                        int lastVisiblePosition = ocVar.f198580d.p().getLastVisiblePosition();
                        int max = java.lang.Math.max(firstVisiblePosition, 0);
                        int max2 = java.lang.Math.max(lastVisiblePosition, 0);
                        if (max < 0 || max2 >= ocVar.f198580d.p().s().getCount()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.GetImageComponent", "invalid position [%d - %d], cnt: %d", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(ocVar.f198580d.p().s().getCount()));
                        } else {
                            java.lang.String b17 = ic5.f.f290437c.b(f9Var);
                            int i17 = max;
                            while (true) {
                                j2Var = chattingUIPhotoInfoEvent2.f54045h;
                                if (i17 > max2) {
                                    break;
                                }
                                com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) ocVar.f198580d.p().s().getItem(i17);
                                if (f9Var2 != null) {
                                    java.lang.String b18 = ic5.f.f290437c.b(f9Var2);
                                    int length = b17.length();
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= length) {
                                            z17 = true;
                                            break;
                                        }
                                        int codePointAt = b17.codePointAt(i18);
                                        if (!java.lang.Character.isWhitespace(codePointAt)) {
                                            z17 = false;
                                            break;
                                        }
                                        i18 += java.lang.Character.charCount(codePointAt);
                                    }
                                    if (!z17 && b17.equals(b18)) {
                                        android.view.View C = ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) ocVar.f198580d.f460718m).C0().C(i17, max);
                                        if (C == null || (chattingMediaGroupMvvmView = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView) C.findViewById(com.tencent.mm.R.id.sr8)) == null || (D = chattingMediaGroupMvvmView.D(f9Var)) == null) {
                                            z18 = false;
                                        } else {
                                            int[] iArr = new int[2];
                                            D.getLocationOnScreen(iArr);
                                            j2Var.f6999a = iArr[0];
                                            j2Var.f7000b = iArr[1];
                                            j2Var.f7001c = D.getWidth();
                                            j2Var.f7002d = D.getHeight();
                                            j2Var.f7003e = i65.a.h(ocVar.f198580d.g(), com.tencent.mm.R.dimen.f479738dv);
                                            j2Var.f7004f = D;
                                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.GetImageComponent", "getMediaGroupPhotoInfo, topView: %s", java.lang.Integer.valueOf(D.hashCode()));
                                            z18 = true;
                                        }
                                        if (z18) {
                                        }
                                    }
                                    if (f9Var2.getMsgId() == f9Var.getMsgId()) {
                                        android.view.View C2 = ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) ocVar.f198580d.f460718m).C0().C(i17, max);
                                        if (C2 == null) {
                                            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.GetImageComponent", "[getPhotoInfo] getChildAt(%d)", java.lang.Integer.valueOf((i17 - max) + ocVar.f198580d.m()));
                                        } else {
                                            android.view.View findViewById = (f9Var.J2() || f9Var.isVideo() || f9Var.Y2() || f9Var.M2()) ? C2.findViewById(com.tencent.mm.R.id.bkg) : f9Var.o2() ? C2.findViewById(com.tencent.mm.R.id.bjs) : null;
                                            if (findViewById != null) {
                                                int[] iArr2 = new int[2];
                                                findViewById.getLocationOnScreen(iArr2);
                                                j2Var.f6999a = iArr2[0];
                                                j2Var.f7000b = iArr2[1];
                                                j2Var.f7001c = findViewById.getWidth();
                                                j2Var.f7002d = findViewById.getHeight();
                                                j2Var.f7003e = i65.a.h(ocVar.f198580d.g(), com.tencent.mm.R.dimen.f479646bl);
                                                j2Var.f7004f = findViewById;
                                                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.GetImageComponent", "getPhotoInfo img: %s", java.lang.Integer.valueOf(findViewById.hashCode()));
                                            }
                                        }
                                    }
                                }
                                i17++;
                            }
                            if (!com.tencent.mm.ui.chatting.component.oc.f199635h) {
                                j2Var.f7004f = null;
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f199637f = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.chatting.component.jc(this), false);
        this.f199638g = com.tencent.mm.ui.chatting.gallery.j4.f201061a;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        this.f199636e.alive();
        ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).getClass();
        f199635h = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupDragAnimChangeVisibility()) == 1;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        this.f199637f.d();
        this.f199636e.dead();
        com.tencent.mm.ui.chatting.gallery.k4 k4Var = this.f199638g;
        k4Var.f201143c.clear();
        ((lt0.f) k4Var.f201141a).c(new com.tencent.mm.ui.chatting.gallery.i4(k4Var));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        this.f199637f.d();
        this.f199636e.dead();
        com.tencent.mm.ui.chatting.gallery.k4 k4Var = this.f199638g;
        k4Var.f201143c.clear();
        ((lt0.f) k4Var.f201141a).c(new com.tencent.mm.ui.chatting.gallery.i4(k4Var));
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        yb5.d dVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || bitmap == null || (dVar = this.f198580d) == null) {
            return;
        }
        dVar.q().post(new com.tencent.mm.ui.chatting.component.kc(this));
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        if (!iq3.a.a()) {
            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).d(this);
        }
        boolean z17 = i19 == 0 && i27 == 0;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Bi(j18, str, z17, false);
        ((fq3.n) ((gq3.e) i95.n0.c(gq3.e.class))).f265540y.a(j17, j18, z17);
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j18);
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class));
        java.util.HashMap hashMap = (java.util.HashMap) kVar.Q;
        if (hashMap.containsKey(java.lang.Long.valueOf(j18))) {
            if (((java.util.HashMap) kVar.R).containsKey(java.lang.Long.valueOf(j18))) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(java.lang.Long.valueOf(j18));
                android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
                if (view != null) {
                    java.lang.Object tag = view.getTag();
                    if (tag instanceof ze5.w6) {
                        android.app.Activity g17 = kVar.K.g();
                        ze5.w6 w6Var = (ze5.w6) tag;
                        if (true != z17) {
                            return;
                        }
                        j15.a ij6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).ij(Li);
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b1.Di().y4(Li, w6Var.f472284c.getMainContentIv(), Li.z0(), i65.a.g(g17), ij6.q(), ij6.n(), true, com.tencent.mm.R.drawable.bzt, w6Var.f472284c.holder.c(), com.tencent.mm.R.drawable.bgu, 1, true, null);
                    }
                }
            }
        }
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        n11.a.b().n(i17);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f199637f;
        if (i17 == 0) {
            b4Var.d();
            b4Var.c(1000L, 1000L);
        } else if (i17 == 2) {
            b4Var.d();
        }
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Bi(j18, str, false, true);
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent();
        am.ao aoVar = pauseAutoGetBigImgEvent.f54607g;
        aoVar.f6172a = true;
        aoVar.f6173b = this.f198580d.u().d1();
        pauseAutoGetBigImgEvent.b(android.os.Looper.getMainLooper());
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.a(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent();
        am.ao aoVar = pauseAutoGetBigImgEvent.f54607g;
        aoVar.f6172a = false;
        aoVar.f6173b = this.f198580d.u().d1();
        pauseAutoGetBigImgEvent.b(android.os.Looper.getMainLooper());
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.e(this);
        this.f199637f.d();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
    }
}
