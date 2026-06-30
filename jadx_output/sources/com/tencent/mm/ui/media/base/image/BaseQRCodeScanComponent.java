package com.tencent.mm.ui.media.base.image;

/* loaded from: classes3.dex */
public class BaseQRCodeScanComponent extends lf3.n implements cg3.a, kd0.o2 {

    /* renamed from: d, reason: collision with root package name */
    public cg3.c f209124d;

    /* renamed from: e, reason: collision with root package name */
    public kd0.p2 f209125e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f209126f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f209127g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent$scanResultEventListener$1 f209128h;

    /* renamed from: i, reason: collision with root package name */
    public final oc5.g0 f209129i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f209130m;

    /* renamed from: n, reason: collision with root package name */
    public final oc5.o f209131n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent$scanResultEventListener$1] */
    public BaseQRCodeScanComponent(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f209127g = new java.util.HashMap();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f209128h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent$scanResultEventListener$1
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent event = recogQBarOfImageFileResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54661g.f6368a;
                if (str == null) {
                    str = "";
                }
                com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent baseQRCodeScanComponent = com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.this;
                cg3.d V6 = com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.V6(baseQRCodeScanComponent, event);
                if (V6 == null) {
                    com.tencent.mars.xlog.Log.i("MediaGallery.DefaultQRCodeScanComponent", "qrCode scan failed. rawPath: ".concat(str));
                    return false;
                }
                ((java.util.HashMap) baseQRCodeScanComponent.f209127g).put(str, V6);
                return false;
            }
        };
        this.f209129i = new oc5.g0(activity, true, "");
        this.f209130m = "";
        this.f209131n = new rh5.c(activity, this);
    }

    public static final cg3.d V6(com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent baseQRCodeScanComponent, com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent event) {
        android.view.View view;
        cg3.c cVar;
        android.graphics.Matrix a17;
        cg3.c cVar2 = baseQRCodeScanComponent.f209124d;
        if (cVar2 == null || (view = cVar2.getView()) == null || (cVar = baseQRCodeScanComponent.f209124d) == null || (a17 = cVar.a()) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.jvm.internal.o.g(event, "event");
        arrayList.clear();
        java.util.ArrayList a18 = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a.a(event);
        jz5.l a19 = com.tencent.mm.plugin.scanner.c0.a(baseQRCodeScanComponent.getContext(), view, a18, 0);
        return new cg3.d(event, a18, (java.util.ArrayList) a19.f302833d, (java.util.ArrayList) a19.f302834e, a17, null, 32, null);
    }

    @Override // cg3.a
    public void H1(mf3.k info, com.tencent.mm.ui.widget.dialog.k0 k0Var, db5.g4 g4Var) {
        sf3.g e17;
        java.util.List list;
        kotlin.jvm.internal.o.g(info, "info");
        if (g4Var == null || (e17 = info.e()) == null || info.getType() != mf3.u.f326123e) {
            return;
        }
        cg3.d dVar = (cg3.d) ((java.util.HashMap) this.f209127g).get(e17.c());
        if (dVar == null || (list = dVar.f41149c) == null) {
            return;
        }
        kd0.p2 p2Var = this.f209125e;
        if (p2Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            dg3.q qVar = dg3.q.f232341e;
            ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).e(arrayList, null, k0Var, g4Var, 3);
        }
        if (list.size() == 1) {
            com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) list.get(0);
            if (k0Var != null) {
                java.lang.ref.WeakReference weakReference = this.f209126f;
                if (kotlin.jvm.internal.o.b(weakReference != null ? (com.tencent.mm.ui.widget.dialog.k0) weakReference.get() : null, k0Var)) {
                    return;
                }
                this.f209126f = new java.lang.ref.WeakReference(k0Var);
                kd0.p2 p2Var2 = this.f209125e;
                if (p2Var2 != null) {
                    ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var2).h(imageQBarDataBean.f158620e, imageQBarDataBean.f158619d);
                }
            }
        }
    }

    @Override // kd0.o2
    public void K0(java.lang.String str, r45.aq3 aq3Var) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        java.lang.ref.WeakReference weakReference = this.f209126f;
        if (weakReference == null || (k0Var = (com.tencent.mm.ui.widget.dialog.k0) weakReference.get()) == null || !k0Var.i()) {
            return;
        }
        k0Var.v();
    }

    @Override // cg3.a
    public cg3.c U3() {
        return this.f209124d;
    }

    public oc5.l0 W6(cg3.d scanResult) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(scanResult, "scanResult");
        oc5.l0 l0Var = new oc5.l0();
        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent event = scanResult.f41147a;
        kotlin.jvm.internal.o.g(event, "event");
        l0Var.f344451a.clear();
        l0Var.f344452b = null;
        l0Var.f344453c = null;
        l0Var.f344451a = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a.a(event);
        mf3.k kVar = scanResult.f41152f;
        if (kVar == null || (str = kVar.g()) == null) {
            str = "";
        }
        l0Var.f344463m = str;
        return l0Var;
    }

    @Override // cg3.a
    public void cancel() {
        kd0.p2 p2Var = this.f209125e;
        if (p2Var != null) {
            ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).n();
        }
    }

    @Override // cg3.a
    public void n5(cg3.d scanResult, com.tencent.mm.plugin.scanner.ImageQBarDataBean selectInfo, boolean z17) {
        kotlin.jvm.internal.o.g(scanResult, "scanResult");
        kotlin.jvm.internal.o.g(selectInfo, "selectInfo");
        java.lang.String codeString = selectInfo.f158619d;
        kotlin.jvm.internal.o.f(codeString, "codeString");
        this.f209130m = codeString;
        com.tencent.mars.xlog.Log.i("MediaGallery.DefaultQRCodeScanComponent", "select codeString " + this.f209130m);
        oc5.l0 W6 = W6(scanResult);
        if (W6 == null) {
            return;
        }
        this.f209129i.b(W6, selectInfo, this.f209131n);
    }

    @Override // cg3.a
    public void o4(java.lang.String imgPath) {
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        if (((java.util.HashMap) this.f209127g).containsKey(imgPath)) {
            return;
        }
        cg3.c cVar = this.f209124d;
        android.view.View view = cVar != null ? cVar.getView() : null;
        cg3.c cVar2 = this.f209124d;
        if (cVar2 != null) {
            cVar2.a();
        }
        this.f209129i.h(view, -1L, "", imgPath, null, true, 2, true, new rh5.d(view, this, imgPath));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        ((jd0.q2) x2Var).getClass();
        this.f209125e = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(context, this, activity);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dead();
        this.f209129i.f();
    }

    @Override // cg3.a
    public void u0(mf3.k mediaInfo, android.graphics.Bitmap bitmap, cg3.h hVar) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        sf3.g e17 = mediaInfo.e();
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.DefaultQRCodeScanComponent", "scan failed, loadParam null, mediaId: " + mediaInfo.getId());
            return;
        }
        java.lang.String c17 = e17.c();
        cg3.c cVar = this.f209124d;
        android.view.View view = cVar != null ? cVar.getView() : null;
        cg3.c cVar2 = this.f209124d;
        if (cVar2 != null) {
            cVar2.a();
        }
        this.f209129i.h(view, -1L, "", c17, bitmap, true, 2, true, new rh5.e(view, this, e17, c17, mediaInfo, hVar));
    }

    @Override // cg3.a
    public void u3(cg3.c cVar) {
        this.f209124d = cVar;
    }
}
