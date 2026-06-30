package com.tencent.mm.plugin.subapp.ui.gallery.ecs;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/subapp/ui/gallery/ecs/EcsGestureGalleryUI;", "Lcom/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI;", "Lu00/a;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class EcsGestureGalleryUI extends com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI implements u00.a {
    public static boolean H2 = false;
    public static java.lang.String I2 = "";
    public static int J2;

    @Override // com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI
    public void C7() {
        com.tencent.mars.xlog.Log.i("MicroMsg. EcsGestureGalleryUI", "runExitAnimation");
        super.C7();
        c00.d4 d4Var = (c00.d4) i95.n0.c(c00.d4.class);
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        cl0.g gVar = new cl0.g(kz5.c1.k(new jz5.l("currentIndex", java.lang.Integer.valueOf(L.getInt("KCurrentIndexNotifyToFrontEnd", 0))), new jz5.l("mbPassBuffer", L.getString("KEcsMBPassBufferToNative", ""))));
        ((b00.n0) d4Var).getClass();
        c00.n3 n3Var = b00.n0.f16729e;
        if (n3Var != null) {
            n3Var.b(gVar);
        }
        b00.n0.f16729e = null;
        com.tencent.mm.sdk.platformtools.o4 L2 = com.tencent.mm.sdk.platformtools.o4.L();
        L2.putInt("KCurrentIndexNotifyToFrontEnd", 0);
        L2.putString("KEcsMBPassBufferToNative", "");
        L2.putString("KPassExtInfoToSearch", "");
        L2.putString("KPassReportInfoToSearch", "");
    }

    public final void L7(boolean z17) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f484143t60);
        if (z17) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg. EcsGestureGalleryUI", "onCreate");
        super.onCreate(bundle);
        H2 = getIntent().getBooleanExtra("KIsShowEcsMb", false);
        java.lang.String stringExtra = getIntent().getStringExtra("KPassBufferToMb");
        if (stringExtra == null) {
            stringExtra = "";
        }
        I2 = stringExtra;
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (!H2 || com.tencent.mm.sdk.platformtools.t8.K0(I2)) {
            return;
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f484143t60);
        frameLayout.setVisibility(0);
        c00.d4 d4Var = (c00.d4) i95.n0.c(c00.d4.class);
        java.lang.String frameSetData = I2;
        b00.n0 n0Var = (b00.n0) d4Var;
        n0Var.getClass();
        kotlin.jvm.internal.o.g(frameSetData, "frameSetData");
        b00.m0 m0Var = b00.m0.f16718d;
        i95.m c17 = i95.n0.c(gq0.t.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        iq0.c de6 = gq0.t.de((gq0.t) c17, m0Var, null, 2, null);
        n0Var.f16731d = de6;
        if (de6 != null) {
            i95.m c18 = i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            gq0.t.bh((gq0.t) c18, de6, null, 2, null);
        }
        iq0.c cVar = n0Var.f16731d;
        if (cVar != null) {
            i95.m c19 = i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            gq0.t.Ve((gq0.t) c19, cVar, null, frameLayout, "EcsShopMagicCardService_frameSet", frameSetData, 0, null, 98, null);
        }
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c("ilinkres_05e6a46e");
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Bi(qVar);
    }

    @Override // com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        jc3.i0 i0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg. EcsGestureGalleryUI", "onDestroy");
        super.onDestroy();
        b00.n0 n0Var = (b00.n0) ((c00.d4) i95.n0.c(c00.d4.class));
        n0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsShopMagicCardService", "stop ecs shop magic card");
        iq0.c cVar = n0Var.f16731d;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Di(cVar);
            nq0.p pVar = (nq0.p) ((gq0.t) i95.n0.c(gq0.t.class));
            pVar.getClass();
            synchronized (cVar) {
                i0Var = (jc3.i0) ((java.util.LinkedHashMap) pVar.f338944f).get(cVar);
                if (i0Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                } else if (!(i0Var instanceof hq0.h)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
                }
                i0Var = null;
            }
            hq0.h hVar = (hq0.h) i0Var;
            if (hVar != null) {
                ((hq0.b0) hVar).U1("".length() == 0 ? "frames" : "frames-");
            }
        }
    }

    @Override // com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI
    public void r7() {
        com.tencent.mars.xlog.Log.i("MicroMsg. EcsGestureGalleryUI", "handleLongClick");
        super.r7();
        cl0.g gVar = new cl0.g(kz5.c1.k(new jz5.l("action", "longPressImage"), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, kz5.b1.e(new jz5.l("currentIndex", java.lang.Integer.valueOf(J2))))));
        ((b00.n0) ((c00.d4) i95.n0.c(c00.d4.class))).wi("onEcsEvent", gVar.toString());
    }

    @Override // com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI
    public void w7(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg. EcsGestureGalleryUI", "onGalleryScaleToRatio: " + f17);
        if (f17 > 0.98f) {
            L7(false);
        } else {
            L7(true);
        }
    }

    @Override // com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI
    public void y7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg. EcsGestureGalleryUI", "onUpdatePosition: " + i17);
        J2 = i17;
        ((b00.n0) ((c00.d4) i95.n0.c(c00.d4.class))).wi("onEcsEvent", new cl0.g(kz5.c1.k(new jz5.l("action", "changeImage"), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, kz5.b1.e(new jz5.l("currentIndex", java.lang.Integer.valueOf(J2)))))).toString());
        com.tencent.mm.sdk.platformtools.o4.L().putInt("KCurrentIndexNotifyToFrontEnd", i17);
    }
}
